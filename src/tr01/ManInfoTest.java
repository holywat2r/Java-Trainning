package tr01;

public class ManInfoTest {

	public static void main(String[] args) {

		ManInfo Tomas = new ManInfo();
		Tomas.manHeight = 180;
		Tomas.manWeight = 78;
		Tomas.manName = "Tomas";
		Tomas.manAge = 37;
		
		System.out.println(Tomas.showManInfo());
		
		ManInfo Holy = new ManInfo(178,72,"Holy",26);
		System.out.println(Holy.showManInfo());
	}

}
