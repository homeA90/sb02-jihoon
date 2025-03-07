package src.data_structure.algorithm.sort;

import java.util.PriorityQueue;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // N * logN
        // N
        for (int i = 0; i < arr.length; i++) {
            // logN
            pq.add(arr[i]);
        }

        // N * logN
        // N
        while (!pq.isEmpty()) {
            // logN
            System.out.print(pq.poll() + " ");
        }
    }
}
