import java.util.ArrayList;

class Solution {
    public double distance(int x, int y, int[] tmp) {
        return Math.sqrt((x - tmp[0]) * (x - tmp[0]) + (y - tmp[1]) * (y - tmp[1]));
    }

    public boolean is(int x, int y, int[] tmp) {
        return x == tmp[0] || y == tmp[1];
    }

    public int nearestValidPoint(int x, int y, int[][] points) {
        double min = Double.MAX_VALUE;
        int i = 0;
        ArrayList<Double> list = new ArrayList<>();
        for (int[] tmp : points) {
            if (is(x, y, tmp) && distance(x, y, tmp) < min) {
                min = distance(x, y, tmp);
            }
            list.add(distance(x, y, tmp));
        }
        return list.indexOf(min);
    }
}

// class Solution {
//     public int nearestValidPoint(int x, int y, int[][] points) {
//         int minDist = Integer.MAX_VALUE, index = -1;

//         for (int i = 0; i < points.length; i++) {
//             if (points[i][0] == x || points[i][1] == y) {
//                 int dist = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
//                 if (dist < minDist) {
//                     minDist = dist;
//                     index = i;
//                 }
//             }
//         }

//         return index;
//     }
// }