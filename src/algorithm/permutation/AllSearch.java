package algorithm.permutation;

/**
 * 경우의수
 */
public class AllSearch {

    public int solution(int[] relation) {
        int answer = 0;

        boolean[] check = new boolean[relation.length];
        int[] output = new int[3];

        allSearch(relation, output, check, 0, relation.length);

        return answer;
    }


    private void allSearch(int[] relation, int[] output, boolean[] check, int start, int n) {
        print(output, start);


        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                check[i] = true;
                output[start] = relation[i];
                allSearch(relation, output, check, start + 1, n);
                output[start] = 0;
                check[i] = false;
            }
        }
    }


    public static void print(int[] relation, int start) {
        for (int i = 0; i < relation.length; i++) {
            if (relation[i] != 0)
                System.out.print(relation[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AllSearch allSearch = new AllSearch();
        int[] arr = {1, 2, 3};
        allSearch.solution(arr);
    }

}
