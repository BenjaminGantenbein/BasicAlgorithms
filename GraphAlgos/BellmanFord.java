	public static boolean negCycle(int source) {
		
		int dist[] = new int[n];
		for(int i=0; i< n; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		dist[source] =0;
		
		//BELLMAN FORD
		
		for(int i=0; i < n; i++) {
			for(int j = 0; j < graph.get(i).size(); j++) {
				Edge me = graph.get(i).get(j);
				if(dist[i] + me.weight < dist[me.dest]) {
					dist[me.dest] = dist[i] + me.weight;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(dist[i]);
		}
		for(int i=0; i < n; i++) {
			for(int j = 0; j < graph.get(i).size(); j++) {
				Edge me = graph.get(i).get(j);
				if(dist[i] + me.weight < dist[me.dest]) {
					return true;
				}
			}
		}
		
		
		
		return false;
		
	}
static class Edge{
  int dest;
  int weight;
  Edge(int dest, int weight){
    this.dest = dest;
    this.weight = weight;
  }
}
