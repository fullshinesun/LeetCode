package problem.challenge.april2021;

public class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        obstacleGrid[0][0] = 1 - obstacleGrid[0][0];
        for (int i = 1; i < rows; i++) {
            if (obstacleGrid[i][0] == 0 && obstacleGrid[i - 1][0] > 0) {
                obstacleGrid[i][0] = obstacleGrid[i - 1][0];
            } else {
                obstacleGrid[i][0] = 0;
            }
        }

        for (int j = 1; j < cols; j++) {
            if (obstacleGrid[0][j] == 0 && obstacleGrid[0][j - 1] > 0) {
                obstacleGrid[0][j] = obstacleGrid[0][j - 1];
            } else {
                obstacleGrid[0][j] = 0;
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0;
                } else {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                }
            }
        }
        return obstacleGrid[rows - 1][cols - 1];
    }
}
