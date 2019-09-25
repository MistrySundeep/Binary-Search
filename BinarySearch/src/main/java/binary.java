import java.util.ArrayList;
import java.util.List;

public class binary {
    public static void main(String[] args) {
        int[] arr = {2, 16, 21, 35, 47, 63, 81, 97};
        int a = 21;
        int b = 54;
        int c = 81;
        int d = 46;


        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            numbers.add(arr[i]);
        }

        System.out.println(binaryList(numbers, a));
        System.out.println(binaryList(numbers, b));
        System.out.println(binaryList(numbers, c));

        System.out.println(binarySearch(arr, a));
        System.out.println(binarySearch(arr, b));
        System.out.println(binarySearch(arr, c));

   }
   //Iterative search with an array
   public static int binarySearch(int[] a, int x){
       int start = 0;
       int end = a.length -1;

       while(start <= end){
           int mid = (start + end) / 2;
           if (x == a[mid]){
               return mid;
           }
           else if(x < a[mid]){
               end = mid - 1;
           }
           else{
               start = mid + 1;
           }
       }
       return -1;
   }

   //Iterative search with a list
   public static int binaryList(List<Integer> e, int x){
        int start = 0;
        int end = e.size() - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(x == e.get(mid)){
                return mid;
            }
            else if(x < e.get(mid)){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
   }

}




