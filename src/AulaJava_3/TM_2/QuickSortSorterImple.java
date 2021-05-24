package AulaJava_3.TM_2;

import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T>{
    @Override
    public T[] sort(T[] arr, Comparator<T> comparator) {
        return quickSort(arr,0,arr.length - 1,comparator);
    }

    private T[] quickSort(T[] arr, int inicio, int fim, Comparator<T> comparator) {
        if (inicio < fim) {
            int posicaoPivo = separar(arr, inicio, fim, comparator);
            quickSort(arr, inicio, posicaoPivo - 1, comparator);
            quickSort(arr, posicaoPivo + 1, fim, comparator);
        }
        return arr;
    }

    private int separar(T[] arr, int inicio, int fim, Comparator<T> comparator) {
        T pivo = arr[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (comparator.compare(pivo, arr[i]) >= 0) {
                i++;
            }
            else if (comparator.compare(arr[f], pivo) > 0) {
                f--;
            }
            else {
                T troca = arr[i];
                arr[i] = arr[f];
                arr[f] = troca;
                i++;
                f--;
            }
        }
        arr[inicio] = arr[f];
        arr[f] = pivo;
        return f;
    }
}
