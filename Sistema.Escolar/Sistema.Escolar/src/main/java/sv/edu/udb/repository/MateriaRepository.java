package sv.edu.udb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.model.Materia;

// Repositorio para Materia que hereda operaciones CRUD de JpaRepository
// <Materia, Long> indica la entidad y su clave primaria id
public interface MateriaRepository  extends  JpaRepository<Materia, Long>{
}
