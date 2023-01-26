public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10,10));

//        int[] numbers = {8, -2, 3, 1, 1};
//        System.out.println(sum(numbers, 0, numbers.length, 0, 999));
    }

    // calculate sum of elements in array b/t lower & upper limits
    // num <= largest && num >= smallest -- add to sum
    // check if lower and upper are valid indexes in array
    // if fromWhere < 0 -> lower == 0
    // if toWhere > array.length -> upper == last index of array
    // num = array[i]
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        // storing sum
        int sum = 0;
        // check if lower and upper limit is valid indexes
        // if lower limit is less than 0 == fromWhere = 0
        if (fromWhere < 0) {
            // fromWhere is index 0
            fromWhere = 0;
        }
        // if upper limit is greater than the array size
        // set toWhere as LAST index of array
        if (toWhere > array.length) {
            // LAST index of array
            toWhere = array.length;
        }
        System.out.println("upper limit = " + toWhere);
        if (toWhere == 0) {
            return 0;
        }
        for (int i = fromWhere; i < toWhere; i++) {
            int num = array[i];


            if (num <= largest && num >= smallest) {
                sum += num;
                System.out.println("number added: " + array[i]);
            }
        }
        return sum;
    }
}

