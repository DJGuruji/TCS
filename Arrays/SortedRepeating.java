public class SortedRepeating{
    public static void main(String[] args) {
        int []a ={1,2,3,4,5,5,6};
        check(a);

            }
            public static void check(int []a){
            for(int i=0; i<a.length; i++){
                if(a[i] == a[i+1]){
                    System.out.println(a[i]);
                    System.exit(0);
                }

            }
            }
}