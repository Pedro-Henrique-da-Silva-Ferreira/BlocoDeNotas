import java.time.LocalDate;
import java.util.Objects;

public class Anotacao{

    private String texto;
    private LocalDate data;
    private int id;
    private boolean removido = false;

    public Anotacao(String texto, int id) {

        this.texto = texto;
        this.id = id;
        this.data = LocalDate.now();
    }


    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getData() {

        return data;
    }

    public boolean isRemovido() {
        return removido;
    }

    public boolean setRemovido(int id) {
        removido = true;
        return removido;
    }

    public boolean setRecuperar(int id){
        return removido = false;
    }


    public String toString() {
        return "texto: " + "|" +getTexto() + "|" +" data " + getData() + " Id:" + getId()
                + " " +  isRemovido() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anotacao anotacao = (Anotacao) o;
        return id == anotacao.id && removido == anotacao.removido && Objects.equals(texto, anotacao.texto) && Objects.equals(data, anotacao.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(texto, data, id, removido);
    }
}

