package Abstractionn;
abstract class Animal {
    abstract void eat();

    abstract void sleep();

    abstract void FoodHabit();
}
 class Deer extends Animal{
    public void eat(){
        System.out.println("Deer grazes and eat");
    }
    public void sleep(){
        System.out.println("deer is sleeping");
    }
    public void FoodHabit(){
        System.out.println("herbivorous");
    }
 }
class Tiger extends Animal{
    public void eat(){
        System.out.println("tiger hunts and eat");
    }
    public void sleep(){
        System.out.println("tiger is sleeping");
    }
    public void FoodHabit(){
        System.out.println("carnivorous");
    }
}
class Monkey extends Animal{
    public void eat(){
        System.out.println("monkey steals and eat");
    }
    public void sleep(){
        System.out.println("monkey is sleeping");
    }
    public void FoodHabit(){
        System.out.println("omnivorous");
    }
}
class forest{
    public void permit(Animal ref){
        ref.eat();
        ref.sleep();
        ref.FoodHabit();
    }
}
public class Lunch {
    public static void main(String[] args) {
        Deer d=new Deer();
        Tiger t=new Tiger();
        Monkey m=new Monkey();
        forest f=new forest();
        f.permit(d);
        f.permit(t);
        f.permit(m);
    }
}
