public class FractionDriver {
	public static void main (String[]args) {

	//Fraction f3 = new Fraction("1/2"); 
	
	//System.out.println(f3); 

	//System.out.println(f1.getNum() + "/" + f1.getDenom());
	//System.out.println(f2.getNum() + "/" + f2.getDenom());
    //System.out.println(f3.getNum() + "/" + f3.getDenom());
    //System.out.println(f4.getNum() + "/" + f4.getDenom());
    Fraction half = new Fraction(1,2);
    Fraction third = new Fraction (1,3);
    Fraction product = Fraction.mult(half, third); 
    System.out.println(product); 
	}  
} 
