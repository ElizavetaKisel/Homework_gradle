package by.overone.homework25;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringWorkerTest {
    private static StringWorker stringWorker;
    @BeforeAll
    public static void setUp(){
        stringWorker = new StringWorker();
        System.out.println("Create Main obj");
    }

    @ParameterizedTest
    @MethodSource("dataForCheckAmountOfWords")
    public void checkAmountOfWords(String pass, int expected){
        assertEquals(expected, stringWorker.getWordsAmount(pass));
    }
    private static Stream<Arguments> dataForCheckAmountOfWords(){
        return Stream.of(Arguments.of("Hello, i am Liza!", 4),
                Arguments.of("Birch - tree, серо-зеленый ??", 3),
                Arguments.of("  ", 0 ));
    }

    @RepeatedTest(7)
    public void successfulEmptyString(){
        assertTrue(stringWorker.isEmptyString("   "));
    }

    @Test
    public void unsuccessfulEmptyString(){
        assertFalse(stringWorker.isEmptyString("one true"));
    }

    @Test
    public void checkChangedString(){
        assertEquals("S%r%h is % wom%n", stringWorker.changeString("  Sarah is a woman        "));
        assertEquals("", stringWorker.changeString("  "));
    }

}