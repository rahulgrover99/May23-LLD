package mergesort;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<ArrayList<Integer>> {

    ExecutorService executorService;
    ArrayList<Integer> arrayToBeSorted;

    MergeSorter(ArrayList<Integer> arrayToBeSorted, ExecutorService executorService) {
        this.arrayToBeSorted = arrayToBeSorted;
        this.executorService = executorService;
    }

    @Override
    public ArrayList<Integer> call() throws ExecutionException, InterruptedException {
        if (arrayToBeSorted.size() <= 1) return arrayToBeSorted;

        int mid = arrayToBeSorted.size() /2;

        System.out.println(arrayToBeSorted + "being sorted in " + Thread.currentThread().getName());

        ArrayList<Integer> leftArrayList = new ArrayList<>();
        ArrayList<Integer> rightArrayList = new ArrayList<>();

        for (int i = 0; i < mid; i++) leftArrayList.add(arrayToBeSorted.get(i));
        for (int i = mid; i < arrayToBeSorted.size(); i++) rightArrayList.add(arrayToBeSorted.get(i));

        MergeSorter left = new MergeSorter(leftArrayList, executorService);
        MergeSorter right = new MergeSorter(rightArrayList, executorService);

        // Pass it to executor service instead.
//        ArrayList<Integer> sortedLeft = left.call();
//        ArrayList<Integer> sortedRight = right.call();

        Future<ArrayList<Integer>> futureSortedLeft = executorService.submit(left);
        Future<ArrayList<Integer>> futureSortedRight = executorService.submit(right);

        ArrayList<Integer> sortedLeft = futureSortedLeft.get();
        ArrayList<Integer> sortedRight = futureSortedRight.get();

        int i = 0, j = 0;
        int l = sortedLeft.size(), r = sortedRight.size();

        ArrayList<Integer> merged = new ArrayList<>();

        while (i < l && j < r) {
            if (sortedLeft.get(i) < sortedRight.get(j)) {
                merged.add(sortedLeft.get(i));
                i+=1;
            } else {
                merged.add(sortedRight.get(j));
                j+=1;
            }
        }

        while (i < l) {
            merged.add(sortedLeft.get(i));
            i+=1;
        }

        while (j < r) {
            merged.add(sortedRight.get(j));
            j+=1;
        }

        return merged;


    }
}
