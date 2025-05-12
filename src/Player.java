import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Player {

    Scanner leer = new Scanner(System.in);
    //Atributos de la clase

    public String name;
    public int dorsal;
    public String position;
    public String team;
    public double weight;
    public double height;
    public LocalDate birthday;
    public String nationality;
    public boolean isActive;

    public Player() {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Nombre: ");
        name = leer.nextLine();

        System.out.print("Position: ");
        position = leer.nextLine();

        System.out.print("Nationality: ");
        nationality = leer.nextLine();

        // Valores generados automáticamente
        dorsal = rand.nextInt(99) + 1; // dorsal entre 1 y 99
        weight = 60 + rand.nextDouble() * 30; // entre 60 y 90 kg
        height = 1.60 + rand.nextDouble() * 0.40; // entre 1.60 y 2.00 m
        int year = 1985 + rand.nextInt(15); // entre 1985 y 2000
        int month = rand.nextInt(12) + 1;
        int day = rand.nextInt(28) + 1;
        birthday = LocalDate.of(year, month, day);

        isActive = true;
    }
}
