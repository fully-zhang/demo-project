package com.osplans.poidemo.activeMQ;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    Logger log = LoggerFactory.getLogger(Consumer.class);


    @JmsListener(destination = "${queueName}")
    public void receiveQueue(Object text) {
        log.info("收到数据{}", text);
    }



}
