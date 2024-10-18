public class GameSystem {

  //Arrays til at have spil og spillere
  private Game[] games;
  private Player[] players;

  //Spil tæller og Spiller tæller
  private int gameCount;
  private int playerCount;

//Kontruktør til at initialisere spil systemet med max nummer af spil og spillere
  public GameSystem(int maxGames, int maxPlayers) {
    games = new Game[maxGames];
    players = new Player[maxPlayers];
    gameCount = 0;
    playerCount = 0;
  }

  //Metode til at tilføje et spil i systemet
  public void addGame(Game game) {
    if (gameCount < games.length) {
      games[gameCount] = game;
      gameCount++;
    } else System.out.println("Max number of games achieved");
  }

  //Metode til at tilføje en spiller i systemet
  public void addplayer(Player player) {
    if (playerCount < players.length) {
      players[playerCount] = player;
      playerCount++;
    } else System.out.println("Max number of players achieved");
  }

  //Metode til at vise alle spil i systemet
  public void displayAllGames() {
    for (int i = 0; i < gameCount; i++) {
      games[i].displayDetails();
    }
  }

  //Metode til at vise all spillere i systemet
  public void displayAllPlayers() {
    for (int i = 0; i < playerCount; i++) {
      players[i].displayDetails();
      System.out.println();
    }
  }

  //Metode til at opdatere scoren af en spiller fra spillerid
  public void updatePlayerScore(int playerId, double newScore) {
    for (int i = 0; i < playerCount; i++) {
      if (players[i].getPlayerId() == playerId) {
        players[i].setScore(newScore);
        System.out.println("The new score for " + players[i].getName() + " is " + newScore);
      }
    }
  }

//Metode til at finde et spil fra spillets id
  public Game findGameById(int gameId) {
    for (int i = 0; i < gameCount; i++) {
      if (games[i].getGameId() == gameId) {
        return games[i];
      }
    }return null;
  }

  //Metode til at finde en spiller fra spillerens id
  public Player findPlayerById(int playerId) {
    for (int i= 0; i<playerCount; i++){
      if(players[i].getPlayerId() == playerId){
        return players[i];
      }
     }
    System.out.println("Player not found");
    return null;
  }

  //Metode til at beregne total omsætning fra alle spil
  public double calculateTotalRevenue(){
    double totalRevenue = 0;
    for(int i=0; i<gameCount; i++){
      totalRevenue = totalRevenue+games[i].getPrice();
    }
    totalRevenue = totalRevenue*playerCount;
    return totalRevenue;
  }


  //Metode til at finde spilleren med den højeste score
  public Player findTopScoringPlayer(){
    Player topPlayer = players[0];
    for (int i = 1; i<playerCount; i++){
      if (players[i].getScore() > topPlayer.getScore()){
        topPlayer = players[i];
      }
    }return topPlayer;
  }
}