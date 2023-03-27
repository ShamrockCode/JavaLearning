/**
 * @Author Shamrock
 * @Date 2023/3/27 20:40
 * @description:
 * @Title: Test
 * @Package PACKAGE_NAME
 */
import java.util.Arrays;

public class Test {
    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5};
        //System.out.println(array[3]);
        //int[] array2 = array;
        //System.out.println(array2.length);


        String ret1 = Arrays.toString(array);
        //String ret2 = Arrays.toString(array2);
        System.out.println(ret1);
        //System.out.println(ret2);
    }
    //public static int binSearch(int[] array,int key){
    //    int left = 0;
    //    int right = array.length - 1;
    //    while(left <= right){
    //        int m = (left + right) / 2;
    //        if(array[m] > key){
    //            right = m - 1;
    //        }else if(array[m] < key){
    //            left = m + 1;
    //        }else{
    //            return m;
    //        }
    //    }
    //    return -1;
    //}

    public static void main(String[] args) {
        int[] array = {1,2,13,4,51,6,7};
        System.out.println("Before Sorting:>"+ " " +Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After Sorting:>" + " " +Arrays.toString(array));
        //int index = binSearch(array,5);
        int index = Arrays.binarySearch(array,5);
        System.out.println("The subscript is:>" + " " + index);
        int[] ret = Arrays.copyOf(array,array.length * 2);
        System.out.println(Arrays.toString(ret));
        int[] ret2 = Arrays.copyOfRange(array,0,4);
        System.out.println(Arrays.toString(ret2));
    }
}