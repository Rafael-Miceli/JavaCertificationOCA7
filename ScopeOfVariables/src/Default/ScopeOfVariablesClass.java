package Default;

public class ScopeOfVariablesClass {
	
	public static void main(String args[]){
		
		{
			int num1 = 10;
			
			System.out.println(num1);
		}
		
		{
			int num1 = 20;
			int $num1 = 12;
			System.out.println(num1);
			System.out.println($num1);
		}
		
	}
	
}
