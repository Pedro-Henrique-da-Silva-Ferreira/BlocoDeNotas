import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int ADICIONAR = 1;
        final int REMOVER = 2;
        final int EDITAR = 3;
        final int RECUPERAR = 4;
        final int PESQUISAR = 5;
        final int MOSTRAR = 6;
        final int SAIR = 7;

        Scanner sc = new Scanner(System.in);
        Fachada fachada = new Fachada();
        BlocoDeNotas bloco = new BlocoDeNotas();

        String menu = "Menu\n1.Adicionar notas.\n2.Remover notas." +
                "\n3.Editar notas.\n4.Recuérar notas.\n5.Pesquisar notas." +
                "\n6.Sair.";

        System.out.println(menu);
        int escolha = sc.nextInt();

        while (escolha != SAIR){
            switch (escolha){

                case ADICIONAR:
                    System.out.println("Adicionar:");
                    String escrita = sc.next();
                    fachada.adicionar(escrita);
                    break;

                case REMOVER:
                    System.out.println("Escolha a anotação que deseja remover.");
                    int remocao = sc.nextInt();
                    fachada.remover(remocao);

                    break;

                case EDITAR:
                    System.out.println("Escolha a anotação que deseja editar.");
                    int procEditar = sc.nextInt();

                    System.out.println("Edite");
                    String editando = sc.nextLine();

                    fachada.editar(procEditar,editando);
                    break;
                case RECUPERAR:

                    break;
                case PESQUISAR:
                    System.out.println("Procure.");
                    String procurando = sc.nextLine();
                    fachada.pesquisa(procurando);
                    break;

                case MOSTRAR:
                bloco.mostrar();
            }
            System.out.println(menu);
            escolha = sc.nextInt();
             }


    }
}