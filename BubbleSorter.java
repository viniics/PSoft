public class BubbleSorter {
    public static void main(String[] args) {
        int[] array1 = {99,100,14,2,4,5};
        bubbleSorter(array1);
        for (int i:array1){
            System.out.println(i);
        }
    }
    private static void bubbleSorter(int[] array){
        for (int i = 0;i<array.length;i++){
            for (int j = i + 1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
