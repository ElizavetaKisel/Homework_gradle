package by.overone.homework25;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CorrectorTest {

    @ParameterizedTest
    @MethodSource("dataForCheckAmountOfWords")
    public void checkWordDeleter (String passSent, String passWord, String expected) {
        Corrector corrector = new Corrector();
        try {
            assertEquals(expected, corrector.deleteWord(passSent, passWord));
        }
        catch (Exception ex){
            assertEquals(expected, ex.getMessage());
        }
    }
    private static Stream<Arguments> dataForCheckAmountOfWords(){
        return Stream.of(Arguments.of("Hello, I am Liza!","Hello,", "I am Liza!"),
                Arguments.of("Birch - tree, серо-зеленый ??", " Hey", "There is no such word"));
    }


}