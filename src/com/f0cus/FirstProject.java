package com.f0cus;

import com.f0cus.interfaces.Contract;

import java.util.List;

public class FirstProject {

    public static void main(String[] args) {

        SimpleClass obj = new SimpleClass();

	    System.out.println(obj.getResult());
        Contract con = new SimpleClass();

        System.out.println(con.showCompleteContract());
        System.out.println("Bye!!");

        List<String> names = List.of("a","b","c","newly added");

        for (String name : names) {
            System.out.println("name = " + name);
        }
    }
}
