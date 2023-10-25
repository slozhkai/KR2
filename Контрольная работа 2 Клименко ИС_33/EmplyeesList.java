//Лист с сотрудниками

import java.util.ArrayList;
import java.util.List;

class EmployeeList implements Salary{
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployeeById(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getId() == employeeId) {
                return employee;
            }
        }
        return null; // Если сотрудник не найден
    }

}
