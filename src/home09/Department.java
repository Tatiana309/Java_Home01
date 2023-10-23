package home09;

public class Department {
    private int numberOfEmployees;
    private String departmentName;
    private Department subordinateDepartment;

    public Department(int numberOfEmployees, String departmentName) {
        this.numberOfEmployees = numberOfEmployees;
        this.departmentName = departmentName;
    }

    public Department(int numberOfEmployees, String departmentName, Department subordinateВepartment) {
        this.numberOfEmployees = numberOfEmployees;
        this.departmentName = departmentName;
        this.subordinateDepartment = subordinateВepartment;
    }
    public String Info(){
        if (subordinateDepartment!=null)
            return departmentName+"\n Подчиняется: "+subordinateDepartment.departmentName+"\n Количество сотрудиков: "+numberOfEmployees;
    else return departmentName+"\n Количество сотрудиков: "+numberOfEmployees;

    }
}
