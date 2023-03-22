import java.util.Arrays;

public class Main {
    public static int fib(int n){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main1(String[] args) {
//        System.out.println(fib(1));
//        System.out.println(fib(2));
//        System.out.println(fib(3));
//        System.out.println(fib(4));
        for (int i = 1; i < 11; i++) {
            System.out.println(fib(i));
        }
    }

    public static void main(String[] args) {
        //数组 - 连续的空间
        int[] array = {1,2,3,4,5};
        int[] array2 = new int[]{1,2,3,4,5};
        System.out.println(array[0]);
        //array[0] = 99;
        //System.out.println(array[0]);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("=====================");
        for (int x: array) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("=====================");
        System.out.println(Arrays.toString(array));
    }
}