import java.time.LocalDate;

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
}

