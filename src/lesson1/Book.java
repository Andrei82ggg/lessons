package lesson1;

import java.util.Objects;

public class Book {
    private final String title;
    private final  Aftor aftor;
    private int yaer;

    public Book(String title, Aftor aftor, int yaer) {

        this.title = title;
        this.aftor = aftor;
        this.yaer = yaer;
    }
    public String getTitle(){
        return title;
    }
    public Aftor getAftor(){
        return aftor;
    }
    public int getYaer(){
        return  yaer;
    }
    public void setYaer(int yaer){
            this.yaer = yaer;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", aftor=" + aftor.toString() +
                ", year=" + yaer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yaer == book.yaer && Objects.equals(title, book.title) && Objects.equals(aftor, book.aftor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, aftor, yaer);
    }
}
