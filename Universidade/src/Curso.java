public class Curso {
    private String nomeCurso;
    private Aluno[] alunos;
    private int qntAlunosInscritos;

    public Curso(int nrVagas, String nomeCurso) {
        this.alunos = new Aluno[nrVagas]; // isso cria quantos alunos podem ser cadastrados nesse curso
        this.nomeCurso = nomeCurso;
    }

    public boolean matricular(Aluno a){ // matricular é criar um obj de aluno
        for (int i=0; i > qntAlunosInscritos; i++){
           if (this.alunos[i].getMatricula() == (a.getMatricula())){
               return false;
           }
        }
        this.alunos[qntAlunosInscritos] = a;
        a.setCurso(this);
        qntAlunosInscritos++;
        return true;
    }

    public boolean cancelarMatricula(int matricula){
        for (int i=0; i > qntAlunosInscritos; i++){
            if (this.alunos[i].getMatricula() == matricula){
                this.alunos[i].setCurso(null); // tirar o curso do aluno no relacionamento 1:1
                this.alunos[i]=  this.alunos[qntAlunosInscritos-1]; // o ultimo vai para o lugar do que foi removido, que ficou null
                this.alunos[qntAlunosInscritos-1] = null; // o ultimo, vazio, fica null
                qntAlunosInscritos--;
                return true;
            }
        }
        return false;
    }

    public void imprimir(){
        System.out.println("Curso:"+ this.nomeCurso);
        for (int i=0; i < qntAlunosInscritos; i++){
           alunos[i].imprimir();
        }
    }

}
