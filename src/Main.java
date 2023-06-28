
import java.util.*;
public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positive = new LinkedList<>();
        Iterator<Integer> itr = null;
        itr = intList.iterator();
        while(itr.hasNext()){
            int item = itr.next();
            if (item > 0) {
                positive.add(item);
            }
        }
        List<Integer> even = new LinkedList<>();
        itr = positive.iterator();
        while(itr.hasNext()){
            int item = itr.next();
            if (item % 2 == 0) {
                even.add(item);
            }
        }
        Collections.sort(even);
        System.out.println(even);

    }
}