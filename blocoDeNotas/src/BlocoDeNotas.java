import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BlocoDeNotas {

    private List<Anotacao> anotacoes = new ArrayList<>();

    public Anotacao adicionar(String texto) {

        Anotacao anotacao = new Anotacao(texto, anotacoes.size() + 1);
        anotacoes.add(anotacao);
        return anotacao;
    }

    public Anotacao remover(int id) {
        Anotacao anotacao = anotacoes.get(id - 1);
        anotacao.setRemovido(id);
        return anotacao;

    }

    public Anotacao editar(int id, String texto) {
        Anotacao anotacao = anotacoes.get(id - 1);
        anotacao.setTexto(texto);
        return anotacao;

    }

    public boolean recuperar(int id) {
        Anotacao anotacao = anotacoes.get(id - 1);
        return anotacao.setRecuperar(id);
    }


    public String pesquisa(String padrao) {
        StringBuilder p = new StringBuilder();
        for (Anotacao a : anotacoes) {
            if (a.toString().contains(padrao)) {
                p.append(a);
            }
        }
        return p.toString();
    }

    public String mostrar() {
        String s = "";
        for (Anotacao a : anotacoes) {
            if (a.isRemovido() == false) {
                s += a.toString();
            }

        }
        return s;
    }

}
