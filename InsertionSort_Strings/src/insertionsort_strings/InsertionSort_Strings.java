/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort_strings;

import java.util.Arrays;

/**
 *
 * @author CARITO
 */
public class InsertionSort_Strings {

    public static void main(String[] args) {
     
      
        InsertionSort_Strings is = new InsertionSort_Strings();
      
       
      is.ISortDes(new String[]{"ABC", "ADARERE", "DERETRAR", "ZARERA", "GTEPEA"}); 
      is.ISortAs(new String[]{"ABC", "ADARERE", "DERETRAR", "ZARERA", "GTEPEA"});
        
    }
    
    
    public void ISortDes(String[]strings){
     int j;                   // the number of items sorted so far
     String key;                // the item to be inserted
     int i; 

     for (j = 1; j < strings.length; j++)    // Start with 1 (not 0)
    {
           key = strings[ j ];
           
           
             for(i = j - 1; (i >= 0) ; i--)   // Smaller values are moving up
                 
          {
                if (key.compareTo(strings[i]) > 0){
                  break;
                }
                 strings[ i+1 ] = strings[ i ];
          }
         strings[ i+1 ] = key;    // Put the key in its proper location
     }
        
        for (int k = 0; k < strings.length; k++){
            
            System.out.println(strings[k]);
           
            
            
            
        }
    
            }
    
    
    
    public void ISortAs(String[]strings){
     int j;                   // the number of items sorted so far
     String key;                // the item to be inserted
     int i; 

     for (j = 1; j < strings.length; j++)    // Start with 1 (not 0)
    {
           key = strings[ j ];
           
           
             for(i = j - 1; (i >= 0) ; i--)   // Smaller values are moving up
                 
          {
                if (key.compareTo(strings[i]) <= 0){
                  break;
                }
                 strings[ i+1 ] = strings[ i ];
          }
         strings[ i+1 ] = key;    // Put the key in its proper location
     }
        
        for (int k = 0; k < strings.length; k++){
            
            System.out.println(strings[k]);
           
            
            
            
        }
    
            }
    
   
    
}
