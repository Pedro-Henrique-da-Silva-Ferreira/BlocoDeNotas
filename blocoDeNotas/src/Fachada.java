vimport java.util.ArrayList;
import java.util.List;

public class Fachada {

    private BlocoDeNotas bloco = new BlocoDeNotas();

    public BlocoDeNotas adicionar(String texto){
        return bloco.adicionar(texto);
    }

    public BlocoDeNotas remover(int id) {
        return bloco.remover(id);
    }

    public BlocoDeNotas editar(int id, String texto) {
        return bloco.editar(id, texto);
    }

    public BlocoDeNotas recuperar(int id) {
        return bloco.recuperar(id);
    }

    public BlocoDeNotas pesquisa(String padrao) {
        return bloco;
    }
    public String mostrar (){
        return bloco.mostrar();
    }

}
