package day_12;

public class CalculatorInterfaceMain implements CalaculatorInterface2 {
	
	public void mod() {
		
		System.out.println("mod");
	}
	
	

	@Override
	public void min() {
		// TODO Auto-generated method stub
		System.out.println("min");
		
	}

	@Override
	public void max() {
		// TODO Auto-generated method stub
		System.out.println("max");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculatorInterfaceMain obj1= new CalculatorInterfaceMain();
		obj1.mod();
		obj1.min();
		obj1.max();
	

}
}