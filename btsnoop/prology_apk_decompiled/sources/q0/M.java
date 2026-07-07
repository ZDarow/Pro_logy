package q0;

import T.C0098t;
import T.C0099u;
import T.C0101w;
import T.C0102x;
import T.C0104z;
import androidx.datastore.preferences.protobuf.C0159k;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class M extends AbstractC0478j {

    /* renamed from: C, reason: collision with root package name */
    public static final T.B f7690C;

    /* renamed from: A, reason: collision with root package name */
    public long[][] f7691A;

    /* renamed from: B, reason: collision with root package name */
    public C0159k f7692B;

    /* renamed from: v, reason: collision with root package name */
    public final AbstractC0469a[] f7693v;
    public final T.U[] w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f7694x;

    /* renamed from: y, reason: collision with root package name */
    public final L1.g f7695y;

    /* renamed from: z, reason: collision with root package name */
    public int f7696z;

    /* JADX WARN: Type inference failed for: r4v0, types: [T.u, T.v] */
    static {
        C0098t c0098t = new C0098t();
        f2.G g4 = f2.I.f5510m;
        f2.c0 c0Var = f2.c0.f5550p;
        Collections.emptyList();
        f2.c0 c0Var2 = f2.c0.f5550p;
        C0101w c0101w = new C0101w();
        f7690C = new T.B("MergingMediaSource", new C0099u(c0098t), null, new C0102x(c0101w), T.E.f2095y, C0104z.f2370a);
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, f2.r] */
    public M(AbstractC0469a... abstractC0469aArr) {
        L1.g gVar = new L1.g(29, false);
        this.f7693v = abstractC0469aArr;
        this.f7695y = gVar;
        this.f7694x = new ArrayList(Arrays.asList(abstractC0469aArr));
        this.f7696z = -1;
        this.w = new T.U[abstractC0469aArr.length];
        this.f7691A = new long[0];
        new HashMap();
        f2.r.e("expectedKeys", 8);
        new Object().a().u();
    }

    @Override // q0.AbstractC0469a
    public final InterfaceC0467D b(F f4, u0.e eVar, long j4) {
        AbstractC0469a[] abstractC0469aArr = this.f7693v;
        int length = abstractC0469aArr.length;
        InterfaceC0467D[] interfaceC0467DArr = new InterfaceC0467D[length];
        T.U[] uArr = this.w;
        int b4 = uArr[0].b(f4.f7668a);
        for (int i4 = 0; i4 < length; i4++) {
            interfaceC0467DArr[i4] = abstractC0469aArr[i4].b(f4.a(uArr[i4].l(b4)), eVar, j4 - this.f7691A[b4][i4]);
        }
        return new L(this.f7695y, this.f7691A[b4], interfaceC0467DArr);
    }

    @Override // q0.AbstractC0469a
    public final T.B h() {
        AbstractC0469a[] abstractC0469aArr = this.f7693v;
        return abstractC0469aArr.length > 0 ? abstractC0469aArr[0].h() : f7690C;
    }

    @Override // q0.AbstractC0478j, q0.AbstractC0469a
    public final void j() {
        C0159k c0159k = this.f7692B;
        if (c0159k != null) {
            throw c0159k;
        }
        super.j();
    }

    @Override // q0.AbstractC0469a
    public final void m(Y.C c4) {
        this.f7870u = c4;
        this.f7869t = W.y.n(null);
        int i4 = 0;
        while (true) {
            AbstractC0469a[] abstractC0469aArr = this.f7693v;
            if (i4 >= abstractC0469aArr.length) {
                return;
            }
            A(Integer.valueOf(i4), abstractC0469aArr[i4]);
            i4++;
        }
    }

    @Override // q0.AbstractC0469a
    public final void o(InterfaceC0467D interfaceC0467D) {
        L l4 = (L) interfaceC0467D;
        int i4 = 0;
        while (true) {
            AbstractC0469a[] abstractC0469aArr = this.f7693v;
            if (i4 >= abstractC0469aArr.length) {
                return;
            }
            AbstractC0469a abstractC0469a = abstractC0469aArr[i4];
            InterfaceC0467D interfaceC0467D2 = l4.f7682l[i4];
            if (interfaceC0467D2 instanceof j0) {
                interfaceC0467D2 = ((j0) interfaceC0467D2).f7871l;
            }
            abstractC0469a.o(interfaceC0467D2);
            i4++;
        }
    }

    @Override // q0.AbstractC0478j, q0.AbstractC0469a
    public final void r() {
        super.r();
        Arrays.fill(this.w, (Object) null);
        this.f7696z = -1;
        this.f7692B = null;
        ArrayList arrayList = this.f7694x;
        arrayList.clear();
        Collections.addAll(arrayList, this.f7693v);
    }

    @Override // q0.AbstractC0469a
    public final void u(T.B b4) {
        this.f7693v[0].u(b4);
    }

    @Override // q0.AbstractC0478j
    public final F v(Object obj, F f4) {
        if (((Integer) obj).intValue() == 0) {
            return f4;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.datastore.preferences.protobuf.k, java.io.IOException] */
    @Override // q0.AbstractC0478j
    public final void z(Object obj, AbstractC0469a abstractC0469a, T.U u4) {
        Integer num = (Integer) obj;
        if (this.f7692B != null) {
            return;
        }
        if (this.f7696z == -1) {
            this.f7696z = u4.h();
        } else if (u4.h() != this.f7696z) {
            this.f7692B = new IOException();
            return;
        }
        int length = this.f7691A.length;
        T.U[] uArr = this.w;
        if (length == 0) {
            this.f7691A = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f7696z, uArr.length);
        }
        ArrayList arrayList = this.f7694x;
        arrayList.remove(abstractC0469a);
        uArr[num.intValue()] = u4;
        if (arrayList.isEmpty()) {
            n(uArr[0]);
        }
    }
}
