package universiteti;
import java.util.ArrayList;
import java.util.List;

public class School {
private List<Student> students;
private List<Teacher> teachers;
private double totalMoneyEarned;
private double totalMoneySpent;

public void addTeacher(Teacher teacher) {
	if(teacher!=null) this.teachers.add(teacher);
}
public void addStudent(Student student) {
	if(student!=null) this.students.add(student);
}
public School() {
	students= new ArrayList<>();
	teachers= new ArrayList<>();
	totalMoneyEarned=0;
	totalMoneySpent=0;
}
public List<Student> getStudents() {
	return students;
}
public List<Teacher> getTeachers() {
	return teachers;
}
public double findTotalEranings() {
	
	double total=0.0;
	for(Student s: students) total+=s.getFeesPaid();
	this.totalMoneyEarned=total;
	return total;
}
public double findTotalSpending() {

	double total=0.0;
	for(Teacher t: teachers) total+=t.getSalary();
	this.totalMoneySpent = total;
	return total;
}

}
