package com.app.service;

import com.app.model.Personal;
import com.app.repository.PersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalServiceImpl implements PersonalService {

    private final PersonalRepository personalRepository;

    @Autowired
    public PersonalServiceImpl(PersonalRepository personalRepository) {
        this.personalRepository = personalRepository;
    }

    @Override
    public Personal altaPersonal(Personal personal) {
        return personalRepository.save(personal);
    }

    @Override
    public List<Personal> listarPersonal() {
        return personalRepository.findAll();
    }

    @Override
    public Optional<Personal> obtenerPorId(Long id) {
        return personalRepository.findById(id);
    }
}