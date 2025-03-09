package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositiveSubArr {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(336465782, -278722862, -2145174067, 1101513929, 1315634022, -1369133069, 1059961393, 628175011, -1131176229, -859484421);
        List<Integer> list2 = Arrays.asList(756898537, -1973594324, -2038664370, -184803526, 1424268980);
//        List<Integer> maxset = maxset(list);
        List<Integer> maxset2 = maxset(list2);
//        System.out.println(maxset);
        System.out.println(maxset2);
    }

    public static List<Integer> maxset(List<Integer> list) {
        if (list.size() == 1) {
            return list;
        }
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > -1) {
                temp.add(list.get(i));
            } else {
                if (!temp.isEmpty()) {
                    ret.add(temp);
                }
                temp = new ArrayList<>();
            }
        }
        if (ret.isEmpty() || !temp.isEmpty()) {
            ret.add(temp);
        }
        if (ret.size() == 1) {
            return ret.get(0);
        }
        int biggest = 0;
        long biggestSum = 0;

        for (int i = 0; i < ret.size(); i++) {
            ArrayList<Integer> a = ret.get(i);
            System.out.println(a);
            long sum = 0;
            for (int ss : a) {
                sum = (long)sum + ss;
            }
            if (sum == biggestSum && a.size() > ret.get(biggest).size()) {
                biggest = i;
            }
            if (sum > biggestSum) {
                biggest = i;
                biggestSum = sum;
            }
        }
        return ret.get(biggest);
    }
}
