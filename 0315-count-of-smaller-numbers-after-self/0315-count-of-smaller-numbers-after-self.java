class Solution {
    int[] cnt, idx;

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        cnt = new int[n];
        idx = new int[n];

        for (int i = 0; i < n; i++) idx[i] = i;
        sort(nums, 0, n - 1);

        List<Integer> res = new ArrayList<>();
        for (int c : cnt) res.add(c);
        return res;
    }

    void sort(int[] a, int l, int r) {
        if (l >= r) return;
        int m = (l + r) / 2;
        sort(a, l, m);
        sort(a, m + 1, r);
        merge(a, l, m, r);
    }

    void merge(int[] a, int l, int m, int r) {
        int[] tmp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r) {
            if (a[idx[i]] <= a[idx[j]]) {
                cnt[idx[i]] += j - m - 1;
                tmp[k++] = idx[i++];
            } else {
                tmp[k++] = idx[j++];
            }
        }

        while (i <= m) {
            cnt[idx[i]] += j - m - 1;
            tmp[k++] = idx[i++];
        }

        while (j <= r) tmp[k++] = idx[j++];

        for (i = 0; i < tmp.length; i++) idx[l + i] = tmp[i];
    }
}
