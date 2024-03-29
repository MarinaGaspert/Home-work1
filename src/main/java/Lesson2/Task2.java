package Lesson2;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Напишите метод, который составит строку, состоящую из 100 повторений слова
 * TEST и метод,
 * который запишет эту строку в простой текстовый файл, обработайте исключения.
 */
public class Task2 {
    public static void main(String[] args) {
        generateString();
        writer();

    }

    private static void writer() {
        try {
                FileOutputStream fileOutputStream = new FileOutputStream("test.txt");

                fileOutputStream.write(generateString().toString().getBytes());

                fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("Проблема вывода!");
                e.printStackTrace();
            }
        }

    private static StringBuilder generateString() {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 100; i++) {
                stringBuilder.append("TEST ");
            }
            return stringBuilder;
        }
}

