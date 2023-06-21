package Ex1;

public class Icarros {
    public static void main(String[] args) {

        Carro renault1 = new Renault("Sandeiro", 2018 , "azul", 4 );
        Carro fiat1 = new Fiat("Uno" , 2012 , "preto" , 2);
        Carro hyndai1 = new Hyundai("HB20" , 2020 , "branca",4);


        System.out.println("\n============Testando================\n");
        renault1.ficha();
        renault1.iniciar();
        renault1.acelerar();
        renault1.acelerar();
        renault1.acelerar();
        renault1.freiar();
        renault1.freiar();
        renault1.freiar();
        renault1.freiar();
        renault1.freiar();
        renault1.freiar();

        System.out.println("\n============Testando================\n");
        fiat1.ficha();
        fiat1.iniciar();
        fiat1.acelerar();
        fiat1.freiar();
        fiat1.freiar();
        fiat1.freiar();


        System.out.println("\n============Testando================\n");
        hyndai1.ficha();
        hyndai1.iniciar();
        hyndai1.acelerar();
        hyndai1.freiar();
        hyndai1.freiar();
        hyndai1.freiar();
        hyndai1.freiar();
        hyndai1.freiar();
        hyndai1.freiar();
        hyndai1.freiar();
        hyndai1.freiar();
        hyndai1.freiar();
        hyndai1.freiar();
        hyndai1.freiar();












    }
}
