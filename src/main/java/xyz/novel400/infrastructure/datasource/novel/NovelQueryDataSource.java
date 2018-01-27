package xyz.novel400.infrastructure.datasource.novel;

import org.springframework.stereotype.Repository;
import xyz.novel400.domain.exception.NotFoundException;
import xyz.novel400.domain.novel.Novel;
import xyz.novel400.domain.novel.NovelIdentifier;
import xyz.novel400.domain.novel.NovelQueryRepository;
import xyz.novel400.domain.novel.Novels;

import java.util.Collections;
import java.util.List;

@Repository
public class NovelQueryDataSource implements NovelQueryRepository {

    NovelQueryMapper novelQueryMapper;

    NovelQueryDataSource(NovelQueryMapper novelQueryMapper) {
        this.novelQueryMapper = novelQueryMapper;
    }

    @Override
    public Novels listAll() {
        List<Novel> list = novelQueryMapper.listAll();
        if(list.isEmpty()) return new Novels(Collections.EMPTY_LIST);

        return new Novels(list);
    }

    @Override
    public Novel findBy(NovelIdentifier novelIdentifier) {
        Novel novel = novelQueryMapper.findBy(novelIdentifier);
        if(novel == null) throw new NotFoundException(String.format("novel not found. novelIdentifier:[%s]", novelIdentifier));
        return novel;
    }
}
