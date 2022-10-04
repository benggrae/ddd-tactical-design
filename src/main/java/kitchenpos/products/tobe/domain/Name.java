package kitchenpos.products.tobe.domain;

import java.util.Objects;
import javax.persistence.Embeddable;

@Embeddable
public class Name {
    private String name;

    protected Name() {}

    public Name(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (Objects.isNull(name)) {
            throw new IllegalArgumentException("이름은 비어있을 수 없습니다.");
        }

    }

    public String getName() {
        return name;
    }
}
