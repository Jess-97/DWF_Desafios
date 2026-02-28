package sv.edu.udb.model;

import java.io.Serializable;
import java.util.Objects;

//Esta clase no se pone como una entidad, sino que la utilizo como ID embebido para otra entidad
//Esto obligatoriamente lo ocupo porque JPA necesita serializar la clave compuesta
public class AlumnoMateriaID implements Serializable {

    //Esto son dos campos que juntos forman una clave primaria
    private Long idAlumno;
    private Long idMateria;

    public AlumnoMateriaID() {}

    //Me permite crear objetos con ambos IDs
    public AlumnoMateriaID(Long idAlumno, Long idMateria) {
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
    }

    //etos es para acceder y modificar
    public Long getIdAlumno() { return idAlumno; }
    public void setIdAlumno(Long idAlumno) { this.idAlumno = idAlumno; }

    public Long getIdMateria() { return idMateria; }
    public void setIdMateria(Long idMateria) { this.idMateria = idMateria; }


    //Me define cuando 2 objetos de la clase se consideran iguales
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlumnoMateriaID)) return false;
        AlumnoMateriaID that = (AlumnoMateriaID) o;
        return Objects.equals(idAlumno, that.idAlumno) &&
                Objects.equals(idMateria, that.idMateria);
    }

    // Lo ocupo para tener la coherancia con equals()
    @Override
    public int hashCode() {
        return Objects.hash(idAlumno, idMateria);
    }
}