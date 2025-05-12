
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);


        Team team1 = new Team(1, "Águilas Imperiales", "Bogotá", "El Nido");
        team1.fillPlayers();

        Team team2 = new Team(2, "Alcones Dorados", "Bogotá", "El Cacerío");
        team2.fillPlayers();


        team1.mostrarJugadores();
        team2.mostrarJugadores();
    }
}
//a
