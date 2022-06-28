package com.test.mercadolibre.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RequestXmenDTO implements Serializable {

	private static final long serialVersionUID = 3957207942689384547L;

	private List<String> dna;

	public RequestXmenDTO() {
		this.dna = new ArrayList<>();
	}

	public List<String> getDna() {
		return dna;
	}

	public void setDna(List<String> dna) {
		this.dna = dna;
	}
}
