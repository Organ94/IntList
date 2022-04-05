import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = new IntList().getIntList();
        List<Integer> resultList = new ArrayList<>();

        for (Integer integer : intList) {
            if (integer > 0 && integer % 2 == 0) {
                resultList.add(integer);
            }
        }

        Collections.sort(resultList);

        for (Integer result : resultList) {
            System.out.println(result);
        }
    }
}
