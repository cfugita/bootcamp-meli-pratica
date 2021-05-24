package AulaJava_3;

import AulaJava_3.TM_1.Celular;
import AulaJava_3.TM_1.Pessoa;
import AulaJava_3.TM_1.SortUtil;
import AulaJava_3.TM_2.HeapSortSorterImple;
import AulaJava_3.TM_2.QuickSortSorterImple;

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

        for(int i = 0; i < sorted.length; i++) {
            System.out.println(sortedArrayCelular[i].getNumero());
        }
    }

    public static void TM_2 () {
        Integer [] arrayInt =  {7,3,9,13,10,8,1};
        String [] arrayStr =  {"Julia","Renata","Marina","Carolina","Juliana","Iasmim","Bianca"};

        QuickSortSorterImple<Integer> quickSortInt = new QuickSortSorterImple<Integer>();
        QuickSortSorterImple<String> quickSortStr = new QuickSortSorterImple<String>();
        Integer [] quickIntSorted = quickSortInt.sort(arrayInt,Integer::compareTo);
        String [] quickStrSorted = quickSortStr.sort(arrayStr,String::compareTo);

        HeapSortSorterImple<Integer> heapSortInt = new HeapSortSorterImple<Integer>();
        HeapSortSorterImple<String> heapSortStr = new HeapSortSorterImple<String>();
        Integer [] heapIntSorted = heapSortInt.sort(arrayInt,Integer::compareTo);
        String [] heapStrSorted = heapSortStr.sort(arrayStr,String::compareTo);

        for (Integer integer : quickIntSorted) {
            System.out.println(integer);
        }

        for (String s : quickStrSorted) {
            System.out.println(s);
        }


        for (Integer integer : heapIntSorted) {
            System.out.println(integer);
        }

        for (String s : heapStrSorted) {
            System.out.println(s);
        }
    }
}
