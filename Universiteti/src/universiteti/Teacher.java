package universiteti;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * The class {Teacher} represents a teacher of a school
 * A teacher should have the following information: 
 * id unique type int 
 * name - type string 
 * salary - type double
 * teacherIDS - type Set <Integer>   
 * 
 *
 */
public class Teacher {
	private static final Set<Integer> teacherIDS = new HashSet<>();
	private Integer id; // private int id
	private String name;
	private double salary;
	public Teacher(Integer id, String name, double salary) throws Exception {
		
		if(!teacherIDS.add(id))
			throw new Exception("Teacher's ID already exists!");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void setId(Integer id) throws Exception {
		if (teacherIDS.contains(id))
			throw new Exception("Teacher's ID already exists!");
		if (this.id!=null)
			teacherIDS.remove(id);
		teacherIDS.add(id);
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
