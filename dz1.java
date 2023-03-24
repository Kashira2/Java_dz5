import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.lang.model.element.Element;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
// что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568

public class dz1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println(
                "Введите 1, чтобы добавить контакт\nВведите 2, чтобы показать списко контактов\nВведите 3, чтобы выйти");
        Integer choose = scr.nextInt();
        Map<String, String> listContacts = new HashMap<>();

        while (choose != 3) {

            if (choose.equals(1)) {
                addNumber(scr, listContacts);
            } else if (choose.equals(2)) {
                showNumber(listContacts);
            }else System.out.println("Вводите цифры от 1 до 3");

            System.out.println(
                    "Введите 1, чтобы добавить контакт\nВведите 2, чтобы показать списко контактов\nВведите 3, чтобы выйти");
            choose = scr.nextInt();
        }

        scr.close();
    }

    private static void showNumber(Map<String, String> list) {
        for (var element : list.entrySet()) {
            System.out.printf("%s: %s\n", element.getKey(), element.getValue());
        }
    }

    private static Map addNumber(Scanner scr, Map list) {
        System.out.println("Введите фамилию");
        String name = scr.next();
        System.out.println("Введите номер");
        Integer num = scr.nextInt();
        if (list.containsKey(name)) {
            list.put(name, list.get(name)+" , " + num);
        } else
            list.put(name, num);

        return list;
    }
}