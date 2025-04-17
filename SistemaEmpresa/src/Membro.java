public class Membro {
    private String nome;
    private String dtNAsc;
    private float salario;
    private Projeto projeto;

    public Membro(String nome, String dtNAsc, float salario, Projeto projeto) {
        this.nome = nome;
        this.dtNAsc = dtNAsc;
    }

    public String getDtNAsc() {
        return dtNAsc;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }




}
