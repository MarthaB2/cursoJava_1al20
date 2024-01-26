import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ////////////////////////////////////////
        ///3: Hola mundo

        //saludarHM();

        //cant de argumento, pasarlos por propiedades
        //System.out.println(args.length);

        ////////////////////////////////////////
        //5: tipos de datos: declaro variables

        //manejoDeTipoDatos();
        ////////////////////////////////////////
        //6: Enteros
        //enteros();

        ////////////////////////////////////////
        //7: Chars y secuencias de escape

        //ejemploChar();
        //System.out.println("Ejemplo de secuencisa de escape:");
        //ejemploSecueniasEscape();
        ////////////////////////////////////////
        ///8-String

        //stringyManejoDeMetodos();
        ////////////////////////////////////////
        ///9 : Sentencias if

        //ejemplosIf();

        ////////////////////////////////////////
        //10: ENTRADA DE DATOS

        //ejemploEntradadeDatos();

        ////////////////////////////////////////
        //11: ciclos while

        //ejemploCicloWhile();

        ////////////////////////////////////////
        //12: ciclo for

        //ejemploCicloFor();
        ////////////////////////////////////////
        //13: ciclo do while

        //ejemploCicloDoWhile();
        ////////////////////////////////////////
        //14 vector

        //ejemploVectores();
        ////////////////////////////////////////
        //15: VECTORES PARALELOS, como asociar un dato con respecto al otro

        //ejemploVecParalelos();


        ////////////////////////////////////////
        //16: Vectores Mayor o Menor elemento

        //System.out.println("Mayor y menor elemento segun las edades:");
        //vectorMayoryMenorElemento();

        ////////////////////////////////////////
        //17:Vectores Ordenamiento (Burbuja)

        //ordenamientoBurbujeoVector();

        ////////////////////////////////////////
        ///18 matrices

        //ejemploMatriz();
        ////////////////////////////////////////
        ///19: Operaciones con Matrices

        //diagonalPrincipalMatriz();
        ////////////////////////////////////////
        ///20: Switch

        //usoSwitch();
        ////////////////////////////////////////












    }

    ///////////////////////////////////////////////////////////////
    ///3
    public static void saludarHM() {
        System.out.println("Hola mundo-Mitocode!");
    }
    ///////////////////////////////////////////////////////////////
    ///5
    public static void manejoDeTipoDatos() {
        ///perdi el codigo
    }
    ///////////////////////////////////////////////////////////////
    ///6
    public static void enteros() {
        int x = 9;
        Integer y = 99;
        System.out.println(x);
        System.out.println(y);

        String texto1 = "99";
        int suma = Integer.parseInt(texto1) + 1; //
        System.out.println(suma);
    }
    ///////////////////////////////////////////////////////////////
    ///7
    public static void ejemploChar() {
        char caracter;
        caracter = 'A';
        System.out.println(caracter);

        //o sin primitivas
        //comentarios: "new" es una palabra reservada, es para poder crear una nueva instancia en nuestra memoria
        // para ese tipo de dato
        //  Character car =  new Character('A'); pero no es convencianal, por ello se usa la primitiva
    }

    public static void ejemploSecueniasEscape() {
        //ejemplo de secuencias de escape :
        // \n
        // \" ....\"
        // \t
        System.out.println("Curso java por \nMitocode");
        System.out.println("Curso java por \"Mitocode\"");
        System.out.println("Curso java por \tMitocode");
    }
    ///////////////////////////////////////////////////////////////
    ///8
    public static void stringyManejoDeMetodos(){
        //metodos
        //ejemplo 1 : charAt()
        String texto = "Mitocode"; // ESA VARIABLE TEXTO TIENE LA INSTANCIA DE UN OBJETO, Y ESA INSTANCIA TIENE METODOS
        char captura = texto.charAt(0);
        System.out.println(captura);
        //ejemplo 2 : compareTo() //Son funciones que le pertenecen al objeto, por eso se llaman metodos
        String texto1a = "Mitocode";
        String texto2a = "Suscribete";
        int resultado = texto1a.compareTo(texto2a); //ignora las mayu y min
        System.out.println(resultado);
        //ejemplo 3 : concat()
        String concatenado = texto1a.concat(texto2a);
        System.out.println(concatenado);
        //ejemplo 4 : contains() //porque me sale warnings ?
        //boolean result = texto1a.contains("o");
        //System.out.println(result);
        //ejemplo 5 : indexOf()
        int pos = texto1a.indexOf("o");  //Mitocode
        System.out.println(pos);
        //ejemplo 6: substring()
        String recorte = texto1a.substring(1, 4); //Mitocode
        System.out.println(recorte);
        //ejemplo 7: length()
        int cant = texto1a.length();//Mitocode
        System.out.println(cant);
    }

    ///////////////////////////////////////////////////////////////
    ///9
    public static void ejemplosIf() {
        int z = 60;
        if (z > 50) {
            System.out.println("Esta es una sentencia de if"); // println con salto de linea, o print sin salto de linea
        } else {
            System.out.println("Esta es una sentencia de else");
        }
        //VAMOS HACER UN DEBUG
        /*
        if(z == 50 ) { //IF EN CASCADA
            System.out.println("Esto es 50"); // println con salto de linea, o print sin salto de linea
        }else if( z == 40) {
            System.out.println("Esto es 40");
        }else if (z == 30) {
            System.out.println("Esto es 30");
        }else if( z == 20){
            System.out.println("Esto es 20");
        }else{
            System.out.println("Esta no es ninguna de las anterios");
        }

         */
        ///tambien se podria hacer if anidados //ARREGLARLO
        /*
        if (a > b) {
            mayor = a;
            if (a > b) {
                mayor = a;

            } else {
                mayor = b;
            }
        } else {
            mayor = b;
        }
        */
        // operador ?
        System.out.println(("EJEMPLO DE USO SIN ?"));
        int a = 10;
        int b = 20;
        int mayor;
        if (a > b) {
            mayor = a;
        } else {
            mayor = b;
        }


        System.out.println(mayor);
        // ahora con ? // es recomendable cuando es simple...
        System.out.println(("EJEMPLO DE USO DE ?"));
        mayor = (a > b) ? a : b;
        System.out.println(mayor);
    }
    ///////////////////////////////////////////////////////////////
    ///10
    public static void ejemploEntradadeDatos() {
        //10-ENTRADA DE DATOS
        Scanner input = new Scanner(System.in);

        System.out.println("Cual es tu nombre:");

        String nombre = input.next();

        System.out.println("Tu nombre es "+ nombre);
    }
    ///////////////////////////////////////////////////////////////
    ///11
    public static void ejemploCicloWhile() {
        //11. ciclos while
        int i = 0;
        while (i < 2) {
            System.out.println("Suscribete");
            i++;
        }

        //ejemplo practico
        /*
        System.out.println("EJEMPLO PRACTICO");

        String nombre =""; // como si estuviera vacia

        while(!nombre.equals("MitoCode")){ //mientras seas distinto de MitoCode
            Scanner input = new Scanner(System.in);
            nombre = input.next();
            System.out.println("No eres MitoCode");
        }
        System.out.println("Hola MitoCode");
        */
    }
    ///////////////////////////////////////////////////////////////
    ///12
    public static void ejemploCicloFor() {
        //12- ciclo for
        //ej 1
        for (int j = 0; j < 5; j++) { // tambien se pude hacer al reverso
            if (j == 2) {
                continue;//break; // me permite terminar el for
            }
            System.out.println(j);
        }
        //ej2
        String[] array = {"Facebook", "Youtube", "Twitter"};
        //aca recorremos todo el array
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        //caso donde no recorremos el array, recomendable su uso cuando usemos listas enlazadas
        for (String s : array) { // se llama forEach
            System.out.println(s);
        }

    }
    ///////////////////////////////////////////////////////////////
    ///13
    public static void ejemploCicloDoWhile() {

        String opcion;
        do{
            System.out.println("Ingrese opcion");
            Scanner sc = new Scanner(System.in);
            opcion = sc.next();
        }while(opcion.equals("Mitocode"));

    }
    ///////////////////////////////////////////////////////////////
    ///14
    public static void ejemploVectores() { //el vector es un array
        //14 vector
        String[] arreglo = new String[2]; // 2 elementos
        arreglo[0] = "Mitocode 1"; //cuando queremos acceder al arreglo
        arreglo[1] = "Subcribete 1";
        //es un for mejorado
        for (String s : arreglo) {
            System.out.println(s);
        }

        //ahora vamos hacerlo de forma dinamica
        System.out.println("---------------------------------------");
        /*
            System.out.println("Ingrese tamaÃ±o del vector");
            Scanner sc = new Scanner(System.in);
            int tamano = sc.nextInt();

            String[] vector =new String[tamano]; // 2 elementos

            for(int c=0 ; c<vector.length ; c++){
                System.out.println("Ingrese contenido para la posicion " + c + " : ");
                vector [c] = sc.next();
            }

            System.out.println("---------------------------------------");

            for(String dato: vector) {
                System.out.println(dato); //para mostrar mi vector
            }
        */
    }

    ///////////////////////////////////////////////////////////////
    ///15
    public static void ejemploVecParalelos() { // se relacionan por el indice
        String[] nombres = new String[3]; // 2 elementos
        int[] edades = new int[3];


        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese nombre:");
            nombres[i] = sc.next();
            System.out.println("Ingrese edad:");
            edades[i] = sc.nextInt();
        }

        for (int j = 0; j < 3; j++) {
            System.out.println(nombres[j] + " " + edades[j]);
        }

        /*
        System.out.println("---------------------------------------");
        //Â¿cual de estos que estoy ingresando por teclado tiene edad 23?
        for(int d=0; d<3 ; d++) {
            if(edades[d] == 23) {
                System.out.println(nombres[d] + " " + edades[d]);
            }
        }
        */
    }
    ///////////////////////////////////////////////////////////////
    ///16
    public static void vectorMayoryMenorElemento() {
        String[] nombres = new String[3]; // 2 elementos
        int[] edades = new int[3];

        for (int d = 0; d < 3; d++) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Ingrese nombre:");
            nombres[d] = sc1.next();
            System.out.println("Ingrese edad:");
            edades[d] = sc1.nextInt();
        }
        System.out.println("---------------------------------------");
        //encontrar mayor elemento
        int mayor = edades[0];
        int posicion = 0;
        for (int i = 0; i < 3; i++) {
            if (edades[i] > mayor) {
                mayor = edades[i];
                posicion = i;
            }
        }
        System.out.println("El mayor es : " + mayor);
        System.out.println("Su nombre es : " + nombres[posicion]);
        System.out.println("---------------------------------------");
        //encontrar menor elemento
        int menor = edades[0];
        int posicion1 = 0;
        for (int j = 0; j < 3; j++) {
            if (edades[j] < menor) {
                menor = edades[j];
                posicion1 = j;
            }
        }
        System.out.println("El menor es : " + menor);
        System.out.println("Su nombre es : " + nombres[posicion1]);

    }

    ///////////////////////////////////////////////////////////////
    ///17
    public static void ordenamientoBurbujeoVector() {

        String[] nombres = new String[3]; // 2 elementos
        int[] edades = new int[3];

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese nombre:");
            nombres[i] = sc.next();
            System.out.println("Ingrese edad:");
            edades[i] = sc.nextInt();
        }
        System.out.println("Vector antes de ser ordenado:");
        for (int j = 0;  j < 3; j++) {
            System.out.println(nombres[j] + " " + edades[j]);
        }

        System.out.println("---------------------------------------");
        System.out.println("Ordenar de menor a mayor el vector edades");
        int aux;
        for(int h=0; h<2 ; h++) {
            for(int j=0; j<2-h ; j++){ // es 2-h xq no voy a seguir hasta el final ya que ya estaria ordenado
                if (edades[j] > edades[j+1]) {
                    aux = edades[j];
                    edades[j] = edades[j+1];
                    edades[j+1] = aux;
                }
            }
        }
        System.out.println("Vector despues de ser ordenado:");

        for(Integer valor : edades) {
            System.out.println(valor);
        }


        System.out.println("---------------------------------------");
        System.out.println("Ordenar de menor a mayor el vector nombres");
        String auxs;

        for(int k=0; k<2 ; k++) {
            for(int r=0; r<2-k ; r++){ // es 2-h xq no voy a seguir hasta el final ya que ya estaria ordenado
                if (nombres[r].compareTo(nombres[r+1]) > 0) {
                    auxs = nombres[r];
                    nombres[r] = nombres[r+1];
                    nombres[r+1] = auxs;
                }
            }
        }
        System.out.println("Vector despues de ser ordenado:");
        for(String valor : nombres) {
            System.out.println(valor);
        }

    }

    ///////////////////////////////////////////////////////////////
    ///18
    public static void ejemploMatriz() { //arrays multidimencional, tiene 2 o mas dimenciones
        Scanner sc = new Scanner(System.in);
        int[][] numeros = new int[3][3];

        //Llenado de la matriz
        for(int i=0 ; i < 3 ; i++){
            for(int j=0 ; j < 3 ; j++){
                System.out.println("Ingrese elemento para la posicion Fila: " + i +" Columna: " + j);
                numeros[i][j] = sc.nextInt();
            }
        }
        //La impresion de la matriz con su forma

        for(int i=0 ; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numeros[i][j]+ "\t");
            }
            System.out.println("\n");
        }

    }
    ///////////////////////////////////////////////////////////////
    //19
    public static void diagonalPrincipalMatriz() {
        Scanner sc = new Scanner(System.in);
        int[][] numeros = new int[3][3];

        //Llenado de la matriz
        for(int i=0 ; i < 3 ; i++){
            for(int j=0 ; j < 3 ; j++){
                System.out.println("Ingrese elemento para la posicion Fila: " + i +" Columna: " + j);
                numeros[i][j] = sc.nextInt();
            }
        }
        //La impresion de la matriz con su forma
        System.out.println("DIAGONAL PRINCIPAL:");
        for(int i=0 ; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                if(i == j){ // tambien si solo queremos columna j == 0 o para fila i == 0
                    System.out.print(numeros[i][j]);
                }else{
                    System.out.print(0);
                }
            }
            System.out.print("\n");
        }
        System.out.println("DIAGONAL PRINCIPAL DE MANERA SECUENCIAL:");
        for(int i=0 ; i < 3 ; i++) {
            System.out.print(numeros[i][i]);
        }
    }
    ///////////////////////////////////////////////////////////////
    //20
    public static void usoSwitch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese elemento en resultado");
        String resultado= sc.next();

        switch (resultado){// aca ponemos la variable que se va a evaluar, abajo pondremos las alternativas de esa variable
            case "Mito":
                System.out.println("Hola Mito");
                break; //termina la ejecucion del bloque y sale afuera

            case "Code":
                System.out.println("Hola Code");
                break;

            default: //por defecto
                System.out.println("Hola por Defecto");
                break;
        }
        System.out.println("Fin de switch");
    }
    ///////////////////////////////////////////////////////////////

}