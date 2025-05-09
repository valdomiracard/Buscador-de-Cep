import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um CEP para busca: ");
        String cep = scanner.nextLine();

        try {
            Endereco novoEndereco = BuscaCep.buscaCep(cep);
            System.out.println("Endereço encontrado:");
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException e) {
            System.out.println(" Fializando aplicação " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        scanner.close();
    }
}