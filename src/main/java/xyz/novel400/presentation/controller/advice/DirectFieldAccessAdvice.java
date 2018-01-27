package xyz.novel400.presentation.controller.advice;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class DirectFieldAccessAdvice {

    private static final String[] allowFields;
    private static final String[] disallowFields;

    static {
        allowFields = new String[]{
                "*",
        };

        disallowFields = new String[]{
                "protected*",
        };
    }

    @InitBinder
    void init(WebDataBinder binder) {
        binder.initDirectFieldAccess();
        binder.setAllowedFields(allowFields);
        binder.setDisallowedFields(disallowFields);
        binder.registerCustomEditor(Object.class, new StringTrimmerEditor(false));
    }

}
