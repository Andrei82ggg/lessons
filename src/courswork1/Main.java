package courswork1;

public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Котов Петр Петрович", 1, 613300);
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
        System.out.println("Средняя сумма = " + average());
        findMinSalary();

        Employee minSalary = findMinSalary();
        if (minSalary != null) {
            System.out.println("Сотрудник с минимальной зарплатой " + minSalary);
        }
        findMaxSalary();
        printFIO();
        zadacha();
    }

    static void printAll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    static int sum() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalari();
        }
        return sum;
    }

    static Employee findMinSalary() {
        Employee min = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (min == null || employee.getSalari() < min.getSalari()) {
                min = employee;
            }
        }
        return min;

    }

    static void findMaxSalary() {
        Employee max = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (max == null || employee.getSalari() > max.getSalari()) {
                max = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой " + max);
    }

    static double average() {
        return (double) sum() / employees.length;
    }

    static void printFIO() {
        for (Employee employee : employees) {
            System.out.println(employee.getFio());
        }
    }
    static void zadacha(){
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 !=0){
                arr[i]+= 1;
                for (i = 3; i < 7; i++) {
                    System.out.println(i);

                }
            }
        }
    }

   }