package io.flutter.view;

/* renamed from: io.flutter.view.f */
/* loaded from: classes.dex */
public final class C1609f {

    /* renamed from: A */
    public java.lang.String f6697A;

    /* renamed from: B */
    public java.lang.String f6698B;

    /* renamed from: C */
    public int f6699C;

    /* renamed from: F */
    public long f6702F;

    /* renamed from: G */
    public int f6703G;

    /* renamed from: H */
    public int f6704H;

    /* renamed from: I */
    public int f6705I;

    /* renamed from: J */
    public float f6706J;

    /* renamed from: K */
    public java.lang.String f6707K;

    /* renamed from: L */
    public java.lang.String f6708L;

    /* renamed from: M */
    public float f6709M;

    /* renamed from: N */
    public float f6710N;

    /* renamed from: O */
    public float f6711O;

    /* renamed from: P */
    public float f6712P;

    /* renamed from: Q */
    public float[] f6713Q;

    /* renamed from: R */
    public io.flutter.view.C1609f f6714R;

    /* renamed from: U */
    public java.util.ArrayList f6717U;

    /* renamed from: V */
    public io.flutter.view.C1608e f6718V;

    /* renamed from: W */
    public io.flutter.view.C1608e f6719W;

    /* renamed from: Y */
    public float[] f6721Y;

    /* renamed from: a */
    public final io.flutter.view.C1610g f6723a;

    /* renamed from: a0 */
    public float[] f6724a0;

    /* renamed from: b0 */
    public android.graphics.Rect f6726b0;

    /* renamed from: c */
    public long f6727c;

    /* renamed from: d */
    public int f6728d;

    /* renamed from: e */
    public int f6729e;

    /* renamed from: f */
    public int f6730f;

    /* renamed from: g */
    public int f6731g;

    /* renamed from: h */
    public int f6732h;

    /* renamed from: i */
    public int f6733i;

    /* renamed from: j */
    public int f6734j;

    /* renamed from: k */
    public int f6735k;

    /* renamed from: l */
    public float f6736l;

    /* renamed from: m */
    public float f6737m;

    /* renamed from: n */
    public float f6738n;

    /* renamed from: o */
    public java.lang.String f6739o;

    /* renamed from: p */
    public java.lang.String f6740p;

    /* renamed from: q */
    public java.util.ArrayList f6741q;

    /* renamed from: r */
    public java.lang.String f6742r;

    /* renamed from: s */
    public java.util.ArrayList f6743s;

    /* renamed from: t */
    public java.lang.String f6744t;

    /* renamed from: u */
    public java.util.ArrayList f6745u;

    /* renamed from: v */
    public java.lang.String f6746v;

    /* renamed from: w */
    public java.util.ArrayList f6747w;

    /* renamed from: x */
    public java.lang.String f6748x;

    /* renamed from: y */
    public java.util.ArrayList f6749y;

    /* renamed from: z */
    public java.lang.String f6750z;

    /* renamed from: b */
    public int f6725b = -1;

    /* renamed from: D */
    public int f6700D = -1;

    /* renamed from: E */
    public boolean f6701E = false;

    /* renamed from: S */
    public final java.util.ArrayList f6715S = new java.util.ArrayList();

    /* renamed from: T */
    public final java.util.ArrayList f6716T = new java.util.ArrayList();

    /* renamed from: X */
    public boolean f6720X = true;

    /* renamed from: Z */
    public boolean f6722Z = true;

