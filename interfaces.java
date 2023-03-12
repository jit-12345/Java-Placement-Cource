public class interfaces {
    public static void main(String[] args) {
        queen q=new queen();
        q.moves();
        bear b=new bear();
        b.eats();
        
    }
}
interface harbivore{
    void eats();
}
interface carnivore{
    void eats();
}
class bear implements harbivore,carnivore{
    public void eats(){
        System.out.println("It eats!");
    }
}
interface chessplayer{
    void moves();
}
class queen implements chessplayer{
   public void moves(){
        System.out.println("up,down,left,right,diagonal(in for side)");
    }
}
class king implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(only 1 step)");
    }
}
class hook implements chessplayer{
    public void moves(){
        System.out.println("horixontally,vertically");
    }
}
