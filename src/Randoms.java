import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Random;


public class Randoms implements Iterable<Integer> {
    
    protected int min, max;
    protected PrimitiveIterator.OfInt random;

    public Randoms(int min, int max) {
        random = new Random().ints(min, (max + 1)).iterator();
        this.min = min;
        this.max = max;
    }

    public class RandomIterator implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt();
        }
    }

    @Override
    public Iterator<Integer> iterator() {

        return new RandomIterator();
    }
}
