public class Sequencia {
    private int inicio;
    private int finall;

    public Sequencia(int inicio, int finall) {
        if (inicio > finall){
            this.inicio = finall;
            this.finall = inicio;
        }else{
        this.inicio = inicio;
        this.finall = finall;}
    }

    public void imprimir(int incremento){
        for (int i = inicio; i <= finall ; i = i + incremento) {
            System.out.println("i = " + i);
        }
    }
}
