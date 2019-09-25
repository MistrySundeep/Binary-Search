import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class binaryString{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Nisha");
        names.add("Sundeep");
        names.add("Chetan");
        names.add("Dipun");
        names.add("Amisha");
        names.add("Seetal");

        Collections.sort(names);
        System.out.println(names);

        String[] arr = {"Amisha", "Chetan", "Dipun", "Nisha", "Seetal", "Sundeep"};


        int result = binarySearch(names,0, names.size() - 1, "Seetal");
        if(result == -1){
            System.out.println("Element is not present");
        }
        else{
            System.out.println("Element " + names.get(result) + " found at index " + result + ".");
        }

        int res = binaryArr(arr, 0, arr.length - 1, "Dipun");
        if(res == -1){
            System.out.println("Element is not present.");
        }
        else{
            System.out.println("Element " + arr[res] + " found at index " + res + ".");
        }
    }

    public static int binarySearch(List<String> col, int start, int end, String x){
        start = 0;
        end = col.size() - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int res = x.compareTo(col.get(mid));

            if(res == 0){
                return mid;
            }
            else if(res > 0){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binaryArr(String[] a, int start, int end, String x){
        start = 0;
        end = a.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int res = x.compareTo(a[mid]);

            if(res == 0){
                return mid;
            }
            else if(res > 0){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
