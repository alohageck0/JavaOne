
public class ArrayStructures {

   private int[] theArray = new int[50];

   private int arraySize = 10;

   public void generateRandomArray() {

      for (int i = 0; i < arraySize; i++) {

         theArray[i] = (int) (Math.random() * 10) + 10;

      }

   }

   public int[] generateRandomArr() {
      int[] theArray = new int[50];
      for (int i = 0; i < arraySize; i++) {

         theArray[i] = (int) (Math.random() * 10) + 10;

      }
      return theArray;

   }

   public void printArray() {

      System.out.println("----------");
      for (int i = 0; i < arraySize; i++) {

         System.out.print("| " + i + " | ");
         System.out.println(theArray[i] + " |");

         System.out.println("----------");

      }

   }

   public int getValueAtIndex(int index) {

      if (index < arraySize) return theArray[index];

      return 0;

   }

   public boolean doesArrayContainThisValue(int searchValue) {

      boolean valueInArray = false;

      for (int i = 0; i < arraySize; i++) {

         if (theArray[i] == searchValue) {

            valueInArray = true;

         }

      }

      return valueInArray;

   }

   public void deleteIndex(int index) {

      if (index < arraySize) {

         for (int i = index; i < (arraySize - 1); i++) {

            theArray[i] = theArray[i + 1];

         }

         arraySize--;

      }

   }

   public void insertValue(int value) {

      if (arraySize < 50) {

         theArray[arraySize] = value;

         arraySize++;

      }

   }

   public String linearSearchForValue(int value) {

      boolean valueInArray = false;

      String indexsWithValue = "";

      for (int i = 0; i < arraySize; i++) {

         if (theArray[i] == value) {

            valueInArray = true;

            indexsWithValue += i + " ";

         }

         printHorzArray(i, -1);

      }

      if (!valueInArray) {

         indexsWithValue = "None";

      }

      System.out.print("The Value was Found in the Following: " + indexsWithValue);

      System.out.println();

      return indexsWithValue;

   }

   public void printHorzArray(int i, int j) {

      for (int n = 0; n < 51; n++) System.out.print("-");

      System.out.println();

      for (int n = 0; n < arraySize; n++) {

         System.out.print("| " + n + "  ");

      }

      System.out.println("|");

      for (int n = 0; n < 51; n++) System.out.print("-");

      System.out.println();

      for (int n = 0; n < arraySize; n++) {

         System.out.print("| " + theArray[n] + " ");

      }

      System.out.println("|");

      for (int n = 0; n < 51; n++) System.out.print("-");

      System.out.println();

      // END OF FIRST PART


      // ADDED FOR BUBBLE SORT

      if (j != -1) {

         // ADD THE +2 TO FIX SPACING

         for (int k = 0; k < ((j * 5) + 2); k++) System.out.print(" ");

         System.out.print(j);

      }


      // THEN ADD THIS CODE

      if (i != -1) {

         // ADD THE -1 TO FIX SPACING

         for (int l = 0; l < (5 * (i - j) - 1); l++) System.out.print(" ");

         System.out.print(i);

      }

      System.out.println();

   }

   // This bubble sort will sort everything from
   // smallest to largest

   public void bubbleSort() {

      for (int i = arraySize - 1; i > 1; i--) {
         for (int j = 0; j < i; j++) {
            if (theArray[j] > theArray[j + 1]) {
               swapValues(j, j + 1);
               printHorzArray(i, j);
            }
            printHorzArray(i, j);
         }
      }

   }

   public void swapValues(int indexOne, int indexTwo) {

      int temp = theArray[indexOne];
      theArray[indexOne] = theArray[indexTwo];
      theArray[indexTwo] = temp;

   }


   // The Binary Search is quicker than the linear search
   // because all the values are sorted. Because everything
   // is sorted once you get to a number larger than what
   // you are looking for you can stop the search. Also
   // you be able to start searching from the middle
   // which speeds the search. It also works best when
   // there are no duplicates

   public void binarySearchForValue(int value) {
      int lowerIndex = 0;
      int highIndex = arraySize - 1;

      while (lowerIndex <= highIndex) {
         int middleIndex = (lowerIndex + highIndex) / 2;
         if (theArray[middleIndex] > value) {
            highIndex = middleIndex;
         } else if (theArray[middleIndex] < value) {
            lowerIndex = middleIndex;
         } else {
            System.out.println("\nFound at index " + middleIndex);

            lowerIndex = highIndex + 1;
         }

         printHorzArray(middleIndex, -1);
      }

   }

   // Selection sort search for the smallest number in the array
   // saves it in the minimum spot and then repeats searching
   // through the entire array each time

   public void selectionSort() {
      for (int i = 0; i < arraySize; i++) {
         int minimum = i;

         for (int j = i; j < arraySize; j++) {
            if (theArray[minimum] > theArray[j]) {
               minimum = j;
            }
         }
         swapValues(i, minimum);
         printHorzArray(i, -1);
      }

   }

   // The Insertion Sort is normally the best of
   // the elementary sorts. Unlike the other sorts that
   // had a group sorted at any given time, groups are
   // only partially sorted here.

   public void insertionSort() {
      for (int i = 1; i < arraySize; i++) {
         int toInsert = theArray[i];
         int j = i;
         while ((j > 0) && (theArray[j - 1] > toInsert)) {
            theArray[j] = theArray[j - 1];
            j--;
            printHorzArray(i, j);
         }
         theArray[j] = toInsert;
         printHorzArray(i, j);
      }

   }

   public static void main(String[] args) {

      ArrayStructures newArray = new ArrayStructures();

      newArray.generateRandomArray();

      newArray.printHorzArray(-1, -1);

      int[] unsorted = newArray.generateRandomArr();

      for (int num:unsorted){
         System.out.print(num+ " ");
      }
      System.out.println();
      int[] sorted = newArray.mergeSort(unsorted);
      for (int num:sorted){
         System.out.print(num+ " ");
      }



      // newArray.linearSearchForValue(10);

//      newArray.bubbleSort();

      // We must Sort first

//      newArray.binarySearchForValue(17);

//      newArray.selectionSort();

//      newArray.insertionSort();


   }

   private int[] mergeSort(int[] arr) {
      if (arr.length < 2) {
         return arr;
      } else {
         int middle = arr.length / 2;
         int[] left = new int[middle];
         int[] right = new int[arr.length - middle];
         System.arraycopy(arr, 0, left, 0, left.length);
         System.arraycopy(arr, middle, right, 0, right.length);
         mergeSort(left);
         mergeSort(right);
         mergeArrays(left, right, arr);
      }
      return arr;

   }

   private int[] mergeArrays(int[] left, int[] right, int[] arr) {
      int leftIndex = 0;
      int rightIndex = 0;
      int arrIndex = 0;

      while (leftIndex < left.length && rightIndex < right.length) {
         if (left[leftIndex] >= right[rightIndex]) {
            arr[arrIndex] = right[rightIndex];
            arrIndex++;
            rightIndex++;
         } else {
            arr[arrIndex] = left[leftIndex];
            arrIndex++;
            leftIndex++;
         }
      }
      while (leftIndex < left.length) {
         arr[arrIndex] = left[leftIndex];
         arrIndex++;
         leftIndex++;
      }
      while (rightIndex < right.length) {
         arr[arrIndex] = right[rightIndex];
         arrIndex++;
         rightIndex++;
      }
      return arr;
   }


}
