import java.util.ArrayList;
import java.util.Scanner;

public class Item {
	private boolean status = false;
	private String content;

	public void Item() {
		System.out.println("new item");
	}

    public String getContent() {
    	return content;
    }

    public boolean getStatus() {
    	return status;
    }

    public static void main (String[] args) {
	Item item = new Item();
	System.out.println(item.getStatus);
  }
}
