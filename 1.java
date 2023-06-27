public class MoveZeros {
    public static void moveZeros(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int insertPos = 0;

        // Move non-zero elements to the front of the array
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        // Fill the remaining elements with zeros
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros(nums);

        System.out.print("Modified array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
