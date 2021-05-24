package AulaJava_3.TM_1;

public class SortUtil {
    public static <T> T[] sortUtil (Precedente<T>[] arr) {

        for (int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){

                if(arr[j].precedenteA((T) arr[i])){
                    Precedente<T> aux = arr[i];
                    arr[i] =  arr[j];
                    arr[j] = aux;
                }
            }
        }
        return (T[]) arr;
    }
}
