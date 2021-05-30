# SpringBoot-Ajax
Desde el ControllerFront se puede mostrar las personas que estan en la bd tambien se puede simular un formulario para agregar una nueva persona haciendo click en "Click here to submit the form"  

## Requisitos
- JDK 11 
- Gradel
- Eclipse 
- Spring Boot

### ControllerFront

METHOD | PATH | DESCRIPTION 
------------|-----|------------
GET |http://localhost:8080/view | get all persons
GET |http://localhost:8080/add | save new Homero Simpson


### ControllerRest

METHOD | PATH | DESCRIPTION 
------------|-----|------------
GET |http://localhost:8080/persons| get all persons
POST |http://localhost:8080/person | save person

