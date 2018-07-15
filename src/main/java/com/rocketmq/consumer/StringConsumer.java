package com.rocketmq.consumer;

import org.apache.rocketmq.spring.starter.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.starter.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * StringConsumer Created by aqlu on 2017/11/16.
 */
@Service
@RocketMQMessageListener(topic = "string-topic", consumerGroup = "string_consumer")
public class StringConsumer implements RocketMQListener<String> {
    @Override
    public void onMessage(String message) {
        System.out.println(message);
    }
}