import java.util.Random;
import java.util.Scanner;

public class Batalha {
	
	public int ataqueUsuario() {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escolha seu ataque");
		System.out.println("(1) Soco");
		System.out.println("(2) Chute");
		System.out.println("(3) Recuperar HP");
		System.out.println("(4) Recuperar Energia");
		return leitor.nextInt();
	}
	
	public int ataqueComputador() {
		Random gerador = new Random();
		return gerador.nextInt(4) + 1;
	}
	
	public void imprimeHp(int hpUsuario, int hpComputador, int energiaUsuario, int energiaComputador, int recuperarUsuario, int recuperarComputador) {
		System.out.println("=============================================");
		System.out.print("Usuario:    HP " + hpUsuario );
		System.out.println(" -  Energia " +  energiaUsuario +" - Cura(s) "+recuperarUsuario);
		System.out.println("=============================================");
		System.out.print("Adversario: HP "+hpComputador);
		System.out.println(" -  Energia " +  energiaComputador +" - Cura(s) "+recuperarComputador);
		System.out.println("=============================================");
		System.out.println("");
	
	}
    public void turnos() {
		int hpUsuario = 80;
		int hpComputador = 1;
		int escolhaAtaque;
		int energiaUsuario = 90;
    int energiaComputador = 1;
    int recuperarUsuario = 6;
    int recuperarComputador=1;
	    
		
		System.out.println("📖 Tutorial 📖");
		System.out.println("");
		System.out.println("O torneio funciona da seguinte maneira:");
		System.out.println("Você enfrenta os oponentes em lutas de turnos. "
				+ "Após derrotar um, o outro entra em ação instantaneamente.");
		System.out.println("4 ações podem ser realizadas durante a luta. Sendo elas:");
		System.out.println("1-Soco: Causa um dano total de 20, mas gasta 15 pontos de energia. ");
		System.out.println("2-Chute: Causa um dano total de 10, mas gasta 5 pontos de energia.");
		System.out.println("3-Recuperar HP: Recupera 13 pontos do HP, mas perde 1 cura.");
		System.out.println("4-Recuperar Energia: Recupera 17 pontos de Stamina, mas perde 1 cura.");
		System.out.println("Após derrotar um adversário você recebe 3 curas, 30 pontos de HP e 40 de Energia ");
		System.out.println("A luta se ENCERRA quando HP ou Energia forem iguais a 0. ");
		System.out.println("OBEJTIVO: Para vencer o torneio você terá derrotar 5 adversários. Boa sorte!!!");
		System.out.println("");
		
		int y=1;
		while(y <6 && hpUsuario >0 && energiaUsuario>0) {

			Lutador BruceLee = new Lutador("Bruce Lee", "Hong Kong",32, 1.72f, 62.0f, 0, 0, 0);
		
				switch(y) {
				case 1:
					Lutador DanielCormier = new Lutador("Daniel Cormier", "Estados Unidos",40, 1.81f, 117.0f, 25, 2, 0);
					hpComputador=60;
					energiaComputador=60;
					recuperarComputador=7;
					
					System.out.println("Desafiado 1 ------");
					DanielCormier.apresentar();
					System.out.println("");
					System.out.println("Desafiante  ------");
					BruceLee.status();
					System.out.println("");
					break;
					
				case 2:
					Lutador ConorMcGregor = new Lutador("Conor McGregor", "Irlanda",31, 1.75f, 77.0f, 22, 4, 0);
					hpComputador=70;
					energiaComputador=70;
					recuperarComputador=9;
					
					System.out.println("Desafiado 2 ------");
					ConorMcGregor.apresentar();
					System.out.println("");
					System.out.println("Desafiante  ------");
					BruceLee.status();
					System.out.println("");
					break;
					
				case 3:
					Lutador IsraelAdesanya = new Lutador("Israel Adesanya", "Nigéria",30, 1.93f, 84.0f, 18, 0, 0);
					hpComputador=80;
					energiaComputador=80;
					recuperarComputador=11;
					
					System.out.println("Desafiado 3 ------");
					IsraelAdesanya.apresentar();
					System.out.println("");
					System.out.println("Desafiante  ------");
					BruceLee.status();
					System.out.println("");
					break;
					
				case 4:
					Lutador KhabibNurmagomedov = new Lutador("Khabib Nurmagomedov", "Rússia",31, 1.78f, 70.0f, 28, 0, 0);
					hpComputador=90;
					energiaComputador=90;
					recuperarComputador=13;
					
					System.out.println("Desafiado 4 ------");
					KhabibNurmagomedov.apresentar();
					System.out.println("");
					System.out.println("Desafiante ------");
					BruceLee.status();
					System.out.println("");
					break;
					
				case 5:
					
					Lutador JonJones = new Lutador("Jon Jones", "Estados Unidos",32, 1.93f, 93.0f, 25, 1, 0);
					hpComputador=100;
					energiaComputador=100;
					recuperarComputador=15;
					
					System.out.println("Desafiado 5 ------");
					JonJones.apresentar();
					System.out.println("");
					System.out.println("Desafiante  ------");
					BruceLee.status();
					System.out.println("");
					break;
					
				}
		
		while (hpUsuario>0 && hpComputador >0 && energiaUsuario>0 && energiaComputador>0) {
			
			imprimeHp(hpUsuario, hpComputador, energiaUsuario, energiaComputador, recuperarUsuario, recuperarComputador);
			escolhaAtaque = ataqueUsuario();
			
				switch(escolhaAtaque) {
				case 1:
          System.out.println("");
					System.out.println("Lee aplicou um soco");
					hpComputador = hpComputador-20;
					energiaUsuario = energiaUsuario -15;
					break;
					
				case 2:
          System.out.println("");
					System.out.println("Lee aplicou um chute");
					hpComputador = hpComputador-10;
					energiaUsuario = energiaUsuario-5;
					break;
				
				case 3:
					hpUsuario = hpUsuario +13;
					recuperarUsuario = recuperarUsuario -1;
					if (hpUsuario>100) {
						hpUsuario=100;
					}
					
					if (recuperarUsuario <0) {
						recuperarUsuario =0;
            System.out.println("");		
						System.out.println("Você não possui mais curas");
					}else {
            System.out.println("");
						System.out.println("Lee recuperou HP");
					}
					
					break;

				case 4:
					energiaUsuario+=17;
					recuperarUsuario = recuperarUsuario-1;
					if (energiaUsuario>100) {
						energiaUsuario=100;
					}
					
					if (recuperarUsuario <0) {
						recuperarUsuario =0;
            System.out.println("");		
						System.out.println("Você não possui mais curas");
					}else {
            System.out.println("");
						System.out.println("Lee recuperou Energia");
					}
					break;
   
				default:
          System.out.println("");
					System.out.println("Opção inválida");
					break;
			}
			
				
			if (hpComputador >0 && energiaComputador>0) {

				escolhaAtaque = ataqueComputador();
				switch (escolhaAtaque) {
				case 1:
					System.out.println("Adversario aplicou um soco ");
          System.out.println("");
					hpUsuario = hpUsuario-20;
					energiaComputador = energiaComputador -15;
					break;
					
				case 2:
					System.out.println("Adversario aplicou um chute");
          System.out.println("");
					hpUsuario = hpUsuario-10;
					energiaComputador = energiaComputador-5;
					break;
					
					
				case 3:
					hpComputador = hpComputador +13;
					recuperarComputador = recuperarComputador-1;
					
					if (hpComputador>100) {
						hpComputador=100;
					}
					
					if (recuperarComputador <0) {
						recuperarComputador =0;		
						System.out.println("Adversário não conseguiu se recuperar, pois, não possui mais curas");
            System.out.println("");
					}else {
						System.out.println("Adversario recuperou HP");
            System.out.println("");
					}
					
					break;

				case 4:
					energiaComputador +=17;
					recuperarComputador = recuperarComputador-1;
					if (energiaComputador>100) {
						energiaComputador=100;
					}
					
					if (recuperarComputador <0) {
						recuperarComputador =0;		
						System.out.println("Adversário não conseguiu se recuperar, pois, não possui mais curas");
            System.out.println("");
					}else {
						System.out.println("Adversario recuperou Energia");
            System.out.println("");
					}
					break;
        
				}
				
				} else  {
				System.out.println("✔️ Adversario derrotado ✔️");
				System.out.println("");	
			}
			
				 
		}if(hpUsuario>0) {
			hpUsuario+=30;
			if (hpUsuario>100) {
				hpUsuario=100;
			}
		}
		
		if (energiaUsuario>0) {
		energiaUsuario+=40;
		if (energiaUsuario>100) {
			energiaUsuario=100;
		}
		}
		
		recuperarUsuario = recuperarUsuario+3;
    if(recuperarUsuario>15){
      recuperarUsuario = 15;
    }
		
		y++;

		} if (hpUsuario<=0 || energiaUsuario <=0) {
			System.out.println("❌ Você foi derrotado ❌");
			System.out.println("");
		}else {
			System.out.println("🏆 Parabéns, você venceu 🏆");
			System.out.println("");
		}
    }
}
		