import java.util.*;

public class tryInput {
  
  static String welcomStat = "Hi,Kerrigan,here is your to-do list:";

  public static void main(String[] args) {

    /*List<String> todoList = Arrays.asList(
    	"1...",
    	"2...",
    	"3...",
    	"4...",
    	"5...");*/
   
    String[] items = {"1...","2...","3...","4...","5..."};
    List<String> newList = Arrays.asList(items);
    List<String> todoList = new ArrayList(newList);
    todoList.add("new item");
    

    //todoList.addAll(items);


    String msg = String.format("toDoList isEmpty=%s, length=%d.",
        todoList.isEmpty(), todoList.size());
    System.out.println(msg);
    System.out.println(welcomStat);



   for (String item : todoList) {
     System.out.println(item);
   }

 /*	Scanner sc = new Scanner(System.in);
    while(true) {
    System.out.print ("enter:");
    String input = sc.next();
    System.out.println(input);
    } */
 } 
}

