public class SortTheOdd {
    public static void main(String[] args) {
        int[] array = sortArray(new int []{5, 3, 2, 8, 1, 4});
        for(int x = 0; x < array.length; x++){
            System.out.print(array[x] + " ");
        }
    }
    public static int[] sortArray(int[] array) {
        int temp = 0;
        for(int x = 0; x < array.length; x++){
            for(int y = x + 1;y <  array.length; y++){
                if(array[x] > array[y] && array[x] % 2 != 0 && array[y] % 2 != 0){
                    temp = array[x];
                    array[x] = array[y];
                    array[y] = temp;
                }
            }
        }
        return array;
    }
}
