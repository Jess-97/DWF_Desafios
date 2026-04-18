package sv.edu.udb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.model.Alumno;
import sv.edu.udb.repository.AlumnoRepository;

import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository repo;

    public List<Alumno> listar() {
        return repo.findAll();
    }

    public Alumno guardar(Alumno a) {
        return repo.save(a);
    }

    public Alumno actualizar(Long id, Alumno a) {
        Alumno existente = repo.findById(id).orElse(null);
        if (existente != null) {
            existente.setNombre(a.getNombre());
            existente.setApellido(a.getApellido());
            return repo.save(existente);
        }
        return null;
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
