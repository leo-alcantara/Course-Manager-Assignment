package se.lexicon;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        ArrayList<String> daysOfTheWeek = new ArrayList<>();


        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");

        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");
        daysOfTheWeek.add("Sunday");

        System.out.println("daysOfTheWeek = " + daysOfTheWeek);

        Iterator<String> iterator = daysOfTheWeek.iterator();

        while (iterator.hasNext()) {
            String day = iterator.next();
            System.out.println(day);
        }
        System.out.println(daysOfTheWeek.size());

        daysOfTheWeek.add(3, "Thursday");
        System.out.println(daysOfTheWeek);
        System.out.println(daysOfTheWeek.size());


        List<String> subListDaysOfTheWeek = daysOfTheWeek.subList(0, 3);
        System.out.println(subListDaysOfTheWeek);

        HashSet<String> weekDays = new HashSet<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
        //Doesn't keep insertion order
        System.out.println("weekDays = " + weekDays);

        Object[] weekDaysToArray = weekDays.toArray();

        Arrays.sort(weekDaysToArray);

        System.out.println("weekDaysToArray = " + Arrays.toString(weekDaysToArray));

        HashSet<String> names = new HashSet<>();

        names.add("Leo");
        names.add("Sophie");
        names.add("Noelle");
        names.add("Philip");
        names.add("Elisabeth");
        names.add("Göran");

        //List<String> namesList = new ArrayList<>(names);

        TreeSet<String> namesSorted = new TreeSet<>(names);
        namesSorted.add("Wagner");
        namesSorted.add("Anna");

        System.out.println("names = " + names);
        System.out.println("namesSorted = " + namesSorted);

        //Collections.sort(namesSorted);





    }


}
