package com.test.mercadolibre.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.mercadolibre.entity.StatsEntity;

public interface StatsRepository extends CrudRepository<StatsEntity, Long> {

}
