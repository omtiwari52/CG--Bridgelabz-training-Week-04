package com.capgemini.map_interface.count_words_in_file_and_map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String,Integer> map = MapWordsFrequency.countAndMap("demo.txt");
        System.out.println(map);

    }
}
