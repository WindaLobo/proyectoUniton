import com.windar.BaseDatos.BaseDeDatos;

public class Main {

    public static void main(String[] args) {
        System.out.println("Proyecto para aprender a hacer un Singleton");


        BaseDeDatos miUnicaInstancia = BaseDeDatos.getInstance();

        miUnicaInstancia.setEdad(29);
        miUnicaInstancia.setNombre("Windar");

        BaseDeDatos otraInstanciaSeraLaMisma = BaseDeDatos.getInstance();

        otraInstanciaSeraLaMisma.setEdad(30);

        BaseDeDatos versionInstancia = BaseDeDatos.getInstance();
        versionInstancia.setNombre("version 1.1");
    }
}