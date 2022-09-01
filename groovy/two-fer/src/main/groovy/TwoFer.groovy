class TwoFer {

    static String twoFer(String name) {
        if(name == null || name.isEmpty()){
            return println('One for you, one for me.')
        }
        return println('One for ' + name + ', one for me.')
    }
}
