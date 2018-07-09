package mypackage;

@FunctionalInterface
interface MathOperation{
	int Operation(int num1,int num2);
}

public class LamdaEx {
	
	public static int operate(int num1,int num2,MathOperation opr){
		return opr.Operation(num1, num2);
	}
	public static void main(String[] args) {
		MathOperation add=(int num1,int num2)->num1+num2;
		MathOperation sub=(int num1,int num2)->num1+num2;
		System.out.println(operate(10,20,add));
		System.out.println(operate(10,20,sub));
		
		MathOperation m1=(num1,num2)->(num1+num2);
		System.out.println(m1.Operation(20, 20));
		
		

	}

}
