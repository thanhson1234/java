public class timMaxMin {
    public static void main(String[] args) {
        int [] a = new int[]{1,2,3,4,5};
        int max = 0 ;
        int min = 0 ;
        for ( int i = 0; i <a.length; i++){
            if(max <a [i] ){
                max = a [i];
            }
            if (min > a[i]){
                min = a[i];
            }
        }
        System.out.println("max = "+ max);
        System.out.println("min = "+ min);
    }
}

