package clientModule;

import domain.Employee;
import domain.dao.EmployeeDAO;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

// client-side
public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee(122332, "Gary", "sales", false);
        emp1.about();

        hireNewEmp(emp1);
        removeEmp(emp1);

        printEmpReport(emp1, FormatType.CSV);
    }

    public static void hireNewEmp(Employee emp) {
        EmployeeDAO e1 = new EmployeeDAO();
        e1.saveEmp(emp);
    }

    public static void removeEmp(Employee emp) {
        EmployeeDAO e1 = new EmployeeDAO();
        e1.termEmp(emp);
    }

    public static void printEmpReport(Employee emp, FormatType formatType) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(emp, FormatType.CSV);
        System.out.println(gerFormatEmp());
    }

}
