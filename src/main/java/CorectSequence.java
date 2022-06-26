public class CorectSequence {
    public static void main(String[] args) {
        int[] array = {2, 2, 2, 2, 2, 3, 3, 4, 5, 5, 5, 5, 5, 6};
        int[] correctArray = {0, 0, 0, 0, 0};
        int index = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                correctArray[index] = array[i];
                index++;
            }
        }
        if(array[array.length - 1] != correctArray[index])
            correctArray[index] = array[array.length - 1];
        for (int i = 0; i < correctArray.length; i++) {
            System.out.println(correctArray[i]);
        }
    }
}
