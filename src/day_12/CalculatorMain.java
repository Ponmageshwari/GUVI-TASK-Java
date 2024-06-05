package day_12;

public class CalculatorMain extends Calculatorclass implements CalculatorInterface {
	
	public void tan() {
		
		System.out.println("tan");
	}
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Add");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("Sub");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculatorMain obj = new CalculatorMain();
		obj.add();
		obj.sub();
		obj.mod();
		

	}

	
		
	}


