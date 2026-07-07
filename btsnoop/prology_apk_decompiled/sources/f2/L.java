package f2;

import java.util.Objects;

/* loaded from: classes.dex */
public final class L extends AbstractC0275C {
    @Override // f2.AbstractC0275C
    public final AbstractC0275C b(Object obj) {
        obj.getClass();
        a(obj);
        return this;
    }

    public final M g() {
        int i4 = this.f5499b;
        if (i4 == 0) {
            int i5 = M.f5515n;
            return i0.f5580u;
        }
        if (i4 != 1) {
            M i6 = M.i(i4, this.f5498a);
            this.f5499b = i6.size();
            this.f5500c = true;
            return i6;
        }
        Object obj = this.f5498a[0];
        Objects.requireNonNull(obj);
        int i7 = M.f5515n;
        return new p0(obj);
    }
}
