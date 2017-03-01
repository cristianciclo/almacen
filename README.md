# Almacen
Esto es un proyecto para la clase de entorno de desarrollo en el cual estamos viendo el funcionamiento de maven y subir proyectos a github.
# Programa
Este programa se encarga de llevar y coordinar los pales de un almacen en el cual podras añadir pales, ponerles id, peso, eliminarlos y listarlos, a demas de ir calculando el numero de plaes asi como su peso y el total de las cajas.
# Requisitos
Debemos tener instalados Maven y java en el sistema(jdk y jre)
# Funcionamiento
Cuando lo descargues o clones los pasos a seguir seran estos:
  1. Nos colocamos en la carpeta del proyecto, donde encontraremos el pom.xml, la carpeta src y este readme.
  
  2. Desde aqui ejecutamos el comando "mvn package" para construirlo
  
  3. Hecho esto ya podremos ejecutarlo de la siguiente forma (estando en la misma carpeta donde realizamos el package): 
  java -cp target/proyecto_maven-0.0.1-SNAPSHOT.jar almacen.TestAlmacen
  
# Ejemplo
1. Un ejemplo es añadir el pale con codigo 1, peso 10 y 10 cajas
2. Luego añadir uno con el mismo codigo y veremos que te dira que el codigo no se puede repetir
3. Listamos el pale (opcion 3) para ver si se ha introducido correctamente
4. Introducimos un nuevo pale con codigo 2, peso 20 y 20 cajas
5. Listamos todos los pales y debe decirnos que hay 2 pales, pesan 30 kg y hay 30 cajas
6. Ahora podemos eliminar un pale (como es una lista, eliminara el ultimo que hemos añadido, en este caso el pale con codigo 2)
7. Listamos otra vez todos los pales y nos dira que hay 1 pale,de peso 10kg y 10 cajas
8. Pulsamos 0 y salimos

