package xyz.novel400.domain.novel;

public class Novel {
    NovelIdentifier novelIdentifier;
    NovelText novelText;

    Novel() {}

    public NovelText text() {
        return novelText;
    }
}
