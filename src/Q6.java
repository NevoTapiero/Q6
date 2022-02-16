import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int [] num1 = new int[20];
        int [] num2 = new int[20];
        for(int i = 0; i < 20; i++){
            num1[i] = (int)(Math.random()*(100 - 1)+ 1);
            System.out.println(num1[i]);
        }
        System.out.println("");
        shiftRight(num1, num2);
        GiveMeNumbers(num1, num2);
    }
    public static void shiftRight(int [] num1, int [] num2){
        int num;
        int b = 1;
        num = num1[19];
        int m = 19;
        for(int i = 0; i < 20; i++) {
            num2[i] = num1[i + m];
            m = -1;
            System.out.println(num2[i]);
        }
    }
    public static void GiveMeNumbers(int [] num1, int [] num2){
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < num1.length; i++){
            System.out.println("give me any number you want");
            num1[i] = s.nextInt();
            System.out.println(num1[i]);
        }
        shiftRight(num1, num2);
    }
}
