package com.test.mercadolibre.dao;

import org.springframework.stereotype.Repository;

import com.test.mercadolibre.entity.StatsEntity;

@Repository
public class StatsDAOImpl {

	private StatsRepository statsRepository;

	public StatsEntity findStatById(Long id) {
		return statsRepository.findById(id).orElse(null);
	}
}
