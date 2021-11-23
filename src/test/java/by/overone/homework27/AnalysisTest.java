package by.overone.homework27;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AnalysisTest {

    @ParameterizedTest
    @MethodSource("dataMostRecent")
    public void checkMostRecent(String pass, String expected){
        assertEquals(expected,Analysis.findMostRecent(pass));
    }

    private static Stream<Arguments> dataMostRecent(){
        return Stream.of(Arguments.of("the are nine are","are"),
                Arguments.of("nine root nine root", "nine"),
                Arguments.of("a a a s o", "a"));
    }

    @ParameterizedTest
    @MethodSource("dataLeastRecent")
    public void checkLeastRecent(String pass, String expected){
        assertEquals(expected,Analysis.findLeastRecent(pass));
    }

    private static Stream<Arguments> dataLeastRecent(){
        return Stream.of(Arguments.of("the are nine are","the"),
                Arguments.of("nine root nine! root", "nine"),
                Arguments.of("a a a s o o", "s"));
    }

    @ParameterizedTest
    @MethodSource("dataLonger")
    public void checkLonger(String pass, String expected){
        assertEquals(expected,Analysis.findLonger(pass));
    }

    private static Stream<Arguments> dataLonger(){
        return Stream.of(Arguments.of("the nine a","nine"),
                Arguments.of("nine. root!! nine root", "nine"),
                Arguments.of("a aa s ooo o o", "ooo"));
    }

    @ParameterizedTest
    @MethodSource("dataYears")
    public void checkYears(String pass, String expected){
        assertEquals(expected,Analysis.findYears(pass));
    }

    private static Stream<Arguments> dataYears(){
        return Stream.of(Arguments.of("the 1988 1988 nine a","1988"),
                Arguments.of("nine. 899 1432 5 nine root", "899, 1432"),
                Arguments.of("nine. nine root", "There are no years here"));
    }
}