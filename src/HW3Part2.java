import java.util.Set;

public class HW3Part2 {

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();
        phonebook.add("Petrov", "123");
        phonebook.add("Petrov", "1243");
        phonebook.add("Petrov", "1453");
        phonebook.add("Sidorov", "6754");
        phonebook.add("Oganian", "0698");

        Set<String> surnames = phonebook.allSurnames();
        for (String surname : surnames) {
            System.out.printf("Пользователь %s имеет номер(а) телефонов %s %n", surname, phonebook.get(surname));
        }
    }
}
