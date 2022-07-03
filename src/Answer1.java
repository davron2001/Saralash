import java.io.PrintWriter;
import java.util.Scanner;

public class Answer1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        byte x = 0;
        byte y = 0;
        boolean robotBor = false;
        for (byte i = 0; i < 7; i++) {
            for (byte j = 0; j < 7; j++) {
                if (in.nextByte() > 0) {
                    x = i;
                    y = j;
                    robotBor = true;
                }
            }
        }
        if (robotBor)
            out.print("Markazgacha eng yaqin masofa. " + ((x > 3 ? x - 3 : 3 - x) + (y > 3 ? y - 3 : 3 - y)));
        else
            out.printf("Robot yo'q.");
        out.flush();
    }
}
