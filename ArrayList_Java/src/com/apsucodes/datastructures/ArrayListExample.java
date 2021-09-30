package com.apsucodes.datastructures;

import com.sun.source.tree.IfTree;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(3,35);
        numbers.add(5,45);

        //numbers.clear();

        numbers.add(35);
        numbers.indexOf(30);

        System.out.println(numbers.indexOf(30));

        Boolean container = numbers.contains(35);
        Boolean ex = numbers.isEmpty();
        System.out.println(ex);

        if (container==true) {
            System.out.println("Number present");

            Boolean instructor = numbers.contains("Alpha");


            System.out.println(instructor);
        }
        System.out.println(numbers);

        for(int i = 0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

    }
}
