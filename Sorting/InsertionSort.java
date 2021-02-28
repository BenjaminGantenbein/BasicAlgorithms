import java.util.Arrays;

public class InsertionSort {

public static int[] insertionsort(int[] array){

    for(int j = 0; j < array.length; j++){
      int compareme = array[j];
      int i = j -1;
      while(i >= 0 && array[i] > compareme){
        array[i + 1] = array[i];
        i = i -1;
      }
      array[i + 1] = compareme
      ;


    }
    return array;



}
public static void main(String[] args){


        int[] array = {900, 1, 3, 4, 6, 72, -7, 9};

        System.out.println(Arrays.toString(insertionsort(array)));


}

}
