import java.util.Scanner;

public class CalculateRectangleArea_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int area = calculatesArea(width, length);
        System.out.println(area);
    }

    private static Integer calculatesArea(int width, int length) {
        return width * length;
    }
}
