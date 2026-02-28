package sv.edu.udb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.test.annotation.Commit;
import sv.edu.udb.model.Alumno;
import sv.edu.udb.repository.AlumnoRepository;

@SpringBootTest
@Transactional
@Commit
class AlumnoTest {

    //Se usa para acceder a la base de datos sin escribir
    @Autowired
    private AlumnoRepository alumnoRepository;

    @Test
    //Se crean dos objetos, se guardan en la base de datos con save()
    //El ID se genera automaticamente
    void insertarAlumnos() {

        Alumno alumno1 = new Alumno("Andrea", "López");
        Alumno alumno2 = new Alumno("Miguel", "Castro");

        alumnoRepository.save(alumno1);
        alumnoRepository.save(alumno2);
    }
}
