

import javax.swing.JOptionPane;

public  class StudentGrades {




	private String name;
	private String email;
	private String phoneNumber;
	
	int [] grades;

	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public int[] getGrades() {
		return grades;
	}
	public void setGrades(int[] grades) {
		this.grades = grades;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	


public void getAndPrintUserData() {
	String name= JOptionPane.showInputDialog("Please enter your name");
	String email= JOptionPane.showInputDialog("Please enter your email");
	String phoneNumber= JOptionPane.showInputDialog("Please enter your phoneNumber");
	
	
	String numberOfGradesString = JOptionPane.showInputDialog("please enter number of grades ");
	int numberOfGrades = Integer.parseInt(numberOfGradesString);
	StudentGrades [] Grades = new StudentGrades [numberOfGrades];
	int grade =0;
	for (int j = 0; j < Grades.length; j++) {
		String gradeString = JOptionPane.showInputDialog("please enter grade    "+(j+1));
		grade = Integer.parseInt(gradeString);
	
		
		
	}
	
	
	
	
	System.out.println("******************** student date**********************\n name is"+name+"\n email"+email+"\n phoneNumber"+phoneNumber);
	
		
			
	



	
}



}

