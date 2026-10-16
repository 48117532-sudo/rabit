package com.app.service;

import com.app.model.Curso;
import com.app.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService {

    private final CursoRepository cursoRepository;

    @Autowired
    public CursoServiceImpl(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @Override
    public Curso altaCursos(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    @Override
    public Optional<Curso> obtenerPorId(Long id) {
        return cursoRepository.findById(id);
    }

    @Override
    public void registrarALumno(long idCurso, long idAlumno) {
        Curso curso = cursoRepository.findById(idCurso)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado con id: " + idCurso));
        cursoRepository.save(curso);
    }

    @Override
    public void sacarALumno(long idCurso, long idAlumno) {
        Curso curso = cursoRepository.findById(idCurso)
                .orElseThrow(() -> new RuntimeException("Curso no encontrado con id: " + idCurso));
        cursoRepository.save(curso);
    }
}