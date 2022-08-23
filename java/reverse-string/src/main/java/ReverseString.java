class ReverseString {

    String reverse(String inputString) {
        String[] inputStringArray = inputString.split("");
        String reversedInputString = "";
        for(int i = inputStringArray.length - 1; i >= 0; i--){
            reversedInputString += inputStringArray[i];
        }
        return reversedInputString;
    }
}