package com.gnanendraprasadp.kafkaconsumer.repository;

import com.gnanendraprasadp.kafkaconsumer.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumerRepository extends JpaRepository<Data,Long> {
}
