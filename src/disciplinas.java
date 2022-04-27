import java.io.*;

public class disciplinas implements Serializable{

    String nome;
    int codigo, cargaHora;

    public disciplinas(String nome, int codigo, int cargaHora) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHora = cargaHora;
    }
}
