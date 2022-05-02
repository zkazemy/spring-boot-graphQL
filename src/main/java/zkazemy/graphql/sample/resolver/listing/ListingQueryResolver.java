package zkazemy.graphql.sample.resolver.listing;


import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import zkazemy.graphql.sample.entity.Listing;
import zkazemy.graphql.sample.services.listing.ListingService;

import java.util.List;

@Component
@AllArgsConstructor
public class ListingQueryResolver implements GraphQLQueryResolver {

    private final ListingService listingService;

    public Listing getListingById(Long id) {
        return listingService.getById(id);
    }

    public List<Listing> getListings(Integer skip, Integer limit) {
        return listingService.get(skip, limit);
    }
}