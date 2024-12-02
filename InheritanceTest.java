class Student{
	private String name;
	private double salary;
	Employee(String n, double s){
		name=n;
		salary=s;
	}
	void print() {
		System.out.println("Name: "+ name);
		System.out.println("Salary: "+ salary);
	}
	void print(float percentage) {
		System.out.println("Name: "+ name);
		System.out.println("Salary: "+ salary);
		double bounsAmount=bonus(percentage);
		System.out.println("Bonus: "+ bounsAmount);
	}
	public double bonus(float percenatge) {
		return (percenatge/100.0)*salary;
	}	
}

class Manager extends Student{
	String secretary;
	Manager(String n, double s, String sec){
		super(n,s);
		secretary=sec;
	}
	
	void print() {
		super.print();
		System.out.println("Secretary of manager:"+secretary);
	}
	
	void print(float percentage) {
		super.print();
		System.out.println("Secretary of manager:"+secretary);
		double bonusAmount=bonus(percentage);
		System.out.println("Bonus: "+ bonusAmount);
	}
	
	public double bonus(float percenatge) {
		return 1.5*super.bonus(percenatge);
	}
	
}	
public class InheritanceTest {

	public static void main(String[] args) {
		Employee obj1 = new Employee("ABC",1000.0);
		Employee obj2=new Manager("XYZ",12000.0,"ASD");
		
		obj1.print();
		obj1.print(31);
		
		obj2.print();
		obj2.print(35);
	}

}
