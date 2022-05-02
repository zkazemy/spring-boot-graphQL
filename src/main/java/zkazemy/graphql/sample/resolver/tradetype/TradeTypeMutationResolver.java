package zkazemy.graphql.sample.resolver.tradetype;

import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import zkazemy.graphql.sample.dto.TradeTypeInput;
import zkazemy.graphql.sample.entity.TradeType;
import zkazemy.graphql.sample.services.tradetype.TradeTypeService;

@Component
@AllArgsConstructor
public class TradeTypeMutationResolver implements GraphQLMutationResolver {

    private final TradeTypeService tradeTypeService;

    public TradeType addTradeType(TradeTypeInput tradeTypeInput) {
        return tradeTypeService.add(tradeTypeInput);
    }
}