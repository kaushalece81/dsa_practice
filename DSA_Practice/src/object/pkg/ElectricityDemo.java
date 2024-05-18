package object.pkg;

public class ElectricityDemo {

	public static void main(String[] args) {
		ElectricityBill eb1=new ElectricityBill(1234, "kaushal", "dskjdhskjdhskjd");
		ElectricityBill eb2=new ElectricityBill(12345, "kaushalender", "rererdsfdfdfddkjdhskjdhskjd");
		ElectricityBill eb3=new ElectricityBill(1234, "kaushalererf", "dskjdhskjdhskjd");
		System.out.println("eb1.equals(eb3):: "+eb1.equals(eb3));
		System.out.println("eb1.equals(eb2):: "+eb1.equals(eb2));
		
		


	}

}
