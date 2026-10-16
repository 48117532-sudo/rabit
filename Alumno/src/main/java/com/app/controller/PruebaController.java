package com.app.controller;

import com.app.service.AlumnoProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class PruebaController {

    @Autowired
    private AlumnoProducerService producerService;

    @GetMapping("/api/alumnos/probar-rabbitmq")
    public String probar(@RequestParam String mensaje) {
        producerService.enviarEventoAlumno(mensaje);
        return "Mensaje enviado a RabbitMQ: " + mensaje;
    }
}