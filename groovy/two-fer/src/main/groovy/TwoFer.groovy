class TwoFer {

    static String twoFer(String name) {
<<<<<<< Updated upstream
        if(name == null || name.isEmpty()){
            return println('One for you, one for me.')
        }
        return println('One for ' + name + ', one for me.')
    }
}
=======
        if(!name){
            return "One for you, one for me."
        }
        return "One for ${name}, one for me."
    }
}
>>>>>>> Stashed changes
