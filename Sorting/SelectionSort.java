import java.util.Arrays;

public class SelectionSort {

public static int[] selectionsort(int[] array){


        for(int i= 0; i < array.length-1; i++) {
                int key = array[i];
                int index = i;

                for(int j = i+1; j < array.length; j++) {
                        if(array[j] < key) {
                                key = array[j];
                                index = j;
                        }


                }
                int temp = array[i];
                array[i] = key;
                array[index] = temp;


        }
        return array;

}

public static void main(String[] args){


        int[] array = {900, 1, 3, 4, 6, 72, -7, 9};

        System.out.println(Arrays.toString(selectionsort(array)));


}

}
