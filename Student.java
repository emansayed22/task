import javax.swing.JOptionPane;

public class Student {
	private String name;
	private String email;
	private String phone;
	private Grades [] grades;
	
	public Student() {
	
	}
	
	
	
	
	public Student(String name, String email, String phone, Grades[] subjectGrades) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.grades = subjectGrades;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Grades[] getSubjectGrades() {
		return grades;
	}
	public void setSubjectGrades(Grades[] subjectGrades) {
		this.grades = subjectGrades;
	}
	
	


	
	
	
	
	
	
	
	
	
}
