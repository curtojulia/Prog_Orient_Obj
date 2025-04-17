//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(30, "Ciências de Dados");
        Aluno a1 = new Aluno("Júlia",1);
        Aluno a2 = new Aluno("Vitor",3);
        Aluno a3 = new Aluno("Marcelle",2);
        Aluno a4 = new Aluno("Guilherme",4);

        curso1.matricular(a1);
        curso1.matricular(a2);
        curso1.matricular(a3);
        curso1.cancelarMatricula(2);
        curso1.imprimir();
    }
}