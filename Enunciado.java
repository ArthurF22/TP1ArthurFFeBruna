import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int f, g;
		System.out.println("Coloque o intervalo que deseja saber os números pares:");
		f = STDIN_SCANNER.nextInt();
		g = STDIN_SCANNER.nextInt();
		while(f <= g) {
			if(f % 2 == 0) {
				System.out.println(f + " par");
			}
			f++;
		}
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
