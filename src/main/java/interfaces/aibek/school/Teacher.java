package interfaces.aibek.school;

public class Teacher implements TeacherRules{
    private  String book;
    @Override
    public void needTeach() {
        book = "кыргыз тили";
        System.out.println("Биз " + book + "н окуйбуз ");

    }
    private String kelechek;
    @Override
    public void shoeRoad() {
        kelechek = "келечекке ";
        System.out.println("Мугалим " + kelechek + "жол корсотот");
    }
}
