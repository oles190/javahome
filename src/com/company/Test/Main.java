package com.company.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;


public class Main
{

    public static void main(String[] args) throws Exception {
        String data = "";
        Scanner scanner = new Scanner(System.in);


        try (InputStream inputStream = new FileInputStream("/Users/olesdoskuc/IdeaProjects/javahome/src/com/company/Test/File")) {
            while (inputStream.available() > 0) {
                data += (char) inputStream.read();
            }
            //    System.out.println(data);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        List<Device> texts = new ArrayList<>();

        for (String line : data.split("\n")) {
            String[] elems = line.split(",");
            Device model = new Device(Integer.parseInt(elems[0].trim()), elems[1].trim(), elems[2].trim(), Integer.parseInt(elems[3].trim()));
            texts.add(model);
        }


        System.out.println("Hello! Write your number: \n1-Вивести весь список на екран." + "\n2-Шукати Device за серійним номером" +
                "\n3-Вивести посортований список за назвою бренду" + "\n4-Вивести лише ті Device у яких ціна більша ніж 400" +
                "\n5-Вивести лише ті Device у яких в серійному номері є нуль(0) і ціна менша за 800." +
                "\n6-Вивести найдорожчий товар.");
        String number = scanner.next();
        switch (number) {

            case ("1"): {
                texts.stream().forEach(System.out::println);
                break;
            }
            case ("2"): {
                Long numbers;
                System.out.println("Write numbers");
                numbers = Long.parseLong(scanner.next());
                Device num = texts.stream().filter(p -> p.getSerialNumber() == numbers).findFirst().orElseThrow(() -> new Exception("NotPoint"));
                System.out.println(num);
                break;
            }

            case ("3"): {
                texts.stream().sorted(((o1, o2) -> o1.getBrand().compareTo(o2.getBrand()))).forEach(System.out::println);
                break;
            }
            case ("4"): {
                texts.stream().filter(price -> price.getPrice() > 400).forEach(System.out::println);
                break;

            }
            case("5"): {
               texts.stream().filter(p->p.getSerialNumber().toString().contains("0")).filter(p->p.getPrice()<800).forEach(System.out::println);
               break;
            }


            case ("6"): {
                Optional<Device> listDev=  texts.stream().max(Comparator.comparing(Device::getPrice));
                System.out.println(listDev);
                }

break;
            }


        }
    }
