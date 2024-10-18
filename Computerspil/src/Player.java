public class Player {
//Attributter
    private int playerId;
    private String name;
    private int age;
    private double score;

//Kunstruktør½ til at initialisere alle attributterne
    public Player(int playerId, String name, int age, double score) {
        this.playerId = playerId;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    //Setter metoder
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //Getter metoder
    public int getPlayerId(){
        return playerId;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getScore(){
        return score;
    }

    //Metode til at vise spillerens detaljer
    public void displayDetails() {
        System.out.println("playerId: "+playerId+"\nName: "+name+"\nAge: "+age+"\nScore: "+score+"\n");
    }

    //Metode til at opdatere spillerens score, med en ny værdi
    public void updateScore(double newScore){
        this.score = newScore;
    }

}
