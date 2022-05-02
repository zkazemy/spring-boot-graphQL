package zkazemy.graphql.sample.services.tradetype;

import zkazemy.graphql.sample.dto.TradeTypeInput;
import zkazemy.graphql.sample.entity.TradeType;

import java.util.List;

public interface TradeTypeService {

    TradeType add(TradeTypeInput tradeTypeInput);

    TradeType getById(Long id);

    List<TradeType> get(Integer skip, Integer limit);
}