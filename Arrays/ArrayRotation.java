
public class ArrayRotation {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int rotate = 3;
        check(a, rotate);
    }

    public static void check(int[] a, int rotate) {

        for (int j = 0; j < rotate; j++) {
            int temp = a[0];
            for (int i = 0; i < a.length - 1; i++) {

                a[i] = a[i + 1];
            }
            a[a.length - 1] = temp;

        }
        for (int i : a) {
            System.out.println(i);
        }

    }

}
