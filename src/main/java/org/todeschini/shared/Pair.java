package org.todeschini.shared;

import java.util.Objects;

/** A generic class for pairs.
 *
 *  <p><b>This is NOT part of any supported API.
 *  If you write code that depends on this, you do so at your own risk.
 *  This code and its internal interfaces are subject to change or
 *  deletion without notice.</b>
 */
public class Pair<A, B> {

    public final A fst;
    public final B snd;

    public Pair(A fst, B snd) {
        this.fst = fst;
        this.snd = snd;
    }

    public String toString() {
        return "Pair[" + fst + "," + snd + "]";
    }

    public boolean equals(Object other) {
        return
                other instanceof org.todeschini.shared.Pair<?, ?> &&
                        Objects.equals(fst, ((org.todeschini.shared.Pair<?, ?>) other).fst) &&
                        Objects.equals(snd, ((org.todeschini.shared.Pair<?, ?>) other).snd);
    }

    public int hashCode() {
        if (fst == null) return (snd == null) ? 0 : snd.hashCode() + 1;
        else if (snd == null) return fst.hashCode() + 2;
        else return fst.hashCode() * 17 + snd.hashCode();
    }

    public static <A, B> org.todeschini.shared.Pair<A, B> of(A a, B b) {
        return new org.todeschini.shared.Pair<>(a, b);
    }
}
