package c0;

import T.C0084e;
import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import f2.C0278F;
import f2.c0;
import f2.h0;
import java.util.Objects;

/* renamed from: c0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206e {

    /* renamed from: c, reason: collision with root package name */
    public static final C0206e f4601c = new C0206e(f2.I.o(C0205d.f4597d));

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f4602d = f2.I.q(2, 5, 6);

    /* renamed from: e, reason: collision with root package name */
    public static final h0 f4603e;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f4604a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final int f4605b;

    static {
        P2.a aVar = new P2.a(4, 5);
        aVar.i(5, 6);
        aVar.i(17, 6);
        aVar.i(7, 6);
        aVar.i(30, 10);
        aVar.i(18, 6);
        aVar.i(6, 8);
        aVar.i(8, 8);
        aVar.i(14, 8);
        f4603e = aVar.e();
    }

    public C0206e(c0 c0Var) {
        for (int i4 = 0; i4 < c0Var.f5552o; i4++) {
            C0205d c0205d = (C0205d) c0Var.get(i4);
            this.f4604a.put(c0205d.f4598a, c0205d);
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f4604a.size(); i6++) {
            i5 = Math.max(i5, ((C0205d) this.f4604a.valueAt(i6)).f4599b);
        }
        this.f4605b = i5;
    }

    public static c0 a(int[] iArr, int i4) {
        C0278F i5 = f2.I.i();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i6 : iArr) {
            i5.a(new C0205d(i6, i4));
        }
        return i5.g();
    }

    public static C0206e b(Context context, C0084e c0084e, C0211j c0211j) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c0084e, c0211j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
    
        if ("Xiaomi".equals(r3) == false) goto L44;
     */
    /* JADX WARN: Type inference failed for: r8v2, types: [f2.L, f2.C] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c0.C0206e c(android.content.Context r5, android.content.Intent r6, T.C0084e r7, c0.C0211j r8) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.C0206e.c(android.content.Context, android.content.Intent, T.e, c0.j):c0.e");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
    
        if (r15 != 5) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair d(T.C0084e r17, T.C0095p r18) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.C0206e.d(T.e, T.p):android.util.Pair");
    }

    public final boolean e(int i4) {
        SparseArray sparseArray = this.f4604a;
        int i5 = W.y.f2709a;
        return sparseArray.indexOfKey(i4) >= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r3 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof c0.C0206e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c0.e r9 = (c0.C0206e) r9
            android.util.SparseArray r1 = r8.f4604a
            android.util.SparseArray r3 = r9.f4604a
            int r4 = W.y.f2709a
            if (r1 != 0) goto L17
            if (r3 != 0) goto L19
            goto L49
        L17:
            if (r3 != 0) goto L1b
        L19:
            r1 = r2
            goto L4a
        L1b:
            int r4 = W.y.f2709a
            r5 = 31
            if (r4 < r5) goto L26
            boolean r1 = B2.p.u(r1, r3)
            goto L4a
        L26:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L31
            goto L19
        L31:
            r5 = r2
        L32:
            if (r5 >= r4) goto L49
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 != 0) goto L47
            goto L19
        L47:
            int r5 = r5 + r0
            goto L32
        L49:
            r1 = r0
        L4a:
            if (r1 == 0) goto L53
            int r1 = r8.f4605b
            int r9 = r9.f4605b
            if (r1 != r9) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.C0206e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i4;
        SparseArray sparseArray = this.f4604a;
        if (W.y.f2709a >= 31) {
            i4 = sparseArray.contentHashCode();
        } else {
            int i5 = 17;
            for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                i5 = Objects.hashCode(sparseArray.valueAt(i6)) + ((sparseArray.keyAt(i6) + (i5 * 31)) * 31);
            }
            i4 = i5;
        }
        return (i4 * 31) + this.f4605b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f4605b + ", audioProfiles=" + this.f4604a + "]";
    }
}
