package pro.tut.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	int id;
	String name;
	@Autowired
	@Qualifier("english")
	Subject subject;
	@Autowired
	Address address;

	public Student() {
		// TODO Auto-generated constructor stub
	}

		public Student(int id, String name, Subject subject, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
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

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subject=" + subject + ", address=" + address + "]";
	}

}
