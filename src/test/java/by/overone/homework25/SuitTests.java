package by.overone.homework25;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ArrayWorkerTest.class, Corrector.class, StringWorkerTest.class})
public class SuitTests {
}
