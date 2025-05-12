import java.util.Scanner;

public class Team {


        public int id;
        public String name;
        public Player dt;
        public Player[] players = new Player[5]; // Arreglo de 5 jugadores
        public String city;
        public String stadium;


        // Constructor
        public Team(int id, String name, String city, String stadium) {
            this.id = id;
            this.name = name;
            this.city = city;
            this.stadium = stadium;
        }

        // Método para llenar los jugadores del equipo
        public void fillPlayers() {
            Scanner leer = new Scanner(System.in);

            for (int i = 0; i < players.length; i++) {
                System.out.println("---- Crear jugador #" + (i + 1) + " para equipo " + name + " ----");
                players[i] = new Player();
                players[i].team = this.name; // Relacionamos el jugador con el equipo
            }

            System.out.println("¿Deseas ingresar un DT para el equipo " + name + "? (s/n)");
            String opcion = leer.next();
            if (opcion.equalsIgnoreCase("s")) {
                System.out.println("--- Ingresando datos del DT ---");
                dt = new Player();
                dt.team = this.name; // También relacionamos al DT
            }
        }
    public void mostrarJugadores() {
        System.out.println("\n--- Jugadores del equipo " + name + " ---");
        for (Player p : players) {
            System.out.println("Nombre: " + p.name);
            System.out.println("Dorsal: " + p.dorsal);
            System.out.println("Posición: " + p.position);
            System.out.println("Nacionalidad: " + p.nationality);
            System.out.println("Peso: " + p.weight + " kg");
            System.out.println("Estatura: " + p.height + " m");
            System.out.println("Fecha de nacimiento: " + p.birthday);
            System.out.println("Activo: " + (p.isActive ? "Sí" : "No"));
            System.out.println();
        }

        if (dt != null) {
            System.out.println("DT: " + dt.name + " (" + dt.nationality + ")");
        }
    }

}
