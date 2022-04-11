import java.util.Scanner;

/* Manav Kasa Programı
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam
        tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
        Örnek Çıktı

        Armut Kaç Kilo ? :0
        Elma Kaç Kilo ? :1
        Domates Kaç Kilo ? :1
        Muz Kaç Kilo ? :2
        Patlıcan Kaç Kilo ? :3
        Toplam Tutar : 21.68 TL  */
public class Main {
    public static void main(String[] args) {
        double armutKg=2.14, elmaKg =3.67, domateKg = 1.11, muzKg=0.95, patlicanKg=5;
        double armut, elma, domates, muz, patlican;
        double armutTop, elmaTop, domatesTop, muzTop, patlicanTop;
        Scanner input  = new Scanner(System.in);
        System.out.println("Armut kac kilo aldiniz ? :");
        armut = input.nextDouble();
        System.out.println("Elma kac kilo aldiniz ? :");
        elma = input.nextDouble();
        System.out.println("Domates kac kilo aldiniz ? :");
        domates = input.nextDouble();
        System.out.println("Muz kac kilo aldiniz ? :");
        muz = input.nextDouble();
        System.out.println("Patlican kac kilo aldiniz ? :");
        patlican = input.nextDouble();
        
          armutTop = armut * armutKg;
          elmaTop = elma * elmaKg;
          domatesTop = domates * domateKg;
          muzTop = muz * muzKg;
          patlicanTop = patlican * patlicanKg;

         double toplam = (armutTop + elmaTop + domatesTop + muzTop +patlicanTop);
        System.out.println("Odenecek toplam tutar: " + toplam);


    }

}
