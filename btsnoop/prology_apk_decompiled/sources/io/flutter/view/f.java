package io.flutter.view;

import B2.AbstractC0007h;
import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: A */
    public String f6455A;

    /* renamed from: B */
    public String f6456B;

    /* renamed from: C */
    public int f6457C;

    /* renamed from: F */
    public long f6460F;

    /* renamed from: G */
    public int f6461G;

    /* renamed from: H */
    public int f6462H;

    /* renamed from: I */
    public int f6463I;
    public float J;

    /* renamed from: K */
    public String f6464K;

    /* renamed from: L */
    public String f6465L;

    /* renamed from: M */
    public float f6466M;

    /* renamed from: N */
    public float f6467N;

    /* renamed from: O */
    public float f6468O;

    /* renamed from: P */
    public float f6469P;

    /* renamed from: Q */
    public float[] f6470Q;

    /* renamed from: R */
    public f f6471R;

    /* renamed from: U */
    public ArrayList f6474U;

    /* renamed from: V */
    public e f6475V;

    /* renamed from: W */
    public e f6476W;

    /* renamed from: Y */
    public float[] f6478Y;

    /* renamed from: a */
    public final g f6480a;

    /* renamed from: a0 */
    public float[] f6481a0;

    /* renamed from: b0 */
    public Rect f6483b0;

    /* renamed from: c */
    public long f6484c;

    /* renamed from: d */
    public int f6485d;

    /* renamed from: e */
    public int f6486e;

    /* renamed from: f */
    public int f6487f;

    /* renamed from: g */
    public int f6488g;

    /* renamed from: h */
    public int f6489h;

    /* renamed from: i */
    public int f6490i;

    /* renamed from: j */
    public int f6491j;

    /* renamed from: k */
    public int f6492k;

    /* renamed from: l */
    public float f6493l;

    /* renamed from: m */
    public float f6494m;

    /* renamed from: n */
    public float f6495n;

    /* renamed from: o */
    public String f6496o;

    /* renamed from: p */
    public String f6497p;

    /* renamed from: q */
    public ArrayList f6498q;

    /* renamed from: r */
    public String f6499r;
    public ArrayList s;

    /* renamed from: t */
    public String f6500t;

    /* renamed from: u */
    public ArrayList f6501u;

    /* renamed from: v */
    public String f6502v;
    public ArrayList w;

    /* renamed from: x */
    public String f6503x;

    /* renamed from: y */
    public ArrayList f6504y;

    /* renamed from: z */
    public String f6505z;

    /* renamed from: b */
    public int f6482b = -1;

    /* renamed from: D */
    public int f6458D = -1;

    /* renamed from: E */
    public boolean f6459E = false;

    /* renamed from: S */
    public final ArrayList f6472S = new ArrayList();

    /* renamed from: T */
    public final ArrayList f6473T = new ArrayList();

    /* renamed from: X */
    public boolean f6477X = true;

    /* renamed from: Z */
    public boolean f6479Z = true;

    public f(g gVar) {
        this.f6480a = gVar;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [io.flutter.view.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [io.flutter.view.h, io.flutter.view.j, java.lang.Object] */
    public static ArrayList C(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i4 = byteBuffer.getInt();
        if (i4 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i4);
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = byteBuffer.getInt();
            int i7 = byteBuffer.getInt();
            int i8 = L.j.c(2)[byteBuffer.getInt()];
            int b4 = L.j.b(i8);
            if (b4 == 0) {
                byteBuffer.getInt();
                ?? obj = new Object();
                obj.f6531a = i6;
                obj.f6532b = i7;
                obj.f6533c = i8;
                arrayList.add(obj);
            } else if (b4 == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                ?? obj2 = new Object();
                obj2.f6531a = i6;
                obj2.f6532b = i7;
                obj2.f6533c = i8;
                obj2.f6530d = StandardCharsets.UTF_8.decode(byteBuffer2).toString();
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static void G(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f4 = fArr[3];
        fArr[0] = fArr[0] / f4;
        fArr[1] = fArr[1] / f4;
        fArr[2] = fArr[2] / f4;
        fArr[3] = 0.0f;
    }

    public static Rect d(f fVar) {
        return fVar.f6483b0;
    }

    public static boolean j(f fVar, d dVar) {
        return (fVar.f6485d & dVar.f6449l) != 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [I.m, java.lang.Object] */
    public static SpannableString r(f fVar) {
        ?? obj = new Object();
        obj.f847l = fVar.f6499r;
        obj.f848m = fVar.s;
        obj.f849n = fVar.A();
        return obj.e();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [I.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [I.m, java.lang.Object] */
    public static CharSequence s(f fVar) {
        ?? obj = new Object();
        obj.f847l = fVar.f6497p;
        obj.f848m = fVar.f6498q;
        obj.f850o = fVar.f6455A;
        obj.f849n = fVar.A();
        SpannableString e4 = obj.e();
        ?? obj2 = new Object();
        obj2.f847l = fVar.f6503x;
        obj2.f848m = fVar.f6504y;
        obj2.f849n = fVar.A();
        CharSequence[] charSequenceArr = {e4, obj2.e()};
        CharSequence charSequence = null;
        for (int i4 = 0; i4 < 2; i4++) {
            CharSequence charSequence2 = charSequenceArr[i4];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [I.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [I.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [I.m, java.lang.Object] */
    public static CharSequence t(f fVar) {
        ?? obj = new Object();
        obj.f847l = fVar.f6499r;
        obj.f848m = fVar.s;
        obj.f849n = fVar.A();
        SpannableString e4 = obj.e();
        ?? obj2 = new Object();
        obj2.f847l = fVar.f6497p;
        obj2.f848m = fVar.f6498q;
        obj2.f850o = fVar.f6455A;
        obj2.f849n = fVar.A();
        SpannableString e5 = obj2.e();
        ?? obj3 = new Object();
        obj3.f847l = fVar.f6503x;
        obj3.f848m = fVar.f6504y;
        obj3.f849n = fVar.A();
        CharSequence[] charSequenceArr = {e4, e5, obj3.e()};
        CharSequence charSequence = null;
        for (int i4 = 0; i4 < 3; i4++) {
            CharSequence charSequence2 = charSequenceArr[i4];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    public static boolean y(f fVar, d dVar) {
        return (fVar.f6461G & dVar.f6449l) != 0;
    }

    public final String A() {
        String str = this.f6456B;
        return (str == null || str.isEmpty()) ? this.f6480a.f6519m : this.f6456B;
    }

    public final String B() {
        String str;
        if (D(13) && (str = this.f6497p) != null && !str.isEmpty()) {
            return this.f6497p;
        }
        Iterator it = this.f6472S.iterator();
        while (it.hasNext()) {
            String B4 = ((f) it.next()).B();
            if (B4 != null && !B4.isEmpty()) {
                return B4;
            }
        }
        return null;
    }

    public final boolean D(int i4) {
        return (this.f6484c & ((long) AbstractC0007h.h(i4))) != 0;
    }

    public final f E(float[] fArr, boolean z4) {
        float f4 = fArr[3];
        boolean z5 = false;
        float f5 = fArr[0] / f4;
        float f6 = fArr[1] / f4;
        if (f5 < this.f6466M || f5 >= this.f6468O || f6 < this.f6467N || f6 >= this.f6469P) {
            return null;
        }
        float[] fArr2 = new float[4];
        Iterator it = this.f6473T.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (!fVar.D(14)) {
                if (fVar.f6477X) {
                    fVar.f6477X = false;
                    if (fVar.f6478Y == null) {
                        fVar.f6478Y = new float[16];
                    }
                    if (!Matrix.invertM(fVar.f6478Y, 0, fVar.f6470Q, 0)) {
                        Arrays.fill(fVar.f6478Y, 0.0f);
                    }
                }
                Matrix.multiplyMV(fArr2, 0, fVar.f6478Y, 0, fArr, 0);
                f E3 = fVar.E(fArr2, z4);
                if (E3 != null) {
                    return E3;
                }
            }
        }
        if (z4 && this.f6490i != -1) {
            z5 = true;
        }
        if (F() || z5) {
            return this;
        }
        return null;
    }

    public final boolean F() {
        String str;
        String str2;
        String str3;
        if (D(12)) {
            return false;
        }
        if (D(22)) {
            return true;
        }
        int i4 = this.f6485d;
        int i5 = g.f6506z;
        return ((i4 & (-61)) == 0 && (this.f6484c & ((long) 10682871)) == 0 && ((str = this.f6497p) == null || str.isEmpty()) && (((str2 = this.f6499r) == null || str2.isEmpty()) && ((str3 = this.f6503x) == null || str3.isEmpty()))) ? false : true;
    }

    public final void H(float[] fArr, HashSet hashSet, boolean z4) {
        hashSet.add(this);
        if (this.f6479Z) {
            z4 = true;
        }
        if (z4) {
            if (this.f6481a0 == null) {
                this.f6481a0 = new float[16];
            }
            if (this.f6470Q == null) {
                this.f6470Q = new float[16];
            }
            Matrix.multiplyMM(this.f6481a0, 0, fArr, 0, this.f6470Q, 0);
            float[] fArr2 = {this.f6466M, this.f6467N, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            G(fArr3, this.f6481a0, fArr2);
            fArr2[0] = this.f6468O;
            fArr2[1] = this.f6467N;
            G(fArr4, this.f6481a0, fArr2);
            fArr2[0] = this.f6468O;
            fArr2[1] = this.f6469P;
            G(fArr5, this.f6481a0, fArr2);
            fArr2[0] = this.f6466M;
            fArr2[1] = this.f6469P;
            G(fArr6, this.f6481a0, fArr2);
            if (this.f6483b0 == null) {
                this.f6483b0 = new Rect();
            }
            this.f6483b0.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f6479Z = false;
        }
        Iterator it = this.f6472S.iterator();
        int i4 = -1;
        while (it.hasNext()) {
            f fVar = (f) it.next();
            fVar.f6458D = i4;
            i4 = fVar.f6482b;
            fVar.H(this.f6481a0, hashSet, z4);
        }
    }

    public final void z(ArrayList arrayList) {
        if (D(12)) {
            arrayList.add(this);
        }
        Iterator it = this.f6472S.iterator();
        while (it.hasNext()) {
            ((f) it.next()).z(arrayList);
        }
    }
}
