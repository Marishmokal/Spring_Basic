package pro.learn;//Custom bean life cycle

public class Vehicle {
int id;
String companyName;
public Vehicle() {
	// TODO Auto-generated constructor stub
}
public Vehicle(int id, String companyName) {
	super();
	this.id = id;
	this.companyName = companyName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
@Override
public String toString() {
	return "Vehicle [id=" + id + ", companyName=" + companyName + "]";
}

public void init()
{
	System.out.println("init method called");
}
public void destroy()
{
	System.out.println("destroy method called");
}


}
