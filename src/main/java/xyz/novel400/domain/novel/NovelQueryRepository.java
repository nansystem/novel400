package xyz.novel400.domain.novel;

public interface NovelQueryRepository {
    Novels listAll();

    Novel findBy(NovelIdentifier novelIdentifier);
}
