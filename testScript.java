import java.util.Random;
import java.util.Vector;


public class testScript {
	private magazine obj;
	static public Random rand = new Random();
	
	public testScript(){
		obj = new magazine();
	}
	
	public void fnTest1(){
		Vector<Integer> vector = obj.getMagazineStack();
		if(!vector.isEmpty()){
			System.out.println("Testcase-1 Fails, State = empty, Service = getMagazineStack()");
		}else{
			System.out.println("Testcase-1 Successful, State = empty, Service = getMagazineStack()");
		}
	}
	
	
	public void fnTest2(){
		int random = rand.nextInt(9);
		int flag = obj.reFillMagazine(random);
		if(flag != 1){
			System.out.println("Testcase-2 Fails, State = empty, Service = reFillMagazine()");
		}else{
			System.out.println("Testcase-2 Successful, State = empty, Service = reFillMagazine()");
		}
	}
	
	
	public void fnTest3(){
		Vector<Integer> vector = obj.getMagazineStack();
		if(vector.isEmpty() || vector.size() == 5){
			System.out.println("Testcase-3 Fails, State = empty/full, Service = getMagazineStack()");
		}else{
			System.out.println("Testcase-3 Successful, State = NENF, Service = getMagazineStack()");
		}
	}
	
	public void fnTest4(){
		String message = obj.fireBullet();
		if(message.equals("#Stack Empty")){
			System.out.println("Testcase-4 Fails, State = empty, Service = fireBullet()");
		}else{
			System.out.println("Testcase-4 Successful, State = empty/NENF, Service = fireBullet()");
		}
	}
	
	
	public void fnTest5(){
		int random = rand.nextInt(9);
		int flag = obj.reFillMagazine(random);
		if(flag != 1){
			System.out.println("Testcase-5 Fails, State = NENF, Service = reFillMagazine()");
		}else{
			System.out.println("Testcase-5 Successful, State = NENF/full, Service = reFillMagazine()");
		}
		storeMax();
	}
	
	
	public void fnTest6(){
		Vector<Integer> vector = obj.getMagazineStack();
		if(vector.size() != 5){
			System.out.println("Testcase-6 Fails, State = NENF/empty, Service = getMagazineStack()");
		}else{
			System.out.println("Testcase-6 Successful, State = FULL, Service = getMagazineStack()");
		}
	}
	
	public void fnTest7(){
		String message = obj.fireBullet();
		if(message.equals("#Stack Empty")){
			System.out.println("Testcase-7 Fails, State = empty, Service = fireBullet()");
		}else{
			System.out.println("Testcase-7 Successful, State = NENF, Service = fireBullet()");
		}
		storeMax();
	}
	

	public void fnTest8() {
		minStack();
		String message = obj.fireBullet();
		if(message.equals("#Stack Empty")){
			System.out.println("Testcase-8 Fails, State = empty, Service = fireBullet()");
		}else{
			System.out.println("Testcase-8 Successful, State = empty/NENF, Service = fireBullet()");
		}
	}
	
	
	public void fnTest9() {
		storeMax();
		Vector<Integer> vector = obj.getMagazineStack();
		int random = rand.nextInt(9);
		int flag = obj.reFillMagazine(random);
		if(vector.size() >= 5){
			System.out.println("Testcase-9 Fails, State = full, Service = getMagazineStack()");
		}else{
			System.out.println("Testcase-9 successful, State = NENF, Service = getMagazineStack()");
		}
	}
  
	public void storeMax(){
		Vector<Integer> vector = obj.getMagazineStack();
		int size = vector.size();
		while(size != 5){
			int random = rand.nextInt(9);
			obj.reFillMagazine(random);
			size++;
		}
		return;
	}
	
	public void minStack() {
		Vector<Integer> vector = obj.getMagazineStack();
		int size = vector.size();
		while(size != -1){
			obj.fireBullet();
			size--;
		}
		return;
	}

	public static void main(String...args){
		testScript test = new testScript();
		test.fnTest1();
		test.fnTest2();
		test.fnTest3();
		test.fnTest4();
		test.fnTest5();
		test.fnTest6();
		test.fnTest7();
		test.fnTest8();
		test.fnTest9();
	} 
}
