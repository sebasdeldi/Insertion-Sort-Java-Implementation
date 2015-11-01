/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

import java.util.Arrays;

/**
 *
 * @author CARITO
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      
      InsertionSort is = new InsertionSort();
      
       
      is.ISortDes(new int[]{34,65,12,9,4,500,0}); 
      is.ISortAs(new int[]{34,65,12,9,4,500,0}); 
        
    }
    
    
    public void ISortDes(int[]nums){
     int j;                   // the number of items sorted so far
     int key;                // the item to be inserted
     int i; 

     for (j = 1; j < nums.length; j++)    // Start with 1 (not 0)
    {
           key = nums[ j ];
             for(i = j - 1; (i >= 0) && (nums[ i ] < key); i--)   // Smaller values are moving up
          {
                 nums[ i+1 ] = nums[ i ];
          }
         nums[ i+1 ] = key;    // Put the key in its proper location
     }
        
        System.out.println(Arrays.toString(nums));
    
            }
    
     public void ISortAs(int[]nums){
     int j;                   // the number of items sorted so far
     int key;                // the item to be inserted
     int i; 

     for (j = 1; j < nums.length; j++)    // Start with 1 (not 0)
    {
           key = nums[ j ];
             for(i = j - 1; (i >= 0) && (nums[ i ] > key); i--)   // Smaller values are moving up
          {
                 nums[ i+1 ] = nums[ i ];
          }
         nums[ i+1 ] = key;    // Put the key in its proper location
     }
        
        System.out.println(Arrays.toString(nums));
    
            }
    
}


