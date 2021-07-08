
public class User {
	
int id;
String firstName;
String lastName;
String description;
String userName;


public User(int id, String firstName, String lastName, String description, String userName) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.description = description;
	this.userName = userName;
}


public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getFirstName() {
	return firstName;
}



public void setFirstName(String firstName) {
	this.firstName = firstName;
}



public String getLastName() {
	return lastName;
}



public void setLastName(String lastName) {
	this.lastName = lastName;
}



public String getDescription() {
	return description;
}



public void setDescription(String description) {
	this.description = description;
}



public String getUserName() {
	return userName;
}



public void setUserName(String userName) {
	this.userName = userName;
}





}
