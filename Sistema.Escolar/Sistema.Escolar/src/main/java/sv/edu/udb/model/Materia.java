package sv.edu.udb.model;

import jakarta.persistence.*;

//Esto hace que se almacene en la base de datos
@Entity
//En la tabla que estara
@Table(name = "materia")
public class Materia {

    //Marca esto como clave primaria y indica que valos se generará automaticamente
    //con GenerateValue
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    //indica que muchas materias pueden estar asociadas a un mismo profesor
    @ManyToOne
    //define las columnas de la clave foranea
    @JoinColumn(name = "id_profesor", nullable = false)
    private Profesor profesor;


    public Materia(){
    }
    //Nos permite crear una materia con nombre y profesor directamente
    public Materia(String nombre, Profesor profesor){
        this.nombre = nombre;
        this.profesor = profesor;
    }

    //Metodos para obtener y modificar los valores
    public Long getId() {
        return  id;
    }

    public String getNombre() {
        return  nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
