import java.util.Scanner;

public class BirthDayTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        BirthDay date = new BirthDay();

        date.setYear(year);
        date.setMonth(month);
        date.setDay(day);

        date.showAll();
    }
}
