package AulaJava_3.TM_2;

import java.util.Comparator;

public interface Sorter <T>{
    public T[] sort (T[] arr, Comparator<T> comparator);
}
