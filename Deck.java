import java.util.*;

public class Deck {


    String[] suit = {"Spades", "Diamonds", "Hearts", "Clubs"};
    String[] name = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    Integer[] value = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
    int counter = 0;



    List<Card> list = new ArrayList<Card>();
    List<String> stringList = new ArrayList<>();

    public void addToList() {
        for (int i = 0; i < suit.length; i++){
            for (int j = 0; j < name.length; j++){
                Card tmp = new Card(suit[i], name[j], value[j]);
                list.add(tmp);
            }
        }
        Collections.shuffle(list);
    }


    public Card getCard() {
        //Card tmp = list.get(counter);
        //list.remove(counter);
        //return tmp;
        Card tmp = list.get(counter);
        list.remove(counter);
        counter++;
        return tmp;
    }
    /*public Integer test(){
        System.out.println(list.get(0));
            return  list.get(0).getValue();
    }*/
}
