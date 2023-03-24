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
        Map<String, Integer> listRepit = new HashMap<>();
        ArrayList listContacts = new ArrayList<>();
        listContacts.add("Иван Иванов");
        listContacts.add("Светлана Петрова");
        listContacts.add("Кристина Белова");
        listContacts.add("Анна Мусина");
        listContacts.add("Анна Крутова");
        listContacts.add("Иван Юрин");
        listContacts.add("Петр Лыков");
        listContacts.add("Павел Чернов");
        listContacts.add("Петр Чернышов");
        listContacts.add("Мария Федорова");
        listContacts.add("Марина Светлова");
        listContacts.add("Мария Савина");
        listContacts.add("Мария Рыкова");
        listContacts.add("Марина Лугова");
        listContacts.add("Анна Владимирова");
        listContacts.add("Иван Мечников");
        listContacts.add("Петр Петин");
        listContacts.add("Иван Ежов");

        for (int i = 0; i < listContacts.size(); i++) {
            if(listRepit.containsKey(listContacts.get(i))){
                listRepit.put(listContacts.get(i), );
            }else listRepit.put(listContacts.get(i),i);
        }
    }
}
