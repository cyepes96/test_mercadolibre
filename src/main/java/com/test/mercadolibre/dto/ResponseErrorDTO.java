package com.test.mercadolibre.dto;

import java.io.Serializable;

public class ResponseErrorDTO implements Serializable {

	private static final long serialVersionUID = 4383557498437256660L;

	private String description;
	private String detailDescription;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetailDescription() {
		return detailDescription;
	}

	public void setDetailDescription(String detailDescription) {
		this.detailDescription = detailDescription;
	}
}
