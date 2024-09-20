//first 2 repeating
public class FirstRepeat {

    public static void main(String[] args) {

        int[] a = {1, 1, 2, 3, 2, 3, 4, 5};
        check(a);

    }

    public static void check(int[] a) {
        int[] freq = new int[10000];
        for (int i : a) {
            freq[i]++;
        }
        int count = 0;
        for (int i : a) {
            if (freq[i] != 1) {
                System.out.println(i);
                freq[i] = 1;
                count++;
                if (count == 2) {
                    System.exit(0);
                    break;
                }

            }

        }
        System.out.println("no element");
    }

}
