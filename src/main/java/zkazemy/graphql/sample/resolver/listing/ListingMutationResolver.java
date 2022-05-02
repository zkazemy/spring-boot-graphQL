package zkazemy.graphql.sample.resolver.listing;

import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.schema.DataFetchingEnvironment;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import zkazemy.graphql.sample.dto.ListingInput;
import zkazemy.graphql.sample.entity.Listing;
import zkazemy.graphql.sample.services.listing.ListingService;

@Component
@AllArgsConstructor
public class ListingMutationResolver implements GraphQLMutationResolver {

    private final ListingService listingService;

    public Listing addListing(ListingInput listingInput, DataFetchingEnvironment e) {
        return listingService.add(listingInput);
    }
}
