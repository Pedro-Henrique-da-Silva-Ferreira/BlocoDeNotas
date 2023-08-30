import java.util.ArrayList;
import java.util.List;

public class BlocoDeNotas  {

    private List<Anotacao> anotacoes = new ArrayList<>();

    public Anotacao adicionar(String texto){

        Anotacao anotacao = new Anotacao(texto, anotacoes.size() + 1);
        anotacoes.add(anotacao);
        return anotacao;
    }

    public Anotacao remover(int id){
        Anotacao anotacao = anotacoes.get(id);
        anotacao.remover(id);
        return anotacao;

    }

    public Anotacao editar(int id,String texto){
        Anotacao anotacao = anotacoes.get(id+1);
        anotacao.setTexto(texto);
        return anotacao;

    }

    public Anotacao recuperar(int id){
        return anotacoes.get(id);

    }

    public void pesquisa(String padrao){
        for(Anotacao a : anotacoes){
            if (a.toString().contains(padrao)) {
                System.out.println(a.toString());
            }
        }
    }

    public String mostrar (){
        String s = "";
        for (Anotacao a: anotacoes) {
            s += a.toString();
        }
        return s;
    }


}
