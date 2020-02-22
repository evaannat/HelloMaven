package pl.altkom.utils;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class HelloUtilTest {

    @Test
    void helloTest() {

        assertEquals("Hello world",HelloUtil.hello("world"));

    }

    @Test
    @DisplayName("Bardzo opisowa nazwa testu")
    void shouldReturnGreetingWithPassedArgument() {
        // Given
        String passedArgument = "World";
        String expectedValue = HelloUtil.GREETING+" "+passedArgument;
        // When
        String returnedValue = HelloUtil.hello(passedArgument);
        // Then
        assertEquals(expectedValue, returnedValue);
    }


}