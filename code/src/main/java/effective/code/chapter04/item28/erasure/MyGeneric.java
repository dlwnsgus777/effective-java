package effective.code.chapter04.item28.erasure;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

public class MyGeneric {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("keesun");
        String name = names.get(0);
        System.out.println(name);

//        List names = new ArrayList();
//        names.add("keesun");
//        Object o = names.get(0);
//        String name = (String) o;
    }
}
