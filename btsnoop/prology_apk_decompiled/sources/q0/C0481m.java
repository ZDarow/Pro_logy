package q0;

import a0.AbstractC0121a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: q0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0481m extends AbstractC0121a {

    /* renamed from: e, reason: collision with root package name */
    public final int f7883e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7884f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f7885g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f7886h;

    /* renamed from: i, reason: collision with root package name */
    public final T.U[] f7887i;

    /* renamed from: j, reason: collision with root package name */
    public final Object[] f7888j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f7889k;

    public C0481m(ArrayList arrayList, d0 d0Var) {
        super(d0Var);
        int size = arrayList.size();
        this.f7885g = new int[size];
        this.f7886h = new int[size];
        this.f7887i = new T.U[size];
        this.f7888j = new Object[size];
        this.f7889k = new HashMap();
        Iterator it = arrayList.iterator();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            C0484p c0484p = (C0484p) it.next();
            T.U[] uArr = this.f7887i;
            C0493z c0493z = c0484p.f7892a.f7667z;
            uArr[i6] = c0493z;
            this.f7886h[i6] = i4;
            this.f7885g[i6] = i5;
            i4 += c0493z.f7923b.o();
            i5 += this.f7887i[i6].h();
            Object[] objArr = this.f7888j;
            Object obj = c0484p.f7893b;
            objArr[i6] = obj;
            this.f7889k.put(obj, Integer.valueOf(i6));
            i6++;
        }
        this.f7883e = i4;
        this.f7884f = i5;
    }

    @Override // T.U
    public final int h() {
        return this.f7884f;
    }

    @Override // T.U
    public final int o() {
        return this.f7883e;
    }

    @Override // a0.AbstractC0121a
    public final int q(Object obj) {
        Integer num = (Integer) this.f7889k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // a0.AbstractC0121a
    public final int r(int i4) {
        return W.y.e(this.f7885g, i4 + 1, false, false);
    }

    @Override // a0.AbstractC0121a
    public final int s(int i4) {
        return W.y.e(this.f7886h, i4 + 1, false, false);
    }

    @Override // a0.AbstractC0121a
    public final Object t(int i4) {
        return this.f7888j[i4];
    }

    @Override // a0.AbstractC0121a
    public final int u(int i4) {
        return this.f7885g[i4];
    }

    @Override // a0.AbstractC0121a
    public final int v(int i4) {
        return this.f7886h[i4];
    }

    @Override // a0.AbstractC0121a
    public final T.U y(int i4) {
        return this.f7887i[i4];
    }
}
