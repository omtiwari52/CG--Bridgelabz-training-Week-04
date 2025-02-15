package com.capgemini.regex.extract_dates_from_text;

import com.capgemini.regex.extract_emails_from_text.ExtractEmailAddress;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtractDatesFromTextTest {
    @Test
    void checkEmailAddressAtParticularIndex(){
        String text = "12/04/2004 this is the date when i born just kidding the real date us 24/04/2003";
        assertEquals("12/04/2004", ExtractDatesFromText.extractDates(text).get(0));
    }

    @Test
    void checkEmailAddressAtParticularIndex2(){
        String text = "12/04/2004 this is the date when i born just kidding the real date us 24/04/2003";
        assertEquals("24/04/2003", ExtractDatesFromText.extractDates(text).get(1));
    }
}
