package com.test.mercadolibre.dto;

import java.io.Serializable;

public class ResponseStatsDTO implements Serializable {

	private static final long serialVersionUID = -7015848080210483254L;

	private Long countMutantDna;
	private Long countHumanDna;
	private Double ratio;

	public ResponseStatsDTO(Long countMutantDna, Long countHumanDna, Double ratio) {
		this.countMutantDna = countMutantDna;
		this.countHumanDna = countHumanDna;
		this.ratio = ratio;
	}

	public Long getCountMutantDna() {
		return countMutantDna;
	}

	public void setCountMutantDna(Long countMutantDna) {
		this.countMutantDna = countMutantDna;
	}

	public Long getCountHumanDna() {
		return countHumanDna;
	}

	public void setCountHumanDna(Long countHumanDna) {
		this.countHumanDna = countHumanDna;
	}

	public Double getRatio() {
		return ratio;
	}

	public void setRatio(Double ratio) {
		this.ratio = ratio;
	}
}
