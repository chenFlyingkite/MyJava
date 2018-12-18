package chenflyingkite.util.functional;

@FunctionalInterface
public interface Get_LL_L<Source, Result> {
    Result get(Source a, Source b);
}
