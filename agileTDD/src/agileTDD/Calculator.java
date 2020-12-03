package agileTDD;

public class Calculator {
	
	public Long add(long...operands) {
		long result=0;
		
		for (long number:operands) {
			result += number;
		}
		
		return result;
	}

}