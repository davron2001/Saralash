import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort();
        if (n < 5) System.out.println(0);
        else System.out.println(1);
    }
}
