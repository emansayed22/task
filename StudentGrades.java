

import javax.swing.JOptionPane;

public  class StudentGrades {

	private String name;
	private String email;
	private String phoneNumber;
	private int grade;
	
	public StudentGrades() {
		
	}

	public StudentGrades(String name, String email, String phoneNumber, int grade) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.grade = grade;
	}

    public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}



	

	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	String gradeString = JOptionPane.showInputDialog("please enter grade ");
	int grade =0;
try {
	 grade = Integer.parseInt(gradeString);
} catch (Exception e) {
	 JOptionPane.showInputDialog("please enter a valid grade");
}
		

	
	
	 JOptionPane.showMessageDialog(null, "your name is "+name+"\nyour email is"+email+"\nyour phone is "+phoneNumber
			 +"\nyour grade is "+ grade);

	 
	        
	        
	    }



	
}





