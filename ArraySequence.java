import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence{

  int currentIndex;
  int[] data;

  public ArraySequence(int[] other) {
    data = new int[other.length];
    for (int i = 0; i < other.length; i++) {
      data[i] = other[i];
    }
    currentIndex = 0;
  }

  public ArraySequence(IntegerSequence otherseq) {
    data = new int[otherseq.size()];
    for (int i = 0; i < otherseq.size(); i++) {
      data[i] = otherseq.get(i);
    }
    currentIndex = 0;
  }

  

}
