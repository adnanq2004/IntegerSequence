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
    if (!hasNext()) {
	throw new NoSuchElementException("No Next Value");
    }
    int val = currentIndex;
    currentIndex++;
    return val;
  }

  public boolean hasNext() {
    return (currentIndex <= data.length);
  }

  public ArraySequence(IntegerSequence otherseq) {
    data = new int[0];
    for (int i = 0; i < otherseq.length(); i++) {
      int[] a = new int[data.length + 1];
      for (int j = 0; j < data.length; j++) {
	a[j] = data[j];
      }
      data = new int[a.length];
      for (int j = 0; j < a.length; j++) {
	data[j] = a[j];
      }
      data[i] = otherseq.next();
    }
    currentIndex = 0;
  }



}
