package variable.yryskeldi;

public class Murabaha {
    public static void main (String[] args) {
        String name = "Уйдун баасы = ";
        int preis = 5280000;
        System.out.println(name + preis+" сом 61395$");
        String vznos = "Первоначальный взнос = ";
        int num = 1584000;
        System.out.println(vznos + num + "сом. 18419$ (30,0%)");
        String srok = "Срок финансирования = ";
        byte num1 = 84;
        System.out.println(srok + num1 +"ай. (7жыл)");
        String finans = "Сумма финансирования = ";
        int num2 = 3696000;
        System.out.println(finans + num2 + "сом. (42977$)");
        String nasenka = "Первоначальный взностон кийинки акча = ";
        int num3 = 3385536;
        System.out.println(nasenka + num3 + "coм. (39367$)");
        int total = num2+num3;
        String preis2 = "Продажная цена дома = ";
        System.out.println(preis2 + total + "coм. (82343$)");
        String summa = "Сумма ежемесячного взноса = ";
        int num4 = 84304;
        System.out.println(summa + num4 + "coм. (980$)");
        String rashod = "Расходы на оформление в среднем = ";
        int num5 = 35000;
        System.out.println(rashod + num5 + "сом. (407$)");
        String text = "Документ: кызыл китеп банкта болот!\n Без первоначальный взнос алсаныз болот бирок залоко башка Уй коюшунуз керек.\n Ошондо банкта 2 уй болот.";
        System.out.println(text);
        String papiere = "Перечень документов, необходимых для получения:";
        String docum1 = "1: Паспорт Клиента, паспорт супруги(а), свидетельство о браке.";
        String docum2 = "2: Нотариально заверенное заявление о семейном положении (холост, не замужем...) или согласие супруги(а) на получение финансирования в ЗАО \"ЭкоИсламикБанк\" и на залог.";
        String docum3 = "3: Документы, подтверждающие источник дохода (справка о заработной плате за последние 6 (Шесть) месяцев, справки о наличии скота, земельной доли, договор аренды, если клиент/поручитель сдает в аренду имущество, копия правоустанавливающего документа сдаваемого имущества и т.п. документы).";
        System.out.println("\n\n" +papiere + "\n" + docum1 + "\n" + docum2 + "\n" + docum3);



    }
}
