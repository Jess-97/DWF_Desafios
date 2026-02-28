package sv.edu.udb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.model.Alumno;

// Repositorio para Alumno que hereda operaciones CRUD de JpaRepository
// <Alumno, Long> indica que maneja la entidad Alumno y su clave primaria id
public interface AlumnoRepository extends  JpaRepository<Alumno, Long>{
}
