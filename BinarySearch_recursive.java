public class BinarySearch_recursive {



public static int binarysearch(int[] array, int left, int right, int key){
        int middle = (left + right) /2;

        if(array[middle] == key){

          return middle;
        }
        else if(array[middle] > key){
          return binarysearch(array, left, middle, key);


        }
        return binarysearch(array, middle, right, key);







}

public static void main(String[] args){

        int[] array = {2, 3, 4, 5, 6, 7, 8, 9};
        int key = 8;

        System.out.println(binarysearch(array, 0, array.length, key));


}

}
