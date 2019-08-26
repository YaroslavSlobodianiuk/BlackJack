public class Card {
    String suit;
    String name;
    Integer value;

    public Card(String suit, String name){
        this.suit = suit;
        this.name = name;
        //this.value = value;
    }
    /*public Card(String name){
        this.name = name;
    } */
    public Card(Integer value){
        this.value = value;
    }

    public String getSuit(){
        return suit;
    }
    public String getName(){
        return name;
    }
    /*public Integer getValue(){
        return value;
    }*/
    @Override
    public String toString() {
        return suit + " " + name;
    }
}
