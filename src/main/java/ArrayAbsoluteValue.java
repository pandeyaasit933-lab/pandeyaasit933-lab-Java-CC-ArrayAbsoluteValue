public class ArrayAbsoluteValue {
    public int[] getArrayAbs(int[] nums) {
        if (nums == null) {
            return null;
        }
        
        int[] result = new int[nums.length];
        int i = 0;
        for (int num : nums) {
            result[i++] = num < 0 ? -num : num;
        }
        return result;
    }
}