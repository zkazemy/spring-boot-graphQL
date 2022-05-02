package zkazemy.graphql.sample.services.listing;


import zkazemy.graphql.sample.dto.ListingInput;
import zkazemy.graphql.sample.entity.Listing;

import java.util.List;

public interface ListingService {

    Listing add(ListingInput listingInput);

    Listing getById(Long id);

    List<Listing> get(Integer skip, Integer limit);
}
