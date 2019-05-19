import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList<String>();
		
		
				animals.add("fox");
				animals.add("rabbit");
				animals.add("bear");
				animals.add("dog");
		
				Iterator<String> it = animals.iterator();
				
				while(it.hasNext()) {
					String value = it.next();
					System.out.println(value);
					
					if(value.equals("cat")) {
							it.remove();
				}
				
				}
				System.out.println();
				
				///Modern iteration, post Java 5 and later.
				
				
		for(String animal: animals) {
			System.out.println(animals);
			
			//animal.remove(2);
		}
	}

					}
