//import Animal.Rui;

public class Hierarchial {
    public static void main(String args[]){
        Mamals lion=new Mamals();
        lion.eats();
        lion.walk();
        
        Rui lio=new Rui();
        lio.size=5;
        System.out.println(lio.size);
        lio.scale();
    }
}
class Animal{
   String colour;
   void eats(){
    System.out.println("Eats!");
   }
   void breathe() {
    System.out.println("breathe");
   }
}
   class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
   }
   class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
   }
   class Mamals extends Animal{
    void walk(){
    System.out.println("Walks");
    }
   }
   class Rui extends Fish{
    int size;
    void scale(){
        System.out.println("It has large scale");
    }
   }
   
