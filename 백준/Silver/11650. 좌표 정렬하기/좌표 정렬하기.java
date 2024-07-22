import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Point implements Comparable<Point> {
    int x, y;
    
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point other) {
        if (this.x != other.x) {
            return this.x - other.x;
        } else {
            return this.y - other.y;
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Point> points = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            points.add(new Point(x, y));
        }
        
        Collections.sort(points);
        
        StringBuilder sb = new StringBuilder();
        for (Point p : points) {
            sb.append(p.x).append(" ").append(p.y).append("\n");
        }
        
        System.out.print(sb.toString());
    }
}
