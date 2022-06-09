import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Number of count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Number of count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Number of count:" + counter.getCount());
		
		counter.increaseBy(5);
		
		System.out.println("Number of count:" + counter.getCount());
		
		counter.decreaseBy(2);
		
		System.out.println("Number of count:" + counter.getCount());

		counter.multipyBy(6);
		
		System.out.println("Number of count:" + counter.getCount());

	}

}
