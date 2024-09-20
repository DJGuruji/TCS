public class RemoveDuplicate {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 2, 3, 4, 5};
        check(a);
    }

    public static void check(int a[]) {
        int b[] = new int[a.length];
        int index = 0; 

        for (int i = 0; i < a.length; i++) {
            
            if (i == 0 || a[i] != a[i - 1]) {
                b[index] = a[i]; 
                index++; 
            }
        }

        
        for (int i = 0; i < index; i++) {
            System.out.println(b[i]);
        }
    }
}
