import java.io.*;
import java.util.Scanner;


public class criacaoArquivos {
    Scanner scan = new Scanner(System.in);
    String nom;
    int cod, cargaH;

    public void escrita(disciplinas disc, String nomeArq){
        File arq = new File(nomeArq);
        try{
            FileOutputStream arqv = new FileOutputStream(arq);
            ObjectOutputStream objarq = new ObjectOutputStream(arqv);
            objarq.writeObject(disc);
            objarq.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public Object leitura(String nomeArq){
        disciplinas disc = new disciplinas (nom, cod, cargaH);

        try{
            FileInputStream arq = new FileInputStream(nomeArq);
            ObjectInputStream objarq = new ObjectInputStream(arq);
            disc = (disciplinas)objarq.readObject();
            objarq.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch(ClassNotFoundException e2) {
            System.out.println(e2.getMessage());
            e2.printStackTrace();
        }
        return(disc);
    }
}
