package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Comparable<Employee> {

    private String empName;
    private String empDept;

    private double empBasicSalary;
    private double empGrossSalary;
    static final double HRA = 0.12;
    static final double DA = 0.08;

    public Employee(String empId, String empName, String empDept, double empBasicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empDept = empDept;
        this.empBasicSalary = empBasicSalary;
        setEmpGrossSalary();
    }

    private String empId;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public double getEmpBasicSalary() {
        return empBasicSalary;
    }

    public void setEmpBasicSalary(double empBasicSalary) {
        this.empBasicSalary = empBasicSalary;
    }

    public double getEmpGrossSalary() {
        return empGrossSalary;
    }

    public void setEmpGrossSalary() {
        this.empGrossSalary = calculateGrossSalary();
    }

    private double calculateGrossSalary() {
        double hra = HRA * this.empBasicSalary;
        double da = DA * this.empBasicSalary;
        return this.empBasicSalary + hra + da;
    }

    @Override
    public String toString() {
        return "Employee{" +
                " empId='" + empId + '\'' +
                " empName='" + empName + '\'' +
                " empDept='" + empDept + '\'' +
                " empBasicSalary=" + empBasicSalary +
                " empGrossSalary=" + empGrossSalary +
                "}";
    }

    @Override
    public int compareTo(Employee employee) {
        return this.empId.compareTo(employee.empId);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (obj.getClass() != this.getClass())
            return false;

        Employee other = (Employee) obj;
        if (other.getEmpId()!=null && this.getEmpId().equalsIgnoreCase(other.getEmpId())
                &&  other.getEmpName()!=null && this.getEmpName().equalsIgnoreCase(other.getEmpName())) {
            return true;
        }
        return false;
    }
}
