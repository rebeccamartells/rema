/**
 * * obs denna klass kan behövas tas bort helt
 */
public class Bid
{
    // The person making the bid.
    private final User bidder;
    // The value of the bid. This could be a large number so
    // the long type has been used.
    private final long value;

    /**
     * Create a bid.
     * @param bidder Who is bidding for the lot.
     * @param value The value of the bid.
     */
    public Bid(User bidder, long value)
    {
        this.bidder = bidder;
        this.value = value;
    }

    /**
     * @return The bidder.
     */
    public User getBidder()
    {
        return bidder;
    }

    /**
     * @return The value of the bid.
     */
    public long getValue()
    {
        return value;
    }


}