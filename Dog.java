public class Dog {
    private String breed;
    private String size;
    private String colour;
    private int age;
}
public Dog(String breed, String size, String colour, int age){
    this.breed = breed;
    this.size = size;
    this.colour = colour;
    this.age = age;
}
void methodForEat(){
    System.out.println("Eat");
}
void methodForRun(){
    System.out.println("Run");
}
void methodForSleep(){
    System.out.println("Sleep");
}
void methodForName(){
    System.out.println("Name");
}
public static void main(String[] args){
    Dog Dog1Object = new Dog("Bulldog", "large","light gray","5 years");
    Dog Dog2Object = new Dog("Beagle", "large", "orage", "6 years");
    Dog Dog3Object = new Dog("German Shepherd", "large", "white & orange", "6 years");
}