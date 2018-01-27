package xyz.novel400.presentation.viewmodel.novel;

import xyz.novel400.domain.novel.Novel;
import xyz.novel400.domain.novel.NovelText;
import xyz.novel400.domain.novel.NovelTitle;

public class NovelWriteForm {
    String title;
    String text;

    public Novel toNovel() {
        NovelTitle novelTitle = new NovelTitle(title);
        NovelText novelText = new NovelText(text);
        return new Novel(novelTitle, novelText);
    }
}
