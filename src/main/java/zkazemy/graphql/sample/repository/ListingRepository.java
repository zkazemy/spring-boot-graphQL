package zkazemy.graphql.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import zkazemy.graphql.sample.entity.Listing;

import java.util.List;
import java.util.Optional;

public interface ListingRepository extends JpaRepository<Listing, Long> {

    Optional<Listing> findById(Long id);

    @Query(value = "SELECT * FROM public.listing ORDER BY created_at OFFSET ?1*?2 LIMIT ?2", nativeQuery = true)
    List<Listing> get(Integer skip, Integer take);
}
