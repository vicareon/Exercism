class RaindropConverter {
    private String raindropSounds = "";

    String convert(int number) {
        if(number % 3 == 0) {
            raindropSounds += "Pling";
        }
        if(number % 5 == 0) {
            raindropSounds += "Plang";
        }
        if (number % 7 == 0){
            raindropSounds += "Plong";
        }
        if(raindropSounds.isEmpty()){
            return String.valueOf(number);
        }
        return raindropSounds;
    }
}