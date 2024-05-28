import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            stack.push(i + 1);
            sb.append("+").append("\n");
            while (!stack.isEmpty() && arr[index] == stack.peek()) {
                stack.pop();
                sb.append("-").append("\n");
                index++;
            }
        }

        System.out.println((n == index) ? sb.toString() : "NO");
    }
}