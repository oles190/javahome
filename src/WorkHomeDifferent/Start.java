package WorkHomeDifferent;

import java.util.*;

public class Start {
    public static void main(String[] args) {
        Practice practice = new Practice("oles ", 22);
        Practice practice1 = new Practice("oleg ", 12);
        Practice practice2 = new Practice("andriy ", 25);
//        Practice.Comparab comb = practice.new Comparab();
        List<Practice> list = new LinkedList<>();
        list.add(practice);
        list.add(practice1);
        list.add(practice2);

        Collections.sort(list, practice.new Comparab());


        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Monitor monitor = new Monitor() {

            @Override
            public String getstatus() {
                return "OKK";
            }

            @Override
            public void calc(String type) {
                System.out.println(type);
            }

        };
    }

}