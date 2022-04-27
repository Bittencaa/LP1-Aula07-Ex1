public class principal {

    public static void main (String[] args){
        disciplinas d = new disciplinas("Matemática", 202, 300);
        criacaoArquivos c = new criacaoArquivos();
        c.leitura("matematica.bin");
    }
}
