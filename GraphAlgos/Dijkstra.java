import java.util.PriorityQueue;
import java.util.Queue;


public class Dijkstra {
int[] dist;
int[] preced
int v:

public static int[] dijkstra(int[][] graph, int src){
        dist = new int[v];
        predec = new int[v];
        Queue<Node> Q = new PriorityQueue();


        for(int i=0; i < v; i++) {
                dist[i] = Int.MAX_VALUE;
                predec[i] = -1;
        }
        Q.push(new Node(src, -1));
        dist[src] = 0;
        predec[src] = 0;

        while(!Q.isEmpty()){
          int me = Q.poll().v;
              for(int i=0; i < v; i++){
                if(g[me][i] !=-1 && dist[i] == Integer.MAX_VALUE){
                  dist[i] = g[me][i] + dist[me];
                  predec[i] = me;
                  Q.push(new Node(i, me));
                else if(dist[i] > g[me][i] + dist[me]){
                  dist[i] = g[me][i] + dist[me];
                  predec[i] = me;
                  Q.push(new Node(i, me));
                }
                }
              }
          }
          return dist;
        }
}

class Node implements Comparable<Node>{

  int v;
  int p;
  public Node(int v, int p){
    this.v = v;
    this.p = p;
  }
  @Override
  public int compareTo(Node a){
      if(this.p > a.p){
        return 1;
      }
      else if(this.p == a.p){
        return 0;
      }
      else{
        return -1;
      }
  }
}
}
