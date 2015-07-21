import java.util.Date;

/**
 * @author Brian Gordon
 */
public class NaiveDateRange {
	public final Date beginning;
	public final Date end;

	public NaiveDateRange(Date beginning, Date end) {
		if(beginning.compareTo(end) > 0) {
			throw new IllegalArgumentException("The start date must not be after the end date.");
		}

		this.beginning = beginning;
		this.end = end;
	}
}
