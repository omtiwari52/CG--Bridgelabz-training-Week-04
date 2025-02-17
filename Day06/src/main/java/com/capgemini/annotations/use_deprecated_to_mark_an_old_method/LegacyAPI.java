package com.capgemini.annotations.use_deprecated_to_mark_an_old_method;

public class LegacyAPI {

    @Deprecated
    public void oldFeature(){
        System.out.println("Warning: This is an old feature and should not be used");
    }

    void newFeature(){
        System.out.println("This is a new method");
    }
}
