import java.util.*;

public class Driver {
    DummyFrame frame = new DummyFrame();

    public static void main(String[] args){
        FileClass one = new FileClass("molly", 1, 1, 1, 1, "Jemma");
        FileClass two = new FileClass("molly", 0, 1, 1, 1, null);
        FileClass three = new FileClass(null, 0, 0, 0, 0, null);
        FileClass four = new FileClass(null, -1, -2, -3, -4, null);
        FileClass five = new FileClass("molly", -1, -2, -3, -4, "Jemma");


        ArrayList<FileClass> data = new ArrayList<>();
        data.add(one);
        data.add(two);
        data.add(three);
        data.add(four);
        data.add(five);

        System.out.println(data);
    }
}
