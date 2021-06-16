package tr03;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber)
	{
		this.busNumber = busNumber;
	}
	public void take(int money)
	{
		//학생이 지불한 돈 
		this.money += money; // 돈이 늘어났기 때문에
		passengerCount++; // 승객수가 증가하므
	}
	public void showBusinfo()
	{
		System.out.println(busNumber + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money +"원 입니다.");
	}
}
