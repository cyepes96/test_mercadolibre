package com.test.mercadolibre.dto;

import java.io.Serializable;

public class ResponseXmenDTO implements Serializable {

	private static final long serialVersionUID = -2989511884360331893L;

	private boolean mutant;

	public ResponseXmenDTO(boolean mutant) {
		this.mutant = mutant;
	}

	public boolean isMutant() {
		return mutant;
	}

	public void setMutant(boolean mutant) {
		this.mutant = mutant;
	}
}
