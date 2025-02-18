package com.capgemini.annotations.suppress_unchecked_warnings;

import java.util.ArrayList;
import java.util.List;

public class supressArrayListWarnings {

    @SuppressWarnings("unchecked")
    public static void addElements(){
        List list = new ArrayList();

        list.add(11);
        list.add("Hello");
        list.add(true);
        list.add(14.9);

        System.out.println("List contains: "+ list);
    }
}
