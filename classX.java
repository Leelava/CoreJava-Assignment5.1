package Session5Assignment1;

// ClassX implements Student class methods 

public class classX extends Student{
	int sub1,sub2,sub3,sub4,sub5; // there are only 5 subjects for class 10 students

	//Constructor to create a class 10 student with subject details , name and id.
	public classX(int rollno, String name, int sub1, int sub2, int sub3, int sub4, int sub5) {
		super(rollno, name);//calling super class (Student) constructor method to populate the roll number and name of the student
		// populating the marks obtained in each subject.
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
	}

	@Override
	// calculates and prints the result for 10 th class students 
	public void result() {
		double result;
		result =( double)(sub1 + sub2+sub3+sub4+sub5)/(double)5.0;// Calculated avrg of five sub marks
		System.out.println("The result of " +this.name + " is " +result);
		
	}

	@Override
	
	// Display the result and other details of the student
	public void display() {
		System.out.println("The student " +this.name + " with marks in 5 subs " + this.sub1 +" "  +  this.sub2 +" " + this.sub3 +" " +this.sub4 +" " +this.sub5);
	
		
	}
	

}
