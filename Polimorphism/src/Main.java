class Movie {
   private String name;

   public Movie(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public String plot() {
      return "No plot here";
   }
}

class Jaws extends Movie {
   public Jaws() {
      super("Jaws");
   }

   public String plot() {
      return "Shark eats lots of people";
   }
}

class IndependenceDay extends Movie {
   public IndependenceDay() {
      super("Independence day");
   }

   @Override
   public String plot() {
      return "Aliens attempt to take over planet earth";
   }
}

class MazeRunner extends Movie {
   public MazeRunner() {
      super("Maze runner");
   }

   @Override
   public String plot() {
      return "Kids try to escape a maze";
   }
}

class StarWars extends Movie {
   public StarWars() {
      super("Star Wars");
   }

   @Override
   public String plot() {
      return "Imperial forces try to take over a universe";
   }
}

class Forgetable extends Movie {
   public Forgetable() {
      super("Forgetable");
   }

   //No plot method
}


public class Main {

   public static Movie randomMovie() {
      int randomNum = (int) (Math.random() * 5) + 1;
      System.out.println("Random was " + randomNum);
      switch (randomNum) {
         case 1:
            return new Jaws();
         case 2:
            return new IndependenceDay();
         case 3:
            return new MazeRunner();
         case 4:
            return new StarWars();
         case 5:
            return new Forgetable();
         default:
            return null;
      }
   }

   public static void main(String[] args) {
      for (int i = 1; i < 11; i++) {
         Movie movie = randomMovie();
         System.out.println("movie # " + i + movie.getName() + "\n" +
                 "Plot: " + movie.plot() + "\n");
      }
   }
}
