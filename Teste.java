import java.util.ArrayList;
import java.util.Scanner;
public class Teste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 10;
        ArrayList<Produto> produtos = new ArrayList();
        while(opcao != 9){
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Consultar estoque");
            System.out.println("3 - Remover unidades");
            System.out.println("4 - Adicionar unidades");
            System.out.println("9 - Sair");
            opcao = scan.nextInt();
            switch(opcao){
                case 1:
                    Produto produto = new Produto();
                    String nome = scan.next();
                    float valor = scan.nextFloat();
                    produto.setNome(nome);
                    produto.setValor(valor);
                    int quantidade = scan.nextInt();
                    produto.adicionarUnidades(quantidade);
                    produtos.add(produto);
                    break;
                case 2:
                    for (Produto i : produtos) {
                        String resumo = i.toString();
                        System.out.println(resumo);
                    }
                    break;
                case 3:
                    int cod = scan.nextInt();
                    int unidadesRemover = scan.nextInt();
                    produtos.get(cod).removerUnidades(unidadesRemover);
                    break;
                case 4:
                    int codigo = scan.nextInt();
                    int unidadesAdicionar = scan.nextInt();
                    produtos.get(codigo).adicionarUnidades(unidadesAdicionar);
                case 9:
                    break;
                default:
                    break;
        }
        }
    }
}
