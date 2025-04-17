import java.awt.*;

public class Projeto {
    private String nome;
    private float custo;
    private int qntDeMembros;
    private Membro[] membros;

    public Projeto(String nome, int qntmaxima) {
        this.nome = nome;
        this.membros = new Membro[qntmaxima];
    }

    public boolean adicionarMembro(Membro m){
        for (int i=0; i < qntDeMembros; i++){
            if ((this.membros[i].getNome().equals(m.getNome())) && (this.membros[i].getDtNAsc().equals(m.getDtNAsc()))){
                return false;
            }
        }
        m.setProjeto(this);
        this.membros[qntDeMembros] = m;
        qntDeMembros++;
        custo += m.getSalario();
        return true;

    }

    public boolean removerMembro(String nome, String datanasc){
        for (int i=0; i < qntDeMembros; i++) {
            if (this.membros[i].getNome().equals(nome) && this.membros[i].getDtNAsc().equals(datanasc)) {
                custo -= membros[i].getSalario();
                membros[i].setProjeto(null);
                membros[i] = membros[qntDeMembros-1];
                qntDeMembros--;
                return true;
            }
            return false;
        }
    }
    
}
