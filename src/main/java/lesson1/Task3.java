/* В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59 */

package lesson1;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        greetingUserIntCurrentTime();

    }

    private static void greetingUserIntCurrentTime() {
        String nameUser = getNameUser();
        int hour = getCurrentHour();
        if (5 <= hour && hour <= 11) {
            System.out.printf("Доброе утро, %s!", nameUser);
        } else if (12 <= hour && hour <= 17) {
            System.out.printf("Добрый день, %s!", nameUser);
        } else if (18 <= hour && hour <= 22) {
            System.out.printf("Добрый вечер, %s!", nameUser);
        } else {
            System.out.printf("Доброй ночи, %s!", nameUser);
        }
    }

    private static String getNameUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String nameUser = in.nextLine();
        in.close();
        return nameUser;
    }

    private static int getCurrentHour() {
        LocalDateTime currentTime = LocalDateTime.now();
        int hour = currentTime.getHour();
        return hour;
    }
}
