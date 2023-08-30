import java.time.LocalDate;

public class Anotacao extends BlocoDeNotas {

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
        removido = true;
        return removido;
    }


    public String toString() {
        return "\ntexto: " + "|" +getTexto() + "|" +" data " + getData() + "\n";
    }
}import java.time.LocalDate;

public class Anotacao extends BlocoDeNotas {

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
        removido = true;
        return removido;
    }


    public String toString() {
        return "\ntexto: " + "|" +getTexto() + "|" +" data " + getData() + "\n";
    }
}
