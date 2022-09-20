## Proyecto de JAVA Sopa de Letras

Juego de JAVA que nos generara una sopa de letras.

## Estructura del proyecto

Al construir un objeto de tipo `SopaLetras` se generara una tabla de N x N, verificando que el numero es mayor que 0.

- Si no se cumple se lanza una excepcion.
- En otro caso, se incializa cada casilla con un asterisco, para indicar que todas las casillas estan vacias.

Tiene un metodo llamado `colocarPalabraHorizontal()` que recibe:
- La palabra a introducir.
- Un objeto de tipo Coordenada para indicar fila y columna dentro de la matriz donde comenzar la palabra.

Tiene otro metodo llamado `colocarPalabraVertical()` que hace lo mismo, pero poniendo en vertical, basando en sus coordenadas y sentido.

El metodo `toString` devuelve un String con la representacion de la matriz de filas y columnas.

Existira otro metodo llamado `mostrarResumendeLetras()` que devolvera un mapa cuya clave sea una letra y cuyo valor sea el numero de veces que aparece esa letra en la matriz.

## Datos del Fichero

Se define otro metodo llamado `enviarDatosAFichero()` que generara un fichero llamado `partida.txt` que almacenara la representacion de la matriz `SopaLetras`.

Finalmente, habra otro metodo llamado `cargarDatosDeFichero()` que cargara la informacion almacenada en `partida.txt` sobre la matriz `SopaLetras`.
