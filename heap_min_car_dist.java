import java.util.*;

public class heap_min_car_dist {
    static class point implements Comparable<point> {
        int x;
        int y;
        int distSq;
        int idx;

        public point(int x, int y, int distSq, int idx) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(point p2) {//asending order
            return this.distSq - p2.distSq;
        }
    }

    public static void main(String[] args) {
        int pts[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;
        PriorityQueue<point> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int distSq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new point(pts[i][0], pts[i][1], distSq, i));
        }
        for (int j = 0; j < k; j++) {
            System.out.println("c"+pq.remove().idx);
        }
    }
}
