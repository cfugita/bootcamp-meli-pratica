package AulaJava_3.TM_2;

import java.util.Comparator;

public class HeapSortSorterImple<T> implements Sorter<T>{
    @Override
    public T[] sort(T[] arr, Comparator<T> comparator) {
        int size = arr.length;
        return heapSort(arr,size, comparator);
    }

    private void heapify(T[] arr, int size, int i, Comparator<T> comparator) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < size && comparator.compare(arr[left], arr[largest]) > 0) {
            largest = left;
        }
        if (right < size &&  comparator.compare(arr[right], arr[largest]) > 0) {
            largest = right;
        }
        if (largest != i) {
            T temp = arr[i];
            arr[i]= arr[largest];
            arr[largest] = temp;
            heapify(arr, size, largest, comparator);
        }
    }

    private T[] heapSort(T[] arr, int size, Comparator<T> comparator) {

        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(arr, size, i, comparator);
        }

        for (int i=size-1; i>=0; i--) {
            T temp = arr[0];
            arr[0]= arr[i];
            arr[i] = temp;
            heapify(arr, i, 0, comparator);
        }
        return arr;
    }
}
