package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_input_and_characters() {
        App myApp = new App();
        String input = "Homer";
        int characters = input.length();

        String expectedOutput = "Homer has 5 characters.";
        String actualOutput = myApp.generateOutputString(input, characters);

        assertEquals(expectedOutput, actualOutput);
    }
}