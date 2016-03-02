package AbstractClasses;

public class Main {
   public static void main(String[] args) {
      Dog dog = new Dog("Yotke");
      dog.breath();
      dog.eat();

      Parrot bird = new Parrot("ringneck");
      bird.eat();
      bird.breath();
      bird.fly();

      Penguin penguin = new Penguin("Emperor");
      penguin.fly();

   }
}
