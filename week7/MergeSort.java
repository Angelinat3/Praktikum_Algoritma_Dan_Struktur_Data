public class MergeSort {

    public void MergeSort(int[] data) {
    }

        private void merge(int data [], int left, int middle, int right) {
            int[] temp = new int[data.length];
            for (int i = left; i <= right; i++) {
                temp[i] = data[i];
            }
            int a = left;
            int b = middle + 1;
            int c = left;

            while (a <= middle && b <= right) {
                if (temp[a] < temp[b]) {
                    data[c] = temp[a];
                    a++;
                } else {
                    data[c] = temp[b];
                    b++;
                }
                c++;
            }
            int s = middle - a;
            for (int i = 0; i < s; i++) {
                data[c + i] = temp[a + i];
            }
        }
        private void sort(int data[], int left, int right) {
            if (left < right) {
                int mid = (left + right) / 2;
                sort(data, left, mid);
                sort(data, mid + 1, right);
                merge(data, left, mid, right);
            }
        }
}