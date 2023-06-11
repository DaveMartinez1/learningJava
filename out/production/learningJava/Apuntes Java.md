### Hola Mundo
```java
public class HolaMundo{
  public static void main(String args[]){
    System.out.println("Hola Mundo desde Java");
  }
}
```

Primero se crea la clase HolaMundo(Siempre debe inicias con mayúsculas), luego se crea la función publica y  estática `main` con el parámetro `String args[]`, ahora escribimos la función `System.out.println()` que imprimirá en pantalla el "Hola Mundo desde Java" importante poner el `;` al final de la linea.

### Variables y tipos de datos
##### Primitivos:

1. Enteros
* byte (-128 hasta 127)
* short (-32,768 hasta 32,767)
* int (-2,147,483,648 hasta 2,147,483,647)
* long (muy grande...)

2. Decimales
* float (permite alojar hasta 8 valores después del punto a la derecha)
* double (permite alojar hasta 15 valores después del punto a la derecha)

3. Otros
* char (un solo caractér)
* boolean (true | false)

##### Tipos Objeto:

1. String (cadenas de texto)

##### Variables

Para crear variables en Java se sigue la siguiente estructura:
```java
tipo nombre = valor;

// Ejemplo:
int numeroUno = 1;
```

Para concatenar variables por ejemplo en una impresión por pantalla se escribe de la siguiente manera:
```java
// Suma de dos números e impresión por pantalla
int numUno = 5;
int numDos = 6;
int resultado = numUno + numDos;

System.out.println("El resultado de la suma es: " + resultado);
// output: El resultaod de la suma es: 11

```

##### Operadores aritméticos
| Signo |     Nombre del signo    |          Tipo de operación        |
|- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  |
|        <b>+</b> |                               Más |                                      Suma |
|         <b>-</b> |                           Menos |                                      Resta |
|        <b>*</b>  |                       Asterisco |                        Multiplicación |
|        <b>/</b>  |            Diagonal o slash |                                  División |
|         <b>^</b> |         Acento circunflejo |                                Potencia |
|         <b>(</b> | Paréntesis de apertura | Prioridad entre operaciones |
|         <b>)</b> |      Paréntesis de cierre | Prioridad entre operaciones |
|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬ |

###### Prioridad entre operadores
1. `()` | Paréntesis
2. `^` | Potencias
3. `*`, `/` | Multiplicaciones y divisiones
4. `+`, `-` | sumas y restas

### Condicionales
Situación: Quieres aprender a programar?
Condición: Si quieres,  debes pagar 10 dólares

¿Pagaste los 10 dólares?
Si o verdadero -> Revisa el pago y aprendes a programar.
No o falso -> No aprenderás a programar.

La estructura para utilizar condicionales en Java es la siguiente:
```java
int numUno = 10;
int numDos = 20;
int resultado;

if (numUno >= 5){
	resultado = numUno + numDos;
	System.out.println("El resultado de la suma es: " + resultado);
} else{
	System.out.println("El primer numero debe ser mayor que cinco");
}
```

Se pueden anidar condicionales usando `else if{}`, sirve para cuando hay múltiples condiciones a verificar.

### Entrada de datos
 Para pedir datos al usuario se necesita importar la librería `java.util.Scanner`. Se importa de esta manera:  `import java.util.Scanner;`. existen más librerías pero esta es la básica.

Aquí muestro un ejemplo de como utilizar la libreria `java.util.Scanner` para pedir datos al usuario:
```java
import java.util.Scanner;

public class Inputs{
  public static void main(String args[]){

   Scanner userInput = new Scanner(System.in);
   String nombre = "";
   int numUno, numDos, resultado;

   System.out.println("Ingresa tu nombre");
   nombre = userInput.nextLine();

   System.out.println("Ingresa el primer valor para la suma: ");
   numUno = userInput.nextInt();

   System.out.println("Ingresa el segundo valor para la suma: ");
   numDos = userInput.nextInt();

   resultado = numUno + numDos;
   System.out.println("Hola, " + nombre + "! El resultado de la suma es: " + resultado);
 }
}
```

