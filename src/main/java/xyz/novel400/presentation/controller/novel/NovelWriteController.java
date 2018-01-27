package xyz.novel400.presentation.controller.novel;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import xyz.novel400.domain.novel.Novel;
import xyz.novel400.presentation.viewmodel.novel.NovelWriteForm;
import xyz.novel400.service.novel.NovelWriteService;

@Controller
@RequestMapping("/novel/write")
public class NovelWriteController {

    NovelWriteService novelWriteService;

    NovelWriteController(NovelWriteService novelWriteService) {
        this.novelWriteService = novelWriteService;
    }

    @GetMapping
    public String show() {
        return "novel/write";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setAllowedFields("*");
    }

    @ModelAttribute
    NovelWriteForm novelWriteForm() {
        return new NovelWriteForm();
    }

    @ModelAttribute
    Novel novel(@ModelAttribute NovelWriteForm novelWriteForm) {
        return novelWriteForm.toNovel();
    }

    @PostMapping
    public String write(@Validated @ModelAttribute Novel novel
            , BindingResult bindingResult
            , RedirectAttributes redirectAttributes
    ) {
        if (bindingResult.hasErrors()) {
            return "novel/write";
        }

        novelWriteService.write(novel);

        redirectAttributes.addFlashAttribute("message", "小説を投稿しました");
        return "redirect:/novel/write";
    }

}
