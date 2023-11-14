package projeto;

public class Calculadora1 {
	public int SomaInteiros(int a, int b) {
		return a+b;
	}
	public int subtraInteiros(int a, int b) {
        return a - b;
    }
	
	public int multiplicaInteiros(int a, int b) {
        return a * b;
    }
	
	public int dividiInteiros(int a, int b) {
        if (b == 0) {
        	System.out.println("Impossivel dividir por zero");
        }
        return a / b;
    }
	
	
	
	
}