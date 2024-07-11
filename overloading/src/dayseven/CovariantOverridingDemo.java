package dayseven;

public class CovariantOverridingDemo {

	public static void main(String[] args)
		throws CloneNotSupportedException
		{
			
			Student student1 = new Student(1, "MCA", "Kapil");
			student1.printData();

			Student student2 = (Student) student1.clone();
			student2.printData();
		}
}