package dayseven;

public class Student implements Cloneable {
	int rollNo;
	String className;
	String name;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int rollNo, String className, String name) {
		super();
		this.rollNo = rollNo;
		this.className = className;
		this.name = name;
	}
	public void Student1(int rollNo2, String className2, String name2) {
		// TODO Auto-generated constructor stub
	}
	public void printData() {
		System.out.println("Name: " +name+ ",RollNo: " +rollNo+ ",ClassName: " +className);
		
	}
	@override
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
}
