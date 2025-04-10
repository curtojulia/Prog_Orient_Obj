package formas;

public class Ponto {
    private int x;
    private  int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void mover(int novoX, int novoY) {
        x = novoX;
        y = novoY;
    }

    public void dividir(){
        this.x = x / 2;
        this.y  = y / 2;
    }
}
