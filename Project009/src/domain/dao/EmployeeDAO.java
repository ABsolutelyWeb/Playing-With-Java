package domain.dao;

import domain.Employee;

public class EmployeeDAO {



    public void saveEmp(Employee emp) {
        // DatabaseConnectionManager code would go here
        System.out.println("Employee " + emp + " was saved to the db.");
    }

    public void termEmp(Employee emp) {
        System.out.println("Employee " + emp + " was deleted from the db.");
    }


}
