/*
A signal reader stores encrypted characters in a square 2D array. The reader must collect characters diagonally from top-right to bottom-left direction. It starts from every cell in the first row, then continues from the remaining cells of the last column. Write a method that returns the collected characters as a string.
Sample Input:
grid = [
  ['A', 'B', 'C', 'D'],
  ['E', 'F', 'G', 'H'],
  ['I', 'J', 'K', 'L'],
  ['M', 'N', 'O', 'P']
]





Sample Output:
AEBIFMJCGNKDHLOP


Hint: Diagonal Groups

A
B E
C F I
D G J M
H K N
L O
P


*/

public class Q12 {
  static String pattern_sequence(char matrix[][]){
    int n = matrix.length;
    StringBuilder result = new StringBuilder();

    // Collect from the first row
    for(int j=0; j<n; j++){
      int x = 0;
      int y = j;

      while(x < n && y >= 0){
        result.append(matrix[x][y]);
        x++;
        y--;
      }
    }

    // Collect from the last column (excluding the first row)
    for(int i=1; i<n; i++){
      int x = i;
      int y = n - 1;

      while(x < n && y >= 0){
        result.append(matrix[x][y]);
        x++;
        y--;
      }
    }

    return result.toString();
  }

  public static void main(String[] args) {
    char[][] grid = {
        {'A', 'B', 'C', 'D'},
        {'E', 'F', 'G', 'H'},
        {'I', 'J', 'K', 'L'},
        {'M', 'N', 'O', 'P'}
    };

    String result = pattern_sequence(grid);
    System.out.println(result);
  }
}