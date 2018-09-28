package com.rocketmq.consumer;
//import org.apache.rocketmq.spring.starter.annotation.RocketMQMessageListener;
//import org.apache.rocketmq.spring.starter.core.RocketMQListener;
//import org.springframework.stereotype.Service;

//@Service
//@RocketMQMessageListener(topic = "order-paid-topic", consumerGroup = "order-paid-consumer")
//public class OrderPaidEventConsumer2 implements RocketMQListener<OrderPaidEvent> {
//
//    @Override
//    public void onMessage(OrderPaidEvent orderPaidEvent) {
//    	System.out.println(orderPaidEvent.getOrderId()+" OrderPaidEventConsumer2 "+orderPaidEvent.getPaidMoney());
//    }
//}