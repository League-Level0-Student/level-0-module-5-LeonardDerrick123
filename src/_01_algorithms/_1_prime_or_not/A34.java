package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class A34 {
	public static void main(String args[]){
	String numbers=JOptionPane.showInputDialog("tellish me thy number to seeith if prime or noitith if notith off with ye head")	;
	int prime=Integer.parseInt(numbers);
	for (int i = 2; i < prime/2; i++) {
	if (prime%i == 0) {
		JOptionPane.showMessageDialog(null, "off with ye head");
	System.exit(0);
	}
		
	}
JOptionPane.showMessageDialog(null, "prime");	
	}
}
