package xyz.novel400.infrastructure.datasource.novel;

import org.springframework.stereotype.Repository;
import xyz.novel400.domain.novel.Novel;
import xyz.novel400.domain.novel.NovelListRepository;
import xyz.novel400.domain.novel.Novels;

import java.util.Collections;
import java.util.List;

@Repository
public class NovelListDataSource implements NovelListRepository {

    NovelListMapper novelListMapper;

    NovelListDataSource(NovelListMapper novelListMapper) {
        this.novelListMapper = novelListMapper;
    }

    @Override
    public Novels listAll() {
        List<Novel> list = novelListMapper.listAll();
        if(list.isEmpty()) return new Novels(Collections.EMPTY_LIST);

        return new Novels(list);
    }
}
