package tr03;

public class TakeTransTest {

	public static void main(String[] args) {

		Student James = new Student("James", 5000);
		Student Tomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		James.takeBus(bus100);
		
		Subway greenSubway = new Subway(2);
		Tomas.takeSubway(greenSubway);
		
		James.showInfo();
		Tomas.showInfo();
		
		bus100.showBusinfo();
		greenSubway.showSubwayInfo();
		
		bus500.showBusinfo(); 
	}

}
