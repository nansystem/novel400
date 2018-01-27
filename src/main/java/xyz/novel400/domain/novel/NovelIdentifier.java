package xyz.novel400.domain.novel;

public class NovelIdentifier {
    Integer value = -1;

    String text = "";
    boolean valid = true;

    public NovelIdentifier(String text) {
        this.text = text;
        try {
            this.value = Integer.valueOf(text);
        } catch (Exception e) {
            this.valid = false;
        }
    }

    public boolean isValid() {
        return valid;
    }

    public String text() {
        return text;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    NovelIdentifier(Integer value) {
        this.value = value;
    }

    NovelIdentifier(){}


    public static NovelIdentifier ofEmpty() {
        return new NovelIdentifier();
    }
}
