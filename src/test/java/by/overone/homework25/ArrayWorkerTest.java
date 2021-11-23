package by.overone.homework25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayWorkerTest {

    @Test
    public void checkMultiplyArray(){
        ArrayWorker arrayWorker = new ArrayWorker();
        int[] original = new int[]{1,2,3};
        int[] expected = new int[]{2,4,6};
        assertArrayEquals(expected,arrayWorker.multiplyByN(original, 2));
    }

}