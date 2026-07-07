package I;

import b3.InterfaceC0190d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p1.AbstractC0462a;

/* renamed from: I.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038g extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public Iterator f820p;

    /* renamed from: q, reason: collision with root package name */
    public Object f821q;

    /* renamed from: r, reason: collision with root package name */
    public int f822r;
    public /* synthetic */ Object s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List f823t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ArrayList f824u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0038g(List list, ArrayList arrayList, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f823t = list;
        this.f824u = arrayList;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        C0038g c0038g = new C0038g(this.f823t, this.f824u, interfaceC0190d);
        c0038g.s = obj;
        return c0038g;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((C0038g) g((InterfaceC0190d) obj2, obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        Iterator it;
        List list;
        int i4 = this.f822r;
        if (i4 == 0) {
            AbstractC0462a.P(obj);
            obj = this.s;
            it = this.f823t.iterator();
            list = this.f824u;
        } else if (i4 == 1) {
            Object obj2 = this.f821q;
            Iterator it2 = this.f820p;
            List list2 = (List) this.s;
            AbstractC0462a.P(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new d3.g(1, null));
                this.s = list2;
                this.f820p = it2;
                this.f821q = null;
                this.f822r = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f820p;
            list = (List) this.s;
            AbstractC0462a.P(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.s = list;
        this.f820p = it;
        this.f821q = obj;
        this.f822r = 1;
        throw null;
    }
}
