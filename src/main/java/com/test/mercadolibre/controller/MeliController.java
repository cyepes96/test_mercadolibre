package com.test.mercadolibre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.mercadolibre.dto.RequestXmenDTO;
import com.test.mercadolibre.dto.ResponseErrorDTO;
import com.test.mercadolibre.dto.ResponseStatsDTO;
import com.test.mercadolibre.dto.ResponseXmenDTO;
import com.test.mercadolibre.exception.BusinessLayerException;
import com.test.mercadolibre.service.MeliService;
import com.test.mercadolibre.util.ErrorMessages;

@RestController
@RequestMapping("/xmen")
public class MeliController {

	@Autowired
	private MeliService meliService;

	@PostMapping(path = "/mutant")
	public ResponseEntity<ResponseXmenDTO> isMutant(@RequestBody(required = true) RequestXmenDTO request) {
		ResponseXmenDTO response = meliService.isMutant(request);

		return new ResponseEntity<>(response, (response.isMutant() ? HttpStatus.OK : HttpStatus.FORBIDDEN));
	}

	@GetMapping(path = "/stats")
	public ResponseEntity<ResponseStatsDTO> stats() {
		ResponseStatsDTO response = meliService.getStats();

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@ExceptionHandler
	public ResponseEntity<ResponseErrorDTO> handle(Exception e) {
		ResponseErrorDTO responseErrorDTO = new ResponseErrorDTO();
		responseErrorDTO.setDescription(ErrorMessages.ERROR_EXCEPTION);
		responseErrorDTO.setDetailDescription(e.getMessage());

		return new ResponseEntity<>(responseErrorDTO, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler
	public ResponseEntity<ResponseErrorDTO> handle(BusinessLayerException e) {
		ResponseErrorDTO responseErrorDTO = new ResponseErrorDTO();
		responseErrorDTO.setDescription(ErrorMessages.ERROR_BUSINESS);
		responseErrorDTO.setDetailDescription(e.getMessage());

		return new ResponseEntity<>(responseErrorDTO, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler
	public ResponseEntity<ResponseErrorDTO> handle(HttpMessageNotReadableException e) {
		ResponseErrorDTO responseErrorDTO = new ResponseErrorDTO();
		responseErrorDTO.setDescription(ErrorMessages.ERROR_BADREQUEST);
		responseErrorDTO.setDetailDescription(e.getMessage());

		return new ResponseEntity<>(responseErrorDTO, HttpStatus.BAD_REQUEST);
	}

}
