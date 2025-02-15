package com.capgemini.regex_problems.extract_links_from_a_web_page;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExtractLinkTest {

    //this test will pass if the method will return correct url
    @Test
    void extractURLsTest1(){
        assertEquals(new ArrayList<String>(Arrays.asList("https://www.google.com", "http://example.org")), ExtractLink.extractLink("Visit https://www.google.com and http://example.org for more info."));
    }

    //this test will fail if the method will return wrong output
    @Test
    void extractURLsTest2(){
        assertEquals(new ArrayList<String>(Arrays.asList("https://www.goog.com", "http://example.rg")), ExtractLink.extractLink("Visit https://www.google.com and http://example.org for more info."));
    }


}
