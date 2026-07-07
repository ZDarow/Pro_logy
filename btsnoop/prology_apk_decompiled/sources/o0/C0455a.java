package o0;

import B2.D;
import L1.g;
import S0.n;
import S0.u;
import S0.v;
import T.C0095p;
import W.y;
import Y.h;
import a0.Q;
import a0.m0;
import android.net.Uri;
import android.os.SystemClock;
import d0.j;
import f1.C0271e;
import f2.c0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p0.C0461a;
import p1.AbstractC0462a;
import q0.C0470b;
import r0.AbstractC0503e;
import r0.C0502d;
import r0.InterfaceC0504f;
import r0.i;
import r0.l;
import t0.C0560b;
import t0.s;
import u0.o;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0455a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final o f7535a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7536b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0504f[] f7537c;

    /* renamed from: d, reason: collision with root package name */
    public final h f7538d;

    /* renamed from: e, reason: collision with root package name */
    public s f7539e;

    /* renamed from: f, reason: collision with root package name */
    public p0.c f7540f;

    /* renamed from: g, reason: collision with root package name */
    public int f7541g;

    /* renamed from: h, reason: collision with root package name */
    public C0470b f7542h;

    public C0455a(o oVar, p0.c cVar, int i4, s sVar, h hVar, g gVar, boolean z4) {
        v[] vVarArr;
        this.f7535a = oVar;
        this.f7540f = cVar;
        this.f7536b = i4;
        this.f7539e = sVar;
        this.f7538d = hVar;
        p0.b bVar = cVar.f7615f[i4];
        this.f7537c = new InterfaceC0504f[sVar.length()];
        for (int i5 = 0; i5 < this.f7537c.length; i5++) {
            int k4 = sVar.k(i5);
            C0095p c0095p = bVar.f7603j[k4];
            if (c0095p.f2329q != null) {
                C0461a c0461a = cVar.f7614e;
                c0461a.getClass();
                vVarArr = c0461a.f7593c;
            } else {
                vVarArr = null;
            }
            v[] vVarArr2 = vVarArr;
            int i6 = bVar.f7594a;
            this.f7537c[i5] = new C0502d(new n(gVar, !z4 ? 35 : 3, null, new u(k4, i6, bVar.f7596c, -9223372036854775807L, cVar.f7616g, c0095p, 0, vVarArr2, i6 == 2 ? 4 : 0, null, null), c0.f5550p, null), bVar.f7594a, c0095p);
        }
    }

    @Override // r0.i
    public final void a() {
        C0470b c0470b = this.f7542h;
        if (c0470b != null) {
            throw c0470b;
        }
        this.f7535a.a();
    }

    @Override // r0.i
    public final long b(long j4, m0 m0Var) {
        p0.b bVar = this.f7540f.f7615f[this.f7536b];
        int f4 = y.f(bVar.f7608o, j4, true);
        long[] jArr = bVar.f7608o;
        long j5 = jArr[f4];
        return m0Var.a(j4, j5, (j5 >= j4 || f4 >= bVar.f7604k - 1) ? j5 : jArr[f4 + 1]);
    }

    @Override // r0.i
    public final boolean c(long j4, AbstractC0503e abstractC0503e, List list) {
        if (this.f7542h != null) {
            return false;
        }
        return this.f7539e.f(j4, abstractC0503e, list);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [q0.b, java.io.IOException] */
    @Override // r0.i
    public final void d(Q q4, long j4, List list, D d4) {
        int a4;
        long b4;
        if (this.f7542h != null) {
            return;
        }
        p0.b[] bVarArr = this.f7540f.f7615f;
        int i4 = this.f7536b;
        p0.b bVar = bVarArr[i4];
        if (bVar.f7604k == 0) {
            d4.f115a = !r4.f7613d;
            return;
        }
        boolean isEmpty = list.isEmpty();
        long[] jArr = bVar.f7608o;
        if (isEmpty) {
            a4 = y.f(jArr, j4, true);
        } else {
            a4 = (int) (((l) list.get(list.size() - 1)).a() - this.f7541g);
            if (a4 < 0) {
                this.f7542h = new IOException();
                return;
            }
        }
        if (a4 >= bVar.f7604k) {
            d4.f115a = !this.f7540f.f7613d;
            return;
        }
        long j5 = q4.f3332a;
        long j6 = j4 - j5;
        p0.c cVar = this.f7540f;
        if (cVar.f7613d) {
            p0.b bVar2 = cVar.f7615f[i4];
            int i5 = bVar2.f7604k - 1;
            b4 = (bVar2.b(i5) + bVar2.f7608o[i5]) - j5;
        } else {
            b4 = -9223372036854775807L;
        }
        int length = this.f7539e.length();
        r0.n[] nVarArr = new r0.n[length];
        for (int i6 = 0; i6 < length; i6++) {
            this.f7539e.k(i6);
            nVarArr[i6] = new j(bVar, a4);
        }
        this.f7539e.s(j5, j6, b4, list, nVarArr);
        long j7 = jArr[a4];
        long b5 = bVar.b(a4) + j7;
        long j8 = list.isEmpty() ? j4 : -9223372036854775807L;
        int i7 = this.f7541g + a4;
        int g4 = this.f7539e.g();
        InterfaceC0504f interfaceC0504f = this.f7537c[g4];
        int k4 = this.f7539e.k(g4);
        C0095p[] c0095pArr = bVar.f7603j;
        W.a.j(c0095pArr != null);
        ArrayList arrayList = bVar.f7607n;
        W.a.j(arrayList != null);
        W.a.j(a4 < arrayList.size());
        String num = Integer.toString(c0095pArr[k4].f2321i);
        String l4 = ((Long) arrayList.get(a4)).toString();
        Uri y4 = W.a.y(bVar.f7605l, bVar.f7606m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l4).replace("{start_time}", l4));
        SystemClock.elapsedRealtime();
        C0095p d5 = this.f7539e.d();
        int e4 = this.f7539e.e();
        Object l5 = this.f7539e.l();
        Map emptyMap = Collections.emptyMap();
        W.a.l(y4, "The uri must be set.");
        d4.f116b = new r0.j(this.f7538d, new Y.l(y4, 1, null, emptyMap, 0L, -1L, null, 0), d5, e4, l5, j7, b5, j8, -9223372036854775807L, i7, 1, j7, interfaceC0504f);
    }

    @Override // r0.i
    public final boolean e(AbstractC0503e abstractC0503e, boolean z4, B.c cVar, C0560b c0560b) {
        u0.h t4 = AbstractC0462a.t(this.f7539e);
        c0560b.getClass();
        C0271e d4 = C0560b.d(t4, cVar);
        if (z4 && d4 != null && d4.f5489a == 2) {
            s sVar = this.f7539e;
            if (sVar.q(d4.f5490b, sVar.p(abstractC0503e.f8023o))) {
                return true;
            }
        }
        return false;
    }

    @Override // r0.i
    public final void f(AbstractC0503e abstractC0503e) {
    }

    @Override // r0.i
    public final int g(long j4, List list) {
        return (this.f7542h != null || this.f7539e.length() < 2) ? list.size() : this.f7539e.n(j4, list);
    }

    @Override // r0.i
    public final void release() {
        for (InterfaceC0504f interfaceC0504f : this.f7537c) {
            ((C0502d) interfaceC0504f).f8012l.release();
        }
    }
}
