package pro.learn;

public class Person {
Address address;

public Person() {
	// TODO Auto-generated constructor stub
}


public Person(Address address) {
	super();
	this.address = address;
}

  

public Address getAddress() {
	return address;
}


public void setAddress(Address address) {
	this.address = address;
}


@Override
public String toString() {
	return "Person [address=" + address + "]";
}



  
}
