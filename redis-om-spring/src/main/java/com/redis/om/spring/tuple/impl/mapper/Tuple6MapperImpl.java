
package com.redis.om.spring.tuple.impl.mapper;

import java.util.function.Function;

import com.redis.om.spring.tuple.AbstractTupleMapper;
import com.redis.om.spring.tuple.Hextuple;
import com.redis.om.spring.tuple.TupleMapper;
import com.redis.om.spring.tuple.Tuples;

/**
 * An implementation class of a {@link TupleMapper } of degree 6
 * <p>
 * Generated by com.speedment.sources.pattern.tuple.TupleMapperImplPattern
 *
 * @param <T>  Type of the original object for the mapper to use when creating a
 *             {@code Tuple }
 * @param <T0> type of element 0
 * @param <T1> type of element 1
 * @param <T2> type of element 2
 * @param <T3> type of element 3
 * @param <T4> type of element 4
 * @param <T5> type of element 5
 */
public final class Tuple6MapperImpl<T, T0, T1, T2, T3, T4, T5>
extends AbstractTupleMapper<T, Hextuple<T0, T1, T2, T3, T4, T5>>
implements TupleMapper<T, Hextuple<T0, T1, T2, T3, T4, T5>> {

    /**
     * Constructs a {@link TupleMapper } that can create {@link Hextuple }.
     *
     * @param m0 mapper to apply for element 0
     * @param m1 mapper to apply for element 1
     * @param m2 mapper to apply for element 2
     * @param m3 mapper to apply for element 3
     * @param m4 mapper to apply for element 4
     * @param m5 mapper to apply for element 5
     */
    public Tuple6MapperImpl(
            Function<T, T0> m0,
            Function<T, T1> m1,
            Function<T, T2> m2,
            Function<T, T3> m3,
            Function<T, T4> m4,
            Function<T, T5> m5) {
        super(6);
        set(0, m0);
        set(1, m1);
        set(2, m2);
        set(3, m3);
        set(4, m4);
        set(5, m5);
    }

    @Override
    public Hextuple<T0, T1, T2, T3, T4, T5> apply(T t) {
        return Tuples.of(
            get0().apply(t),
            get1().apply(t),
            get2().apply(t),
            get3().apply(t),
            get4().apply(t),
            get5().apply(t)
        );
    }

    public Function<T, T0> get0() {
        return getAndCast(0);
    }

    public Function<T, T1> get1() {
        return getAndCast(1);
    }

    public Function<T, T2> get2() {
        return getAndCast(2);
    }

    public Function<T, T3> get3() {
        return getAndCast(3);
    }

    public Function<T, T4> get4() {
        return getAndCast(4);
    }

    public Function<T, T5> get5() {
        return getAndCast(5);
    }
}