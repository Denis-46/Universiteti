package universiteti;
import java.util.HashSet;
import java.util.Set;
/**
 * 
 * The class {Student} represents a student of a school
 * A student should have the following information:
 * id -unique type int 
 * name - type string 
 * feesPaid - type double
 * studnetIDS - type Set<Integer>   
 * 
 */

public class Student {
	private static final Set<Integer> studentIDS = new HashSet<>();
	private Integer id;
	private String name;
	private double feesPaid=0;
	public Student(Integer id, String name) throws Exception {
		if(!studentIDS.add(id))
			throw new Exception("Student ID already exists!");
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getFeesPaid() {
		return feesPaid;
	}
	public void setId(Integer id) throws Exception {
		if (studentIDS.contains(id))
			throw new Exception("Student ID already exists!");
		if (this.id!=null)
			studentIDS.remove(id);
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void payFee(double fee) {
		//student cannot pay more than 5000 USD
		if (feesPaid+ fee <= 5000)
		     feesPaid += fee;
		else feesPaid = 5000;
	}
	
	
	
}
