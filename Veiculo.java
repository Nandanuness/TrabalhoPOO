package OO;

public class Veiculo {
    private String marca;
    private double km;
    private double valor;
    private int mes;
    private int ano;

    public Veiculo() {
    }

    public Veiculo(String marca, double km, double valor, int mes, int ano) {
        this.marca = marca;
        this.km = km;
        this.valor = valor;
        this.mes = mes;
        this.ano = ano;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}



//Lenbretes
//Set: atribuir informação/valor de um atributo privado (não retorna nada, "void").
//Get: acessar informação/valor de um atributo privado (retorna o valor atual, sempre "return").

