package q0;

import f2.C0278F;
import java.util.List;

/* renamed from: q0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0480l implements c0 {

    /* renamed from: l, reason: collision with root package name */
    public final f2.c0 f7880l;

    /* renamed from: m, reason: collision with root package name */
    public long f7881m;

    public C0480l(List list, List list2) {
        C0278F i4 = f2.I.i();
        W.a.e(list.size() == list2.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4.a(new C0479k((c0) list.get(i5), (List) list2.get(i5)));
        }
        this.f7880l = i4.g();
        this.f7881m = -9223372036854775807L;
    }

    @Override // q0.c0
    public final boolean c() {
        int i4 = 0;
        while (true) {
            f2.c0 c0Var = this.f7880l;
            if (i4 >= c0Var.size()) {
                return false;
            }
            if (((C0479k) c0Var.get(i4)).c()) {
                return true;
            }
            i4++;
        }
    }

    @Override // q0.c0
    public final long h() {
        int i4 = 0;
        long j4 = Long.MAX_VALUE;
        long j5 = Long.MAX_VALUE;
        while (true) {
            f2.c0 c0Var = this.f7880l;
            if (i4 >= c0Var.size()) {
                break;
            }
            C0479k c0479k = (C0479k) c0Var.get(i4);
            long h4 = c0479k.h();
            if ((c0479k.a().contains(1) || c0479k.a().contains(2) || c0479k.a().contains(4)) && h4 != Long.MIN_VALUE) {
                j4 = Math.min(j4, h4);
            }
            if (h4 != Long.MIN_VALUE) {
                j5 = Math.min(j5, h4);
            }
            i4++;
        }
        if (j4 != Long.MAX_VALUE) {
            this.f7881m = j4;
            return j4;
        }
        if (j5 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j6 = this.f7881m;
        return j6 != -9223372036854775807L ? j6 : j5;
    }

    @Override // q0.c0
    public final boolean i(a0.Q q4) {
        boolean z4;
        boolean z5 = false;
        do {
            long r4 = r();
            if (r4 == Long.MIN_VALUE) {
                break;
            }
            int i4 = 0;
            z4 = false;
            while (true) {
                f2.c0 c0Var = this.f7880l;
                if (i4 >= c0Var.size()) {
                    break;
                }
                long r5 = ((C0479k) c0Var.get(i4)).r();
                boolean z6 = r5 != Long.MIN_VALUE && r5 <= q4.f3332a;
                if (r5 == r4 || z6) {
                    z4 |= ((C0479k) c0Var.get(i4)).i(q4);
                }
                i4++;
            }
            z5 |= z4;
        } while (z4);
        return z5;
    }

    @Override // q0.c0
    public final long r() {
        int i4 = 0;
        long j4 = Long.MAX_VALUE;
        while (true) {
            f2.c0 c0Var = this.f7880l;
            if (i4 >= c0Var.size()) {
                break;
            }
            long r4 = ((C0479k) c0Var.get(i4)).r();
            if (r4 != Long.MIN_VALUE) {
                j4 = Math.min(j4, r4);
            }
            i4++;
        }
        if (j4 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    @Override // q0.c0
    public final void w(long j4) {
        int i4 = 0;
        while (true) {
            f2.c0 c0Var = this.f7880l;
            if (i4 >= c0Var.size()) {
                return;
            }
            ((C0479k) c0Var.get(i4)).w(j4);
            i4++;
        }
    }
}
