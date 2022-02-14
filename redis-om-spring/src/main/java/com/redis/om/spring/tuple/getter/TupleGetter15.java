
package com.redis.om.spring.tuple.getter;

/**
 * Specialization of {@link TupleGetter} that always returns the 15th element.
 * <p>
 * Generated by com.speedment.sources.pattern.tuple.TupleGetterPattern
 *
 * @param <T>   the type of the tuple to get a value from
 * @param <T15> the type of the element to return
 *

 *
 */
@FunctionalInterface
public interface TupleGetter15<T, T15> extends TupleGetter<T, T15> {

    @Override
    default int index() {
        return 15;
    }
}