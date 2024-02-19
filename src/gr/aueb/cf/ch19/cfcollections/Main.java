package gr.aueb.cf.ch19.cfcollections;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities = List.of("Athens", "Paris", "London");
        Iterator<String> itr = cities.iterator();

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        cities.removeIf(c -> c.equals("London"));

        while (itr.hasNext()) {
            String s = itr.next();
            if (s.equals("London")) cities.remove(s);
            System.out.println(s);
        }

          // Enhanced for is based in iterator
          for (String s1 : cities) {
              System.out.println(s1);
          }


        //forEach() is a method
        cities.forEach(System.out::println);
    }
}
