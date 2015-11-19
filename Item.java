import java.util.ArrayList;
import java.util.Scanner;

public class Item {
	private boolean status = false;
	private String content;

    public Item(String item) {
        content = item;
    }
    
    public void setContent(String todo) {
        content = todo;
    }
    public String getContent() {
    	return content;
    }
    
    public void setStatus() {
        if (!status) {
            status = true;
        } else {
           return;
        }
    }
    public boolean getStatus() {
    	return status;
    }

public static void main (String[] args) {
	TodoList = myList TodoList();
    while(myList.AllMarkasDone()) {
        System.out.println("Mark one as DONE:");
        Scanner user_input = new Scanner(System.in);
        int i = user_input.nextInt();
        int index = i-1;
        myList.markAsDone(index);
        for(String todos : todoList[index].getContent()) {
            System.out.println(todos);
        }
    }
	
  }
}



public class TodoList {
  static String welcomStat = "Hi,Kerrigan,here is your to-do list:";
  private ArrayList<Item> todoList ;
  private boolean areAllMarkasDone = true;

  public void TodoList () {
    System.out.println(welcomStat);
    List<Item> todoList = new ArrayList<>();
    todoList[0] = new Item("1...");
    todoList[1] = new Item("2...");
    todoList[3] = new Item("3...");
    for (String item : todoList) {
      System.out.println(item);
    }

   public void markAsDone(int index) {
    todoList[index].setStatus();
    todoList[index].content += todoList[index]+"DONE";
   }

  public boolean checkMarkasDone(ArrayList<Item> todoList) {
    for(int index>=0; index<todoList.size(); i++) {
      if(todoList[index].getStatus=false){
            areAllMarkasDone = false;
        } else {
            return areAllMarkasDone = true;
        }  
      }

    }
  }
