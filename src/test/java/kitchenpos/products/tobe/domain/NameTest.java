package kitchenpos.products.tobe.domain;


import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NameTest {

    @Test
    @DisplayName("이름이 비어있을 수는 없다.")
    void name_is_not_null() {
       assertThatIllegalArgumentException()
               .isThrownBy(() -> new Name(null));
    }

}
