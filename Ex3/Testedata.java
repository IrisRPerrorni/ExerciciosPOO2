package Ex3;

import java.time.LocalDate;

public class Testedata { // Foi somente para testar
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.parse("2023-05-10");
        LocalDate data2 = LocalDate.of(2023 , 05 ,10);
        LocalDate data4 = LocalDate.now();
        System.out.println(data1);
        System.out.println(data4);

        System.out.println(data1.equals(data4)); // comparação data
        System.out.println(data1.isAfter(data2)); // data depois

    }



}
