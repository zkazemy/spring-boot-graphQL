package zkazemy.graphql.sample.dto;

import lombok.Getter;
import lombok.Setter;
import zkazemy.graphql.sample.entity.Currency;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Setter
@Getter
public class ListingInput {

    private String title;

    private String description;

    private Float price;

    @Enumerated(EnumType.STRING)
    @Column(length = 5)
    private Currency currency;

    private Long tradeTypeId;
}