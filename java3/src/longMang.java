public class longMang {
    public static void main(String[] args) {
        int [] a = new int[]{
                1,2,4,5,7
        };
        int[] b= new int[]{
                2,4,5,6
        };
        int [] c = new int[a.length+b.length];
        for(int i= 0; i<c.length;i++){
           if(i< a.length){
               c[i]= a[i];
           }else {
               c[i]= b[i - a.length];
           }
        }
        for (int i =0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}
