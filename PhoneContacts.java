package lesson3;

import java.util.*;

public class PhoneContacts {

    static Map<String, Set<String>> note = new HashMap<>();

    public static void add(String name, String number) {
        Set<String> num = new HashSet<>();
        if (note.get(name) != null) {
            num = note.get(name);
            num.add(number);


        } else {
            num.clear();
            num.add(number);
            note.put(name, num);
        }

    }

    public static void get(String name) {
        System.out.println("Contact{" + "name= " + name + ", numbers=" + note.get(name) + '}');
    }
}
