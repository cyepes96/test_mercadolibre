package com.test.mercadolibre.service;

import org.springframework.stereotype.Service;

import com.test.mercadolibre.dto.RequestXmenDTO;
import com.test.mercadolibre.dto.ResponseStatsDTO;
import com.test.mercadolibre.dto.ResponseXmenDTO;
import com.test.mercadolibre.exception.BusinessLayerException;

@Service
public interface IMeliService {

	public ResponseXmenDTO isMutant(RequestXmenDTO request) throws BusinessLayerException;

	public ResponseStatsDTO getStats();
}
