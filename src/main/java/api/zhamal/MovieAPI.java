package api.zhamal;

public class MovieAPI {
    public String getMovieInfo(String title) {
        if (title.equalsIgnoreCase("Avatar")) {
            return "🎬 Avatar - 2009, режиссер: James Cameron, жанр: фантастика";
        } else if (title.equalsIgnoreCase("Titanic")) {
            return "🎬 Titanic - 1997, режиссер: James Cameron, жанр: драма";
        } else {
            return "😕 Маалымат табылган жок.";
        }
    }
}
