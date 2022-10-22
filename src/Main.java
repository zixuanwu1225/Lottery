import java.util.Scanner;
import java.text.*;
public class Main {
    public static void main(String[] args) {
        DecimalFormat currency = new DecimalFormat("###00");
        Scanner s = new Scanner(System.in);
        Integer f = s.nextInt();
        Lottery p = new Lottery();
        System.out.println(p.determineWinnings(f));
    }
}