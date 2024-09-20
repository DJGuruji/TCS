import java.util.*;
public class ReoveArrayDuplicate{
    public static void main(String[] args) {
        int []a = {1,8,8,2,2,3,3,4,5};
        check(a);
    }

    public static void check(int []a){
        // Set<Integer> set = new LinkedHashSet<>();//remove duplicates and print in order as array
         Set<Integer> set = new TreeSet<>();//remove duplicates and print in asc order
        for(int i: a){
            set.add(i);
        }
         for(int i: set){
            System.out.println(i);
        }


    }
}