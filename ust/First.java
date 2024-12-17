
import java.util.*;

public class First {

    public static void main(String[] args) {
        int[] a = {3,3,2,1};
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (i < j && a[i] < a[j]) {
                    int max = j - i;
                    set.add(max);

                }
            }
        }
        if (set.isEmpty()) {
            System.out.println(-1);

        } else {
            int large = set.last();
            System.out.println(large);
            
        }
    }
}



/*

You are given an array A of length N representing a permutation. Find two indices such that:

1. i < j


2. A[i] < A[j]


3. j - i is maximized



If no such pairs exist, return -1; otherwise, return the maximum possible value of j - i.


---

Input:
3
3
2
1

Output:
-1


---

Input:
4
1
2
3
4

Output:
3


---

Input:
5
5
4
1
3
2

Output: 2
 */