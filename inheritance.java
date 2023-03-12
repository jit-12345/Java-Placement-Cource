public class inheritance {
    public static void main(String[] args) {
        
    
    // Fish katla=new Fish();
    // katla.eats();
    Dog rotwiller=new Dog();
    rotwiller .eats();
    rotwiller.legs=4;
    System.out.println(rotwiller.legs);

    }
}
class Animal{
    String colour;
    void eats(){
        System.out.println("Eats");
    }
    void breathes(){
        System.out.println("Brea");
    }
}
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swims in water");
//     }
    class Mamals extends Animal{
        int legs;
    }
    class Dog extends Mamals{
        String breed;
    }

