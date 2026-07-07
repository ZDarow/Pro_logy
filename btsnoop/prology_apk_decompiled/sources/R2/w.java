package R2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class w extends d3.b {

    /* renamed from: o, reason: collision with root package name */
    public K f1860o;

    /* renamed from: p, reason: collision with root package name */
    public Set f1861p;

    /* renamed from: q, reason: collision with root package name */
    public Map f1862q;

    /* renamed from: r, reason: collision with root package name */
    public Iterator f1863r;
    public M.d s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f1864t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ K f1865u;

    /* renamed from: v, reason: collision with root package name */
    public int f1866v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(K k4, d3.b bVar) {
        super(bVar);
        this.f1865u = k4;
    }

    @Override // d3.b
    public final Object k(Object obj) {
        this.f1864t = obj;
        this.f1866v |= Integer.MIN_VALUE;
        return K.c(this.f1865u, null, this);
    }
}
