package K2;

import I.C0044m;
import L2.w;
import java.util.TreeSet;
import m0.C0428i;
import m0.C0429j;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f951a;

    /* renamed from: b, reason: collision with root package name */
    public int f952b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f953c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f954d;

    public c(D2.b bVar) {
        C0044m c0044m = new C0044m(bVar, "flutter/lifecycle", w.f1101b, null);
        this.f951a = 0;
        this.f952b = 0;
        this.f953c = true;
        this.f954d = c0044m;
    }

    public static int b(int i4, int i5) {
        int min;
        int i6 = i4 - i5;
        return (Math.abs(i6) <= 1000 || (min = (Math.min(i4, i5) - Math.max(i4, i5)) + 65535) >= 1000) ? i6 : i4 < i5 ? min : -min;
    }

    public synchronized void a(C0429j c0429j) {
        this.f951a = c0429j.f7235a.f7231c;
        ((TreeSet) this.f954d).add(c0429j);
    }

    public synchronized C0428i c(long j4) {
        if (((TreeSet) this.f954d).isEmpty()) {
            return null;
        }
        C0429j c0429j = (C0429j) ((TreeSet) this.f954d).first();
        int i4 = c0429j.f7235a.f7231c;
        if (i4 != C0428i.a(this.f952b) && j4 < c0429j.f7236b) {
            return null;
        }
        ((TreeSet) this.f954d).pollFirst();
        this.f952b = i4;
        return c0429j.f7235a;
    }

    public synchronized void d() {
        ((TreeSet) this.f954d).clear();
        this.f953c = false;
        this.f952b = -1;
        this.f951a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(int r5, boolean r6) {
        /*
            r4 = this;
            int r0 = r4.f951a
            if (r0 != r5) goto L9
            boolean r1 = r4.f953c
            if (r6 != r1) goto L9
            return
        L9:
            if (r5 != 0) goto L10
            if (r0 != 0) goto L10
            r4.f953c = r6
            return
        L10:
            int r0 = L.j.b(r5)
            if (r0 == 0) goto L29
            r1 = 1
            r2 = 3
            r3 = 2
            if (r0 == r1) goto L24
            if (r0 == r3) goto L29
            if (r0 == r2) goto L29
            r1 = 4
            if (r0 == r1) goto L29
            r0 = 0
            goto L2a
        L24:
            if (r6 == 0) goto L27
            r2 = r3
        L27:
            r0 = r2
            goto L2a
        L29:
            r0 = r5
        L2a:
            r4.f951a = r5
            r4.f953c = r6
            int r5 = r4.f952b
            if (r0 != r5) goto L33
            return
        L33:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "AppLifecycleState."
            r5.<init>(r6)
            r6 = 1
            if (r0 == r6) goto L57
            r6 = 2
            if (r0 == r6) goto L54
            r6 = 3
            if (r0 == r6) goto L51
            r6 = 4
            if (r0 == r6) goto L4e
            r6 = 5
            if (r0 != r6) goto L4c
            java.lang.String r6 = "PAUSED"
            goto L59
        L4c:
            r5 = 0
            throw r5
        L4e:
            java.lang.String r6 = "HIDDEN"
            goto L59
        L51:
            java.lang.String r6 = "INACTIVE"
            goto L59
        L54:
            java.lang.String r6 = "RESUMED"
            goto L59
        L57:
            java.lang.String r6 = "DETACHED"
        L59:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r1)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r6 = r4.f954d
            I.m r6 = (I.C0044m) r6
            r1 = 0
            r6.q(r5, r1)
            r4.f952b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.c.e(int, boolean):void");
    }

    public c() {
        this.f954d = new TreeSet(new W0.d(4));
        d();
    }
}
