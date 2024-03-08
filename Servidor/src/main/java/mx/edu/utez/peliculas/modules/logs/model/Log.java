package mx.edu.utez.peliculas.modules.logs.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/* Este código representa una clase Java llamada Log que está anotada con @Entity,
lo que indica que es una entidad persistente en una base de datos.
La anotación @Table especifica el nombre de la tabla en la base de datos donde se
almacenarán los objetos Log. En este caso, el nombre de la tabla es "logs". */
@Entity
@Table(name = "logs")
public class Log {
    /* La anotación @Id indica que el campo 'id' es la clave primaria de la entidad Log.
   La anotación @GeneratedValue especifica la estrategia para generar los valores de
   la clave primaria. En este caso, se utiliza una estrategia de identidad. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /* El campo 'tabla' representa el nombre de la tabla asociada con la entrada del registro. */
    private String tabla;
    /* El campo 'operacion' representa la operación realizada en la tabla asociada, como insertar, actualizar o eliminar. */
    private String operacion;

    /* El campo 'descripcion' contiene una descripción o información adicional sobre la entrada del registro. */
    private String descripcion;
    /* El campo 'fechaHora' almacena la fecha y hora en que se creó la entrada
     del registro. Utiliza la clase LocalDateTime del paquete java.time. */
    private LocalDateTime fechaHora;

    /* Métodos getterers y setterers para todos los campos. */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }


}
