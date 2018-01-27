package xyz.novel400.domain.novel;

public class Novel {
    NovelIdentifier novelIdentifier;
    NovelTitle novelTitle;
    NovelText novelText;

    Novel() {}

    public NovelTitle title() {
        return novelTitle;
    }

    public NovelText text() {
        return novelText;
    }
}
