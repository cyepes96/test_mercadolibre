package com.test.mercadolibre.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.mercadolibre.dao.IStatsDAO;
import com.test.mercadolibre.entity.StatsEntity;
import com.test.mercadolibre.repository.StatsRepository;

@Repository
public class StatsDAOImpl implements IStatsDAO {

	@Autowired
	private StatsRepository statsRepository;

	public StatsEntity findStatById(Long id) {
		return statsRepository.findById(id).orElse(null);
	}

	public void saveStat(StatsEntity entity) {
		statsRepository.save(entity);
	}
}
