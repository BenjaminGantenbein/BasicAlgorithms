	public static boolean isAntisymmetricRelation() {

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (matrix[i][j] && matrix[j][i]) {
					return false;
				}
			}
		}
		return true;

	}
