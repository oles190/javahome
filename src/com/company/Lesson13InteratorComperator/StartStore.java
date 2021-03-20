package com.company.Lesson13InteratorComperator;

import java.util.Scanner;

public class StartStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store store = new Store();
        boolean a = true;
        System.out.println("");

        System.out.println("Hello!!!");

        while (a) {

            System.out.println("\nselect next action:\n" +
                    "1 - add commodity;\n" +
                    "2 - remove commodity;\n" +
                    "3 - replace commodity;\n" +
                    "4 - sort by name;\n" +
                    "5 - sort by length;\n" +
                    "6 - sort by weight;\n" +
                    "7 - sort by width;\n" +
                    "8 - print all commodities from your storage;\n" +
                    "9 - exit;\n");
            int chose = scanner.nextInt();

            switch (chose) {
                case 1: {
                    store.addCommodity(createNewCommodity());
                    System.out.println("!!!success!!!");
                    break;
                }
                case 2: {
                    System.out.println("\nEnter index of commodity which you want to remove:\n");
                    store.removeFromStorage(scanner.nextInt());
                    break;

                }
                case 3: {
                    System.out.println("\nEnter index of commodity which you want to replace:\n");
                    int index = scanner.nextInt();
                    System.out.println("\nEnter new commodity:\n");
                    store.replaceInStorage(index, createNewCommodity());
                    break;

                }
                case 4:{
                    store.sortByName();
                    break;

                }
                case 5:{
                    store.sortByLength();
                    break;
                }
                case 6:{
                    store.sortByWeight();
                    break;

                }
                case 7:{
                    store.sortByWidth();}
                break;

                case 8:{
                        System.out.println(store.getListStore());
                        break;

                    }
                case 9:{
                    System.out.println("By by");
                    a=false;
                }
                }

            }


        }
        public static Commodity createNewCommodity () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the commodity name:");
            String name = scanner.nextLine();
            System.out.println("Enter the commodity length:");
            int length = scanner.nextInt();
            System.out.println("Enter the commodity weight:");
            int weight = scanner.nextInt();
            System.out.println("Enter the commodity width:");
            int width = scanner.nextInt();
            return new Commodity(name, length, weight, width);
        }
    }
