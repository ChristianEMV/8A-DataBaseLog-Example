package mx.edu.utez.peliculas.modules.logs.service;

import mx.edu.utez.peliculas.modules.logs.model.Log;
import mx.edu.utez.peliculas.modules.logs.model.LogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/* Este código representa una clase llamada LogService que está anotada con
@Service, indicando que es un componente de servicio en la aplicación.
La clase tiene una dependencia en LogRepository, que se inyecta a través del constructor. */

@Service
public class LogService {
    private final LogRepository logRepository;

    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }
    /* El método 'registrarLog' recibe un objeto Log y utiliza el método 'save'
    del logRepository para guardar el registro en la base de datos. */
    public void registrarLog(Log log) {
        logRepository.save(log);
    }

    /* El método 'getAll' devuelve una lista de todos los registros de log
    utilizando el método 'findAll' del logRepository. */
    public List<Log> getAll(){
        return logRepository.findAll();
    }
}
