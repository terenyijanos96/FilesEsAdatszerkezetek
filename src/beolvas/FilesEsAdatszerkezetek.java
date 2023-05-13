
package beolvas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.List;

public class FilesEsAdatszerkezetek {
    
    private final List<String> SOROK;
    
    public FilesEsAdatszerkezetek() throws IOException{
        this.SOROK = Files.readAllLines(Path.of("fuvar.csv"));
        
        assert !SOROK.isEmpty() : "Üres a fájl";
    }

    public static void main(String[] args) throws IOException, ParseException {
        new FilesEsAdatszerkezetek().feladatok();
    }

    private void feladatok() throws ParseException {
        feladat1();
        feladat2();
        feladat3();
    }

    private void feladat1() {        
        System.out.println("1. feladat: a sorok száma:");
        System.out.printf("a fájl %d sort tartalmaz\n", SOROK.size());
    }

    private void feladat2() throws ParseException {
        Fuvar f = new Fuvar(SOROK.get(1));
        System.out.println(f);
        
    }
    
    private void feladat3() throws ParseException{
        int veletlen = (int)(Math.random() * SOROK.size()-1) + 1;
        Fuvar f = new Fuvar(SOROK.get(veletlen));
        System.out.println(f);
    }
    
}
