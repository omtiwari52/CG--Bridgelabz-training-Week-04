package com.capgemini.regex.replace_multiple_spaces_with_single;

import com.capgemini.regex.replace_multiple_space_with_single.ReplaceMultipleSpaces;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplaceMultipleWhiteSpacesTest {
    @Test
    void removeSpacesCase(){
        String text = "hey      hero      how   was your    day";
        assertEquals("hey hero how was your day", ReplaceMultipleSpaces.replaceMultipleSpaces(text));
    }
}