Cabe recalcar que cuando se esta pidiendo un String se debe usar la función `nextLine()` pero cuando se pide un número entero se utiliza la función `nextInt()`.

### Operadores relacionales

* < menor que, ejemplo: 4 < 5 y se lee, 4 es menor que 5.
* > mayor que, ejemplo: A > B y se lee, A es mayor que B.
* == igual que, ejemplo: 5 == 5 y se lee, 5 es igual a 5.
* != no igual a(diferente), ejemplo: perro != gato y se lee, perro no es igual a gato.
* <= menor o igual que, ejemplo: A <= B y se lee, A es menor o igual que B.
* >= mayor o igual que, ejemplo: A <= B y se lee, A es mayor o igual que B.

### Operadores lógicos
* && AND, ejemplo: haz la tarea &&(y) lava la ropa
* || OR, ejemplo: haz la tarea ||(o) lava la ropa


### Switch Case
 El switch case puede ser una alternativa mas sencilla cuando hay multiples opciones a elegir. Ejemplo de la estructura de switch case:
 ```java
 switch(parametro){

    case 1: resultado = numUno + numDos;
            System.out.println("El resultado de la suma es: " + resultado);
            break;
    case 2: resultado = numUno - numDos;
            System.out.println("El resultado de la resta es: " + resultado);
            break;
    case 3: resultado = numUno * numDos;
            System.out.println("El resultado de la multiplicacion es: " + resultado);
            break;
    case 4: resultado = numUno / numDos;
            System.out.println("El resultado de la division es: " + resultado);
            break;
    default: System.out.println("Error! Opcion invalida");
   }
 ```

### Bucles

#### Bucle FOR:
La estructura del bucle FOR en Java es la siguiente:
```java
for (inicio; condicion; inclemento){
	Instruccion
}
```

Ejemplo:
```java
for (int i = 1; i <= 5; i++){
	System.out.print(i + ", ");
}
```

Al igual que en otros lenguajes de programación, en Java puedes incrementar el valor de una variable de la siguiente manera:

```java
int i = 0;

i++; // Incrementa el valor de la variable de uno en uno
i +=2; // Incrementa el valor de la variable de dos en dos

/*Esto de puede usar para incrementar los contadores en bucles u otros metodos, por lo general se utiliza mas "i++"*/
```

###### Dato Curioso:
`System.out.println()` es para imprimir saltando la linea mientras que `System.out.print()` es para imprimir en la misma  linea, parece una tontería pero para principiantes puede ser muy útil.

### Bucle WHILE:
Estructura del bucle WHILE en Java:
```java
while (condicion){ // Mientras que...
	Instrucciones // Haz tal cosa
}
```

Ejemplo de uso:
```java
int i = 1;

while (i<10){ // Mientras que i(1) sea menor que 10
	System.out.print(i+", "); // Imprime i en pantalla y separalo por coma
	i+=2; // Incrementa i de dos en dos3
}
```

### Bucle DO WHILE
DO WHILE primero ejecuta las instrucciones y después comprueba la condición

Estructura básica del ciclo DO WHILE en Java:
```java
do{
	instrucciones
} while(condicion);
```


### Método equals()

Sirve para comparar valores en condicionales y bucles por ejemplo:
```java
int num = 17;
if (num.equals(17)){
	System.out.println("Hola Mundo");
}
```

### Metodo length & substring

El método `length` indica cuantos caracteres tiene una cadena, por ejemplo:
 ```java
 String text = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

 System.out.println(text.length());
 ```

El método `substring` permite obtener una parte especifica de la cadena de caracteres, `substring(desde, hasta);` por ejemplo:
```java
String camelCase = "ThisIsACamelCaseText";

System.out.print(camelCase.subtring(7, 16));

// output: CamelCase
```

### Arreglos unidimensionales
Un arreglo es una estructurad e datos que almacena bajo el mismo nombre a una colección de datos.

