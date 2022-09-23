public class MagicIndex {
    static int getMagicIndex(int[] arr, int i){
        if(i==arr.length)
            return -1;
        if(arr[i]==i+1)
            return i+1;
        return getMagicIndex(arr, i+1);
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5};
        int magicIndex = getMagicIndex(arr, 0);
        System.out.println(magicIndex);
    }
}
