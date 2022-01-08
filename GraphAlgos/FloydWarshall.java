		
public static int FloydWarshall(){

int[][] alltoall = new int[n][n];

	

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				alltoall[i][j] = matrix[i][j];
			}
		}

		// Floyd Warshall

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (alltoall[i][k] != 0 && alltoall[k][j] != 0) {
						if (alltoall[i][j] == 0) {
							alltoall[i][j] = alltoall[i][k] + alltoall[k][j];
						} else {
							alltoall[i][j] = Math.min(alltoall[i][j], alltoall[i][k] + alltoall[k][j]);
						}
					}
				}

			}
		}
}
