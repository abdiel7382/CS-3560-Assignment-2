public class Professor extends Employee{
    private String field;
    
    public Professor(\ String field){
        super(name, hours);
        this.field = field;
    }
    @Override
    
    public double calculateSalary(){
        int salary = getHours()*30;
        return salary;
    }
}