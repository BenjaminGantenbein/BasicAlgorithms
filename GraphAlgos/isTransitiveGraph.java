	
	//Graph stored in Adjacency Matrix matrix 

	public static boolean isTransitiveRelation() {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (matrix[i][j] && matrix[j][k] && !matrix[i][k]) {
						return false;
					}
				}
			}
		}
		return true;
	}
