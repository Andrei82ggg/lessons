package lesson1;

public class App {
    public static void main(String[] args){

        Aftor lev =new Aftor("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", lev, 1930);
        Book master = new Book("Мастер", new Aftor("Михаил", "Булгаков"), 1930);
        System.out.println(master.getTitle() + " "+ master.getAftor().getFirstName() +" " +master.getAftor().getLastName()+" "+master.getYaer());
    }
}
