package myPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        Iterator<String> it = list.iterator();

        // kiem tra xem co item in Mang print ra theo vong lap;
        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("A")){
                it.remove();
            }
        }
        for (String i:
             list) {
            System.out.println(i);
        }
    }
}
// Iterator lap cac phan tu trong List;

// Ham (hashNext) kiem tra xem co phan tu nao trong Mang ko;

// Xoa cac item trong Mang (uu diem);

// (for:each) khi duyet se thay doi index nen ko the xoa item;