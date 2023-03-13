public class StudentTest {
	public static void main(String[] args)
	{
		Student student1 = new Student("John", "CS", 3.5);
	
		System.out.println("Name: " + student1.getName());
		System.out.println("Major: " + student1.getMajor());
		System.out.println("Gpa: " + student1.getGpa());
		
		System.out.println(student1);
		Student student2 = new Student();
		student2.setName("Mary Ann");
		student2.setMajor("CE");
		student2.setGpa(3.3);
		System.out.println(student2);
	}
}
