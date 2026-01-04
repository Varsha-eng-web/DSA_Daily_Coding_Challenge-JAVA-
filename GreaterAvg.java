package Day02_Array_problem;
    import java.util.*;
    public class GreaterAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println(0);
            return;
        }
        long sum = sc.nextLong(); // first element
        int count = 1;
        int result = 0;

        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();

            if (x > (double) sum / count) {
                result++;
            }
            sum += x;
            count++;
        }
        System.out.println(result);
        sc.close();
    }
}
