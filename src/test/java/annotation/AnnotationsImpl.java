package annotation;

// Аннотацияларды аныктайбыз
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


// Анотациялар
@Retention(RetentionPolicy.RUNTIME)
@interface Autor {
    String name();
    String date();
}

// Негизги класс
public class AnnotationsImpl {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        javaDeveloper.toWork();

        AnnotationsImpl impl = new AnnotationsImpl();
        impl.developer(); // метод чакыруу
    }

    public void developer() {
        System.out.println("Developer");
    }
}

// Класстар
@Autor(name = "Азамат", date = "11.05.2021")
class Developer {
    public void toWork() {
        System.out.println("Мен сен Developer");
    }
}

@ToDo(message = "Бул классты жазганды унутпаш керек", priority = "LOW", createBy = "Азамат")
class JavaDeveloper extends Developer {
    @Override
    public void toWork() {
        System.out.println("Мен сен JavaDeveloper");
    }
}

class PascalDeveloper extends Developer {
    @Override
    public void toWork() {
        System.out.println("Мен сен PascalDeveloper");
    }
}
