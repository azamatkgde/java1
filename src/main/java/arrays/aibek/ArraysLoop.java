package arrays.aibek;

public class ArraysLoop {
    public static void main(String[] args) {
        int ages []= {20,22,18,98,30,67,78};
        //avg — орточо жаш куракты,sum — бардык жаштардын жалпы суммасын сактайт.
        float avg , sum = 0;
        int length = ages.length ;
        for(int age : ages){
            sum += age ;
        }
        avg = sum / length ;
        System.out.println("Орточо мааниси: "+ avg ) ;


        // MAX MIN VALUE


        int numbers[]={7,2,9,1,6,8};
        // Баштапкы маанилерди массивдин биринчи элементинен алабыз
        int min = numbers[0];
        int max = numbers [0];
        for (int num: numbers ){
            if (num < min ){
                min = num ;  // Эгер учурдагы сан minден кичине болсо, minди жаңыла
            }
            if (num > max ){
                max = num ;   // Эгер учурдагы сан maxтан чоң болсо, maxты жаңыла
            }

        };

        System.out.println("Минимум: " + min) ;
        System.out.println("Максимум: " + max) ;

    }
}
