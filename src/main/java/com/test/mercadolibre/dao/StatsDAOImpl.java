package com.test.mercadolibre.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.mercadolibre.entity.StatsEntity;

@Repository
public class StatsDAOImpl {

	@Autowired
	private StatsRepository statsRepository;

	public StatsEntity findStatById(Long id) {
		return statsRepository.findById(id).orElse(null);
	}
}
