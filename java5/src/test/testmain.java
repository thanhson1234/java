package test;

public class testmain {
    public static void main(String[] args) {
        toado td1 = new toado(5, 3);
        toado td2 = new toado(1, 1);
        toado td3 = new toado(2, 2);

        hinh h1=new diem(td1);
        hinh h2 = new hinhtron(td2, 10 );
        hinh h3 = new hinhchunhat(td3,10.0,4.0);
        System.out.println("td1 : "+h1.tinhdientich());
        System.out.println("td1 : "+h2.tinhdientich());
        System.out.println("td1 : "+h3.tinhdientich());
    }
}
