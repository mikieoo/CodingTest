import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int originalNum = num;

        int cnt = 0;
        do {
            int share = num / 10;
            int remain = num % 10;

            int sum = share + remain;

            num = remain * 10 + (sum % 10);

            cnt++;

        } while (num != originalNum);

        System.out.println(cnt);
    }
}