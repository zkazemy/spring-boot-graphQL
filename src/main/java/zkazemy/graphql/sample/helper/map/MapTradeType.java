package zkazemy.graphql.sample.helper.map;

import org.springframework.stereotype.Component;
import zkazemy.graphql.sample.dto.TradeTypeInput;
import zkazemy.graphql.sample.entity.TradeType;

import java.util.Date;

@Component
public class MapTradeType {

    public TradeType mapInputToTradeType(TradeTypeInput tradeTypeInput) {
        TradeType tradeType = new TradeType();

        tradeType.setName(tradeTypeInput.getName());
        tradeType.setCreatedAt(new Date());

        return tradeType;
    }
}