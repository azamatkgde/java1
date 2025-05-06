package methods.elmirbek;

// Explanation
// ❗The method [void] does not return anything
// ❗The method [String], [int], [double], [float], [boolean], [char] - returns value

public class SimpleMethod {

    public static void main(String[] args) {
        // create instance of the GreeterUser Class 👇
        Greeter ainuraGreeter = new Greeter();
        ainuraGreeter.sayHelloAinura("Салам" , "Айнура");
        // create instance of the Greeter Class 👇
        Greeter myGreeter = new  Greeter();
        Greeter anvarGreeter = new Greeter();
        // print instance of the Greeter Class
        myGreeter.sayHelloElmirbek("Элмирбек", 19, "Я студент хотя не считаю себя студентом");
        myGreeter.sayHelloAnvar("Анвар", 18, "Я считаю себя студентом");

    }
}



class  Greeter {
    void sayHelloElmirbek (String name, int age, String aboutMe) {
        System.out.printf("Всем привет меня зовут %s и мне %d лет %s спасибо мы знаем кто ты !!! \n ", name, age, aboutMe);
    }
    void sayHelloAnvar (String name, int age, String aboutMe) {
        System.out.printf("Всем привет меня зовут %s, и мне %d лет %s спасибо мы знаем кто ты !!! \n ", name, age, aboutMe);
    }

    void sayHelloAinura(String greeter, String name) {
        System.out.println(greeter + name);
    }
}
