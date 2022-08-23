class MicroBlog {
    public String truncate(String input) {
        StringBuilder truncatedInput = new StringBuilder();
        input.codePoints().limit(5).forEach(point -> truncatedInput.appendCodePoint(point));
        return truncatedInput.toString();
    }
}