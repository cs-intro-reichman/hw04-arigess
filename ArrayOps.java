public class ArrayOps {
    public static void main(String[] args) {
        //System.out.println(findMissingInt(new int[] {0,1,2,5,4,6}));
        //System.out.println(containsTheSameElements(new int[] {2,2,3,7,4,3,2}, new int[] {8,2,7,7,3}));
        System.out.println(isSorted(new int[] {5000,1,1,0,2}));
        System.out.println(secondMaxValue(new int[]{6,9,4,7,3,4}));

    }
    private static boolean isExist(int [] array, int n){
        for (int i=0; i< array.length;i++){
            if (array[i] == n){
                return true;
            }
        }
        return false;
    }

    public static int findMissingInt (int [] array) {
        for (int i=0; i<array.length; i++){
            if(!isExist(array, i)){
                return i;
            }
        }
        return array.length; //if no number was returned yet, then it's the last one
    }

    public static int secondMaxValue(int [] array) {
        //find max value
        int maxValue = Integer.MIN_VALUE;
        int secondMaxValue = Integer.MIN_VALUE;
        for(int i=0;i<array.length; i++){
            if (array[i] >= maxValue){
                secondMaxValue = maxValue;
                maxValue = array[i];
            }
            else if(array[i] >=secondMaxValue){
                secondMaxValue = array[i];
            }
        }
        return secondMaxValue;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        for(int i=0;i<array1.length;i++){
            if(!isExist(array2, array1[i])){
                return false;
            }
        }
        for(int i=0;i<array2.length;i++){
            if(!isExist(array1, array2[i])){
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        boolean sortedInc = true, sortedDec = true;
        //checks if sorted inc
        for(int i=0;i<array.length - 1;i++){
            if (array[i] > array[i+1]){
                sortedInc = false;
            }
        }
        //checks if sorted dec
        for(int i=0;i<array.length - 1;i++){
            if (array[i] < array[i+1]){
                sortedDec = false;
            }
        }
        return sortedInc || sortedDec;
    }

}
