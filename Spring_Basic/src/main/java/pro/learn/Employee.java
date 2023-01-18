package pro.learn;//constructer injection

public class Employee {
int id;
String name;
String department;
Address address;
public Employee() {
	// TODO Auto-generated constructor stub
}


public Employee(int id, String name, String department, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.department = department;
	this.address = address;
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


public String getDepartment() {
	return department;
}


public void setDepartment(String department) {
	this.department = department;
}


public Address getAddress() {
	return address;
}


public void setAddress(Address address) {
	this.address = address;
}


@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", address=" + address + "]";
}
 
}
