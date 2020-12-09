import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence{

  private int currentIndex;
  private int[] data;

  public ArraySequence(int[] other) {
    data = new int[other.length];
    for (int i = 0; i < other.length; i++) {
      data[i] = other[i];
    }
    currentIndex = 0;
  }

  public void reset() {
    currentIndex = 0;
  }

  public int length() {
    return data.length;
  }

  public int next() {
    if (!hasNext())
	    throw new NoSuchElementException("No Next Value");
    currentIndex++;
    return currentIndex -1;

/*if (!hasNext()) throw new NoSuchElementException("No Next Value");
    int val = currentIndex;
    currentIndex++;
    return val;*/
  }

  public boolean hasNext() {
    return (currentIndex < data.length);
  }

  public ArraySequence(IntegerSequence otherseq) {
    data = new int[otherseq.length()];
    otherseq.reset();
    for (int i = 0; i < otherseq.length(); i++) {
      data[i] = otherseq.next();
    }
    otherseq.reset();
    currentIndex = 0;
  }



}
