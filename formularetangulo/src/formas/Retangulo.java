package formas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Retangulo {
    private int x;
    private int y;
    private int largura;
    private int altura;

    public Retangulo(int x, int y, int largura, int altura) {
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
    }

    public Retangulo(int x, int y, int lado) {
        this.x = x;
        this.y = y;
        this.largura = lado;
        this.altura = lado;
    }

    public void mover(int novoX, int novoY) {
        x = novoX;
        y = novoY;
    }

    public void desenhar() {
        System.out.printf("Retangulo(%d, %d, %d, %d)\n",
                x, y, largura, altura);
    }

    public void redimensionar(float sx, float sy) {
        if (sx > 0 && sy > 0) {
            largura = (int) (sx / 100 * largura);
            altura = (int) (sy / 100 * altura);
        }
    }
    public void dividir() {
        this.x = x / 2;
        this.y = y / 2;
    }

}
