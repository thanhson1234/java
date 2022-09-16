public class daoNguyoc {
    public static void main(String[] args) {
        int [] x = new int[] {1,3,5,7};
        int first = 0;
        int last = x.length-1;
        while ( first< last){
            int c;
            c = x[first];
            x[first]= x[last];
            x[last]=c;
            first++;
            last--;
        }
        for( int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }

}

