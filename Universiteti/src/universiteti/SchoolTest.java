package universiteti;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SchoolTest {

	public static void main(String[] args) {
		try {
			School s = new School();
			s.addTeacher(new Teacher(1, "Kowalski", 9000.0));
			s.addTeacher(new Teacher(2, "Skipper", 8600.0));
			s.addTeacher(new Teacher(3, "Rico", 4500.0));
			s.addTeacher(new Teacher(4,"Private", 5700.34));
			
			
			
			List<Student> javaSubjectList = new ArrayList<>();
			javaSubjectList.add(new Student(100, "Morti"));
			javaSubjectList.add(new Student(101, "Mauricio"));
			javaSubjectList.get(0).payFee(2300.0);
			javaSubjectList.get(0).payFee(1700.0);
			javaSubjectList.get(1).payFee(2300.0);
			
			List<Student> phpSubjectList = new ArrayList<>();
			phpSubjectList.add(new Student(200, "King"));
			phpSubjectList.add(new Student(201, "Julien"));
			phpSubjectList.get(0).payFee(2300.0);
			phpSubjectList.get(0).payFee(1900.0);
			phpSubjectList.get(1).payFee(5100.0);
			
			List<Student> pythonSubjectList = new ArrayList<>();
			pythonSubjectList.add(new Student(300, "Denis"));
			pythonSubjectList.add(new Student(301, "Irsa"));
			pythonSubjectList.get(0).payFee(2300.0);
			pythonSubjectList.get(0).payFee(1900.0);
			pythonSubjectList.get(1).payFee(6300.0);
			
			List<Student> cSubjectList = new ArrayList<>();
			cSubjectList.add(new Student(400, "Anxhela"));
			cSubjectList.add(new Student(401, "Anisa"));
			cSubjectList.get(0).payFee(2300.0);
			cSubjectList.get(0).payFee(1700.0);
			cSubjectList.get(1).payFee(2300.0);
			
			for(Student st: javaSubjectList) s.addStudent(st);
			for(Student st: phpSubjectList) s.addStudent(st);
			for(Student st: pythonSubjectList) s.addStudent(st);
			for(Student st: cSubjectList) s.addStudent(st);
			
			Subject javaSubject = new Subject(1000, "Java", s.getTeachers().get(0), javaSubjectList);
			Subject phpSubject = new Subject(1001, "PHP", s.getTeachers().get(1), phpSubjectList);
			Subject pythonSubject = new Subject(1002, "Python", s.getTeachers().get(2), pythonSubjectList);
			Subject cSubject = new Subject(1003, "C++", s.getTeachers().get(0), cSubjectList);
		
			double netEarnOrLoss=s.findTotalEranings()-s.findTotalSpending();
			if (netEarnOrLoss>0.0) System.out.println("Net earnings: " + netEarnOrLoss);
			else if (netEarnOrLoss < 0.0 ) System.out.println("Net loss: " + Math.abs(netEarnOrLoss));
			else System.out.println("No eraning or loss.");
			
			
			
		} catch (Exception e) {
			
		}

	}

}
