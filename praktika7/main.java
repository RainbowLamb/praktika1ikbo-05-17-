import java.util.ArrayDeque;
import java.util.Stack;

class main {
    public static Stack<Integer> players[] = new Stack<Integer>[2];
    public static void main(String[] args) {
        int cards[] = new int[]{ 0,1,8,4,0,3,0,8,8,3,7 };
 
        for(int i = 0; i < cards.length; i += 2){
            players[0].push(cards[i]);
            players[1].push(cards[i + 1]);}

        while(players[0].isEmpty() || players[1].isEmpty()){
            Integer firstCard = players[0].pop();
            Integer secondCard = players[1].pop();
            
            if(firstCard > secondCard){
                players[0].add(players[0].size() - 1, secondCard);
                players[0].push(firstCard); }
                else{
                players[1].add(players[1].size() - 1, firstCard);
                players[1].push(secondCard); }
        }

        if(players[0].isEmpty())
            System.out.println("First");
        else
            System.out.println("Second");}
}
