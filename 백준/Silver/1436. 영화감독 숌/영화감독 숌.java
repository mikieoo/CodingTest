import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int index = 0;
        int small = 666;
        int result = 0;

        while (index < n) {
            String str = String.valueOf(small);
            if (str.contains("666")) {
                result = small;
                index++;
            }
            small++;
        }

        System.out.println(result);
    }
}