public class FractionDriver {
	public static void main (String[]args) {
	
	Fraction f1 = new Fraction(2,4); 
	Fraction f2 = new Fraction(1,3); 
	Fraction f3 = new Fraction(f1); 
	
	//System.out.println(f3); 

	//System.out.println(f1.getNum() + "/" + f1.getDenom());
	//System.out.println(f2.getNum() + "/" + f2.getDenom());
    //System.out.println(f3.getNum() + "/" + f3.getDenom());
    //System.out.println(f4.getNum() + "/" + f4.getDenom());
    
    Fraction sum = Fraction.add(f1, f2); 
    Fraction difference = Fraction.sub(f1, f2); 
    Fraction product =  Fraction.mult(f1, f2); 
    Fraction quotient = Fraction.div(f1, f2); 
    
    //Fraction half = new Fraction(1,2);
    //Fraction third = new Fraction (1,3);
    //Fraction sum = Fraction.mult(half, third); 
    //System.out.println(f3); 
    //System.out.println(f1.getNum() + "/" + f1.getDenom()); 
    //System.out.println(f2.getNum() + "/" + f2.getDenom()); 
    System.out.println(sum); 
    System.out.println(difference); 
    System.out.println(product); 
    System.out.println(quotient); 
    
    //f1.setNum(5); 
    //f1. setDenom(10); 
    //System.out.println(f1); 
	}  
} 

