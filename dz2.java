import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся
// имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

public class dz2 {
    public static void main(String[] args) {
        Map<String, Integer> repit = new HashMap<>();
        Map<String, String> contacts = new HashMap();

        contacts.put("Иванов", "Иван");
        contacts.put("Петрова", "Светлана");
        contacts.put("Белова", "Кристина");
        contacts.put("Мусина", "Анна");
        contacts.put("Крутова", "Анна");
        contacts.put("Юрин", "Иван");
        contacts.put("Лыков", "Петр");
        contacts.put("Чернов", "Павел");
        contacts.put("Чернышов", "Петр");
        contacts.put("Федорова", "Мария");
        contacts.put("Светлова", "Марина");
        contacts.put("Савина", "Мария");
        contacts.put("Рыкова", "Мария");
        contacts.put("Лугова", "Марина");
        contacts.put("Владимирова", "Анна");
        contacts.put("Мечников", "Иван");
        contacts.put("Петин", "Петр");
        contacts.put("Ежов", "Иван");

        countName(repit, contacts);

        showSort(repit);

    }

    private static void countName(Map<String, Integer> repit, Map<String, String> contacts) {
        for (var elem : contacts.entrySet()) {
            if (repit.containsKey(elem.getValue())) {
                repit.put(elem.getValue(), repit.get(elem.getValue()) + 1);
            } else
                repit.put(elem.getValue(), 1);

        }
        System.out.println(repit);
    }

    private static void showSort(Map<String, Integer> repit) {
        ArrayList newList = new ArrayList<>();
        Integer maxNum = 0;
        String maxName = "";
        Integer size = repit.size();
        for (int i = 0; i < size; i++) {
            maxNum = 0;
            for (var elem : repit.entrySet()) {
                if (elem.getValue() > maxNum) {
                    maxNum = elem.getValue();
                    maxName = elem.getKey();
                }
            }
            newList.add(maxName + "=" + maxNum);
            repit.remove(maxName);
        }
        System.out.println(newList.toString());
    }
}
