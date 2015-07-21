import java.util.Date;

/**
 * @author Brian Gordon
 */
public class BestDateRange {
	public final Date beginning;
	public final Date end;

	public BestDateRange(Date beginning, Date end) {
		this.beginning = new Date(beginning.getTime());
		this.end = new Date(end.getTime());

		if(beginning.compareTo(end) > 0) {
			throw new IllegalArgumentException("The start date must not be after the end date.");
		}
	}
}
