
import javax.lang.model.util.ElementScanner14;

public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

        if (sigla == "P")
            System.err.println("PEQUENO");
        else if(sigla == "M")
            System.err.println("MEDIO");
        else if(sigla == "G")
            System.err.println("GRANDE");
        else
            System.err.println("INDEFINIDO");




    }
}
