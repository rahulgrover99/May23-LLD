package mergesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(13);
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(2, 3, 1, 4, 8, 1, 5, 7, 8, 9, 10, 3, 4));
        MergeSorter mergeSorter = new MergeSorter(arrayList, executorService);
        System.out.println(mergeSorter.call());
        executorService.shutdown();
    }
}
