package N1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final C0058b f1302a;

    /* renamed from: b, reason: collision with root package name */
    public final L1.c f1303b;

    public /* synthetic */ p(C0058b c0058b, L1.c cVar) {
        this.f1302a = c0058b;
        this.f1303b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof p)) {
            p pVar = (p) obj;
            if (O1.s.f(this.f1302a, pVar.f1302a) && O1.s.f(this.f1303b, pVar.f1303b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1302a, this.f1303b});
    }

    public final String toString() {
        B1.d dVar = new B1.d(this);
        dVar.i(this.f1302a, "key");
        dVar.i(this.f1303b, "feature");
        return dVar.toString();
    }
}
