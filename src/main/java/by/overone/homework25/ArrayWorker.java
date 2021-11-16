package by.overone.homework25;

public class ArrayWorker {

    public int[] multiplyByN(int[] arr, int n){
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * n;
        }
        return arr;
    }
}
