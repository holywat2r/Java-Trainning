package tr03;

public class Student {

	String studentName;
	int money;
	
	public Student(String studentName, int money)
	{
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus)
	{
		bus.take(1000);
		this.money -= 1000; // 버스를 탔을 때 호출 
	}
	public void takeSubway(Subway subway)
	{
		subway.take(1200);
		this.money -= 1200; // 지하철 탔을 때 호출 
	}
	public void showInfo()
	{
		System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
	}
}
