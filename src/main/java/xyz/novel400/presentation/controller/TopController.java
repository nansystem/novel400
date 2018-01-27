package xyz.novel400.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.novel400.domain.novel.Novels;
import xyz.novel400.service.novel.NovelListService;

@Controller
@RequestMapping("/")
public class TopController {

    NovelListService novelListService;

    TopController(NovelListService novelListService) {
        this.novelListService = novelListService;
    }

    @ModelAttribute
    Novels novels() {
        return novelListService.listAll();
    }

    @GetMapping
    public String top() {
        return "top/top";
    }
}
