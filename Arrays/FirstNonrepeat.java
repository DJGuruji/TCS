public class FirstNonrepeat{ 

    public static void main(String [] args){

 int []a = {1,1,2,3,2,3,4,4,5};
 check(a);

    }
    public static void check(int []a){
        int [] freq = new int[10000];
        for(int i : a){
            freq[i]++;
        }

        for(int i:a){
            if(freq[i] == 1){
                System.out.println(i);
                System.exit(0);
            }

        }
        System.out.println("no element");
    } 

}