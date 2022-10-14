package com.gnanendraprasadp.kafkaconsumer.kafka.consumer;

import com.gnanendraprasadp.kafkaconsumer.entity.Data;
import com.gnanendraprasadp.kafkaconsumer.repository.ConsumerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    private ConsumerRepository consumerRepository;

    public KafkaConsumer(ConsumerRepository consumerRepository) {
        this.consumerRepository = consumerRepository;
    }

    @KafkaListener(topics = "wikimedia_change", groupId = "recentGroup")
    public void getData(String message) {
        LOGGER.info(String.format("Data is %s", message));
        Data data = new Data();
        data.setMessage(message);
        consumerRepository.save(data);
    }
}
