package com.osplans.poidemo.activeMQ;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import javax.jms.Destination;
import javax.jms.Queue;
import java.util.HashMap;
import java.util.Map;

@Component
@EnableScheduling
public class Producer {

    Logger log = LoggerFactory.getLogger(Producer.class);

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    public void sendMsg(final Object obj) {
        log.info("send msg >> 固定Name");
        this.jmsMessagingTemplate.convertAndSend(this.queue, obj);
    }

    public void sendMsg(Destination destination,final Object obj) {
        log.info("send msg >> {}", destination.toString());
        jmsMessagingTemplate.convertAndSend(destination, obj);
    }

}
