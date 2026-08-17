class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long min = time[0];
        for (int x : time) {
            min = Math.min(min, x);
        }

        long l = 1;
        long h = min * totalTrips;
        long ans = h;

        while (l <= h) {
            long mid = l + (h - l) / 2;

            if (can(time, totalTrips, mid)) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    public boolean can(int[] time, int totalTrips, long mid) {
        long complete = 0;
        for (int t : time) {
            complete += mid / t;
            if (complete >= totalTrips) {
                return true;
            }
        }
        return complete >= totalTrips;
    }
}