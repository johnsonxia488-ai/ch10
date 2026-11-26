import java.util.Random; 

public class Fraction1 {
    private int numerator, denominator;
    
    public Fraction() { 
		Random random = new Random(); 
		setNum(random.nextInt(9) +1); 
		setDenom(random.nextInt(1) + 9); 
	}	
	
    public Fraction(int n, int d) {
        numerator = n;
        if (d != 0) {
            denominator = d;
        } else {
            denominator = 1;
            System.out.println("Error");
        }
        reduce(); 
    }
    public Fraction(String s) {
		int slash = s.indexOf("/"); 
		int n = Integer.parseInt(s.substring(0, slash)); 
		int d = Integer.parseInt(s.substring(slash + 1)); 
		numerator = n; 
		denominator = d; 
		reduce(); 
    }

    public Fraction(Fraction f) {
        numerator = f.getNum();
        denominator = f.getDenom();
    }
    
    public boolean equals(Fraciton f) {
		return numerator == f.numerator && denominator == f.denominator; 
}

    public int getNum() {
        return numerator;
    }

    public int getDenom() {
        return denominator;
    }

    public void setNum(int n) {
        numerator = n;
    }

    public void setDenom(int d) {
        if (d != 0) {
            denominator = d;
        } else {
            denominator = 1;
            System.out.println("Error");
        }
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public int GCF(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (a != b) {Refactor Fraction class with multiple constructors
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public void reduce() {
        int G = GCF(numerator, denominator);
        numerator = numerator / G;
        denominator = denominator / G;
    }

    public static Fraction mult(Fraction a, Fraction b) {
        int n = a.getNum() * b.getNum();
        int d = a.getDenom() * b.getDenom();
        Fraction answer = new Fraction(n, d);
        answer.reduce();
        return answer;
    }

    public static Fraction div(Fraction a, Fraction b) {
        int n = a.getNum() * b.getDenom();
        int d = a.getDenom() * b.getNum();
        Fraction answer = new Fraction(n, d);
        answer.reduce();
        return answer;
    }

    public static Fraction add(Fraction a, Fraction b) {
        int n = a.getNum() * b.getDenom() + b.getNum() * a.getDenom();
        int d = a.getDenom() * b.getDenom();
        Fraction answer = new Fraction(n, d);
        answer.reduce();
        return answer;
    }

    public static Fraction sub(Fraction a, Fraction b) {
        int n = a.getNum() * b.getDenom() - b.getNum() * a.getDenom();
        int d = a.getDenom() * b.getDenom();
        Fraction answer = new Fraction(n, d);
        answer.reduce();
        return answer;
    }
}

