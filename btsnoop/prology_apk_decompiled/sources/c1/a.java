package c1;

import V.b;
import V0.k;
import V0.l;
import W.c;
import W.r;
import W.y;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import e2.d;
import f2.G;
import f2.I;
import f2.c0;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: l, reason: collision with root package name */
    public final r f4692l = new r();

    /* renamed from: m, reason: collision with root package name */
    public final boolean f4693m;

    /* renamed from: n, reason: collision with root package name */
    public final int f4694n;

    /* renamed from: o, reason: collision with root package name */
    public final int f4695o;

    /* renamed from: p, reason: collision with root package name */
    public final String f4696p;

    /* renamed from: q, reason: collision with root package name */
    public final float f4697q;

    /* renamed from: r, reason: collision with root package name */
    public final int f4698r;

    public a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f4694n = 0;
            this.f4695o = -1;
            this.f4696p = "sans-serif";
            this.f4693m = false;
            this.f4697q = 0.85f;
            this.f4698r = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f4694n = bArr[24];
        this.f4695o = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f4696p = "Serif".equals(new String(bArr, 43, bArr.length - 43, d.f5436c)) ? "serif" : "sans-serif";
        int i4 = bArr[25] * 20;
        this.f4698r = i4;
        boolean z4 = (bArr[0] & 32) != 0;
        this.f4693m = z4;
        if (z4) {
            this.f4697q = y.i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i4, 0.0f, 0.95f);
        } else {
            this.f4697q = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i4, int i5, int i6, int i7, int i8) {
        if (i4 != i5) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i4 >>> 8) | ((i4 & 255) << 24)), i6, i7, i8 | 33);
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, int i4, int i5, int i6, int i7, int i8) {
        if (i4 != i5) {
            int i9 = i8 | 33;
            boolean z4 = (i4 & 1) != 0;
            boolean z5 = (i4 & 2) != 0;
            if (z4) {
                if (z5) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i6, i7, i9);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i6, i7, i9);
                }
            } else if (z5) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i6, i7, i9);
            }
            boolean z6 = (i4 & 4) != 0;
            if (z6) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i6, i7, i9);
            }
            if (z6 || z4 || z5) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i6, i7, i9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // V0.l
    public final void h(byte[] bArr, int i4, int i5, k kVar, c cVar) {
        String s;
        int i6 = 1;
        r rVar = this.f4692l;
        rVar.E(bArr, i4 + i5);
        rVar.G(i4);
        int i7 = 2;
        int i8 = 0;
        W.a.e(rVar.a() >= 2);
        int A4 = rVar.A();
        if (A4 == 0) {
            s = "";
        } else {
            int i9 = rVar.f2695b;
            Charset C4 = rVar.C();
            int i10 = A4 - (rVar.f2695b - i9);
            if (C4 == null) {
                C4 = d.f5436c;
            }
            s = rVar.s(i10, C4);
        }
        if (s.isEmpty()) {
            G g4 = I.f5510m;
            cVar.accept(new V0.a(c0.f5550p, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(s);
        c(spannableStringBuilder, this.f4694n, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f4695o, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f4696p;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f4 = this.f4697q;
        while (rVar.a() >= 8) {
            int i11 = rVar.f2695b;
            int h4 = rVar.h();
            int h5 = rVar.h();
            if (h5 == 1937013100) {
                W.a.e(rVar.a() >= i7 ? i6 : i8);
                int A5 = rVar.A();
                int i12 = i8;
                while (i12 < A5) {
                    W.a.e(rVar.a() >= 12 ? i6 : i8);
                    int A6 = rVar.A();
                    int A7 = rVar.A();
                    rVar.H(i7);
                    int u4 = rVar.u();
                    rVar.H(i6);
                    int h6 = rVar.h();
                    if (A7 > spannableStringBuilder.length()) {
                        W.a.A("Tx3gParser", "Truncating styl end (" + A7 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        A7 = spannableStringBuilder.length();
                    }
                    if (A6 >= A7) {
                        W.a.A("Tx3gParser", "Ignoring styl with start (" + A6 + ") >= end (" + A7 + ").");
                    } else {
                        int i13 = A7;
                        c(spannableStringBuilder, u4, this.f4694n, A6, i13, 0);
                        a(spannableStringBuilder, h6, this.f4695o, A6, i13, 0);
                    }
                    i6 = 1;
                    i12++;
                    i7 = 2;
                    i8 = 0;
                }
            } else if (h5 == 1952608120 && this.f4693m) {
                i7 = 2;
                W.a.e(rVar.a() >= 2 ? i6 : 0);
                f4 = y.i(rVar.A() / this.f4698r, 0.0f, 0.95f);
            } else {
                i7 = 2;
            }
            rVar.G(i11 + h4);
            i8 = 0;
        }
        cVar.accept(new V0.a(I.o(new b(spannableStringBuilder, null, null, null, f4, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f)), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // V0.l
    public final int w() {
        return 2;
    }
}
