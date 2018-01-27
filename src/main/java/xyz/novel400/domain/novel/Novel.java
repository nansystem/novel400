package xyz.novel400.domain.novel;

import javax.validation.Valid;

public class Novel {
    NovelIdentifier novelIdentifier = NovelIdentifier.ofEmpty();

    @Valid
    NovelTitle novelTitle;

    @Valid
    NovelText novelText;

    public Novel() {}

    public Novel(NovelTitle novelTitle, NovelText novelText) {
        this.novelTitle = novelTitle;
        this.novelText = novelText;
    }

    public NovelIdentifier identifier() {
        return novelIdentifier;
    }

    public NovelTitle title() {
        return novelTitle;
    }

    public NovelText text() {
        return novelText;
    }

}
