public class Main{
    public static int main(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }
        int candidate = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            }
            else if (num == candidate) {
                count++;
            }
            else {
                count--;
            }
        }
        int occurrences = 0;
        for (int num : nums) {
            if (num == candidate) {
                occurrences++;
            }
        }
        if (occurrences > nums.length / 2) {
            return candidate;
        }
        throw new IllegalArgumentException("Мажоритарного элемента нет");
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 3, 4, 2, 1, 2, 2};
        System.out.println(main(arr));
    }
}