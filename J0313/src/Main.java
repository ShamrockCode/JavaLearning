import java.util.Scanner;

public class Main {
    public static void main1(String[] args) {
        int a = 18;
        int b = 24;
        int c = a % b;
        while(c != 0){
            a = b;
            b = c;
            c = a % b;
        }
        System.out.println(b);
    }

    public static void main2(String[] args) {
        for (int i = 0; i < 10000; i++) {
            int cnt = 0;
            int tmp = i;
            while(tmp != 0){
                cnt++;
                tmp /= 10;
            }
            tmp = i;
            int sum = 0;
            while(tmp != 0){
                sum += Math.pow(tmp % 10,cnt);
                tmp /= 10;
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }

    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt  = 0;
        for (int i = 0; i < 32; i++) {
            if((n & 1) != 0){
                cnt++;
            }
            n = n >>> 1;
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        int n = 15;
        int cnt = 0;
        while(n != 0){
            n = n & (n - 1);
            cnt++;
        }
        System.out.println(cnt);
    }
}