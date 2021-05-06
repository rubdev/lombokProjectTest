# lombokProjectTest
Ejemplo de uso de la librería Lombok en un proyecto Java.
Podemos reducir drásticamente la creación de código en clases pojo en Java, 
evitando escribir constructores, getter y setter, sobrescribir equals, hashcode, toString.

Para usarlo en Eclipse descargamos el jar y lo ejecutamos, analiza nuestro eclipse y lo instala: https://projectlombok.org/download

En el proyecto que queramos utilizar, en mi caso Maven añadir al pom.xml la dependencia: 
```java
<dependency>
  <groupId>org.projectlombok</groupId>
  <artifactId>lombok</artifactId>
  <version>1.18.20</version>
  <scope>provided</scope>
</dependency>
```

