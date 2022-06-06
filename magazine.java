import java.util.Vector;


public class magazine {
	private Vector<Integer> bullet_stack;
	private int top = -1;
	private int size = 5;
	
	public magazine() {
		bullet_stack = new Vector<Integer>(size);
	}
	

	public Integer reFillMagazine(int x) {
		if(top == size-1) {
			return 2;
		}
		top++;
		bullet_stack.add(top,x);
		return 1;
	}
	

	public String fireBullet(){
		String message;
		if(top == -1){
			message = "#Stack Empty";
			return message;
		}
		message = bullet_stack.get(top)+"#Successful";
		top--;
		return message;
	}
	

	public Vector<Integer> getMagazineStack(){
		@SuppressWarnings("UseOfObsoleteCollectionType")
		Vector<Integer> object_clone = (Vector<Integer>) bullet_stack.clone();
		return object_clone;
	}
}
