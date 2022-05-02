package zkazemy.graphql.sample.resolver.tradetype;


import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import zkazemy.graphql.sample.entity.TradeType;
import zkazemy.graphql.sample.services.tradetype.TradeTypeService;

import java.util.List;

@Component
@AllArgsConstructor
public class TradeTypeQueryResolver implements GraphQLQueryResolver {

    private final TradeTypeService tradeTypeService;

    public TradeType getTradeTypeById(Long id) {
        return tradeTypeService.getById(id);
    }

    public List<TradeType> getTradeTypes(Integer skip, Integer limit) {
        return tradeTypeService.get(skip, limit);
    }
}