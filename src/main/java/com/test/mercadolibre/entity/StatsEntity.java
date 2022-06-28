package com.test.mercadolibre.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stats")
public class StatsEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	private Long id;

	@Column(name = "COUNT_MUTANT_DNA")
	private Long countMutantDna;

	@Column(name = "COUNT_HUMAN_DNA")
	private Long countHumanDna;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
}
