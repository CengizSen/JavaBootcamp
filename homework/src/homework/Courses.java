package homework;

public class Courses {
 
	int id;
	String name;
	String description;
	double price;
	String instructorName;
	
	
	public Courses() {
		
		
	}
	
	
	public Courses(int id, String name, String description, double price, String instructorName) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.instructorName = instructorName;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	
	
	
}
