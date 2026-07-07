package f2;

import java.util.Comparator;

/* renamed from: f2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0301x extends AbstractC0303z {
    public static AbstractC0303z f(int i4) {
        return i4 < 0 ? AbstractC0303z.f5631b : i4 > 0 ? AbstractC0303z.f5632c : AbstractC0303z.f5630a;
    }

    @Override // f2.AbstractC0303z
    public final AbstractC0303z a(int i4, int i5) {
        return f(i4 < i5 ? -1 : i4 > i5 ? 1 : 0);
    }

    @Override // f2.AbstractC0303z
    public final AbstractC0303z b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // f2.AbstractC0303z
    public final AbstractC0303z c(boolean z4, boolean z5) {
        return f(z4 == z5 ? 0 : z4 ? 1 : -1);
    }

    @Override // f2.AbstractC0303z
    public final AbstractC0303z d(boolean z4, boolean z5) {
        return f(z5 == z4 ? 0 : z5 ? 1 : -1);
    }

    @Override // f2.AbstractC0303z
    public final int e() {
        return 0;
    }
}
