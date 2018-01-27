package xyz.novel400.domain.novel;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class NovelTitle {
    @NotEmpty
    @Size(max=5)
    String value;

    public NovelTitle(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    NovelTitle() {}
}
