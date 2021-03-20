package WorkHomeDifferent;

import java.util.*;

public class Practice {


    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public Practice(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Practice{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public class Comparab implements Comparator<Practice> {

        public void doit() {
            System.out.println("DO IT right now");
        }


        @Override
        public int compare(Practice o1, Practice o2) {
            if (o1.age > o2.getAge()) {
                return 1;
            }
            if (o1.age == o2.getAge()) {
                return 0;
            }
            return -1;
        }

        }


        }



