package xyz.novel400.domain.novel;

import java.util.List;

public class Novels {
    List<Novel> list;

    public Novels(List<Novel> list) {
        this.list = list;
    }

    public List<Novel> list() {
        return list;
    }
}
