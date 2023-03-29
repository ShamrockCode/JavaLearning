import java.util.Arrays;

/**
 * @Author Shamrock
 * @Date ${DATE} ${TIME}
 * @description: ${description}
 * @Title: ${NAME}
 * @Package
 */
public class Main {
    public static void func(int[] array){
        int left = 0;
        int right = array.length - 1;
        while(left < right){
            while(left < right && array[left] % 2 != 0){
                left++;
            }
            while(left < right && array[right] % 2 == 0){
                right--;
            }
            //此时left下标是偶数，right下标是奇数
            if(left < right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
                left++;
                right--;
            }
        }
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5,6};
        func(array);
        System.out.println(Arrays.toString(array));
    }
//两数之和 ============================================
    public static int[] twoSum(int[] nums,int target){
        int[] ret = new int[]{-1, -1};
        for (int left = 0; left < nums.length-1; left++) {
            for (int right = left+1; right < nums.length; right++) {
                if(nums[left] + nums[right] == target){
                    ret[0] = left;
                    ret[1] = right;
                    return ret;
                }
            }
        }
        return null;
    }
//=====================================================
    public static int func2(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum ^= array[i];
        }
        return sum;
    }
    public static void main2(String[] args) {
        int array[] = {1,9,5,9,1};
        System.out.println(func2(array));
    }
    //=========================================================

}