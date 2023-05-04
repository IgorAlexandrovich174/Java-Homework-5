import javax.naming.Name;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    private final PhoneBook phoneBook;

    public static void main(String[] args) {
        PhoneBook phoneBook1 = new PhoneBook();
        Main main = new Main(phoneBook1);
        main.ex1(); // не стал создавать метод на поиск контакта по номеру
        main.ex2();
    }

    public Main(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void ex1() {
//        Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
//        что 1 человек может иметь несколько телефонов.

        phoneBook.addContact("Геннадий Васильевич Иванов","+ 7 952 123 99 31");
        phoneBook.addContact("Геннадий Васильевич Иванов","+ 7 823 132 41 43");

        phoneBook.addContact("Геннадий Васильевич Гирин", "+7 923 131 33 00");
        phoneBook.addContact("Геннадий Васильевич Иванов","+ 7 823 132 41 43");
        phoneBook.searchContact("Геннадий Васильевич Иванов");
        phoneBook.searchContact("Геннадий Васильевич Гирин");
        phoneBook.searchContact("Евгений");

    }
    public void ex2(){
//        Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова,
//        Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина,
//        Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
//        Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//        Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
        ListOfEmployees listOfEmployees = new ListOfEmployees();
        listOfEmployees.addEmployees();
        ArrayList<String> list = listOfEmployees.splitOfNames(listOfEmployees.getListOfEmployees());
        TreeMap<Integer, Set<String>> result = listOfEmployees.sortNamesPopularity(list);
        System.out.println(result);
    }
}
