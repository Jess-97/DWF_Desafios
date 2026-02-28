package sv.edu.udb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.test.annotation.Commit;
import sv.edu.udb.model.Profesor;
import sv.edu.udb.repository.ProfesorRepository;

@SpringBootTest
@Transactional
@Commit
class ProfesorTest {

    @Autowired
    private ProfesorRepository profesorRepository;

    @Test
    void insertarProfesores() {

        //Me crea los dos profesores, se me guardan en la base de datos con save()

        Profesor profesor1 = new Profesor("Pedro Martínez");
        Profesor profesor2 = new Profesor("Laura Gómez");

        profesorRepository.save(profesor1);
        profesorRepository.save(profesor2);
    }
}