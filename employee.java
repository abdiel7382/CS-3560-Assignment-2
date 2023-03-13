public abstract class Employee
{
    private String name;
    private int hours;
    
    public Employee(String name, int hours){
        this.name = name;
        this.hours = hours;
    }
    
    public int getHours(){
        return hours;
    }
    
    public double calculateSalary(){
        int salary = getHours()*20;
        return salary;
    }
}