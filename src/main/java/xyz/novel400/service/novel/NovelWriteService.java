package xyz.novel400.service.novel;

import org.springframework.stereotype.Service;
import xyz.novel400.domain.novel.Novel;
import xyz.novel400.domain.novel.NovelIdentifier;
import xyz.novel400.domain.novel.NovelWriteRepository;

@Service
public class NovelWriteService {

    NovelWriteRepository novelWriteRepository;
    NovelWriteService(NovelWriteRepository novelWriteRepository) {
        this.novelWriteRepository = novelWriteRepository;
    }

    public NovelIdentifier write(Novel novel) {
        return novelWriteRepository.write(novel);
    }
}
