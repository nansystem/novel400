package xyz.novel400.infrastructure.datasource.novel;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.novel400.domain.novel.Novel;
import xyz.novel400.domain.novel.NovelIdentifier;

import java.util.List;

@Mapper
public interface NovelQueryMapper {

    List<Novel> listAll();

    Novel findBy(@Param("novelIdentifier") NovelIdentifier novelIdentifier);
}
