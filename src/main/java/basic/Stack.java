package basic;

/**
 * @Author mengshuai
 * @Date 2019/8/4
 */
public class Stack<T> {
    public static final int DEFAULT_VOL = 100;
    private int vol;
    private T[] stack;
    private int index = -1;

    public Stack(int vol) {
        int a = 100;
        this.vol = vol;
        stack = (T[]) new Object[vol];
    }

    public Stack() {
        this(DEFAULT_VOL);
    }

    public void push(T t) {
        if (index == vol - 1) {
            expand();
        }
        index++;
        stack[index] = t;
    }

    public T pop() throws StackOverflowError {
        if (index < 0) {
            throw new StackOverflowError("stack overflow");
        }
        return stack[index--];
    }

    public T top() throws StackOverflowError {
        if (index < 0) {
            throw new StackOverflowError("stack overflow");
        }
        return stack[index];
    }

    public int getSize() {
        return index + 1;
    }

    private void expand() {
        T[] newStack = (T[]) new Object[vol * 2];
        for (int i = 0; i < vol; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }
}
