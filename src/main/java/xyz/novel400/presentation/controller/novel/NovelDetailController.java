package xyz.novel400.presentation.controller.novel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.novel400.domain.exception.NotFoundException;
import xyz.novel400.domain.novel.Novel;
import xyz.novel400.domain.novel.NovelIdentifier;
import xyz.novel400.service.novel.NovelQueryService;

@Controller
@RequestMapping("/novel/{novelIdentifier}")
public class NovelDetailController {

    NovelQueryService novelQueryService;

    NovelDetailController(NovelQueryService novelQueryService) {
        this.novelQueryService = novelQueryService;
    }

    @ModelAttribute
    Novel novel(@PathVariable("novelIdentifier") NovelIdentifier novelIdentifier) {
        if (!novelIdentifier.isValid())
            throw new NotFoundException(String.format("novel not found. novelIdentifier:", novelIdentifier.text()));
        return novelQueryService.findBy(novelIdentifier);
    }

    @GetMapping
    public String detail() {
        return "novel/detail";
    }
}
