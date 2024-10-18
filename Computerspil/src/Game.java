public class Game {
    //Attributter
    /* De er private så man ikke kan nemt få fat i data, og kun blive blive brugt i andre klasser ved brug af
    public metoder. */
    public int gameId;
    private String title;
    private String genre;
    private double price;

// Konstruktør til at initilasisere vores attributter
    public Game(int gameId, String title, String genre, double price){
    this.gameId = gameId;
    this.title = title;
    this.genre = genre;
    this.price = price;

    }

// Setter metoder.
    public void setGameId(int gameId){
      this.gameId = gameId;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setPrice(double price) {
        this.price = price;
    }

// getter metoder.
    public int getGameId() {
        return gameId;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre(){
        return genre;
    }
    public double getPrice(){
        return price;
    }


    // Metode til at vise spil detaljerne
    public void displayDetails(){
        System.out.println("Game id: "+gameId+"\nGame title: "+title+"\nGenre: "+genre+"\nPrice: "+price+"\n");
    }



}

