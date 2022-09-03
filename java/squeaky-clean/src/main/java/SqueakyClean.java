class SqueakyClean {
    static String clean(String identifier) {
        if(identifier.contains("-")){

        }
        return identifier.replaceAll(" ", "_")
                .replaceAll("\\p{Cntrl}", "CTRL")
                .replaceAll("[α-ω]", "")
                .replaceAll("[^\\p{L}\\p{P}]", "");
    }
}
