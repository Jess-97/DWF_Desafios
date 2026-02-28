package sv.edu.udb.model;

import jakarta.persistence.*;


@Entity
@Table(name = "alumno_materia")
//Esto em dice que tiene una clave primaria compuesta definida en la clase AlumnoMateriaID
@IdClass(AlumnoMateriaID.class)
public class AlumnoMateria {

    //Cada campo forma parte de la clave primaria
    //Se definen los noMbres exacto de la columna en la tabla
        @Id
        @Column(name = "id_alumno")
        private Long idAlumno;

        @Id
        @Column(name = "id_materia")
        private Long idMateria;

        //Constructor vacío

        public AlumnoMateria() {
        }
        //Me permite crear los objetos con un alumno y materia
        public AlumnoMateria(Long idAlumno, Long idMateria) {
            this.idAlumno = idAlumno;
            this.idMateria = idMateria;
        }

        public Long getIdAlumno() {
            return idAlumno;
        }

        public void setIdAlumno(Long idAlumno) {
            this.idAlumno = idAlumno;
        }

        public Long getIdMateria() {
            return idMateria;
        }

        public void setIdMateria(Long idMateria) {
            this.idMateria = idMateria;
        }
    }
