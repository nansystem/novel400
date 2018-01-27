package xyz.novel400.service.novel;

import org.springframework.stereotype.Service;
import xyz.novel400.domain.novel.NovelListRepository;
import xyz.novel400.domain.novel.Novels;

@Service
public class NovelListService {

    NovelListRepository novelListRepository;

    NovelListService(NovelListRepository novelListRepository) {
        this.novelListRepository = novelListRepository;
    }

    public Novels listAll() {
        return novelListRepository.listAll();
    }
}
