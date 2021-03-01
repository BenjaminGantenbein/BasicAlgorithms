import java.util.Stack;

public class DFS {

int[][] g;
int v;
boolean[] visited;
public DFS(int[][] g, int v){
        this.g = g;
        this.v = v;
        visited = new boolean[v];
}
public void dfs(){
        Stack<Integer> S = new Stack();
        S.add(0);
        while(!S.isEmpty()) {
                int me = S.pop();
                if(!visited[me]) {
                        System.out.println("visiting node: " +me);
                        visited[me] = true;
                        for(int i= 0; i < v; i++) {
                                if(g[me][i] != 0 && !visited[i]) {
                                        S.push(i);
                                }
                        }
                }
        }
}
}
