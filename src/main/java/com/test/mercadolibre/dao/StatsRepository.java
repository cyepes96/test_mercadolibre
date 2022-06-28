package com.test.mercadolibre.dao;

import org.springframework.data.repository.CrudRepository;

import com.test.mercadolibre.entity.StatsEntity;

public interface StatsRepository extends CrudRepository<StatsEntity, Long> {

}
