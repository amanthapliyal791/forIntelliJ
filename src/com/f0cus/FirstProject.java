package com.f0cus;

import com.f0cus.interfaces.Contract;

public class FirstProject {

    public static void main(String[] args) {

        SimpleClass obj = new SimpleClass();

	    System.out.println(obj.getResult());

        Contract con = new SimpleClass();
        System.out.println(con.showCompleteContract());
        System.out.println("Bye!!");
    }
}
