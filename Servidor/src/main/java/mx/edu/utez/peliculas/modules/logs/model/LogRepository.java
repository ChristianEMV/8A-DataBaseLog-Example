package mx.edu.utez.peliculas.modules.logs.model;

import mx.edu.utez.peliculas.modules.movie.model.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/* Este código representa una interfaz llamada LogRepository que está anotada
con @Repository, indicando que es un repositorio de datos para la entidad Log.
La interfaz extiende JpaRepository, lo que significa que hereda métodos y
funcionalidades para realizar operaciones CRUD en la entidad Log.
El parámetro <Log, Long> especifica que esta interfaz trabaja con objetos de
tipo Log y utiliza Long como tipo de dato para la clave primaria. */
@Repository
public interface LogRepository extends JpaRepository<Log, Long> {
    List<Log> findAll();
}
