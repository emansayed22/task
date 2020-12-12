import javax.swing.JOptionPane;
public class TestStudentGrades {
public static void main(String[] args) {
	
	String studentName = JOptionPane.showInputDialog("please enter student name:  ");
	String studentEmail = JOptionPane.showInputDialog("please enter student email:  ");
	String studentPhone = JOptionPane.showInputDialog("please enter student phone:  ");
	
	Grades [] grades = new Grades [5];
	int Grade=0;
	for (int i = 0; i < grades.length; i++) {	
		String GradeString = JOptionPane.showInputDialog("please enter student grade number:  "+(i+1));
		try {
			 Grade = Integer.parseInt(GradeString);
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "please enter valid number");	
		}
	catch (NullPointerException e) {
			
			JOptionPane.showMessageDialog(null, "please enter value ");
		}
	}
JOptionPane.showMessageDialog(null, "your name is "+studentName);
JOptionPane.showMessageDialog(null, "your name is "+studentEmail);	
JOptionPane.showMessageDialog(null, "your name is "+studentPhone);	

for (int i = 0; i < grades.length; i++) {
	JOptionPane.showMessageDialog(null, "your garde number "+(i+1)+"is "+grades[i]);
}	
	}
}


