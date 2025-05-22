public class Mensagem implements Printable{
    protected String conteudo;
    private Pessoa remetente;
    private Pessoa destinatario;

    public Mensagem(String conteudo, Pessoa remetente, Pessoa destinatario) {
        this.conteudo = conteudo;
        this.remetente = remetente;
        this.destinatario = destinatario;
    }

    public void imprimir() {
        this.toString();
    }
}
