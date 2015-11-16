import java.util.*;

public class TodoList {
  
  static String welcomStat = "Hi,Kerrigan,here is your to-do list:";

  public static void main(String[] args) {
  	// Note this list is fix-sized, you cann't add new items into it.
    List<String> todoList = Arrays.asList(
    	"1...",
    	"2...",
    	"3...",
    	"4...",
    	"5...");

    System.out.println(welcomStat);

    for (String item : todoList) {
    	System.out.println(item);
    }
  }
}
