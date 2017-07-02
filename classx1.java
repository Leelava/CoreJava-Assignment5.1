package Session5Assignment1;
//ClassX1 implements Student class methods 

public class classx1 extends Student {



	int sub1,sub2,sub3,sub4,sub5, sub6;// there are only 6 subjects for class 11 students
	
	//Constructor to create a class 11 student with subject details , name and rollno.
	public classx1(int rollno, String name, int sub1, int sub2, int sub3, int sub4, int sub5, int sub6) {
		super(rollno, name);//calling super class (Student) constructor method to populate the roll number and name of the student
		// populating the marks obtained in each subject.
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
		this.sub6 = sub6;
	}


	@Override
	// calculates and prints the result for 11 th class students
	public void result() {
		double result;
		// Calculates avrg of six sub marks
		result =( double)(sub1 + sub2+sub3+sub4+sub5 +sub6)/(double)6.0;
		System.out.println("The result of " +this.name + " is " +result);
		
	}


	@Override
	// Display the result and other details of the student
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The student " +this.name + " with marks in 6 subs " + this.sub1 +" "  +  this.sub2 +" " + this.sub3 +" " +this.sub4 +" " +this.sub5 +" " +this.sub6);
		
		
	}
	
}
