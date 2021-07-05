package se.lexicon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

        while (iterator.hasNext()){
            String day = iterator.next();
            System.out.println(day);
        }
        System.out.println(daysOfTheWeek.size());

        daysOfTheWeek.add(3, "Thursday");
        System.out.println(daysOfTheWeek);
        System.out.println(daysOfTheWeek.size());


        List<String> subListDaysOfTheWeek = daysOfTheWeek.subList(0,3);
        System.out.println(subListDaysOfTheWeek);


    }


}
