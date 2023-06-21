package Ex1;

public class Fiat extends Carro {
    public Fiat(String marca, int ano, String cor, int portas) {
        super(marca, ano, cor, portas);
    }

    @Override
    public void iniciar() {
        System.out.println("Iniciando o motor...\n Minha velocidade é igual a 3 km/h");
        setVelocidade(3);

    }

    @Override
    public void freiar() {
        double freiando = getVelocidade() - 6;
        setVelocidade(freiando);
        if (freiando<=0){
            System.out.println("o carro parou");
        }else {
            System.out.println("Freiando...Minha velocidade está: " + getVelocidade() + "km/h");
        }
//        if(getVelocidade() <= 0) {
//            System.out.println("o carro parou");
//        } else if (getVelocidade() > 0) {
//            double freiando = getVelocidade()-6;
//            setVelocidade(freiando);
//            System.out.println("Freiando...Minha velocidade está: " + getVelocidade() + "km/h");
//        }
    }

    @Override
    public void acelerar() {
        if (getVelocidade() >= 200) {
            System.out.println("Velocidade máxima permitida!");
        } else if (getVelocidade() < 200) {

            double acelera = getVelocidade() + 12;
            setVelocidade(acelera);
            System.out.println("Acelerando...Minha velocidade está: " + getVelocidade() + "km/h");
        }

    }

    @Override
    public void ficha() {
        System.out.println("\n***********Ficha Técnica**********\n");
        System.out.println("O carro é um " + getMarca() + " da Fiat \nDo ano: " + getAno() + "\nCor: " + getCor()
                + "\n portas: " + getPortas() + "\n");
    }
}
