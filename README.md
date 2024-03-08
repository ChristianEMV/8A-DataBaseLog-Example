Nombre del proyecto: Peliculas_CineDot

Buena practica implementada: Bitacora de Base de Datos

Antes de ejecutar el FrontEnd
•Desde la base de datos se deberan las categorias en la tabla Categories:

SELECT * FROM peliculas.categories;
INSERT INTO `peliculas`.`categories` (`description`, `name`, `status`) VALUES ('Peliculas de Accion', 'Accion', '1');
INSERT INTO `peliculas`.`categories` (`description`, `name`, `status`) VALUES ('Peliculas de Suspenso', 'Suspenso', '1');
INSERT INTO `peliculas`.`categories` (`description`, `name`, `status`) VALUES ('Peliculas de Terror', 'Terror', '1');
INSERT INTO `peliculas`.`categories` (`description`, `name`, `status`) VALUES ('Peliculas de Romance', 'Romance', '1');

•npm i
Para ejecturar el FrontEnd
•npm run dev

Se realizo lo siguiente:

•Durante este codigo de agrego una clase Java llamada Log que está anotada con @Entity, lo que indica que es una entidad persistente en una base de datos.
  La anotación @Table especifica el nombre de la tabla en la base de datos donde se almacenarán los objetos Log. En este caso, el nombre de la tabla es "logs".
  Donde se agregaron los campos: tabla, operacion, descripcion, fechaHora y sus métodos getter y setter para cada uno de los campos.

•Se creo una clase Interfaz llamada LogRepository que está anotada con @Repository, indicando que es un repositorio de datos para la entidad Log.
  La interfaz extiende JpaRepository, lo que significa que hereda métodos y funcionalidades para realizar operaciones CRUD en la entidad Log.
  El parámetro <Log, Long> especifica que esta interfaz trabaja con objetos de tipo Log y utiliza Long como tipo de dato para la clave primaria.

•Una clase llamada LogService que está anotada con @Service, indicando que es un componente de servicio en la aplicación.
  La clase tiene una dependencia en LogRepository, que se inyecta a través del constructor.
