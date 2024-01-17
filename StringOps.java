public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        //System.out.println(capVowelsLowRest("vowels are fun"));
        //System.out.println(camelCase("    Intro to     coMPUter     sCIEncE     "));
        //int[] arr = allIndexOf("MMMM", 'M');
    }
    private static boolean isVowelLower(char c){
        return (c == 97 || c == 101 || c == 105 || c == 111 || c == 117);
    }

    public static String capVowelsLowRest (String string) {
        String modifiedString = "";
        for(int i=0; i<string.length(); i++){
            char current = string.charAt(i);
            if(isVowelLower(current)){
                modifiedString += (char)(current - 32);
            }
            else if(current >= 65 && current <= 90 && !isVowelLower((char)(current + 32))){
                modifiedString += (char)(current + 32);
            }
            else{
                modifiedString += current;

            }
        }
        return modifiedString;
    }

    private static String wordToCamelCase(String word){
        return "";
    }

    private static char toUpper(char c){
        if (c>= 97 && c<= 122){
            return (char)(c - 32);
        }
        return c;
    }
    private static char toLower(char c) {
        if (c>= 65 && c<= 90){
            return (char)(c + 32);
        }
        return c;
    }

    public static String camelCase (String string) {
        char previous = 'a';
        String modifiedString = "";
        for(int i=0; i< string.length(); i++){
            char current = string.charAt(i);
            if (current == ' '){
                if (modifiedString == ""){ //meaning that the space is in the beginning of the sentence
                    continue;
                }
            }
            else if (modifiedString == ""){
                modifiedString += toLower(current);
            }
            else{
                if(previous == ' ') { //means it's a new word
                    modifiedString += toUpper(current);
                }
                else {
                    modifiedString += toLower(current);
                }

            }
            previous = current;
        }
        return modifiedString;
    }

    private static int numberOfAppearances(String string, char c){
        int counter = 0;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i) == c){
                counter++;
            }
        }
        return counter;
    }

    public static int[] allIndexOf (String string, char chr) {
        int[] arr = new int[numberOfAppearances(string, chr)];
        int previous = -1;
        for(int i=0; i<arr.length; i++){
            arr[i] = string.indexOf(chr, previous + 1);
            previous = arr[i];
        }
        return arr;
    }
}
