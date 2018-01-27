package xyz.novel400.domain.novel;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class NovelText {
    @NotEmpty
    @Size(max=400)
    String value;

    public NovelText(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    NovelText() {}
}
