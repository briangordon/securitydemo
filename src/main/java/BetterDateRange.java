import java.util.Date;

/**
 * @author Brian Gordon
 */
public class BetterDateRange {
	public final Date beginning;
	public final Date end;

	public BetterDateRange(Date beginning, Date end) {
		if(beginning.compareTo(end) > 0) {
			throw new IllegalArgumentException("The start date must not be after the end date.");
		}

		this.beginning = new Date(beginning.getTime());
		this.end = new Date(end.getTime());
	}
}
