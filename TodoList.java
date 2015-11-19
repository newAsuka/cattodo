import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class TodoList {
  
  static String welcomStat = "Hi,Kerrigan,here is your to-do list:";
  private ArrayList<String> todoList ;

  public TodoList () {
    System.out.println(welcomStat);
    List<String> todos = new ArrayList<>(
        Arrays.asList("1...","2...","3...","4...","5..."));
    todoList = (ArrayList<String>)todos;

    for (String item : todoList) {
      System.out.println(item);
    }
  }
  
// 1. && and,  || or
// 2. Correct condition - exit loop / incorrect condition - loop for input
// 3. Off-by-one: [1, 5]  [1, 5): always use 0-based internally.

// 4. Move happy path out of while loop

  public void markAsDone(int index) {
    if (!todoList.get(index).endsWith("DONE")) {
       todoList.set(index, todoList.get(index) + "DONE");
    }
    
    for(String todos : todoList) {
        System.out.println(todos);
    }

  }

  

  public static void main(String[] args) {
    TodoList myTodoList = new TodoList();
    /*System.out.println("mark one as DONE");
    Scanner sc = new Scanner(System.in);
    myTodoList.markAsDone(sc.nextInt());*/

    do {
      System.out.println("mark one as DONE");
      String hint = String.format("input from 1 ~ %s", myTodoList.todoList.size());
      System.out.println(hint);

      Scanner sc = new Scanner(System.in);
      int index = sc.nextInt() - 1;
      myTodoList.markAsDone(index);
    } while (true);


      
  }

}



  
