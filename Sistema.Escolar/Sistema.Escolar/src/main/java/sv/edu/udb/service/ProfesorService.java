package sv.edu.udb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.model.Profesor;
import sv.edu.udb.repository.ProfesorRepository;

import java.util.List;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository repo;

    public List<Profesor> listar() {
        return repo.findAll();
    }

    public Profesor guardar(Profesor p) {
        return repo.save(p);
    }

    public Profesor actualizar(Long id, Profesor p) {
        Profesor existente = repo.findById(id).orElse(null);
        if (existente != null) {
            existente.setNombre(p.getNombre());
            return repo.save(existente);
        }
        return null;
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
