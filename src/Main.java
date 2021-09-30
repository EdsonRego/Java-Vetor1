import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[] vet = new double[N];
		
		for(int i=0; i < N; i++) {
			vet[i] = sc.nextDouble(); 
		}
		
		double maiorValor = vet[0];
		int posicaoMaiorValor = 0;
		
		for(int i=0; i<N ; i++) {
			if (vet[i] > maiorValor) {
				maiorValor = vet[i];
				posicaoMaiorValor = i;
			}
		}
		System.out.printf("%.1f%n", maiorValor);
		System.out.println(posicaoMaiorValor);
		
		sc.close();
	}

}
