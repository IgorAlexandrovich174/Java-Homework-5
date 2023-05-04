import java.util.*;


//        Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
//        что 1 человек может иметь несколько телефонов.
public class PhoneBook {
    private final Map<String, Set<String>> phoneBook = new HashMap<>(100, 0.75f);

    /**
     * Метод добавления нового контакта
     */
    public void addContact(String newContact, String newNumber) {
        Set<String> list = new HashSet<>();
        
        if (phoneBook.containsKey(newContact) && !phoneBook.containsValue(phoneBook.get(newNumber))) {
            phoneBook.get(newContact).add(newNumber);
            System.out.println("Номер " + newNumber + " добавлен к контакту " + newContact);
        } else {
            list.add(newNumber);
            phoneBook.putIfAbsent(newContact, list);
            System.out.println("Контакт " + newContact + " с номером " + newNumber + " добавлен");
        }
    }
    public void searchContact(String searchContact) {
        if (phoneBook.containsKey(searchContact)){
            System.out.printf("Контакт: %s \nНомер: %s\n", searchContact, phoneBook.get(searchContact).toString());
        } else {
            System.out.println("Такого контакта нет");
        }
    }

    public void printPhoneBook() {
        System.out.println(phoneBook);
    }
}
