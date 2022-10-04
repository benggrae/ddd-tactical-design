package kitchenpos.products.tobe.domain;

import java.math.BigDecimal;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "product")
@Entity
public class Product {

    @Column(name = "id", columnDefinition = "binary(16)")
    @Id
    private UUID id;

    @Embedded
    @Column(name = "name", nullable = false)
    private Name displayedName;

    @Column(name = "price", nullable = false)
    private Price price;

    protected Product() {

    }

    public Product(String displayedName) {
        this.displayedName = new Name(displayedName);
        //this.displayedName =
    }

    public UUID getId() {
        return id;
    }

    public Name getDisplayedName() {
        return displayedName;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
