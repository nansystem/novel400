package xyz.novel400.infrastructure.datasource.novel;

import org.springframework.stereotype.Repository;
import xyz.novel400.domain.novel.Novel;
import xyz.novel400.domain.novel.NovelIdentifier;
import xyz.novel400.domain.novel.NovelWriteRepository;

@Repository
public class NovelWriteDataSource implements NovelWriteRepository {

    NovelWriteMapper novelWriteMapper;

    NovelWriteDataSource(NovelWriteMapper novelWriteMapper) {
        this.novelWriteMapper = novelWriteMapper;
    }

    @Override
    public NovelIdentifier write(Novel novel) {
        novelWriteMapper.write(novel);
        return novel.identifier();
    }

}
