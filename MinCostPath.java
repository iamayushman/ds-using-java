import java.util.*;


/**
 * Problem Description
 *
 * You are given a AB character matrix named C. Every cell in C has a character U,R,L or D indicating up,right,left and down.
 * Your target is to go from top left corner to the bottom right corner of the matrix.
 * But there are some restrictions while moving along the matrix:
 *
 * If you follow what is written in the cell then you can move freely.
 * But if you don't follow what is written in the cell then you have to pay 1 unit of cost.
 * Like: If a cell contains character U and you go right instead of Up you have to pay 1 unit of cost.
 *
 * So your task is to find the minimum cost to go from top-left corner to the bottom-right corner.
 *
 * Problem Constraints
 * 1 <= A,B <= 103
 * C[i][j] can be either U,R,L or D.
 *
 * Input Format
 * First Argument represents a integer A (number of rows).
 * Second Argument represents a integer B (number of columns).
 * Third Argument represents a string array C which contains A strings each of length B.
 *
 * Output Format
 *  Return an integer denoting the minimum cost to travel from top-left corner to bottom-right corner.
 *
 * Example Input
 * Input:1
 *
 *  A = 3
 *  B = 3
 *  C = ["RRR","DDD","UUU"]
 * Input:2
 *
 *  A = 1
 *  B = 4
 *  C = ["LLLL"]
 *
 *
 * Example Output
 * Output-1 :
 *
 *  1
 * Output-2 :
 *
 *  3
 *
 *
 * Example Explanation*
 * Explanation for Input-1:
 *
 *  Matrix looks like: RRR
 *                     DDD
 *                     UUU
 *  We go right two times and down two times.
 *  So from top-right cell we are going down though right is given so this incurs a cost of 1.
 * Explanation for Input-2:
 *
 *  Matrix looks like: LLLL
 *  We go right three times.
 */
public class MinCostPath {

    public static void main(String[] args) {
        System.out.println(solve(3 ,3, new ArrayList<>(Arrays.asList("RRR","DDD","UUU"))));
        System.out.println(solve(1 ,4, new ArrayList<>(List.of("LLLL"))));
    }

    public static int solve(int A, int B, ArrayList<String> C) {
        PriorityQueue<Pair<Integer, Pair<Integer, Integer>>> queue = new PriorityQueue<>(Comparator.comparingInt(Pair::getKey));

        int[][] dist = new int[A][B];

        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};
        char[] dir = {'U', 'R', 'D', 'L'};


        queue.offer(new Pair<>(0, new Pair<>(0, 0)));
        dist[0][0] = 0;

        while (!queue.isEmpty()) {
            Pair<Integer, Pair<Integer, Integer>> node = queue.poll();
            int cost = node.getKey();
            int r = node.getValue().getKey();
            int c = node.getValue().getValue();

            if (r == A - 1 && c == B - 1) {
                return cost;
            }

            for (int i = 0; i < 4; i++) {
                int nr = r + delRow[i];
                int nc = c + delCol[i];

                if (nr >= 0 && nr < A && nc >= 0 && nc < B) {
                    int extraCost = (C.get(r).charAt(c) != dir[i]) ? 1 : 0;
                    if (dist[r][c] + extraCost < dist[nr][nc]) {
                        dist[nr][nc] = dist[r][c] + extraCost;
                        queue.offer(new Pair<>(dist[nr][nc], new Pair<>(nr, nc)));
                    }
                }

            }
        }
        return -1;
    }

}






