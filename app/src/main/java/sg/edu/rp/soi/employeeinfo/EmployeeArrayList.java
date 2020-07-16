package sg.edu.rp.soi.employeeinfo;
public class EmployeeArrayList {
    private String name;
    private String title;
    private String salary;

    public EmployeeArrayList(String name, String title, String salary){
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name +":"+title +" :"+salary;
    }
}
