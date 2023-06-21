package Ex3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Funcionario medico = new Funcionario();
        medico.setNome("José Bonifácio");
        medico.setDataAdmissao(LocalDate.of(2020 , 5 ,12));
        medico.setSalario(5000.0);
        medico.getNome();
        medico.getDataAdmissao();
        medico.getSalario();

        Funcionario enfermeira = new Funcionario();
        enfermeira.setNome("Mariana da silva");
        enfermeira.setDataAdmissao(LocalDate.of(2021,06,15));
        enfermeira.setSalario(3000.0);
        enfermeira.getNome();
        enfermeira.getDataAdmissao();
        enfermeira.getSalario();

        Funcionario recepcionista = new Funcionario();
        recepcionista.setNome("Elis da Corte");
        recepcionista.setDataAdmissao(LocalDate.of(2021,10,25));
        recepcionista.setSalario(2000.);
        recepcionista.getNome();
        recepcionista.getDataAdmissao();


        System.out.println("_________Imprimindo a ficha___________\n");
        System.out.println("Nome: "+medico.getNome()+ "\nData de Admissão: " + medico.getDataAdmissao() + "\nSalário R$: "
                + medico.getSalario()+ "\nID: " + medico.getIdentificador()) ; // imprimindo funcionario 1

        System.out.println("\nNome: "+enfermeira.getNome()+ "\nData de Admissão: " + enfermeira.getDataAdmissao() + "\nSalário R$: "
                + enfermeira.getSalario() + "\nID: " + enfermeira.getIdentificador()); // imprimeindo funcionario 2

        System.out.println("\nNome: "+recepcionista.getNome()+ "\nData de Admissão: " + recepcionista.getDataAdmissao() + "\nSalário R$: "
                + recepcionista.getSalario() +"\nID: " +recepcionista.getIdentificador()); // imprimeindo funcionario 3

        System.out.println("\n_________Testando salario menor R$700.0___________\n");
        recepcionista.setSalario(500.0);
        System.out.println(recepcionista.getSalario());

        System.out.println("\n_________Testando o ID___________\n");
        System.out.println(medico.getIdentificador()+ "\n" + enfermeira.getIdentificador() + "\n"
                + recepcionista.getIdentificador());

        System.out.println("\n_________Testando o Validação do setdata___________\n");

        medico.setDataAdmissao(LocalDate.of(2024 , 5 ,12));
        System.out.println(medico.getDataAdmissao());








    }


}
