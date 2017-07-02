package Session5Assignment1;

public class resultMain {

	public static void main(String[] args) {
		
		System.out.println("Creating classX student with name, roll no,sub1,sub2,sub3,sub4,sub5 marks");
		classX s1 = new classX(12,"Veena",35,38,56,78,89);//calling classX constructor to create classX student.
		s1.display();//Display all the details
		s1.result();//display the result
		
		System.out.println("Creating classX1 student with name, roll no,sub1,sub2,sub3,sub4,sub5,sub6 marks");
		classx1 s2 = new classx1(25,"Chinuva",45,56,45,78,66,55);////calling classX1 constructor to create classX student.
		s2.display();//Display all the details
		s2.result();//display the result

	}

}
