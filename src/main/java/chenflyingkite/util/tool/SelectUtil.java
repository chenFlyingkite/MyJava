package chenflyingkite.util.tool;

import chenflyingkite.util.functional.Get_L_L;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SelectUtil {

    public static <T, S> List<T> select(Collection<S> collection, Get_L_L<S, T> projector) {
        return select(collection, projector, null);
    }

    /**
     * Selects target item from collection with condition
     */
    public static <T, S> List<T> select(Collection<S> collection, Get_L_L<S, T> projector, Get_L_L<S, Boolean> condition) {
        if (collection == null || projector == null) return null;

        List<T> li = new ArrayList<>();
        for (S s : collection) {
            if (condition == null || condition.get(s)) {
                li.add(projector.get(s));
            }
        }
        return li;
    }
}
