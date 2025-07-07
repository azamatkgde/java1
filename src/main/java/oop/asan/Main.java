package oop.asan;

public class Main {
    public static void main(String[] args) {

/*
 Dog hunde = new Dog();
       hunde.rasse = "Бульдок";
       hunde.weight = 45;

       hunde.sayGay();

    }
}

 */
        SellCat sellCat2 =new SellCat("Черный","Бомбейская",13,5.7,800,1400,"США:ул.Вашингтон");
        sellCat2.printSellCat2();
        SellCat sellCat1 = new SellCat("Коричневый ","Мейн Кун ",5,21.3,200,1000,  " США:ул.Вашингтон" );

        sellCat1.printSellCat1();





    }
}