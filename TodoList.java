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
  
  public void setStatus (int index) {
    while (index>0 || index<todoList.size()) {
        if todoList.[index-1].endWith("DONE") {
          return;
        }
        else {
          todoList.[index-1] = todoList.[index].concat(status.toString())
        };
        System.out.println("must between 1-5");
        //waiting for input
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
