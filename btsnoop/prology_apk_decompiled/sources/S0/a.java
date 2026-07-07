package S0;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: n, reason: collision with root package name */
    public final long f1881n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f1882o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f1883p;

    public a(long j4, int i4) {
        super(i4);
        this.f1881n = j4;
        this.f1882o = new ArrayList();
        this.f1883p = new ArrayList();
    }

    public final a e(int i4) {
        ArrayList arrayList = this.f1883p;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            a aVar = (a) arrayList.get(i5);
            if (aVar.f1886m == i4) {
                return aVar;
            }
        }
        return null;
    }

    public final b f(int i4) {
        ArrayList arrayList = this.f1882o;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = (b) arrayList.get(i5);
            if (bVar.f1886m == i4) {
                return bVar;
            }
        }
        return null;
    }

    @Override // S0.c
    public final String toString() {
        return c.b(this.f1886m) + " leaves: " + Arrays.toString(this.f1882o.toArray()) + " containers: " + Arrays.toString(this.f1883p.toArray());
    }
}
