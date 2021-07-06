package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 笛卡尔积
 * **/
public class CartesianProduct {

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("a1");
        a.add("a2");
        List<String> b = new ArrayList<>();
        b.add("b1");
        b.add("b2");
        List<String> c = new ArrayList<>();
        c.add("c1");
        c.add("c2");
        c.add("c3");
        List<String> d = new ArrayList<>();
        d.add("d1");
        d.add("d2");
        d.add("d3");

        List<List<String>> dimValue = new ArrayList<>();
        dimValue.add(a);
        dimValue.add(b);
        dimValue.add(c);
        dimValue.add(d);

        List<String> decartes = new CartesianProduct().decartes(dimValue);

        for (String decarte : decartes) {
            System.out.println(decarte);
        }
    }

    public List<String> decartes(List<List<String>> sources) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < sources.size(); i++) {
            List<String> curList = sources.get(i);

            if (i == 0) {
                for (String s : curList) {
                    result.add(s);
                }
                continue;
            }

            selfCopy(result, curList);
        }

        return result;
    }

    public void selfCopy(List<String> result, List<String> curList) {
        List<String> tempList = new ArrayList<>();
        for (String s : curList) {
            for (String s1 : result) {
                tempList.add(s1 + s);
            }
        }

        result.clear();
        for (String s : tempList) {
            result.add(s);
        }
    }

}
