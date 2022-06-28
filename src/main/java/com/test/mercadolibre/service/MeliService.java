package com.test.mercadolibre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.mercadolibre.dao.StatsDAOImpl;
import com.test.mercadolibre.dto.RequestXmenDTO;
import com.test.mercadolibre.dto.ResponseStatsDTO;
import com.test.mercadolibre.dto.ResponseXmenDTO;
import com.test.mercadolibre.entity.StatsEntity;
import com.test.mercadolibre.util.Constantes;
import com.test.mercadolibre.util.Utils;

@Service
public class MeliService {

	@Autowired
	private StatsDAOImpl statsDAOImpl;

	public ResponseXmenDTO isMutant(RequestXmenDTO request) {
		ResponseXmenDTO response = new ResponseXmenDTO();

		return response;
	}

	public ResponseStatsDTO getStats() {
		ResponseStatsDTO response;
		StatsEntity stat = statsDAOImpl.findStatById(Constantes.ID_STAT_DEFAULT);

		if (stat == null) {
			response = new ResponseStatsDTO(0L, 0L, 0.0);
		} else {
			Double ratio = stat.getCountHumanDna().doubleValue() / (stat.getCountMutantDna().doubleValue() + stat.getCountHumanDna().doubleValue());
			response = new ResponseStatsDTO(stat.getCountHumanDna(), stat.getCountMutantDna(), Utils.getDoubleWithTwoDecimals(ratio));
		}

		return response;
	}
}
