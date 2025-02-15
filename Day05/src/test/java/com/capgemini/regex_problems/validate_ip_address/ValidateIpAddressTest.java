package com.capgemini.regex_problems.validate_ip_address;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateIpAddressTest {
    @Test
    void checkIp(){
        String ip = "255.195.245.196";
        assertTrue(ValidateIpAddress.validateIpAddress(ip));
    }
}
