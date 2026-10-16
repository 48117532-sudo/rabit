package com.app.service;

import com.app.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoProducerService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

   
    public void enviarEventoAlumno(Object datosAlumno) {
        rabbitTemplate.convertAndSend(
            RabbitMQConfig.EXCHANGE_NAME,
            RabbitMQConfig.ROUTING_KEY,
            datosAlumno
        );
        System.out.println("Mensaje enviado a RabbitMQ desde alumnos: " + datosAlumno);
    }
}