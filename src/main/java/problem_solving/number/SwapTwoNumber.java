package problem_solving.number;

public class SwapTwoNumber {
    int x=30;
    int y=3;
    public static void main(String[] args) {
	SwapTwoNumber n=new SwapTwoNumber();
	//n.byAdditionSubstraction();
	//n.byMultiplicationDivision();
	n.byUsingXor();
    }
    void byAdditionSubstraction(){
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println(x+" "+y);
    }
    void byMultiplicationDivision(){
	x=x*y;
	y=x/y;
	x=x/y;
	System.out.println(x+" "+y);
    }
    void byUsingXor(){
	x=x^y;
	y=x^y;
	x=x^y;
	System.out.println(x+" "+y);
    }
}
