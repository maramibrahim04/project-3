import java.util.Scanner;  // Import the Scanner class
class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    int[] seat = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    String [] names = new String[15];
    for (int i = 0; i < names.length; i++){
      System.out.println("please enter student name");
      String userName= myObj.nextLine();
      names[i] = userName;
    }
  int count = 0;

  while (count <= 14){
    System.out.println(names[count]+" sits in seat # "+ seat[count]);
    count++;
  }
}} 