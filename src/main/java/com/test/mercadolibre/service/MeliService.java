package com.test.mercadolibre.service;

import org.springframework.stereotype.Service;

import com.test.mercadolibre.dto.RequestXmenDTO;
import com.test.mercadolibre.dto.ResponseStatsDTO;
import com.test.mercadolibre.dto.ResponseXmenDTO;

@Service
public class MeliService {

	public ResponseXmenDTO isMutant(RequestXmenDTO request) {
		ResponseXmenDTO response = new ResponseXmenDTO();

		return response;
	}

	public ResponseStatsDTO getStats() {
		ResponseStatsDTO response = new ResponseStatsDTO();

		return response;
	}

}
