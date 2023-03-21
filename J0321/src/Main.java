import java.util.Scanner;

public class Main {
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || (i + j) == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //-----------------------------------------------
    public static int maxNum(int a,int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
        //return a>b?a:b;
    }
    public static void main2(String[] args) {
        int a = 10;
        int b = 15;
        int n = maxNum(a,b);
        System.out.println(n);
    }

    public static void login(){
        Scanner scanner = new Scanner(System.in);
        int cnt = 3;
        while(cnt != 0){
            System.out.println("请输入密码，你有 "+cnt+" 次机会:>");
            String password = scanner.nextLine();
            if(password.equals("123456")){
                System.out.println("密码正确！");
                break;
            }else{
                cnt--;
                System.out.println("密码有误，你还有 "+cnt+" 次机会");
            }
        }
    }
    public static void main3(String[] args) {
        login();
    }
    //------------------------------------------------------------
    public static int fac(int n){
        if(n == 1){
            return 1;
        }
        int tmp = n * fac(n - 1);
        return tmp;
    }
    public static void main4(String[] args) {
        System.out.println(fac(5));
    }
    //-----------------------------------------
    public static void print1(int num){
        while(num != 0){
            System.out.println(num % 10);
            num /= 10;
        }
    }
    public static void print(int num){
        if(num <= 9){
            System.out.println(num);
        }else{
            print(num / 10);
            System.out.println(num % 10);
        }
    }
    public static void main5(String[] args) {
        print(123);
    }
//    public static int sum(int num){
//        if(num == 1){
//            return num;
//        }
//        return num + sum(num - 1);
//    }
//    public static int sum(int num){
//        if(num <= 9){
//            return num;
//        }else{
//            sum(num/10);
//            return num % 10;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        sum(num);
//    }
    public static int sum(int n){
        int sum = 0;
        if(n == 0){
            sum = sum + n;
            return n;
        }else{
            sum = sum + n;
            return n % 10 + sum(n / 10);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = sum(n);
        System.out.println(sum);
    }
}