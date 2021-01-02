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
		return (current < end+1);
	}

	//throws NoSuchElementException

	public int next() {
		/*if (!this.hasNext())
			throw new NoSuchElementExcpetion("No Next Value");
		current++;
		return current-1;*/
		if (!hasNext()) {
            		throw new NoSuchElementException("No Next Value");
    		}
		current++;
    		return current -1;

	}

}
