package Interfaces.CHallenge;

import java.util.ArrayList;

public class Player implements ISavable {
   private String name;
   ArrayList<String> parametersToSave;
   private String hairColor;
   private String eyesColor;
   private String gender;
   private String age;


   public Player(String name) {
      this.name = name;
      parametersToSave = new ArrayList<>();
   }

   @Override
   public ArrayList<String> returnList() {
      return parametersToSave;
   }

   @Override
   public void populateFields(Object arrayList) {
      parametersToSave = (ArrayList<String>) arrayList;
      hairColor = parametersToSave.get(0);
      eyesColor = parametersToSave.get(1);
      gender = parametersToSave.get(2);
      age = parametersToSave.get(3);
   }

   @Override
   public String toString() {
      return "Player's name " + this.name + "\nParemeters: " + "\n Hair color = " + this.hairColor +
              "\nEyes color = " + this.eyesColor +
              "\nGender = " + this.gender +
              "\nAge = " + this.age;
   }


}
