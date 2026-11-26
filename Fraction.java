import java.util.random; 

public class Fraction {
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
    }

    public Fraction(String s) {
        String n = s.substring(0, s.indexOf("/"));
        String d = s.substring(s.indexOf("/") + 1);
        numerator = Integer.parseInt(n);
        int denom = Integer.parseInt(d);
        if (denom != 0) {
            denominator = denom;
        } else {
            denominator = 1;
            System.out.println("Error");
        }
    }

    public Fraction(Fraction f) {
        numerator = f.getNum();
        denominator = f.getDenom();
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
