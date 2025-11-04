//Questão 5
//Ordenação: Ordenar um array usando o método Quicksort

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
  
    public static int[] quickSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int pivot = arr[0];
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < pivot) {
                left.add(arr[i]);
            } else {
                right.add(arr[i]);
            }
        }

        int[] sortedLeft = quickSort(listToArray(left));
        int[] sortedRight = quickSort(listToArray(right));

        return concatArrays(sortedLeft, pivot, sortedRight);
    }

    private static int[] listToArray(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private static int[] concatArrays(int[] left, int pivot, int[] right) {
        int[] result = new int[left.length + 1 + right.length];
        int index = 0;

        for (int val : left) {
            result[index++] = val;
        }

        result[index++] = pivot;

        for (int val : right) {
            result[index++] = val;
        }

        return result;
    }
}