Los arreglos que caracterizan por:
* Almacenar los elementos en espacios contiguos de memoria.
* Tienen un mismo nombre de variable que representa a todos los elementos.
* Los elementos son asignados a una posición dentro del vector.
* Los arreglos trabajan en conjunto con índices que especifican la posición de cada elemento dentro del arreglo.

Tipos de arreglos:

* Arreglos unidimensionales. (Vectores)
* Arreglos bidimensionales. (Matrices)

Sintaxis para programar un vector:
```java
int nombre[] = new int[5];
```

El indice tiene dos tipos de comportamientos:
* Comportamiento estático: No es necesario declararlo solo basta con indicar el nombre y la posición del vector, no se moverá de la posición al menos que se lo indique mediante una linea de código, ejemplo:

```java
numeros[2]=8; // Agrega el numero 8 en la posicion 2

System.out.println(numeros[2]); // Imprime en pantalla la segunda posicion del vector
```

* Comportamiento dinámico: No requiere indicar al indice la posición debe de recorrer ya que lo hace de manera automática, lo cual lograremos con una estructura repetitiva `for`, el valor por defecto de un vector es `null`, ejemplo:
```java
int numeros[] = new int[5];

for (int i=0; i<numeros.length; i++){

	numeros[i]=i+10;
	
}
```

### Arreglos bidimensionales (matrices)
Es un arreglo que tiene filas y columnas, necesita 2 indices para ubicar un elemento, ejemplo:
<img src="https://i.ytimg.com/vi/B46f8nOnNbc/hqdefault.jpg" align="center">

##### Matrices dinámicas
Es similar al los vectores dinámicos pues no depende de indices ya que se asigna automáticamente mediante el uso de estructuras repetitivas. Ejemplo:
```java
int filas = 3;
int columnas = 3;
int contador =  1;

int numeros[][] = new int [filas][columnas];

for (int j = 0; j<filas; j++){
	for (int i = 0; i<columnas; i++){
		numeros[j][i] = contador;
		contador++;
		System.out.print("[" + numeros[j][i] + "]");
	}
	System.out.println("");
}

/* output:
[1][2][3]
[4][5][6]
[7][8][9]
*/ 
```

### Interfaces gráficas (librería  swing)
Permite a los usuarios interactuar con el programa sin tener que escribir comandos o similares.

* public: Se puede acceder desde otras clases.
* private: No se puede acceder desde otras clases.

Los `JLabel` siempre deben ser privados.

Ejemplo de uso de la libreria `swing`:
```java
import javax.swing.*;

public class Formulario extends JFrame{
   private JLabel labelOne;
   
    
   // Etiqueta que mostrara el mensaje en la IG(interfaz grafica)
   public Formulario(){
    setLayout(null);
    labelOne = new JLabel("Interfaz Grafica");
    labelOne.setBounds(10,20,200,300); // X,Y,Width,Height
    add(labelOne);
   }
    
   public static void main(String[] args){
       Formulario formOne = new Formulario();
       formOne.setBounds(0,0,400,400);
       formOne.setVisible(true);
       formOne.setLocationRelativeTo(null);
   }
}
```

#### Botones

Ejemplo de un botón que cierra la interfaz gráfica:
```java
import javax.swing.*;
import java.awt.event.*;

public class Botones extends JFrame implements ActionListener{
    
    private JButton buttonOne;
    
    public Botones(){
        setLayout(null);
        buttonOne = new JButton("Cerrar");
        buttonOne.setBounds(300,250,100,30);
        add(buttonOne);
        buttonOne.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == buttonOne){ // getSource contiene el objeto donde se origino el evento
            System.exit(0);
        }
    }
    
    public static void main(String[] args){
        Botones buttons = new Botones();
        buttons.setBounds(0,0,450,350);
        buttons.setVisible(true);
        buttons.setResizable(false);
        buttons.setLocationRelativeTo(null);
    }
}
```