package zkazemy.graphql.sample.helper.map;

import org.springframework.stereotype.Component;
import zkazemy.graphql.sample.dto.ListingInput;
import zkazemy.graphql.sample.entity.Listing;
import zkazemy.graphql.sample.entity.TradeType;

import java.util.Date;

@Component
public class MapListing {

    public Listing mapInputToListing(ListingInput listingInput, TradeType tradeType) {
        Listing listing = new Listing();

        listing.setTitle(listingInput.getTitle());
        listing.setDescription(listingInput.getDescription());
        listing.setPrice(listingInput.getPrice());
        listing.setCurrency(listingInput.getCurrency());
        listing.setCreatedAt(new Date());
        listing.setTradeType(tradeType);

        return listing;
    }
}