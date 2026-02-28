package exercicios.exercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Comum, importado ou usado?");
            String tp = sc.next();

            System.out.println("Name");
            String nm = sc.next();

            System.out.println("Preço");
            double pre = sc.nextDouble();

            if (tp.equals("c")){
                Produto prod = new Produto(nm, pre);
                System.out.println(prod.etiquetaPreco());
            }

            else if (tp.equals("u")) {
                System.out.println("Data de fabricação (dd/MM/yyyy):");
                String dataStr = sc.next();

                DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dt = LocalDate.parse(dataStr, fmt);

                Produto prod = new ProdutoUsado(nm, pre, dt);
                System.out.println(prod.etiquetaPreco());
            }

            else {
                System.out.println("Taxa:");
                double taxa = sc.nextDouble();

                Produto prod = new ProdutoImportado(nm, pre, taxa);
                System.out.println(prod.etiquetaPreco());
            }

        }


    }
}
