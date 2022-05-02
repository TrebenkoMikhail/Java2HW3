import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Phonebook {

    Map<String, Set<String>> phonesBySurname = new TreeMap<>();

    public void add (String surname, String phoneNumber) {
        /*Set<String> phones = phonesBySurname.get(surname);
        if (phones == null) {
            Set<String> phonesSet = new HashSet<>();
            phonesSet.add(phoneNumber);
            phonesBySurname.put(surname, phonesSet);
        } else {
            phones.add(phoneNumber);
            phonesBySurname.put(surname, phones);
        }*/
        Set<String> phones = phonesBySurname.getOrDefault(surname, new HashSet<>());
        phones.add(phoneNumber);
        phonesBySurname.put(surname, phones);
    }

    public Set<String> get(String surname) {
        return phonesBySurname.get(surname);
    }

    public Set<String> allSurnames () {
        return phonesBySurname.keySet();
    }

}
