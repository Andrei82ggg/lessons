package courswork1;

public class Employee {

    private static int idGenerator =0;
    private final int id;
    private final String fio;
    private  int departament;
    private int salari;

    public Employee(String fio, int departament, int salari){
        if (departament < 1 || departament > 5){
            throw new IllegalStateException("Отдел должен быть от 1 до 6");
        }
        this.id = ++idGenerator;
        this.fio = fio;
        this.departament = departament;
        this.salari = salari;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public int getDepartament() {
        return departament;
    }

    public int getSalari() {
        return salari;
    }

    public void setDepartament(int departament) {
        if (departament < 1 || departament > 5){
            this.departament = departament;
        }
        this.departament = departament;
    }

    public void setSalari(int salari) {
        this.salari = salari;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", departament=" + departament +
                ", salari=" + salari +
                '}';
    }
}
