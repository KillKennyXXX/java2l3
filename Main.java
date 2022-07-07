package lesson3;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        testArrayList();
//        testLinkedList();
//        testSet();
        testMap();
    }

    private static void testArrayList() {
        List<List<List<String>>> arrayListDeep = new ArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add(0, "X");
        arrayList.add(1, "Y");

//        arrayList.remove("C");
//        arrayList.remove(1);

/*        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i) + "!");
        }*/

/*
        for (String s : arrayList) {
//            s += "HELLO!";
            System.out.println(s + "!!");
        }
*/

/*        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s + "!!!");
        }*/

//        arrayList.clear();

/*        arrayList.forEach(str -> {
            str += "!";
            System.out.println(str + "!!!!");
        });*/
//        arrayList.forEach(System.out::println);

//        arrayList.trimToSize();

        Object[] objects = arrayList.toArray();
        String[] strings = arrayList.toArray(new String[0]);


        Collections.addAll(arrayList, "Aaa", "D", "Bbbb", "R", "Dd", "ddd");
        Collections.shuffle(arrayList);
//        Collections.sort(arrayList);
        Collections.sort(arrayList, Comparator.comparingInt(String::length));
        Collections.reverse(arrayList);
        Collections.rotate(arrayList, -1);
//        System.out.println(Collections.binarySearch());
        System.out.println(Collections.replaceAll(arrayList, "D", "!"));

//        System.out.println(arrayList);
//        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
//        System.out.println(integers.get(1));
        System.out.println(integers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()));
        System.out.println(integers.stream().filter(e -> e % 2 == 0).count());
        System.out.println(integers.stream().filter(e -> e % 2 == 0).map(n -> {
            n += 10;
            String str = "Четное число из прошлой коллекции: " + n;
            return str;
        }).collect(Collectors.toList()));

        LinkedList<Integer> list = new LinkedList<>(integers);

    }

    private static void testLinkedList() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    }

    private static void testSet() {
        Set<Integer> set = new TreeSet<>();
        Collections.addAll(set, 1, 2, 4, 2, 1, 2, 4, 6, 3, 6, 8, 9, 4, 3, 2, 6, 8, 5, 23, 5, 7, 4, 3, 2, 7, 4, 1, 1, 1, 1, 1, 1, 6, 4, 3, 2, 7, 9, 6, 4, 3, 2, 8, 6, 5, 4, 3, 2);
        System.out.println(set);
    }


    private static void testMap() {
        Map<String, String> map = new HashMap<>(400);
        map.put("Russia", "Moscow");
        map.put("Russia", "Ufa");
        map.put("France", "Paris");
        map.put("Germany", "Berlin");
        map.put("Norway", "Oslo");

/*        for (String key : map.keySet()) {
            System.out.printf("Key: %s \t\t value: %s%n", key, map.get(key));
        }*/

/*        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.printf("Key: %s \t\t value: %s%n", entry.getKey(), entry.getValue());
        }*/

        map.forEach((key, value) -> System.out.printf("Key: %s \t\t value: %s%n", key, value));


//        System.out.println(map);
    }
}
