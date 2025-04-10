public class Carro {
    private String modelo;
    private Motor motor;
    private int velocidade;

    public Carro(String modelo, float cilindrada) {
        this.modelo = modelo;
        this.motor = new Motor(cilindrada);
    }

    public float velocidadeMaxima() {
        if (this.motor.getCilindrada() <= 1.0f) {
            velocidade = 140;
        } else if (this.motor.getCilindrada() <= 1.6f) {
            velocidade = 180;
        } else if (this.motor.getCilindrada() <= 2f) {
            velocidade = 220;
        } else velocidade = 260;
        return velocidade;
    }

}

