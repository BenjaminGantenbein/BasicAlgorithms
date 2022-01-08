	public static boolean containsCycle() {

		// 0 for White (not yet encountered) 
		// 1 for Grey (encountered, call not finished)
		//-1 for Black (finished)
		int[] colours = new int[n];

		Stack<Integer> s = new Stack();
		s.push(0);

		while (!s.isEmpty()) {
			int me = s.peek();

			if (colours[me] != 1) {
				colours[me] = 1;

				for (int i = 0; i < graph.get(me).size(); i++) {
					int child = graph.get(me).get(i);

					if (colours[child] == 0) {
						s.push(child);
					} else if (colours[child] == 1) {
						return true;
					}

				}
			} else if (colours[me] == 1) {
				colours[me] = -1;
				s.pop();

			}

		}

		return false;

	}
