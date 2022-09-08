package Assignment;

class Fibonacci{
	private int[] series;
	private int start;
	private int end;
	
	public Fibonacci(int start, int end){
		this.start = start;
		this.end = end;
		series = new int[end-start+1];
	}
	
	int[] getFibonacci() {
		return series;
	}
	
	void calculateFibonacciSeries() {
		int a = 0;
		int b = 1;
		int count = 1;
		while(count<start) {
			int c = a+b;
			a = b;
			b = c;
			count++;
		}
		for(int i=0;i<end-start+1;i++) {
			if(i==0)
				series[i] = a;
			else if(i==1)
				series[i] = b;
			else {
				int c = a+b;
				a = b;
				b = c;
				series[i] = b;
			}
		}
	}
}

public class FibonacciMain {

	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci(1, 10);
		fib.calculateFibonacciSeries();
		int[] series = fib.getFibonacci();
		for(int e: series)
			System.out.print(e+" ");
		
		System.out.println();
		Fibonacci fib2 = new Fibonacci(7, 10);
		fib2.calculateFibonacciSeries();
		int[] series2 = fib2.getFibonacci();
		for(int e: series2)
			System.out.print(e+" ");
	}

}
