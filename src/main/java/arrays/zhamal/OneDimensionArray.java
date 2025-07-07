package arrays.zhamal;

import java.util.Arrays;

public class OneDimensionArray {
    public static void main ( String [] args){

         int [] patienttinjashy = { 65, 78, 43, 25, 87 } ;
         int komnata = Arrays .binarySearch( patienttinjashy , 43);
         System.out.println(  " 25 jashtagy Alinanyn komnatasy " + komnata  );

        int [] taschengeld  = {450, 675, 850, 1100, 1500};
        for (int s = 0; s < taschengeld.length; s++) {
            System.out.println(" Die Studenten bekommen insgesamt " + s + " = " + taschengeld[s]);
        }
          int [] sandar = { 43, 45, 99, 223, 567, 1, 56, 43, 19, 90};
          int max =  sandar [ 0];
          int min = sandar [ 0];

          for ( int num : sandar ){
              if ( num > max) max = num ;
              if ( num < min) min = num ;
              }
        System.out.println( " maximum  " + max );
        System .out .println( " minimum  " + min);


    }


    }


