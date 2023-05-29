package lesson1;

public class App {
    public static void main(String[] args) {

        Aftor lev = new Aftor("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", lev, 1930);
        Book master = new Book("Мастер", new Aftor("Михаил", "Булгаков"), 1930);

        System.out.println(master.getTitle() + " " + master.getAftor() + "   " + master.getYaer());

        System.out.println(master);

        System.out.println(master.hashCode());
        System.out.println(warAndPeace.hashCode());

        if (warAndPeace.equals(master)) {
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Книги разные");
        }

    }
}
