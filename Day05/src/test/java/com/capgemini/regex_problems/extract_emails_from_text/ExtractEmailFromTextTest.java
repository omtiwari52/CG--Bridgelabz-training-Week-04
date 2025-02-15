package com.capgemini.regex.extract_emails_from_text;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtractEmailFromTextTest {
    @Test
    void checkEmailAddressAtParticularIndex(){
        String text = "HARSHVEER7828@GMAIL.COM YE HAI MERA HARSH KA EMAIL AND OMTIWAR83.@GMAIL.COM";
        assertEquals("HARSHVEER7828@GMAIL.COM",ExtractEmailAddress.extractEmailAddresses(text).get(0));
    }

    @Test
    void checkEmailAddressAtParticularIndex2(){
        String text = "HARSHVEER7828@GMAIL.COM YE HAI MERA HARSH KA EMAIL AND OMTIWAR83.@GMAIL.COM";
        assertEquals("OMTIWAR83.@GMAIL.COM",ExtractEmailAddress.extractEmailAddresses(text).get(1));
    }

}
