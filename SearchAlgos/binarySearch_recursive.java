public class binarysearch{

  public static int binarysearch(int[] array, int left, int right, int key){

      if(right >= left){
        int middle = (left + right)/2;

        if(array[middle] == key){
          return middle;
        }
        else if(array[middle] > key){
          return binarysearch(array, left, middle, key);
        }
        return binarysearch(array, middle, right, key);
      }
      return -1;

  }
}
