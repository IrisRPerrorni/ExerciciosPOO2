package Ex3;

import java.time.LocalDate;

public class Funcionario {
 private String nome;
 private LocalDate dataAdmissao;
 private double salario ;
 private static int idContador = 0;
 private int identificador;

 public Funcionario(){
     idContador +=1;
     identificador = idContador;

 }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

     this.nome = nome;
    }

    public LocalDate getDataAdmissao() {

     return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        if(dataAdmissao.isAfter(LocalDate.now())){
            this.dataAdmissao = LocalDate.now();    // fiz uma condição que se colocasse uma data futura , ele retornaria a data atual.
        } else {
            this.dataAdmissao = dataAdmissao;
        }
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {
     if (salario>700.0){
         this.salario = salario;
     } else {
         this.salario = 700.0;
     }
    }

    public int getIdentificador(){
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
}
