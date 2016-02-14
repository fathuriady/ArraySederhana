/*
Dibuat oleh : Fathuriady
Tanggal     : 15 Feb 2016
*/
package belajar;
import java.util.Random;
import java.util.Scanner;
public class Belajar 
{


    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Random randomk = new Random();
        int i,j;
        int hasil = 0;
        
        
        System.out.println("Masukkan besar Array : ");
        j = input.nextInt();
        int array[]=new int[j];
        
        for(int counter = 0; counter < j; counter++)
        {
         i = randomk.nextInt(99);
         array[counter] =  i;
         System.out.println("Array ke- " + (counter+1) + " adalah " + array[counter]);
        }
        System.out.println("\nIndex\tValue");
        for(int counter = 0; counter<j; counter++)
        {
         
         System.out.println((counter+1) +"\t" + array[counter]);
         hasil += array[counter];
         
        }
        System.out.println("Jumlah semua nilai Array adalah " + hasil);
        
    }

}
