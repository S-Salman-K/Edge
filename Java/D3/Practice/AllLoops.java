
public class AllLoops {
	
	static void forLoop(int[] a) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	
	static void whileLoop(int[] a) {
		int size = a.length;
		int i = 0;
		while(i<size)
			System.out.print(a[i++]+" ");
		System.out.println();
	}
	
	static void doWhileLoop(int[] a) {
		int size = a.length;
		int i = 0;
		do {
			System.out.print(a[i]+" ");
			i++;
		}while(i<size);
		System.out.println();
	}
	
	static void forEachLoop(int[] a) {
		for(int e: a)
			System.out.print(e+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		forLoop(a);
		whileLoop(a);
		doWhileLoop(a);
		forEachLoop(a);
	}

}
