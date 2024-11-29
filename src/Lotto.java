import java.util.ArrayList;
import java.util.Collections;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            list.add(i);
        }

        Collections.shuffle(list);
        System.out.println("번호추첨");

        for (int j = 0; j < 7; j++) {
            if (j == 6) {
                System.out.println("+ 보너스번호 : " + list.get(j));
             }else {
                System.out.print(list.get(j)+" ");
            }
        }
    }

}
