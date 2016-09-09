/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw0907;
import java.util.*;
import java.io.*;
//import java.io.PrintWriter;
/**
 *
 * @author jhonsong
 */
public class FileGen 
{
    private int size = 0;
    int[] intArray = null;
    Random rd = new Random();

    public FileGen(int size) throws IOException
    {
        this.size = size;
        intArray = new int[size];
        for(int i = 0; i < size; i++)
        {
            intArray[i] = i;
        }

        shuffle();
        
        FileOutputStream fos = new FileOutputStream("input.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        for(int i = 0; i < size; i++)
        {
            dos.writeInt(intArray[i]);
        }
        dos.writeInt(-1);
        dos.close();       
        fos.close();
    }
    
    private void shuffle()
    {
        for(int i = 0; i < size; i ++)
        {
           int randomInt = rd.nextInt(size);
           int swap = 0;
           swap = intArray[i];
           intArray[i] = intArray[randomInt];
           intArray[randomInt] = swap;
        }
        for(int i = size -1; i >= 0; i --)
        {
           int randomInt = rd.nextInt(size);
           int swap = 0;
           swap = intArray[i];
           intArray[i] = intArray[randomInt];
           intArray[randomInt] = swap;
        }
    }
}
