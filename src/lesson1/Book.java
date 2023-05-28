package lesson1;

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
}
