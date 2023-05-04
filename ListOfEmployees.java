import java.util.*;

public class ListOfEmployees {
    private ArrayList<String> listOfEmployees = new ArrayList<>(100);

    /**
     * Метод сам добавит всех работников, перечисленных в условии задачи
     */
    public void addEmployees() {
        listOfEmployees.add("Иван Иванов");
        listOfEmployees.add("Светлана Петрова");
        listOfEmployees.add("Кристина Белова");
        listOfEmployees.add("Анна Мусина");
        listOfEmployees.add("Анна Крутова");
        listOfEmployees.add("Иван Юрин");
        listOfEmployees.add("Петр Лыков");
        listOfEmployees.add("Павел Чернов");
        listOfEmployees.add("Петр Чернышов");
        listOfEmployees.add("Мария Федорова");
        listOfEmployees.add("Марина Светлова");
        listOfEmployees.add("Мария Савина");
        listOfEmployees.add("Мария Рыкова");
        listOfEmployees.add("Марина Лугова");
        listOfEmployees.add("Анна Владимирова");
        listOfEmployees.add("Иван Мечников");
        listOfEmployees.add("Петр Петин");
        listOfEmployees.add("Иван Ежов");
    }

    public ArrayList<String> getListOfEmployees() {
        return listOfEmployees;
    }

    public ArrayList<String> splitOfNames(ArrayList<String> inputList) {

        ArrayList<String> result = new ArrayList<>(20);
        for (String name : inputList) {
            if (name.contains(" ")) {
                result.add(name.substring(0, name.indexOf(' ')));
            }
        }

        System.out.println(result);
        return result;
    }


    public TreeMap<Integer, Set<String>> sortNamesPopularity(ArrayList<String> inputList) {
        TreeMap<Integer, Set<String>> result = new TreeMap<>(Comparator.reverseOrder());
        for (String name : inputList) {
            int frequency = Collections.frequency(inputList, name);
            if(result.containsKey(frequency)) {
                result.get(frequency).add(name);
            } else {
                Set<String> names= new HashSet<>();
                names.add(name);
                result.put(frequency,names);
            }
        }
        return result;
    }

}
