public class ls11 {
    public static void main(String[] args) {

        int[] nums ={2, 3, 1, 5, 10, 0, 42};
        int temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < nums.length - 1; i++){
                if (nums[i] > nums[i+1]){
                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    sorted = false;
                }
            }
        }
        for (int i : nums){
            System.out.println(i);
        }
        System.out.println("Длина массива: "+ nums.length);

    }
}
