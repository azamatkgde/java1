package interfaces.azamat.school;

public class Teacher implements TeacherRules {
    private String book;

    @Override
    public void needTeach() {
        book = "Кыргыз тили";
        System.out.println(book + "н окуйбуз");
    }

    @Override
    public void showRoad() {

    }
}
