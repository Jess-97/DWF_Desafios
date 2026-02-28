package sv.edu.udb.repository;

//importa las interfaz de Spring Data que permite acceder a la base de datos
import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.model.AlumnoMateria; //importa la entidad que presenta la tabla de ralcion
import sv.edu.udb.model.AlumnoMateriaID;// importa la clase de clave compuesta

//Repositorio para AlumnoMateria que hereda CRUD de JpaRepository
//<AlumnoMateria, AlumnoMateriaID> me indica la entidad y su clave compuesta
public interface AlumnoMateriaRepository extends  JpaRepository<AlumnoMateria, AlumnoMateriaID>{
}
