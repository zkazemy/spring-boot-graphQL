package zkazemy.graphql.sample.services.tradetype;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import zkazemy.graphql.sample.dto.TradeTypeInput;
import zkazemy.graphql.sample.entity.TradeType;
import zkazemy.graphql.sample.helper.map.MapTradeType;
import zkazemy.graphql.sample.repository.TradeTypeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class TradeTypeServiceImpl implements TradeTypeService {

    private final TradeTypeRepository tradeTypeRepository;

    private final MapTradeType mapTradeType;

    private static final Integer DEFAULT_SKIP = 0;

    private static final Integer DEFAULT_LIMIT = 4;

    @Override
    public TradeType add(TradeTypeInput tradeTypeInput) {
        TradeType tradeType = mapTradeType.mapInputToTradeType(tradeTypeInput);
        return tradeTypeRepository.save(tradeType);
    }

    @Override
    public TradeType getById(Long id) {
        return tradeTypeRepository.findById(id).get();
    }

    @Override
    public List<TradeType> get(Integer skip, Integer limit) {
        return tradeTypeRepository.get(skip == null ? DEFAULT_SKIP : skip, limit == null ? DEFAULT_LIMIT : limit);
    }
}