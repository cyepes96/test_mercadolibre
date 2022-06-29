package com.test.mercadolibre.dao;

import org.springframework.stereotype.Repository;

import com.test.mercadolibre.entity.StatsEntity;

@Repository
public interface IStatsDAO {

	public StatsEntity findStatById(Long id);

	public void saveStat(StatsEntity entity);
}
