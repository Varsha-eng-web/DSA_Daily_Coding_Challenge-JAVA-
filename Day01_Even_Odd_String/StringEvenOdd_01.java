import java.util.Scanner;
public class StringEvenOdd_01 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<t; i++) {
            String str = sc.nextLine();
            String Evenstr = "";
            String Oddstr = "";
            for(int j=0; j<str.length(); j++) {
                if(j%2 == 0) {
                    Evenstr += str.charAt(j);
                }
                else {
                    Oddstr += str.charAt(j);
                }
            }
            System.out.println(Evenstr + " " + Oddstr);
            System.out.println();
        }
    }
}