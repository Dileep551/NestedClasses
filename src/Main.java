import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(2213, "Dileep", 2021),
                new Employee(1021, "John", 2021),
                new Employee(1003, "David", 2006),
                new Employee(1000, "Ram", 1996),
                new Employee(999, "Varma", 1990)
        ));


//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);


        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());
        for (Employee e : employees) {

            System.out.println(e);
        }

        System.out.println("Store Memebers");

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(1021, "Dileep", 2021, "Walmart" ),
                new StoreEmployee(1124, "David", 2021, "Target" ),
                new StoreEmployee(2345, "John", 2021, "Costco" ),
                new StoreEmployee(234512, "joseph", 2021, "walmart" )

        ));

        var comparator = new StoreEmployee().new StoreComparator<>();
        storeEmployees.sort(comparator);
        for(StoreEmployee e : storeEmployees){
            System.out.println(e);
        }
    }
}