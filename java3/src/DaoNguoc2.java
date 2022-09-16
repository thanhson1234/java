public class DaoNguoc2 {
        public static void main(String[] args) {
            int [] x = new int[] {1,3,5,7};
            int c;
            for (int i = 0; i < x.length/2;i++){
                c = x[i];
                x[i]= x[x.length-i-1];
                x[x.length-i-1]=c;
            }
            for (int j = 0; j < x.length;j++){
                System.out.println(x[j]);
            }
        }

    }


