package com.capgemini.annotations.use_deprecated_to_mark_an_old_method;

public class Main {

    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();   //create an instance of legacyAPI class

        api.oldFeature(); //this method will show warning as it's a deprecated method

        api.newFeature(); //this method will run
    }

}
