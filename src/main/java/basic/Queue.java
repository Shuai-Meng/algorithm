package basic;

/**
 * @Author mengshuai
 * @Date 2019/12/1
 */
public class Queue<T> {
    public static final int DEFAULT_CAPACITY = 10;

    private int capacity;
    private int head = 0;
    private int tail = 0;
    private T[] array;

    public Queue(int capacity) {
        this.capacity = capacity + 1;
        array = (T[]) new Object[this.capacity];
    }

    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    public void enqueue(T t) {
        int index = (tail + 1) % capacity;

        if (index == head) {
            //full
            return;
        }

        array[tail] = t;
        tail = index;
    }

    public T dequeue() {
        if (head == tail) {
            //empty
            return null;
        }

        T tmp = array[head];
        head = (head + 1) % capacity;
        return tmp;
    }

    public int getSize() {
        if (tail >= head) {
            return tail - head;
        }

        return tail + capacity - head;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
