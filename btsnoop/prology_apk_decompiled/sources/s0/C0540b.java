package s0;

import f2.C0273A;
import f2.C0278F;
import f2.C0295q;
import f2.I;
import f2.a0;
import f2.c0;
import f2.j0;
import java.util.ArrayList;

/* renamed from: s0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0540b implements InterfaceC0539a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0273A f8192b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8193a = new ArrayList();

    static {
        a0 a0Var = a0.f5544l;
        b0.d dVar = new b0.d(20);
        a0Var.getClass();
        C0295q c0295q = new C0295q(dVar, a0Var);
        j0 j0Var = j0.f5586l;
        b0.d dVar2 = new b0.d(21);
        j0Var.getClass();
        f8192b = new C0273A(c0295q, new C0295q(dVar2, j0Var));
    }

    @Override // s0.InterfaceC0539a
    public final I a(long j4) {
        ArrayList arrayList = this.f8193a;
        if (!arrayList.isEmpty()) {
            if (j4 >= ((V0.a) arrayList.get(0)).f2597b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    V0.a aVar = (V0.a) arrayList.get(i4);
                    if (j4 >= aVar.f2597b && j4 < aVar.f2599d) {
                        arrayList2.add(aVar);
                    }
                    if (j4 < aVar.f2597b) {
                        break;
                    }
                }
                c0 r4 = I.r(f8192b, arrayList2);
                C0278F i5 = I.i();
                for (int i6 = 0; i6 < r4.size(); i6++) {
                    i5.d(((V0.a) r4.get(i6)).f2596a);
                }
                return i5.g();
            }
        }
        return I.m();
    }

    @Override // s0.InterfaceC0539a
    public final long b(long j4) {
        ArrayList arrayList = this.f8193a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j4 < ((V0.a) arrayList.get(0)).f2597b) {
            return -9223372036854775807L;
        }
        long j5 = ((V0.a) arrayList.get(0)).f2597b;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            long j6 = ((V0.a) arrayList.get(i4)).f2597b;
            long j7 = ((V0.a) arrayList.get(i4)).f2599d;
            if (j7 > j4) {
                if (j6 > j4) {
                    break;
                }
                j5 = Math.max(j5, j6);
            } else {
                j5 = Math.max(j5, j7);
            }
        }
        return j5;
    }

    @Override // s0.InterfaceC0539a
    public final long c(long j4) {
        int i4 = 0;
        long j5 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f8193a;
            if (i4 >= arrayList.size()) {
                break;
            }
            long j6 = ((V0.a) arrayList.get(i4)).f2597b;
            long j7 = ((V0.a) arrayList.get(i4)).f2599d;
            if (j4 < j6) {
                j5 = j5 == -9223372036854775807L ? j6 : Math.min(j5, j6);
            } else {
                if (j4 < j7) {
                    j5 = j5 == -9223372036854775807L ? j7 : Math.min(j5, j7);
                }
                i4++;
            }
        }
        if (j5 != -9223372036854775807L) {
            return j5;
        }
        return Long.MIN_VALUE;
    }

    @Override // s0.InterfaceC0539a
    public final void clear() {
        this.f8193a.clear();
    }

    @Override // s0.InterfaceC0539a
    public final boolean d(V0.a aVar, long j4) {
        long j5 = aVar.f2597b;
        W.a.e(j5 != -9223372036854775807L);
        W.a.e(aVar.f2598c != -9223372036854775807L);
        boolean z4 = j5 <= j4 && j4 < aVar.f2599d;
        ArrayList arrayList = this.f8193a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j5 >= ((V0.a) arrayList.get(size)).f2597b) {
                arrayList.add(size + 1, aVar);
                return z4;
            }
        }
        arrayList.add(0, aVar);
        return z4;
    }

    @Override // s0.InterfaceC0539a
    public final void e(long j4) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f8193a;
            if (i4 >= arrayList.size()) {
                return;
            }
            long j5 = ((V0.a) arrayList.get(i4)).f2597b;
            if (j4 > j5 && j4 > ((V0.a) arrayList.get(i4)).f2599d) {
                arrayList.remove(i4);
                i4--;
            } else if (j4 < j5) {
                return;
            }
            i4++;
        }
    }
}
