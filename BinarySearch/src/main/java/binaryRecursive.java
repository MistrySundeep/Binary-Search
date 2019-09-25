import java.util.ArrayList;
import java.util.List;

public class binaryRecursive {
    public static void main(String[] args) {
        int[] arr = {2, 16, 21, 35, 47, 63, 81, 97};
        List<Integer> number = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            number.add(arr[i]);
        }
        System.out.println(number);

        System.out.println(binarySearch(63, arr,0, arr.length - 1));
        System.out.println(binaryList(97, number, 0, number.size() - 1));
    }

    public static int binarySearch(int search, int[] a, int start, int end){
        int mid = start + (end - start) / 2;

        if(end < start){
            return -1;
        }

        if(search == a[mid]){
            return mid;
        }
        else if(search < a[mid]){
            return binarySearch(search, a, start, mid -1);
        }
        else{
            return binarySearch(search, a, mid + 1, end);
        }
    }

    public static int binaryList(int search, List<Integer> a, int start, int end){
        int mid = start + (end - start) / 2;

        if(end < start){
            return -1;
        }

        if(search == a.get(mid)){
            return mid;
        }
        else if(search < a.get(mid)){
            return binaryList(search, a, start, mid - 1);
        }
        else{
            return binaryList(search, a, mid + 1, end);
        }
    }
}

