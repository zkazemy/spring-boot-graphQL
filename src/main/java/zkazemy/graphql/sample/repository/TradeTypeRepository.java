package zkazemy.graphql.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import zkazemy.graphql.sample.entity.TradeType;

import java.util.List;
import java.util.Optional;

public interface TradeTypeRepository extends JpaRepository<TradeType, Long> {

    Optional<TradeType> findById(Long id);

    @Query(value = "SELECT * FROM public.trade_type ORDER BY created_at OFFSET ?1*?2 LIMIT ?2", nativeQuery = true)
    List<TradeType> get(Integer skip, Integer take);
}
