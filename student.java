public class Student
  {
    private String name;
    private String major;
    private double gpa;

    public Student(){
      
    }

    public Student(String name, String major)
    {
      this.name = name;
      this.major = major;
    }

    public Student(String name, String major, double gpa)
    {
      this.name = name;
      this.major = major;
      this.gpa = gpa;
    }
    
    public String getName(){
      return name;
    }

    public void setName(String name){
      this.name = name;
    }

    public String getMajor(){
      return major;
    }

    public void setMajor(String major) {
      this.major = major;
    }

    public double getGpa(){
      return gpa;
    }

    public void setGpa (double gpa) {
      this.gpa = gpa;
    }

    public String toString(){
      return String.format("Name: %s, Major: %s, GPA: %f", name, major, gpa);
    }

    public boolean equals(Student student){
      boolean status;
      if((name == student.name) && (major == student.major))
        status = true;
      else
        status = false;
      return status;
    }
  }
