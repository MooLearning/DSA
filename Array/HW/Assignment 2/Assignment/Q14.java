public class Q14 {

    static int[][] energy(int[][] mat1, String[][] mat2) {

        int rows = mat1.length;
        int cols = mat1[0].length;

        int[][] res = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                int total = 0;
                int x = i;
                int y = j;

                // Direction is taken ONLY from starting cell
                String dir = mat2[i][j];

                int dx = 0, dy = 0;

                switch (dir) {
                    case "N":
                        dx = -1;
                        dy = 0;
                        break;
                    case "S":
                        dx = 1;
                        dy = 0;
                        break;
                    case "E":
                        dx = 0;
                        dy = 1;
                        break;
                    case "W":
                        dx = 0;
                        dy = -1;
                        break;
                    case "NE":
                        dx = -1;
                        dy = 1;
                        break;
                    case "NW":
                        dx = -1;
                        dy = -1;
                        break;
                    case "SE":
                        dx = 1;
                        dy = 1;
                        break;
                    case "SW":
                        dx = 1;
                        dy = -1;
                        break;
                }

                while (x >= 0 && x < rows && y >= 0 && y < cols) {
                    total += mat1[x][y];
                    x += dx;
                    y += dy;
                }

                res[i][j] = total;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[][] energy = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        String[][] directions = {
                {"E", "S", "SW"},
                {"N", "SE", "W"},
                {"NE", "E", "N"}
        };

        int[][] result = energy(energy, directions);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}