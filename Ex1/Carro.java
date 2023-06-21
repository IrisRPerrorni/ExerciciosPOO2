package Ex1;

public abstract class Carro {

    private String marca;
    private int ano;
    private  String cor ;
    private int portas;
    private double velocidade;

    public Carro(String marca, int ano, String cor, int portas) {
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.portas = portas;

    }

    public abstract void iniciar();
    public abstract void freiar();
    public abstract void acelerar();
    public abstract void ficha();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }


}
