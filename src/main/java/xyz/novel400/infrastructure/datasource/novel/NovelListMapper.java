package xyz.novel400.infrastructure.datasource.novel;

import org.apache.ibatis.annotations.Mapper;
import xyz.novel400.domain.novel.Novel;

import java.util.List;

@Mapper
public interface NovelListMapper {

    List<Novel> listAll();
}
