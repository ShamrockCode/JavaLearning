import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int randNum = random.nextInt(100);

        while(true) {
            int n = scan.nextInt();
            if(n < randNum) {
                System.out.println("你猜小了！");
            }else if(n == randNum) {
                System.out.println("你猜对了！");
                break;
            }else {
                System.out.println("你猜大了！");
            }
        }
    }

    public static void main2(String[] args) {
        int num = 9;
        int i = 2;
        for (i = 2; i < num - 1; i++) {
            if(num % i == 0){
                System.out.println("不是素数！");
                break;
            }
        }
        if(i == num){
            System.out.println("是素数！");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i +"="+i*j+" ");
            }
            System.out.println();

        }
    }
}