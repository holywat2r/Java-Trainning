package tr04;

public class Texi {

	String texiName;
	int money;
	
	public Texi(String texiName)
	{
		this.texiName = texiName;
	}
	
	public void take(int money)
	{
		this.money += money;
	}
	
	public void showTexiInfo()
	{
		System.out.println(texiName + " 수입은 " + money + " 입니다.");
	}
}
