package universiteti;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * The class {Subject} represents a subject
 * A subject should have the following information: 
 * id -unique type int
 * name - type string 
 * teacher - type {Teacher}
 * studnetList - type List<{Student}>
 * subjectIDS - type Set<Integer> 
 * 
 */

public class Subject {
	private static final Set<Integer> subjectIDS = new HashSet<>();
	private Integer id;
	private String name;
	private Teacher teacher;
	private List<Student> studentList;
	public Subject(Integer id, String name, Teacher teacher, List<Student> studentList) throws Exception {
		
		if(!subjectIDS.add(id))
			throw new Exception("Subject ID already exists!");
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		studentList= new ArrayList<Student>();
		this.studentList = studentList;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}	
}
