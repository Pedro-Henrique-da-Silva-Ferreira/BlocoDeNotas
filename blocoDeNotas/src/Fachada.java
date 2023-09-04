
import java.util.List;

public class Fachada {

    private BlocoDeNotas bloco = new BlocoDeNotas();

    public Anotacao adicionar(String texto){
        return bloco.adicionar(texto);
    }

    public Anotacao remover(int id) {
        return bloco.remover(id);
    }

    public Anotacao editar(int id, String texto) {
        return bloco.editar(id, texto);
    }

    public boolean recuperar(int id) {
        return bloco.recuperar(id);
    }

    public String pesquisa(String padrao) {
        return bloco.pesquisa(padrao);
    }
    public String mostrar (){
        return bloco.mostrar();
    }

}
