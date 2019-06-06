package parquejava;

public class ParqueJava{

    public static void main(String[] args) {
        GatoJava gato = new GatoJava("kadasha");
            gato.name  = "kadasha";
            gato.miau();
            GatoJava female = new GatoJava("Lylly");
            female.idade=3; female.female =true;
            female.miau();
            gato.female = false;
                 

        }
 
    }
