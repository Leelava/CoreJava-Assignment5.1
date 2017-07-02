package Session5Assignment1;
//Student class which is an abstract one with student name and rollno as data members.
public abstract class Student {
	int rollno;//Student roll number
	String name;//Student name
	//constructor to create a student
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public abstract void result();// to be implemented by the subclasses as the result calculation differs for each standard like class 10th or 11.
	public abstract void display();//to be implemented by the subclasses as the details of the classes vary for each standard. 
	

}
