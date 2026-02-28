package sv.edu.udb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.test.annotation.Commit;
import sv.edu.udb.model.*;
import sv.edu.udb.repository.*;

//Me indica que se debe ejecutar un test de integracion con SpringBoot
// Tambien se realizaran cambios en la base de datos durante el test se confirman
@SpringBootTest
@Transactional
@Commit
class AlumnoMateriaTest {

    //El @Autowired inyecta automaticamente los repositorios para que pueda interactuar con mi base de datos
    //Cada uno de los repositorios corresponden a una entidad
    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private ProfesorRepository profesorRepository;

    @Autowired
    private MateriaRepository materiaRepository;

    @Autowired
    private AlumnoMateriaRepository alumnoMateriaRepository;

    //Me marca este metodo como una prueba que Spring se ejecutara automaticamente
    @Test
    void insertarRelaciones() {

        Alumno alumno = alumnoRepository.save(new Alumno("Sofía", "Ramírez"));

        Profesor profesor = profesorRepository.save(new Profesor("Mario Díaz"));

        Materia materia1 = materiaRepository.save(new Materia("Matemática Discreta", profesor));
        Materia materia2 = materiaRepository.save(new Materia("Álgebra", profesor));

        AlumnoMateria relacion1 = new AlumnoMateria(alumno.getId(), materia1.getId());
        AlumnoMateria relacion2 = new AlumnoMateria(alumno.getId(), materia2.getId());

        alumnoMateriaRepository.save(relacion1);
        alumnoMateriaRepository.save(relacion2);
    }
}