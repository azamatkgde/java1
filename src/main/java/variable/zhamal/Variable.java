package variable.zhamal;

public class Variable {
    public static void main ( String []args){

        String pat = " Marcus   ";
        String pat1 = " Stefan ";
        int alt = 17 ;
        int alt2 = 18;
          double aufnahmegewicht = 86.6;
          double aufnahmegewicht2 = 55.2;
          boolean adipös = aufnahmegewicht2 < aufnahmegewicht ;
          System.out.println( " Der Hr." + pat+" ist " + alt  +" Jahre alt. " +  " Er wiegt " + aufnahmegewicht );
          System.out.println( " Hr." + pat1 + " ist " + alt2 + " Jahre alt. " + " Er wiegt " + aufnahmegewicht2 );
          System.out.println( " Hr. Marcus soll Diätberatung kriegen " + adipös );

        int d = 27 * 9 + 90;
        System.out.println(d);

        int g = 99;
        int e = -67;
        int l = g + e;
        System.out.println(l);

        int k = 76589546;
        k--;
        System.out.println(k);

        int mathe = 45;
        byte byteNumber = 10;
        System.out.println(" Janat "+ mathe+ " jashta " + " Urmat "+byteNumber+ " jashta  ");

        short shortNumber = 90;
        System.out.println(shortNumber);

        long longNumber = 567489302;
        System.out.println("Alar bankga " + longNumber + " Summa kotordu jana "+ shortNumber+" Kitep satyp aldy");

        float floatNumber = 2.13f;
        System.out.println(floatNumber);

        double doubleNumber = 35.99;
        System.out.println(" Bilet baasy Studentter uchun " + doubleNumber);

        char charNumber = 2;
        System.out.println(charNumber);

        System.out.println(mathe + Byte.MAX_VALUE);
        System.out.println(mathe + Short.MIN_VALUE);
        System.out.println(mathe + Long.MAX_VALUE);
        System.out.println(mathe + Float.MIN_VALUE);
        System.out.println( mathe + Double.MIN_VALUE );






    }
}
