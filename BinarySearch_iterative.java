public class BinarySearch_iterative{



  public static int binarysearch(int[] array, int key){
      int left = 0;
      int right = array.length;

      while(left<=right){
        int middle = (left + right) / 2;
        if(array[middle] == key){
          return middle;
        }
        else if(array[middle] < key){
          left = middle +1;
        }
        else{
          right = middle-1;
        }
      }
      return -1;

  }

  public static void main(String[] args){

    int[] array = {2, 3, 4, 5 , 6, 7, 8, 9};
    int key = 8;

    System.out.println(binarysearch(array, key));

  }

}
