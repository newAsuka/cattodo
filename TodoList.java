import java.util.*;

public class TodoList{
	
	static String welcomStat = new String("Hi,Kerrigan,here is your to-do list:");
	
/*
	void SetTodo(){
		
		todos.add("1....");
		todos.add("2....");
		todos.add("3....");
}

	void displayAll(){
		System.out.println(welcomStat);
		for (int item :)

	}
*/


	public static void main(String[] args){

//		TodoList todo = new TodoList();
//		todo.displayAll();

		List<String> todoList = new ArrayList<>();
		todoList.add("1....");
		todoList.add("2....");
		todoList.add("3....");
		todoList.add("4....");
		todoList.add("5....");

		System.out.println(welcomStat);

		for(int index=0; index<todoList.size(); index++){
		System.out.println(todoList.get(index));
	}


	}

}