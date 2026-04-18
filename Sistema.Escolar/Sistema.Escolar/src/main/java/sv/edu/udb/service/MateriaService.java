package sv.edu.udb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.model.Materia;
import sv.edu.udb.repository.MateriaRepository;

import java.util.List;

@Service
public class MateriaService {

    @Autowired
    private MateriaRepository repo;

    public List<Materia> listar() {
        return repo.findAll();
    }

    public Materia guardar(Materia m) {
        return repo.save(m);
    }

    public Materia actualizar(Long id, Materia m) {
        Materia existente = repo.findById(id).orElse(null);
        if (existente != null) {
            existente.setNombre(m.getNombre());
            existente.setProfesor(m.getProfesor());
            return repo.save(existente);
        }
        return null;
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
