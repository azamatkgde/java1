package jsons.azamat;

public class Task {
    private int id;
    private String title;
    private Boolean done;

    // Конструктор
    public Task() {

    }

    public Task(int id, String title, Boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }

    // Геттер жана сеттер

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
