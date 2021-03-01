import java.util.Arrays;

public class MergeSort {

public static int[] mergesort(int[] array){

        if(array.length > 1) {
                int middle = (int)(array.length/2);
                int[] left = new int[middle];
                for(int i =0; i <=middle-1; i++) {
                        left[i] = array[i];
                }
                int[] right = new int[array.length-middle];
                for(int i= middle; i <= array.length-1; i++) {
                        right[i-middle] = array[i];
                }
                left = mergesort(left);
                right = mergesort(right);
                return merge(left, right);
        }
        else
                return array;



}

public static int[] merge(int[] left, int[] right){
        int[] newarr = new int[left.length + right.length];
        int indexl = 0;
        int indexr = 0;
        int indexresult = 0;
        while(indexl < left.length && indexr < right.length) {
                if(left[indexl] < right[indexr]) {
                        newarr[indexresult] = left[indexl];
                        indexl++;
                }
                else{
                        newarr[indexresult] = right[indexr];
                        indexr++;
                }
                indexresult++;
        }
        while(indexl < left.length) {
                newarr[indexresult] = left[indexl];
                indexl++;
                indexresult++;
        }
        while(indexr < right.length) {
                newarr[indexresult] = right[indexr];
                indexr++;
                indexresult++;
        }

        return newarr;
}
public static void main(String[] args){


        int[] array = {900, 1, 3, 4, 6, 72, -7, 9};

        System.out.println(Arrays.toString(mergesort(array)));


}

}
