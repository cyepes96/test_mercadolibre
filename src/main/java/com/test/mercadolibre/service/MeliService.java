package com.test.mercadolibre.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.mercadolibre.dao.StatsDAOImpl;
import com.test.mercadolibre.dto.RequestXmenDTO;
import com.test.mercadolibre.dto.ResponseStatsDTO;
import com.test.mercadolibre.dto.ResponseXmenDTO;
import com.test.mercadolibre.entity.StatsEntity;
import com.test.mercadolibre.exception.BusinessLayerException;
import com.test.mercadolibre.util.Constantes;
import com.test.mercadolibre.util.ErrorMessages;
import com.test.mercadolibre.util.Utils;

@Service
public class MeliService {

	@Autowired
	private StatsDAOImpl statsDAOImpl;

	public ResponseXmenDTO isMutant(RequestXmenDTO request) throws BusinessLayerException {
		ResponseXmenDTO response = new ResponseXmenDTO();

		this.bussinessValidations(request.getDna());

		return response;
	}

	public ResponseStatsDTO getStats() {
		StatsEntity stat = statsDAOImpl.findStatById(Constantes.ID_STAT_DEFAULT);
		return this.fillStatsResponse(stat);
	}

	private ResponseStatsDTO fillStatsResponse(StatsEntity stat) {
		if (stat == null) {
			return new ResponseStatsDTO(0L, 0L, 0.0);
		} else {
			Double humanDna = stat.getCountHumanDna().doubleValue();
			Double mutantDna = stat.getCountMutantDna().doubleValue();
			Double ratio = humanDna / (mutantDna + humanDna);

			return new ResponseStatsDTO(stat.getCountHumanDna(), stat.getCountMutantDna(),
					Utils.getDoubleWithTwoDecimals(ratio));
		}
	}

	private void bussinessValidations(List<String> dna) throws BusinessLayerException {
		this.hasMinimumSizeList(dna);
		this.isListNxN(dna);
		this.hasCharactersNotInATCG(dna);
	}

	private void hasMinimumSizeList(List<String> dna) throws BusinessLayerException {
		if (dna == null || dna.isEmpty())
			throw new BusinessLayerException(ErrorMessages.ERROR_MATRIZ_MINIMUM_SIZE);

		if (dna.size() < Constantes.MIN_SIZE_MATRIX)
			throw new BusinessLayerException(ErrorMessages.ERROR_MATRIZ_MINIMUM_SIZE);

		for (String value : dna) {
			if (value.length() < Constantes.MIN_SIZE_MATRIX)
				throw new BusinessLayerException(ErrorMessages.ERROR_MATRIZ_MINIMUM_SIZE);
		}
	}

	private void isListNxN(List<String> dna) throws BusinessLayerException {
		int sizeColumn = dna.get(0).length();
		int sizeRow = dna.size();

		if (sizeColumn != sizeRow)
			throw new BusinessLayerException(ErrorMessages.ERROR_MATRIZ_NXN);

		for (String value : dna) {
			if (value.length() != sizeColumn)
				throw new BusinessLayerException(ErrorMessages.ERROR_MATRIZ_NXN);
		}
	}

	private void hasCharactersNotInATCG(List<String> dna) throws BusinessLayerException {
		for (String value : dna) {
			if (!Utils.validateRegexExpression(value, Constantes.REGEX_ALLOWED_CHARS))
				throw new BusinessLayerException(ErrorMessages.ERROR_MATRIZ_CHARS_NOTALLOWED);
		}
	}
}
