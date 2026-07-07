package t0;

import W.y;
import f2.AbstractC0303z;
import f2.a0;
import f2.j0;

/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: A, reason: collision with root package name */
    public final int f8363A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f8364B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f8365C;

    /* renamed from: D, reason: collision with root package name */
    public final int f8366D;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f8367p;

    /* renamed from: q, reason: collision with root package name */
    public final C0569k f8368q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f8369r;
    public final boolean s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f8370t;

    /* renamed from: u, reason: collision with root package name */
    public final int f8371u;

    /* renamed from: v, reason: collision with root package name */
    public final int f8372v;
    public final int w;

    /* renamed from: x, reason: collision with root package name */
    public final int f8373x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f8374y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f8375z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p(int r8, T.V r9, int r10, t0.C0569k r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.p.<init>(int, T.V, int, t0.k, int, int, boolean):void");
    }

    public static int c(p pVar, p pVar2) {
        AbstractC0303z c4 = AbstractC0303z.f5630a.c(pVar.s, pVar2.s).a(pVar.f8373x, pVar2.f8373x).c(pVar.f8374y, pVar2.f8374y).c(pVar.f8370t, pVar2.f8370t).c(pVar.f8367p, pVar2.f8367p).c(pVar.f8369r, pVar2.f8369r);
        Integer valueOf = Integer.valueOf(pVar.w);
        Integer valueOf2 = Integer.valueOf(pVar2.w);
        a0.f5544l.getClass();
        AbstractC0303z b4 = c4.b(valueOf, valueOf2, j0.f5586l);
        boolean z4 = pVar2.f8364B;
        boolean z5 = pVar.f8364B;
        AbstractC0303z c5 = b4.c(z5, z4);
        boolean z6 = pVar2.f8365C;
        boolean z7 = pVar.f8365C;
        AbstractC0303z c6 = c5.c(z7, z6);
        if (z5 && z7) {
            c6 = c6.a(pVar.f8366D, pVar2.f8366D);
        }
        return c6.e();
    }

    @Override // t0.o
    public final int a() {
        return this.f8363A;
    }

    @Override // t0.o
    public final boolean b(o oVar) {
        p pVar = (p) oVar;
        if (this.f8375z || y.a(this.f8362o.f2325m, pVar.f8362o.f2325m)) {
            this.f8368q.getClass();
            if (this.f8364B == pVar.f8364B && this.f8365C == pVar.f8365C) {
                return true;
            }
        }
        return false;
    }
}
