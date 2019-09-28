package basic.util;

import basic.tree.TreeNode;

/**
 * @Author mengshuai
 * @Date 2019/8/6
 */
public interface CallBack<E> {
    Object call(E e);
}
