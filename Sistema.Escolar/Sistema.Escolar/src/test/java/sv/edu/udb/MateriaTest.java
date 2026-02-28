package sv.edu.udb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import sv.edu.udb.model.Materia;
import sv.edu.udb.model.Profesor;
import sv.edu.udb.repository.MateriaRepository;
import sv.edu.udb.repository.ProfesorRepository;

@SpringBootTest
@Transactional
@Commit
class MateriaTest {

    @Autowired
    private MateriaRepository materiaRepository;

    @Autowired
    private ProfesorRepository profesorRepository;

    @Test
    void insertarMaterias() {

        //Se crea y guarda un profesor nuevo
        Profesor profesor = profesorRepository.save(new Profesor("Carlos Ruiz"));

        //Se crean las dos materia asociadas a el
        Materia materia1 = new Materia("Programación Avanzada", profesor);
        Materia materia2 = new Materia("Redes", profesor);

        materiaRepository.save(materia1);
        materiaRepository.save(materia2);
    }
}
