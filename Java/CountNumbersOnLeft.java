public class CountNumbersOnLeft{

	 class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public List<Integer> countSmaller(int[] nums) {

        int n = nums.length;

        Pair[] arr = new Pair[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(nums[i], i);
        }

        int[] ans = new int[n];

        mergeSort(arr, 0, n - 1, ans);

        List<Integer> result = new ArrayList<>();

        for (int x : ans) {
            result.add(x);
        }

        return result;
    }

    private void mergeSort(Pair[] arr, int low, int high, int[] ans) {

        if (low >= high)
            return;

        int mid = low + (high - low) / 2;

        mergeSort(arr, low, mid, ans);
        mergeSort(arr, mid + 1, high, ans);

        merge(arr, low, mid, high, ans);
    }

    private void merge(Pair[] arr, int low, int mid, int high, int[] ans) {

        Pair[] temp = new Pair[high - low + 1];

        int left = low;
        int right = mid + 1;
        int k = 0;

        int rightCount = 0;

        while (left <= mid && right <= high) {

            if (arr[left].value <= arr[right].value) {

                ans[arr[left].index] += rightCount;
                temp[k++] = arr[left++];

            } else {

                rightCount++;
                temp[k++] = arr[right++];
            }
        }

        while (left <= mid) {

            ans[arr[left].index] += rightCount;
            temp[k++] = arr[left++];
        }

        while (right <= high) {

            temp[k++] = arr[right++];
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
    }

}


