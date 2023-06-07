package courswork1;

public class Main {
    private static final Employee[] employees = new Employee[10];
    public static void main(String[] args){
        employees[0] = new Employee("Иванов Иван Иванович", 1, 55000);
        employees[1] = new Employee("Петров Петр Петрович", 1, 61000);
        employees[2] = new Employee("Симонов Иван Иванович", 2, 62000);
        employees[3] = new Employee("Когель Юлия Ивановна", 2, 63000);
        employees[4] = new Employee("Киа Кан Ермолаевич", 3, 60300);
        employees[5] = new Employee("Ян Ян Янович", 3, 60400);
        employees[6] = new Employee("Семенов Семен Семенович", 4, 63400);
        employees[7] = new Employee("Иванови Петр Павлович", 4, 60400);
        employees[8] = new Employee("Кот Татьяна Сергеевна", 5, 60401);
        employees[9] = new Employee("Лиман Екатерина Андреевна", 5, 60412);
        printAll();
        System.out.println("Сумма затрат в месяц = " + sum());
        findMinSalary();
    }
    static void printAll(){
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
    static int sum(){
        int sum = 0;
        for (Employee employee : employees){
            sum += employee.getSalari();
        }
        return sum;
    }
    static void  findMinSalary(){
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalari() < min) {
                min = employees[i].getSalari();
                index = i;
            }
        }
        System.out.println("Минимальная зарплата =" + min);
        System.out.println("Сотрудник с минимальной зарплатой" + min);

    }
}
