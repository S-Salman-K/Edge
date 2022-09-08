
public class BreakAndContinue {

	public static void search(int[] a, int key) {
		int index = -1;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=key)
				continue;
			else {
				index = i;
				break;
			}
		}
		if(index!=-1)
			System.out.println("Found at index: "+index);
		else
			System.out.println("Not found");
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		search(a, 10);
	}

}
