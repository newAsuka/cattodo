import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
  
  static String welcomStat = "Hi,Kerrigan,here is your to-do list:";
  private Boolean status = true;
  private ArrayList<String> todoList ;

  public void TodoList () {
    System.out.println(welcomStat);
    List<String> todoList = new ArrayList<>(
        Array.asList("1...","2...","3...","4...","5..."));

    for (String item : todoList) {
      System.out.println(item);
    }
  }
  
// 1. && and,  || or
// 2. Correct condition - exit loop / incorrect condition - loop for input
// 3. Off-by-one: [1, 5]  [1, 5): always use 0-based internally.

// 4. Move happy path out of while loop

  public void markAsDone(int index) {
    int i = index - 1; // [1, 5] -> [0, 5)
    while (!(index>=0 && index<todoList.size())) {
      //waiting for input
      System.out.println("must between 1-5");
      // TODO(...)
    }

    if (todoList[index].endWith("DONE")) {
      return;
    } else {
      todoList[index] = todoList[index] + "DONE";
    }
}

  public void String getStatus(int index){

  }



  
}

public class markAsDone {
  public static void main(String[] args) {

    
      


    
    }
  }
}
