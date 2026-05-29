public class ls9 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1};
        int nums2[] = {1, 1, 1, 1};

        int[] nums3 = new int [4];

        for (int i = 0; i < 4; i++){
            nums3[i] = i;
        }

        nums3[2] = 100;

        for (int e : nums3) {
            System.out.println(e);
        }

        for (int i = 0; i < 4; i++){
            System.out.println("Элемент [" + i + "] " + nums3[i]);
        }

        int table2[][] = new int[3][4];
        int table[][] = new int[3][];
        table[0] = new int[4];
        table[1] = new int[4];
        table[2] = new int[5];


    }
}

