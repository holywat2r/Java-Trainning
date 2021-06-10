package tr01;

public class ManInfo {

	public int manHeight;
	public int manWeight;
	public String manName;
	public int manAge;
	
	public ManInfo()
	{
		//default 생성자 
	}
	
	public ManInfo(int manHeight, int manWeight, String manName, int manAge)
	{
		this.manHeight = manHeight;
		this.manWeight = manWeight;
		this.manName = manName;
		this.manAge = manAge;
	}
	
	public String showManInfo()
	{
		return "키가" + manHeight + "이고 몸무게가 " +manWeight + "킬로인 남성이 있습니다. 이름은 "+ manName + "이고 나이는 "+ manAge + "입니다.";
	}
}