    public C1609f(io.flutter.view.C1610g c1610g) {
        this.f6723a = c1610g;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [io.flutter.view.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [io.flutter.view.h, io.flutter.view.j, java.lang.Object] */
    /* renamed from: C */
    public static java.util.ArrayList m3524C(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer[] byteBufferArr) {
        int i4 = byteBuffer.getInt();
        if (i4 == -1) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = byteBuffer.getInt();
            int i7 = byteBuffer.getInt();
            int i8 = p044L.AbstractC0352j.m782c(2)[byteBuffer.getInt()];
            int m781b = p044L.AbstractC0352j.m781b(i8);
            if (m781b == 0) {
                byteBuffer.getInt();
                ?? obj = new java.lang.Object();
                obj.f6778a = i6;
                obj.f6779b = i7;
                obj.f6780c = i8;
                arrayList.add(obj);
            } else if (m781b == 1) {
                java.nio.ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                ?? obj2 = new java.lang.Object();
                obj2.f6778a = i6;
                obj2.f6779b = i7;
                obj2.f6780c = i8;
                obj2.f6777d = java.nio.charset.StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* renamed from: G */
    public static void m3525G(float[] fArr, float[] fArr2, float[] fArr3) {
        android.opengl.Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f4 = fArr[3];
        fArr[0] = fArr[0] / f4;
        fArr[1] = fArr[1] / f4;
        fArr[2] = fArr[2] / f4;
        fArr[3] = 0.0f;
    }

    /* renamed from: d */
    public static android.graphics.Rect m3529d(io.flutter.view.C1609f c1609f) {
        return c1609f.f6726b0;
    }

    /* renamed from: j */
    public static boolean m3535j(io.flutter.view.C1609f c1609f, io.flutter.view.EnumC1607d enumC1607d) {
        return (c1609f.f6728d & enumC1607d.f6691l) != 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [I.m, java.lang.Object] */
    /* renamed from: r */
    public static android.text.SpannableString m3543r(io.flutter.view.C1609f c1609f) {
        ?? obj = new java.lang.Object();
        obj.f876l = c1609f.f6742r;
        obj.f877m = c1609f.f6743s;
        obj.f878n = c1609f.m3551A();
        return obj.m689e();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [I.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [I.m, java.lang.Object] */
    /* renamed from: s */
    public static java.lang.CharSequence m3544s(io.flutter.view.C1609f c1609f) {
        ?? obj = new java.lang.Object();
        obj.f876l = c1609f.f6740p;
        obj.f877m = c1609f.f6741q;
        obj.f879o = c1609f.f6697A;
        obj.f878n = c1609f.m3551A();
        android.text.SpannableString m689e = obj.m689e();
        ?? obj2 = new java.lang.Object();
        obj2.f876l = c1609f.f6748x;
        obj2.f877m = c1609f.f6749y;
        obj2.f878n = c1609f.m3551A();
        java.lang.CharSequence[] charSequenceArr = {m689e, obj2.m689e()};
        java.lang.CharSequence charSequence = null;
        for (int i4 = 0; i4 < 2; i4++) {
            java.lang.CharSequence charSequence2 = charSequenceArr[i4];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : android.text.TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [I.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [I.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [I.m, java.lang.Object] */
    /* renamed from: t */
    public static java.lang.CharSequence m3545t(io.flutter.view.C1609f c1609f) {
        ?? obj = new java.lang.Object();
        obj.f876l = c1609f.f6742r;
        obj.f877m = c1609f.f6743s;
        obj.f878n = c1609f.m3551A();
        android.text.SpannableString m689e = obj.m689e();
        ?? obj2 = new java.lang.Object();
        obj2.f876l = c1609f.f6740p;
        obj2.f877m = c1609f.f6741q;
        obj2.f879o = c1609f.f6697A;
        obj2.f878n = c1609f.m3551A();
        android.text.SpannableString m689e2 = obj2.m689e();
        ?? obj3 = new java.lang.Object();
        obj3.f876l = c1609f.f6748x;
        obj3.f877m = c1609f.f6749y;
        obj3.f878n = c1609f.m3551A();
        java.lang.CharSequence[] charSequenceArr = {m689e, m689e2, obj3.m689e()};
        java.lang.CharSequence charSequence = null;
        for (int i4 = 0; i4 < 3; i4++) {
            java.lang.CharSequence charSequence2 = charSequenceArr[i4];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : android.text.TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    /* renamed from: y */
    public static boolean m3550y(io.flutter.view.C1609f c1609f, io.flutter.view.EnumC1607d enumC1607d) {
        return (c1609f.f6703G & enumC1607d.f6691l) != 0;
    }

    /* renamed from: A */
    public final java.lang.String m3551A() {
        java.lang.String str = this.f6698B;
        return (str == null || str.isEmpty()) ? this.f6723a.f6764m : this.f6698B;
    }

    /* renamed from: B */
    public final java.lang.String m3552B() {
        java.lang.String str;
        if (m3553D(13) && (str = this.f6740p) != null && !str.isEmpty()) {
            return this.f6740p;
        }
        java.util.Iterator it = this.f6715S.iterator();
        while (it.hasNext()) {
            java.lang.String m3552B = ((io.flutter.view.C1609f) it.next()).m3552B();
            if (m3552B != null && !m3552B.isEmpty()) {
                return m3552B;
            }
        }
        return null;
    }

    /* renamed from: D */
    public final boolean m3553D(int i4) {
        return (this.f6727c & ((long) p009B2.AbstractC0051h.m149h(i4))) != 0;
    }

    /* renamed from: E */
    public final io.flutter.view.C1609f m3554E(float[] fArr, boolean z4) {
        float f4 = fArr[3];
        boolean z5 = false;
        float f5 = fArr[0] / f4;
        float f6 = fArr[1] / f4;
        if (f5 < this.f6709M || f5 >= this.f6711O || f6 < this.f6710N || f6 >= this.f6712P) {
            return null;
        }
        float[] fArr2 = new float[4];
        java.util.Iterator it = this.f6716T.iterator();
        while (it.hasNext()) {
            io.flutter.view.C1609f c1609f = (io.flutter.view.C1609f) it.next();
            if (!c1609f.m3553D(14)) {
                if (c1609f.f6720X) {
                    c1609f.f6720X = false;
                    if (c1609f.f6721Y == null) {
                        c1609f.f6721Y = new float[16];
                    }
                    if (!android.opengl.Matrix.invertM(c1609f.f6721Y, 0, c1609f.f6713Q, 0)) {
                        java.util.Arrays.fill(c1609f.f6721Y, 0.0f);
                    }
                }
                android.opengl.Matrix.multiplyMV(fArr2, 0, c1609f.f6721Y, 0, fArr, 0);
                io.flutter.view.C1609f m3554E = c1609f.m3554E(fArr2, z4);
                if (m3554E != null) {
                    return m3554E;
                }
            }
        }
        if (z4 && this.f6733i != -1) {
            z5 = true;
        }
        if (m3555F() || z5) {
            return this;
        }
        return null;
    }

    /* renamed from: F */
    public final boolean m3555F() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if (m3553D(12)) {
            return false;
        }
        if (m3553D(22)) {
            return true;
        }
        int i4 = this.f6728d;
        int i5 = io.flutter.view.C1610g.f6751z;
        return ((i4 & (-61)) == 0 && (this.f6727c & ((long) 10682871)) == 0 && ((str = this.f6740p) == null || str.isEmpty()) && (((str2 = this.f6742r) == null || str2.isEmpty()) && ((str3 = this.f6748x) == null || str3.isEmpty()))) ? false : true;
    }

    /* renamed from: H */
    public final void m3556H(float[] fArr, java.util.HashSet hashSet, boolean z4) {
        hashSet.add(this);
        if (this.f6722Z) {
            z4 = true;
        }
        if (z4) {
            if (this.f6724a0 == null) {
                this.f6724a0 = new float[16];
            }
            if (this.f6713Q == null) {
                this.f6713Q = new float[16];
            }
            android.opengl.Matrix.multiplyMM(this.f6724a0, 0, fArr, 0, this.f6713Q, 0);
            float[] fArr2 = {this.f6709M, this.f6710N, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            m3525G(fArr3, this.f6724a0, fArr2);
            fArr2[0] = this.f6711O;
            fArr2[1] = this.f6710N;
            m3525G(fArr4, this.f6724a0, fArr2);
            fArr2[0] = this.f6711O;
            fArr2[1] = this.f6712P;
            m3525G(fArr5, this.f6724a0, fArr2);
            fArr2[0] = this.f6709M;
            fArr2[1] = this.f6712P;
            m3525G(fArr6, this.f6724a0, fArr2);
            if (this.f6726b0 == null) {
                this.f6726b0 = new android.graphics.Rect();
            }
            this.f6726b0.set(java.lang.Math.round(java.lang.Math.min(fArr3[0], java.lang.Math.min(fArr4[0], java.lang.Math.min(fArr5[0], fArr6[0])))), java.lang.Math.round(java.lang.Math.min(fArr3[1], java.lang.Math.min(fArr4[1], java.lang.Math.min(fArr5[1], fArr6[1])))), java.lang.Math.round(java.lang.Math.max(fArr3[0], java.lang.Math.max(fArr4[0], java.lang.Math.max(fArr5[0], fArr6[0])))), java.lang.Math.round(java.lang.Math.max(fArr3[1], java.lang.Math.max(fArr4[1], java.lang.Math.max(fArr5[1], fArr6[1])))));
            this.f6722Z = false;
        }
        java.util.Iterator it = this.f6715S.iterator();
        int i4 = -1;
        while (it.hasNext()) {
            io.flutter.view.C1609f c1609f = (io.flutter.view.C1609f) it.next();
            c1609f.f6700D = i4;
            i4 = c1609f.f6725b;
            c1609f.m3556H(this.f6724a0, hashSet, z4);
        }
    }

    /* renamed from: z */
    public final void m3557z(java.util.ArrayList arrayList) {
        if (m3553D(12)) {
            arrayList.add(this);
        }
        java.util.Iterator it = this.f6715S.iterator();
        while (it.hasNext()) {
            ((io.flutter.view.C1609f) it.next()).m3557z(arrayList);
        }
    }
}
