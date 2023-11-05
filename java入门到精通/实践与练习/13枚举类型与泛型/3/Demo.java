class Entrance<T> {
	public void enter(T t) {
		if(t instanceof Customer) {
			System.out.println("顾客您好，小心地滑");
		}
	}
}

class Customer {

}

class Staff {

}

public class Demo {
	public static void main(String[] args) {
		Staff tom=new Staff();
		Customer mali=new Customer();
		Entrance<Staff> staffEntrance = new Entrance();
		staffEntrance.enter(tom);
		Entrance publicEntrance = new Entrance();
		publicEntrance.enter(tom);
		publicEntrance.enter(mali);
	}
}
