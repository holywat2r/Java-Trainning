package tr04;

public class TexiTest {

	public static void main(String[] args) {
		Passenger Edward = new Passenger("Edward", 20000);
		
		Texi Texi2 = new Texi("잘 간다 운수택시");
		Edward.takeTexi(Texi2);
		
		Edward.showInfo();
		Texi2.showTexiInfo();
	}

}
