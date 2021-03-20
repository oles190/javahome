package com.company.Lesson18Generics.L01;

public class User implements  Comparable<User>{

        private String name;
        private String surname;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public User(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;

        }


    @Override
    public int compareTo(User o) {
        if (age>o.age){ return 1; }
        if (age==o.age){return 0;}
        return -1;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}