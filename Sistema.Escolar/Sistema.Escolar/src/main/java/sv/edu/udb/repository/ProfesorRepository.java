package sv.edu.udb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.model.Profesor;

// Repositorio para Profesor que hereda CRUD de JpaRepository
// <Profesor, Long> indica la entidad y su clave primaria id
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}
