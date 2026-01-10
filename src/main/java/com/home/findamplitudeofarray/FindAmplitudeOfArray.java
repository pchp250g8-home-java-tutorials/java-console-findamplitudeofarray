/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.home.findamplitudeofarray;
import java.io.*;
import java.util.*;
/**
 *
 * @author PC
 */
public class FindAmplitudeOfArray 
{

    public static void main(String[] args) throws Exception
    {
        System.out.println("Input a count of elements in array");
        var bufStdIn = new BufferedReader(new InputStreamReader(System.in));
        var nElems = Integer.parseInt(bufStdIn.readLine());
        if(nElems == 0)
        {
            System.out.println("Empty arrays not allowed");
            System.exit(1);
        }
        var iNumbers = new int[nElems];
        var oRnd = new Random();
        System.out.println("Generating array by filling " + nElems + " elements");
        for(int i = 0; i < nElems; i++)
        {
            iNumbers[i] = oRnd.nextInt(1, 100);
            System.out.format("%d ", iNumbers[i]);
        }
        var iMax = iNumbers[0];
        var nMaxIndex = 0;
        var iMin = iNumbers[0];
        var nMinIndex = 0;
        for(int i = 1; i < nElems; i++)
        {
            if(iNumbers[i] > iMax)
            {
                iMax = iNumbers[i];
                nMaxIndex = i;
            }
            if(iNumbers[i] < iMin)
            {
                iMin = iNumbers[i];
                nMinIndex = i;
            }
         
        }
        System.out.format
        (
           "\r\nFound maximum element:%d with index %d\r\n", 
           iMax, nMaxIndex
        );
        System.out.format
        (
           "Found minimum element:%d with index %d\r\n", 
           iMin, nMinIndex
        );
        System.out.format("Found amplitude:%d", iMax - iMin);
    }
}