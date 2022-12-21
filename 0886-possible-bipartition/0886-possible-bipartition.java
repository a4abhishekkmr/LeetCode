class Solution {

    private List<Integer>[] graph;
    private int[] colors;

    public boolean possibleBipartition(int n, int[][] dislikes) {

        //noinspection unchecked
        graph = new List[n + 1];
        for (int i = 1; i <= n; ++i) graph[i] = new ArrayList<>();

        for (int[] dislike : dislikes) {
            graph[dislike[0]].add(dislike[1]);
            graph[dislike[1]].add(dislike[0]);
        }

        colors = new int[n + 1]; // 0=unvisited/no_color, 1=blue, -1=red
        for (int i = 1; i <= n; ++i) {
            if (colors[i] == 0 && canNotBiPartition(i, 1)) return false;
        }

        return true;
    }

    private boolean canNotBiPartition(int node, int color) {
        colors[node] = color;
        for (int neighbor : graph[node]) {
            if (colors[neighbor] == 0) {
                if (canNotBiPartition(neighbor, -color)) return true;
            } else if (colors[neighbor] == color) {
                return true;
            }
        }
        return false;
    }
}