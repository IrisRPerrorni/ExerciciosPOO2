package Ex1;

public class Renault extends Carro {


    public Renault(String marca, int ano, String cor, int portas) {
        super(marca, ano, cor, portas);
    }

    @Override
    public void iniciar() {
        System.out.println("Iniciando o motor...\nMinha velocidade está em 0 km/h");
        setVelocidade(0);


    }

    @Override
    public void freiar() {

        double freiando = getVelocidade() - 5;
        setVelocidade(freiando);
        System.out.println("Freiando...Minha velocidade está: " + getVelocidade() + "km/h");
        if (freiando == 0){
            System.out.println("A velocidade é 0 km/h. O carro parou!");
        }


    }

    @Override
    public void acelerar() {
        if (getVelocidade() >= 200) {
            System.out.println("Velocidade máxima permitida!");
        } else if (getVelocidade() < 200) {

            double acelera = getVelocidade() + 10;
            setVelocidade(acelera);
            System.out.println("Acelerando...Minha velocidade está: " + getVelocidade() + "km/h");
        }
    }

    @Override
    public void ficha() {
        System.out.println("\n***********Ficha Técnica**********\n");
        System.out.println("O carro é um " + getMarca() + " da Renault \nDo ano: " + getAno() + "\nCor: " + getCor()
                + "\n portas: " + getPortas() + "\n");
    }

}

