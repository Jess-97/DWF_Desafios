package sv.edu.udb.model;

//Nos ayuda a importar todas las anotaciones necesarias que ocupamos de JPA
import jakarta.persistence.*;

//Me ayuda a decirle a Spring que esta clase es una identidad y que represanta una tabla en mi base de datos
@Entity
//Me ayuda dice que esta clase esta Vinculada a la tabla llamada profesor
@Table(name = "Profesor")
//Esta es la representacion de la tabla de profesores en nuestra base de datos
public class Profesor {

    // El Id me indica la clase primaria, el ID lo que hace es generarse automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Mi Identity usa el AUTO_INCREMENT en la base de datos
    private  Long id;

    //Me repsenta la columna nombre y como lleva null
    //me indica que no puede ser nulo
    @Column(nullable = false)
    private String nombre;

    public Profesor(){}

    //Me permite crear un profesor enviando los nombres
    public Profesor(String nombre){
        this.nombre = nombre;
    }

    //El get y set me ayuda a obtener y modificar los valores
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
