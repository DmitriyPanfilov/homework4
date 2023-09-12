package lesson_4.homework4.task2;

import java.util.*;

public class ArrayConteiner {
    public static void printArray(List<?> list){
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        List<Integer> intArray = new ArrayList<>();
        intArray.add(5);
        intArray.add(10);

        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Привет");
        stringArrayList.add("Мир");

        printArray(intArray);
        printArray(stringArrayList);

        }
    }

