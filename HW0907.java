/*
 * Jiansong He
 * URL: https://github.com/paradox42/COSC311
 * COSC 311
 * HW 09/07
 * FALL 2016
 */
package hw0907;
import java.io.*;

public class HW0907 
{
    static  final int SIZE = 1000;
    static int[] intArray = new int[SIZE];
    
    public static void main(String[] args) throws IOException
    {
        FileGen fg = new FileGen(SIZE);
        
        readFile();
        
        //mySort();
    }
    
    public static void readFile() throws IOException
    {
        FileInputStream fis = new FileInputStream("input.txt");
        DataInputStream dis = new DataInputStream(fis);
        for(int i = 0; i < SIZE; i++)
        {
            intArray[i] = dis.readInt();
        }
    }
    
    public static void selectionSort()
    {
        
    }
    
    public static void mySort()
    {
        for(int i = 0; i < SIZE; i++)
        {
            for(int j = SIZE -1; j > i; j--)
            {
                if (intArray[j] < intArray[i])
                {
                    int swap = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = swap;
                }
            }
            System.out.printf("%d ", intArray[i]);
        }
    }
    
}
