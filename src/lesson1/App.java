package lesson1;

public class App {
    public static void main(String[] args){

        Aftor michail = new Aftor("Михаил", "Булгаков");
        Aftor lev =new Aftor("Лев", "Толстой");
        Book master = new Book("Мастер", michail, 1930);

        master.setYaer(200);

        System.out.println(master.getTitle() + " "+ master.getAftor().getFirstName() + " "+michail.getLastName() + " "+master.getYaer());
    }
}
