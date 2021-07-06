package bigdecimal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BigDecimalList {

    public static void main(String[] args) {
        List<BigDecimal> list = new ArrayList<>();

        BigDecimal bigDecimal = new BigDecimal(0);

        list.add(bigDecimal);

        bigDecimal = bigDecimal.add(new BigDecimal(1));

        for (BigDecimal decimal : list) {
            System.out.println(decimal.toString());
        }
    }

}
