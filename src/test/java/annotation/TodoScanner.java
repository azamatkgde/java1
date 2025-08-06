package annotation;

public class TodoScanner {
    public static void main(String[] args) {
        Class<?>[] classes = {
                AnnotationsImpl.class,
                Developer.class,
                JavaDeveloper.class,
                PascalDeveloper.class
        };

        for (Class<?> clazz : classes) {
            if (clazz.isAnnotationPresent(ToDo.class)) {
                ToDo todo = clazz.getAnnotation(ToDo.class);
                System.out.println("Класс: " + clazz.getSimpleName());
                System.out.println(" - Message: " + todo.message());
                System.out.println(" - Priority: " + todo.priority());
                System.out.println(" - Created By: " + todo.createBy());
                System.out.println();
            }
        }
    }
}