package AulaJava_3.TM_1;

public class Celular implements Precedente<Celular>{
    private String numero;
    private String holder;

    public Celular(String numero, String holder) {
        this.numero = numero;
        this.holder = holder;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getNumero() {
        return numero;
    }

    public String getHolder() {
        return holder;
    }

    @Override
    public Boolean precedenteA(Celular celular) {
        if (this.numero.compareTo(celular.getNumero()) < 0){
            return true;
        }
        return false;
    }
}
