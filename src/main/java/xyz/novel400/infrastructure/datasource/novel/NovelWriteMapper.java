package xyz.novel400.infrastructure.datasource.novel;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.novel400.domain.novel.Novel;

@Mapper
public interface NovelWriteMapper {
    void write(@Param("novel") Novel novel);
}
