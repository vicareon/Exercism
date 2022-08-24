class SqueakyClean {
    static String clean(String identifier) {
        return identifier.replaceAll(" ", "_");
                //.replaceFirst("^[^\\x01-\\x1A]+$", "CTRL");
                //.replaceAll("-", "");
    }
}
