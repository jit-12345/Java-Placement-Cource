public class abstract_class {
    public static void main(String args[]){
        Horse h=new Horse();
        h.eats();
        h.walk();
        h.changecolour();
        Hen h2=new Hen();
        h2.eats();
        h2.walk();
    }
    
}
abstract class Animal{
    String colour;
    Animal(){
        colour="brown";
    }
    void eats(){
        System.out.println("It eats!");
    }
    abstract void walk();
}
class Horse extends Animal{
    void changecolour(){
        colour="Dark brown";
        System.out.println(colour);
    }
    void walk(){
        System.out.println("It walks in 4 legs");
    }
}
class Hen extends Animal{
    void walk(){
        System.out.println("It walks in 2 legs!");
    }
}