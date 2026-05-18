class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        var noOfCars = position.length;
        var completed = new int[noOfCars];
        var fleet = 0;

        while (noOfCars > 0) {
            var currentHourCrossed = false;

            for (int i = 0; i < position.length; i++) {
                position[i] += speed[i];
                if (position[i] >= target && completed[i] == 0) {
                    noOfCars--;
                    completed[i] = 1;
                    currentHourCrossed = true;
                }
            }

            if (currentHourCrossed) {
                fleet++;
            }
        }
        return fleet;
    }
}
