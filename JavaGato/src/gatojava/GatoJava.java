package gatojava;

public class GatoJava {
    
    String raça;
    String name;
    int idade;
    boolean female;

    public GatoJava(String g) {
        this.name = g;
    }

    public GatoJava() {
        if (idade >= 3) {
            System.out.println("Miau");
        } else {
            System.out.println("niau");

        }

    }

}
