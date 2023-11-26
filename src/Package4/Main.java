package Package4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        int i = 0;

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList();
        while (scanner.hasNext()) {
            int s = scanner.nextInt();
            if (i % 2 != 0) {
                arrayList.add(s);
            }
            i++;


        }
        scanner.close();

        Collections.reverse(arrayList);

        for (Integer a : arrayList) {
            System.out.print(a + " ");
        }
    }
}
