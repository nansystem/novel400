package xyz.novel400.service.novel;

import org.springframework.stereotype.Service;
import xyz.novel400.domain.novel.Novel;
import xyz.novel400.domain.novel.NovelIdentifier;
import xyz.novel400.domain.novel.NovelQueryRepository;
import xyz.novel400.domain.novel.Novels;

@Service
public class NovelQueryService {

    NovelQueryRepository novelQueryRepository;

    NovelQueryService(NovelQueryRepository novelQueryRepository) {
        this.novelQueryRepository = novelQueryRepository;
    }

    public Novels listAll() {
        return novelQueryRepository.listAll();
    }

    public Novel findBy(NovelIdentifier novelIdentifier) {
        return novelQueryRepository.findBy(novelIdentifier);
    }
}
