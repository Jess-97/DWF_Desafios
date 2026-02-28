package sv.edu.udb.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alumno")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Esto me indica que estas columnas no pueden ser nulas
    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    public Alumno(){}

    //Me permite crear un alumno con nombre y apellido directamente
    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //El get y set me ayuda a obtener y modificar los valores
    public Long getId(){
        return id;
    }
    public String getNombre() {return nombre;}
    public String getApellido() {return apellido;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
}
