import org.apache.commons.lang3.StringUtils;

public class FooBar {

    public static void main(String[] args) {
        for (Integer i=1; i<=100; i++) {

            StringBuilder res = new StringBuilder();

            String strNumber = i.toString();

            if ((i%3) == 0) {
                res.append("Foo");
            }

            if ((i%5) == 0) {
                res.append("Bar");
            }

            if(strNumber.startsWith("3")) {
                res.append("Foo");
            } else if(strNumber.startsWith("5")) {
                res.append("Bar");
            } else {

                if (String.valueOf(i).contains("3"))
                    res.append("Foo");

                if (String.valueOf(i).contains("5"))
                    res.append("Bar");
            }

            if (String.valueOf(i).contains("7"))
                res.append("Qix");

            if(StringUtils.isNoneBlank(res.toString())) {
                System.out.println(res.toString());
            } else {
                System.out.println(strNumber);
            }
        }
    }
}
