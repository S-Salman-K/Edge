package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {

    static List<Employee> searchEmployeeByDepartment(Employee[] employeeList, String department){
        List<Employee> list = new ArrayList<>();
        for(Employee employee: employeeList){
            if(employee.getEmpDept().equalsIgnoreCase(department))
                list.add(employee);
        }
        return list;
    }


    public static void main(String[] args) {
//        Problem 1
        Employee emp1 = new Employee("EMP001", "Jon", "IT", 700000);
        Employee emp2 = new Employee("EMP002", "Ron", "HR", 500000);
        Employee emp3 = new Employee("EMP003", "Joe", "HR", 600000);
        Employee emp4 = new Employee("EMP004", "Smith", "IT", 1000000);
        Employee emp5 = new Employee("EMP005", "Mike", "IT", 900000);
        Employee[] employeesList = {emp1, emp2, emp3, emp4, emp5};
        for(Employee e: employeesList)
            System.out.println(e);
        Comparator<Employee> sortBySalary = (a, b)-> (int)(b.getEmpBasicSalary()-a.getEmpBasicSalary());
        Arrays.sort(employeesList, sortBySalary);
        System.out.println("\nOrdering by Salary(DESC): ");
        for(Employee e: employeesList)
            System.out.println(e);

        System.out.println("\nOrdering by ID(ASC) : ");
        Arrays.sort(employeesList);
        for(Employee e: employeesList)
            System.out.println(e);

        System.out.println("\nIT Dept:");
        for(Employee emp: searchEmployeeByDepartment(employeesList, "IT"))
            System.out.println(emp);
//        Problem 2
        Employee emp6 = new Employee("EMP005", "Mike", "IT", 900000);
        System.out.println(emp5.equals(emp6));
    }
}
