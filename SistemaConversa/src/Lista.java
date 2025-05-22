import java.lang.reflect.Array;

public class Lista implements Printable {
    private String[] nomes;

    public Lista(String[] nomes) {
        this.nomes = nomes;
    }

    public void imprimir() {
        this.toString();
    }
}
