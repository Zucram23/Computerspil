public class Main {
    public static void main(String[] args) {
//opgave 1 Tilføjelse af spil
Game fortnite = new Game(1, "Fortnite", "Battle Royale", 20);
fortnite.displayDetails();
//opgave 2 Tilføjelse af spiller
Player player = new Player(1, "bob", 34, 200);
//Opdater spillerens score
player.updateScore(200);
player.displayDetails();

//Opgave 3
GameSystem system = new GameSystem(10, 10);

Game game1 = new Game(2, "minecraft", "survival", 50);
Game game2 = new Game(3, "Call of Duty", "fps", 100);
Game game3 = new Game(4, "csgo", "fps", 0);
Game game4 = new Game(5, "Angry birds","strategy", 20);
Game game5 = new Game(6, "Dead by daylight","Survival",150);

Player player1 = new Player(2, "henning", 15, 500);
Player player2 = new Player(3, "Morten", 25, 400);
Player player3 = new Player(4, "peter", 23, 145);
Player player4  = new Player(5, "john", 51, 324);
Player player5 = new Player(6, "mikkel", 17, 621);

//Metode til at tilføje spil
system.addGame(game1);
system.addGame(game2);
system.addGame(game3);
system.addGame(game4);
system.addGame(game5);

//metode til at tilføje spillere
system.addplayer(player1);
system.addplayer(player2);
system.addplayer(player3);
system.addplayer(player4);
system.addplayer(player5);

//metode til at vise alle spil og alle spillere

system.displayAllGames();
system.displayAllPlayers();

//metode til at opdatere spillerens score
system.findPlayerById(5).displayDetails();
system.updatePlayerScore(5, 611);
System.out.println();
system.displayAllPlayers();

// Metoder fra GmeSystem.
system.findGameById(3).displayDetails();
system.findPlayerById(2).displayDetails();

        System.out.println("Total revenue: "+system.calculateTotalRevenue());
        System.out.println();

        // finder spilleren med flest point
        Player topPlayer = system.findTopScoringPlayer();
        // udskriver spilleren med flest point
        System.out.println("Top Scoring Player: " + topPlayer.getName() + " with score " + topPlayer.getScore());
    }
}
