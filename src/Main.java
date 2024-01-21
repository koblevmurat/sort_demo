public class Main {
    public static void main(String[] args) {
        int [] A = new int[] {45, 3, 5, 6, 13, 46, 80, 94, 18, 7};
        SortedArray sortedArray = new SortedArray(A.length);
        for (int i = 0; i < A.length; i ++){
            sortedArray.Add(A[i]);
        }
        Integer [] S = sortedArray.getSortedArray();
        for (int i = 0; i < S.length; i++) {
            System.out.printf("%s, ", S[i]);
        }

    }
}