import java.util.*;

public class TodoList {
  
  static String welcomStat = "Hi,Kerrigan,here is your to-do list:";

  public static void main(String[] args) {
    List<String> todoList = new ArrayList<>();
    todoList.add("1....");
    todoList.add("2....");
    todoList.add("3....");
    todoList.add("4....");
    todoList.add("5....");

    System.out.println(welcomStat);

    for(int index = 0; index < todoList.size(); index++) {
      System.out.println(todoList.get(index));
    }
  }
}
