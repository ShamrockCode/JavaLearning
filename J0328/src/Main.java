import java.util.Arrays;

/**
 * @Author Shamrock
 * @Date ${DATE} ${TIME}
 * @description: ${description}
 * @Title: ${NAME}
 * @Package
 */
public class Main {
    public static void main1(String[] args) {
        int[][] array= new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }
}