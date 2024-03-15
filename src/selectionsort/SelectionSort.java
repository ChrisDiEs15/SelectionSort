/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selectionsort;
import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Programa que sirve para ordenar a treves del metodo de burbuja");
        System.out.println("Ingrese el numero de elementos a ordenar");
        int numEl = sc.nextInt();
        /*creates an temp array for store newArray return*/
        int[] tmpArray = new int[numEl];
        /*Call to creates an array*/
        tmpArray = NewArray(numEl);
        /*print unordered array*/
        System.out.println("El arreglo que ha ingresado es:");
        PrintArray(numEl, tmpArray);
        /*pass the tmpArray to order function and overwrite the tmp with bubble ordered*/
        tmpArray = SelectionOrder(numEl, tmpArray);
        System.out.println("El arreglo ordenado es:");
        PrintArray(numEl, tmpArray);
    }
     public static int[] SelectionOrder(int numEl, int[] unorderedArray) {
        int[] newArray = unorderedArray; 
        /*look for the minus element*/
       for (int i = 0; i < numEl - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numEl; j++) {
                if (newArray[j] < newArray[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap newArray[i] and newArray[minIndex]
            int temp = newArray[i];
            newArray[i] = newArray[minIndex];
            newArray[minIndex] = temp;
        }
        
        return newArray;
    }

    /* creates and fills the array */
    public static int[] NewArray(int numEl) {
        int[] newArray = new int[numEl];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numEl; i++) {
            System.out.println("Ingrese el dato en la posicion " + i);
            int nwEl = sc.nextInt();
            newArray[i] = nwEl;
        }

        return newArray;
    }

    /* PrintArray */
    public static void PrintArray(int numEl, int[] arrayToPrint) {
        for (int i = 0; i < numEl; i++) {
            System.out.print(arrayToPrint[i] + " ");
        }
        System.out.println();
    }
    
}
