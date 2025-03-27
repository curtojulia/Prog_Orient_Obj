package formas;

import java.sql.SQLOutput;

public class Circulo {
    private int x;
    private int y;
    private float raio;

    public int getX() { // metodos de acesso
        return x;
    }

    public void setX(int x) { // metodos de acesso
        if(x > 0){
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if(x > 0){
            this.y = y;
        }
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public Circulo(int x, int y, float raio){
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public Circulo(Circulo outro){
        this.x = outro.x;
        this.y = outro.y;
        this.raio = outro.raio;
    }
    public void mover(int Novo_x, int Novo_y){
        x = Novo_x;
        y = Novo_y;
    }
    public void desenhar(){
        System.out.printf("Circulo(%d, %d, %f)", x, y, raio);
    }

    public void redimensionar(float sx, float sy){
        if (sx > 0 && sy > 0) {
            raio = (int) (sx / 100 * raio);
        }
    }
    public void dividir(){
        this.x = x / 2;
        this.y = y / 2;
        this.raio = raio / 2;
    }

}
