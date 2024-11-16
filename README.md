# Problemas de SOLID

- ## Single Responsability: 
La clase Order no solo se usa para instanciar una orden sino también para obtener valores, guardar la orden y crear un reporte en la base de datos.
El método guardar de la base de datos crea una conexión cada vez que va a guardar
- ## Open/Closed:
1. De momento en el código no hay condiciones basadas en tipo o categoría que rompan este principio.
2. Al tener una clase Order que tenga diferentes responsabilidades, cada vez que se quiera agregar una funcionalidad relacionada 
a las ordenes, habría que modificar código. Se podría manejar uno o más servicios que se encarguen de cada funcionalidad
dependiendo de lo que se quiera. Por ejemplo, un servicio que se encargue de guardar y obtener las ordenes, y otro que se encargue
de hacer otros procesos que se requieran a futuro.
- ## Liskov Substitution:
Al no tener interfaces o clases abstractas no hay manera de que las clases puedan ser sustituidas por otras.
- ## Interface Segregation:
Al no haber interfaces no hay manera de que se aplique este principio. Actualmente como está el código as clases no pueden "implementar solo los métodos que necesiten".
- ## Dependency Inversion:
Hay una dependencia directa entre la clase Order y databaseMysql, pero no se está dependiendo de abstracciones. 
DatabaseMysql debería implementar una interfaz y y debería haber un servicio que inyecte esta dependencia 