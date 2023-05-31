import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);

	int continua = 1;
	while (continua ==1) {
	Batalha l1 = new Batalha();
	l1.turnos();
  
	System.out.println("Fim de jogo. Deseja jogar novamente? (1) Sim (2) Não");
	continua = leitor.nextInt();
	}

}
}