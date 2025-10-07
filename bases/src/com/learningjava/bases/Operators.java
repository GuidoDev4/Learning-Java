package com.learningjava.bases;

public class Operators {

	public static void main(String[] args) {
	
	System.out.println(Math.pow(5, 2));

	System.out.println(true ^ true);
	System.out.println(true ^ false);
	System.out.println(false ^ true);
	System.out.println(false ^ false);
	
	System.out.println();
	
	System.out.println(f1(false) & f2(true));
	System.out.println(f1(false) && f2(true));
	
	System.out.println();
	
	System.out.println(f1(true) | f2(false));
	System.out.println(f1(true) || f2(false));
	
	System.out.println();
	
	System.out.println(5 & 3); // 111 && 011 = 001
	System.out.println(Integer.toBinaryString(0b101 & 0b011));
	
	System.out.println();
	
	int x;
	
	System.out.println(x=5);
	
	System.out.println(x);
	
	int a,b,c;
	
	a = b = c = 5;
	
	System.out.printf("%s, %s, %s\n", a, b, c);
	
	// Pre.Post-Incremento-Decremento(No dan el mismo resultado)
	
	System.out.println(a++);// Primero da el resultado de a pero lo incrementa después de haberselo devuelto al println
	System.out.println(++b);// Primero se incrementa la b y después devuelve el valor incrementado. Más intuitivo.
	
	System.out.println();
	
	boolean bool = true;
	
	System.out.println(bool ? "TRUE" : "FALSE");
	
	System.out.println();
	
	int value = 2;
	
	System.out.println(value == 1 ? "ONE" : value == 2 ? "TWO" : "I DON'T KNOW");
	
	System.out.println();
	
	value = 3;
	
	System.out.println(switch (value) {
	case 1-> "ONE";
	case 2-> "TWO";
	default-> "I DON'T KNOW";
	});
	
	
	
	}

	private static boolean f1(boolean b) {
		System.out.println("f1");
		return b;
	}

	private static boolean f2(boolean b) {
		System.out.println("f2");
		return b;
	}

}
