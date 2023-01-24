IncredibleCalculator.java

import java.util.Scanner;

public class IncredibleCalculator {

    public static void main(String[] args) {

        int a=0, b=0;
        double a2=0.0, b2=0.0;
        

        System.out.println("Selecciona la operación que prefieras realizar: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir (división entera)");
        System.out.println("5. Dividir (división con decimales)");

        int opcion = leerEnteroEntrada();


        switch (opcion) {
            case 1: //Sumar. Debes leer dos numeros enteros de entrada e imprimir su suma
                System.out.println("Diga número a");
                a=leerEnteroEntrada();
                System.out.println("Ahora diga número b");
                b=leerEnteroEntrada();
                System.out.println(suma(a, b));
                    break;
            case 2: // Restar. Debes leer dos números enteros de entrada e imprimir su resta
                System.out.println("Diga número a");
                a=leerEnteroEntrada();
                System.out.println("Ahora diga número b");
                b=leerEnteroEntrada();
                System.out.println(resta(a, b));        
                break;
            case 3: // Multiplicar. Debes leer dos números enteros de entrada e imprimir su producto.
                System.out.println("Diga número a");
                a=leerEnteroEntrada();
                System.out.println("Ahora diga número b");
                b=leerEnteroEntrada(); 
                System.out.println(multiplicacion(a, b)); 
                break;
            case 4: // Dividir enteros. Debes leer dos números enteros de entrada e imprimir su división entera.
                System.out.println("Diga número a");
                a=leerEnteroEntrada();
                System.out.println("Ahora diga número b");
                b=leerEnteroEntrada(); 
                System.out.println(divisionEntera(a, b));    
                break;
            case 5: // Dividir con decimales. Debes leer dos números enteros de entrada e imprimir su división con decimales.
                System.out.println("Diga número a");
                a2=leerEnteroEntrada();
                System.out.println("Ahora diga número b");
                b2=leerEnteroEntrada(); 
                System.out.println(divisionEntera(a2, b2));     
                break;

        }

    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int divisionEntera(int a, int b) {
        return a / b;
    }

    public static double divisionConDecimales(int a, int b) {
        return a / (b * 1.0);
    }

    public static int leerEnteroEntrada() {
        try {
            Scanner sc = new Scanner(System.in);
            int result = Integer.parseInt(sc.next());
            sc.close();
            return result;
        } catch (NumberFormatException ex) {
            System.err.println("Lo que has introducido no es un número entero!");
            System.exit(1);
            return -1;
        }

    }

}
