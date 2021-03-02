import java.util.Queue;
import java.util.ArrayDeque;

public class BFS {
int v;
int[][] graph;
boolean[] visited;
int[] level;

public static void bfs(){
        visited = new boolean[v];
        level = new int[v];
        Queue<Node> Q = new ArrayDeque();
        Q.push(0);

        while(!S.isEmpty()) {
                Node me = S.pop();
                if(!visited(me)) {
                        System.out.println("Visiting Node :" + me);
                        visited[me] = true;
                        for(int i = 0; i < v; i++) {
                                if(!visited[i] && graph[me][i] != 0) {
                                        level[i] = level[me] + 1;
                                        S.push(i);
                                }
                        }
                }
        }
}
}
