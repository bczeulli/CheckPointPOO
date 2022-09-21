package CheckPoint;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Estudio estudio1 = new Estudio("Ink Arte", "rua A, N10", 1155443322, 57841254000165L);
        //Fornecedor fornecedor1 = new Fornecedor("Materiais Ink", 1155887766, 58865254000165L);
        Tatuador tatuador1 = new Tatuador("Bob", "3D", 35);
        Tatuador tatuador2 = new Tatuador("Everton", "Realista", 26);
        Tatuador tatuador3 = new Tatuador("Mateus", "Tribal", 30);

        estudio1.addTatuador(tatuador1);
        estudio1.addTatuador(tatuador2);
        estudio1.addTatuador(tatuador3);

        Cliente cliente1 = new Cliente();
        cliente1.setAnamnesePreenchida(false);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Seja bem bindo. Para darmos início ao seu atendimento, preciso realizar um breve cadastro tudo bem?\n" + "Qual é o seu nome?");
        cliente1.setNome(scanner.next());
        System.out.println(cliente1.getNome() + ", qual é a sua idade?");
        cliente1.setIdade(scanner.nextInt());
        System.out.println(cliente1.getNome() + " antes de realizar a tuatagem, temos os seguintes tatuadores disponíveis:");
        estudio1.mostrarTatuadores();
        System.out.println(cliente1.getNome() + " agora que seu cadastro foi efetuado, vou preencher ou atualizar sua anamnese.");
        cliente1.preencherAnamnese();
        System.out.println("Agora me informe qual será o desenho da sua tatuagem e irei atribuir o tatuador mais adequado.");
        estudio1.tatuar(scanner.next());
        System.out.println(estudio1.getEstoque());
        estudio1.VerificaEstoqueFornecedor();
    }
}
