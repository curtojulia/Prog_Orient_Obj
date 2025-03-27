public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int ano, int mes) {
        this.dia = dia;
        this.ano = ano;
        this.mes = mes;
    }

    public void EhValida(){

    }

    public boolean ehBissexto(){
        if ( (ano % 400 == 0) || ( ano % 4 == 0 && ano % 100 != 0)){
            return true;
        }
        else  return false;
    }


    public void imprimir(){
        System.out.println(dia +"/"+ mes+"/"+ ano);
    }
}
