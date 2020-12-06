import java.util.NoSuchElementException;

public class Range implements IntegerSequence {

	private int start, end, current;

	public Range(int start, int end) {
		this.start = start; 
		this.end = end;
		current = start;
	}

	public void reset() {
		current = start;
	}

	public int length() {
		return (end - start) +1;
	}

	public boolean hasNext() {
		return (current <= end);
	}

	//throws NoSuchElementException

	public int next() {
		int val = 0;
		if (hasNext()) {
			val = current;
			current ++;
		}
		return val;
	}

}
