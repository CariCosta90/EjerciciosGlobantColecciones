package valoresenteros;

/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y 
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se 
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el 
programa mostrará por pantalla el número de valores que se han leído, su suma y su 
media (promedio).
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ValoresEnteros {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Integer> numeros = new ArrayList();

        int num=0;


        while (num != -99) {
            System.out.println("Ingresa un numero: ");
            num = leer.nextInt();
            if(num!=-99){
                numeros.add(num);
            }             
        }

        System.out.println("La lista de numeros ingresados hasta ahora es de: ");

        for (Integer numero : numeros) {
            System.out.println("[" + numero + "]");
        }

        System.out.println("El largo de la lista de numeros leidos es de: " + numeros.size());

        int suma = 0;
        int promedio;

        for (Integer numero : numeros) {
            suma += numero;
        }

        promedio = suma / numeros.size();

        System.out.println("El promedio de los numeros es de: " + promedio);

    }

}
