//Author: Benjamin Gantenbein

import java.util.Arrays;

public class BubbleSort{


  public static int[] bubblesort(int[] array){

      for(int i= 0; i < array.length; i++){
        for(int j = i; j < array.length; j++){
            if(array[i] > array[j]){
              int temp = array[i];
              array[i] = array[j];
              array[j] = temp;
            }

        }
      }
      return array;


  }



  public static void main(String[] args){


          int[] array = {900, 1, 3, 4, 6, 72, -7, 9};


          System.out.println(Arrays.toString(bubblesort(array)));


  }

}
