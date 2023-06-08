package lesson1;

import java.util.Objects;

public class Aftor {

    private final String firstName;

    private final String lastName;

    public Aftor(String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;

    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
    @Override
    public String toString() {
        return "Aftor{" +
                "firstName='" + firstName +'\''+
                ",lastName='" + lastName +'\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aftor)) return false;
        Aftor aftor = (Aftor) o;
        return Objects.equals(firstName, aftor.firstName) && Objects.equals(lastName, aftor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
