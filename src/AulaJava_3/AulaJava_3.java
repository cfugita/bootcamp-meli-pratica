package AulaJava_3;

import AulaJava_3.TM_1.Celular;
import AulaJava_3.TM_1.Pessoa;
import AulaJava_3.TM_1.SortUtil;
import AulaJava_3.TM_2.*;

public class AulaJava_3 {
    public static void main(String[] args) {
        TM_1();
        TM_2();
    }

    public static void TM_1() {
        Pessoa A = new Pessoa("Fernanda", "98765432110");
        Pessoa B = new Pessoa("Carolina", "12345678910");
        Pessoa C = new Pessoa("Pedro", "2849173059");
        Pessoa D = new Pessoa("Alana", "13753854390");

        Pessoa[] array = new Pessoa[4];
        array[0] = A;
        array[1] = B;
        array[2] = C;
        array[3] = D;

        Pessoa[] sorted = SortUtil.sortUtil(array);

        for (Pessoa pessoa : sorted) {
            System.out.println(pessoa.getNome());
        }

        Celular celularA = new Celular("98765432110", "Fernanda");
        Celular celularB = new Celular("12345678910", "Carolina");
        Celular celularC = new Celular("2849173059", "Pedro");
        Celular celularD = new Celular("13753854390", "Alana");

        Celular[] arrayCelular = new Celular[4];
        arrayCelular[0] = celularA;
        arrayCelular[1] = celularB;
        arrayCelular[2] = celularC;
        arrayCelular[3] = celularD;

        Celular[] sortedArrayCelular = SortUtil.sortUtil(arrayCelular);

        for (Celular celular : sortedArrayCelular) {
            System.out.println(celular.getNumero());
        }
    }

    public static void TM_2 () {
        Integer [] arrayInt =  {7,3,9,13,10,8,1};

        QuickSortSorterImple<Integer> quickSortInt = new QuickSortSorterImple<Integer>();
        HeapSortSorterImple<Integer> heapSortInt = new HeapSortSorterImple<Integer>();

        Timer timerQuick = new Timer();
        Timer timerHeap = new Timer();

        timerQuick.start();
        Integer [] quickIntSorted = quickSortInt.sort(arrayInt,Integer::compareTo);
        timerQuick.end();

        timerHeap.start();
        Integer [] heapIntSorted = heapSortInt.sort(arrayInt,Integer::compareTo);
        timerHeap.end();

        System.out.println(
                "Sorting Integer array\n" +
                "timer for QuickSort: " + timerQuick.getElapsedTime() + "\n" +
                "timer for HeapSort: " + timerHeap.getElapsedTime() + "\n");

        /*for (Integer integer : quickIntSorted) { System.out.println(integer); }
        for (Integer integer : heapIntSorted) { System.out.println(integer); }*/


        String [] arrayStr =  {"Julia","Renata","Marina","Carolina","Juliana","Iasmim","Bianca"};

        QuickSortSorterImple<String> quickSortStr = new QuickSortSorterImple<String>();
        HeapSortSorterImple<String> heapSortStr = new HeapSortSorterImple<String>();

        timerQuick.start();
        String [] quickStrSorted = quickSortStr.sort(arrayStr,String::compareTo);
        timerQuick.end();

        timerHeap.start();
        String [] heapStrSorted = heapSortStr.sort(arrayStr,String::compareTo);
        timerHeap.end();

        System.out.println(
                "Sorting String array\n" +
                "timer for QuickSort: " + timerQuick.getElapsedTime() + "\n" +
                "timer for HeapSort: " + timerHeap.getElapsedTime() + "\n");

        /*for (String s : quickStrSorted) { System.out.println(s); }
        for (String s : heapStrSorted) { System.out.println(s); }*/
    }
}
