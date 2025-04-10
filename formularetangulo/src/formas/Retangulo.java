package formas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Retangulo {
    private Ponto ponto_inicial;
    private int largura;
    private int altura;

    public Retangulo(Ponto ponto, int largura, int altura) {
        this.ponto_inicial = ponto;
        this.largura = largura;
        this.altura = altura;
    }

    public Retangulo(int x, int y, int lado) {
        this.ponto_inicial = new Ponto(x,y);
        this.largura = lado;
        this.altura = lado;
    }

    public void mover(int x, int y) {
        ponto_inicial.mover(x,y);
    }

    public void desenhar() {
        System.out.printf("Retangulo(%d, %d, %d, %d)\n",
                ponto_inicial, largura, altura);
    }

    public void redimensionar(float sx, float sy) {
        if (sx > 0 && sy > 0) {
            largura = (int) (sx / 100 * largura);
            altura = (int) (sy / 100 * altura);
        }
    }
    public void dividir() {
        dividir();
    }

}
