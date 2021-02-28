public class LinearSearch{


  public static int linearsearch(int[] array, int key){
      for(int i =0; i < array.length; i++){
        if(array[i] == key){
          return i;

        }
      }
      return -1;


  }



  public static void main(String[] args){


    int[] array = {2, 3, 4, 5, 6, 7, 8, 9};
     int key = 8;

     System.out.println(linearsearch(array, key));


  }
}
