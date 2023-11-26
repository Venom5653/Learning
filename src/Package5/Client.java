package Package5;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        ArrayList<Clt> arrayList = new ArrayList<>();

        arrayList.add(new Clt(9, "Vova", true) );
        arrayList.add(new Clt(12, "Shluha", true) );
        arrayList.add(new Clt(1, "Danila", false) );
        arrayList.add(new Clt(32, "Popa", true) );


    }
}
