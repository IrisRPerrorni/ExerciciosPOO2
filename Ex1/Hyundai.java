package Ex1;

public class Hyundai extends Carro {
    public Hyundai(String marca, int ano, String cor, int portas) {
        super(marca, ano, cor, portas);
    }

    @Override
    public void iniciar() {
        System.out.println("Iniciando o motor...\n Minha velocidade é igual a 5 km/h");
        setVelocidade(5);
    }

    @Override
    public void freiar() {
        double freiando = getVelocidade()-2;
           setVelocidade(freiando);
           if (freiando<=0){
               System.out.println("A velocidade é 0 km/h. O carro parou");
           } else {
               System.out.println("Freiando...Minha velocidade está: " + getVelocidade() + "km/h");
           }
    }

    @Override
    public void acelerar() {
        if(getVelocidade()>=200){
            System.out.println("Velocidade máxima permitida!");
        } else if (getVelocidade()<200){
            double acelera = getVelocidade() + 15;
            setVelocidade(acelera);
            System.out.println("Acelerando...Minha velocidade está: " + getVelocidade() + "km/h");
        }

    }

    @Override
    public void ficha() {
        System.out.println("\n***********Ficha Técnica**********\n");
        System.out.println("O carro é um " + getMarca() + " da Hyundai \nDo ano: " + getAno() + "\nCor: " + getCor()
        + "\n portas: " + getPortas()+ "\n");
    }
}
