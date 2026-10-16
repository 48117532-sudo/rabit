package com.app.service;

import com.app.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministracionProducerService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void enviarEventoAdministrativo(Object datos) {
        rabbitTemplate.convertAndSend(
            RabbitMQConfig.EXCHANGE_NAME,
            RabbitMQConfig.ROUTING_KEY,
            datos
        );
        System.out.println("Mensaje enviado desde administracion: " + datos);
    }
}