package basic.util;

/**
 * @Author mengshuai
 * @Date 2019/8/6
 */
public interface CallBack<T> {
    void call(T t, Object... object);
}
