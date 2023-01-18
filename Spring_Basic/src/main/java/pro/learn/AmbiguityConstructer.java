package pro.learn;

public class AmbiguityConstructer {
int i;
int j;


double k;
double l;
public AmbiguityConstructer() {
	// TODO Auto-generated constructor stub
}
public AmbiguityConstructer(int i, int j) {
	super();
	System.out.println("int int");
	this.i = i;
	this.j = j;
}
public AmbiguityConstructer(double k, double l) {
	super();
	System.out.println("double");
	this.k = k;
	this.l = l;
}

public AmbiguityConstructer(String i, String j) {
	super();
	System.out.println("String");
	this.i=Integer.parseInt(i);
	this.j =Integer.parseInt(j);

}
}
