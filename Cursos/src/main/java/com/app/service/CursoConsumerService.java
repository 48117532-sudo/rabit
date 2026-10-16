package com.app.service;

import com.app.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class CursoConsumerService {

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void recibirNotificacionAlumno(Object datosAlumno) {
        System.out.println("Mensaje recibido de curso: " + datosAlumno);
        
    }
}