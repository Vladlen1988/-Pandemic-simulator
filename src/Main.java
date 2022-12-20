public class Main {

    public static void main(String[] args) {
        int[][] field = new int[5][5];
        int[][] agents = {{1, 4}, {0, 1}, {4, 2}, {4, 3}, {4, 3}, {0, 1}, {0, 2}, {4, 3}};
        int[][] result = pandemic(field, agents);
        print(result);
    }

    public static int[][] pandemic(int[][] field, int[][] agents) {

        for (int[] i : agents) {

            int line = i[0];
            int column = i[1];

            if (field[line][column] == 0) {
                field[line][column] = 1;
            } else {
                field[line][column] *= 2;
            }
        }
        return field;
    }

    public static void print(int[][] result) {
        for (int[] i : result) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
