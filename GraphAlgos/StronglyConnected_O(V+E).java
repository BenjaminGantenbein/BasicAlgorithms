	public static boolean stronglyConnected(ArrayList<ArrayList<Integer>> graph) {

		// CHECKS IF GRAPH IS STRONGLY CONNECTED IN O(V + E)

		boolean[] visited = new boolean[n];

		DFS(0, visited, graph);

		for (int i = 1; i < n; i++) {
			if (!visited[i]) {
				return false;
			}
		}

		ArrayList<ArrayList<Integer>> reversed = ReverseEdges(graph);

		for (int i = 0; i < n; i++) {
			visited[i] = false;
		}

		DFS(0, visited, reversed);

		for (int i = 1; i < n; i++) {
			if (!visited[i]) {
				return false;
			}
		}

		return true;

	}

	public static ArrayList<ArrayList<Integer>> ReverseEdges(ArrayList<ArrayList<Integer>> graph) {
		ArrayList<ArrayList<Integer>> reverse = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n; i++) {
			reverse.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < graph.get(i).size(); j++) {
				int source = i;
				int dest = j;

				reverse.get(j).add(i);
				graph.get(i).remove(j);
			}
		}
		return reverse;

	}

	public static void DFS(int source, boolean[] visited, ArrayList<ArrayList<Integer>> graph) {

		Stack<Integer> s = new Stack();

		s.push(source);

		while (!s.isEmpty()) {
			int me = s.pop();

			for (int i = 0; i < graph.get(me).size(); i++) {
				int child = graph.get(me).get(i);
				if (!visited[child]) {
					visited[child] = true;
					s.push(child);
				}
			}
		}
	}
