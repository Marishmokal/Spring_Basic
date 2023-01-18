package pro.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Teacher {
String name;
List<String>phones;
List<String>addreses;
Map<String,String>courses;
Properties props;

public Teacher() {
	super();
	// TODO Auto-generated constructor stub
}

public Teacher(String name, List<String> phones, List<String> addreses, Map<String, String> courses, Properties props) {
	super();
	this.name = name;
	this.phones = phones;
	this.addreses = addreses;
	this.courses = courses;
	this.props = props;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<String> getPhones() {
	return phones;
}

public void setPhones(List<String> phones) {
	this.phones = phones;
}

public List<String> getAddreses() {
	return addreses;
}

public void setAddreses(List<String> addreses) {
	this.addreses = addreses;
}

public Map<String, String> getCourses() {
	return courses;
}

public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}

public Properties getProps() {
	return props;
}

public void setProps(Properties props) {
	this.props = props;
}

@Override
public String toString() {
	return "Teacher [name=" + name + ", phones=" + phones + ", addreses=" + addreses + ", courses=" + courses
			+ ", props=" + props + "]";
}




}
