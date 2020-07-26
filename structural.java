public class Employee {
    private String name;
    private String gender;
    private String position;
    
    public Employee(String name, String gender, String position) {
        this.name = name;
        this.gender = gender;
        this.position = position;
    }
    //getters
}
public interface Criteria {
    public List<Employee> criteria(List<Employee> employeeList);
}
