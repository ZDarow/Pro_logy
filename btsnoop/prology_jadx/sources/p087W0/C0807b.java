package p087W0;

/* renamed from: W0.b */
/* loaded from: classes.dex */
public final class C0807b {

    /* renamed from: a */
    public final java.util.ArrayList f2820a;

    /* renamed from: b */
    public final java.util.ArrayList f2821b;

    /* renamed from: c */
    public final java.lang.StringBuilder f2822c;

    /* renamed from: d */
    public int f2823d;

    /* renamed from: e */
    public int f2824e;

    /* renamed from: f */
    public int f2825f;

    /* renamed from: g */
    public int f2826g;

    /* renamed from: h */
    public int f2827h;

    public C0807b(int i4, int i5) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f2820a = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f2821b = arrayList2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        this.f2822c = sb;
        this.f2826g = i4;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f2823d = 15;
        this.f2824e = 0;
        this.f2825f = 0;
        this.f2827h = i5;
    }

    /* renamed from: a */
    public final void m1632a(char c4) {
        java.lang.StringBuilder sb = this.f2822c;
        if (sb.length() < 32) {
            sb.append(c4);
        }
    }

    /* renamed from: b */
    public final void m1633b() {
        java.lang.StringBuilder sb = this.f2822c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            java.util.ArrayList arrayList = this.f2820a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                p087W0.C0806a c0806a = (p087W0.C0806a) arrayList.get(size);
                int i4 = c0806a.f2819c;
                if (i4 != length) {
                    return;
                }
                c0806a.f2819c = i4 - 1;
            }
        }
    }

    /* renamed from: c */
    public final p082V.C0757b m1634c(int i4) {
        float f4;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        int i5 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f2821b;
            if (i5 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((java.lang.CharSequence) arrayList.get(i5));
            spannableStringBuilder.append('\n');
            i5++;
        }
        spannableStringBuilder.append((java.lang.CharSequence) m1635d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i6 = this.f2824e + this.f2825f;
        int length = (32 - i6) - spannableStringBuilder.length();
        int i7 = i6 - length;
        int i8 = i4 != Integer.MIN_VALUE ? i4 : (this.f2826g != 2 || (java.lang.Math.abs(i7) >= 3 && length >= 0)) ? (this.f2826g != 2 || i7 <= 0) ? 0 : 2 : 1;
        if (i8 != 1) {
            if (i8 == 2) {
                i6 = 32 - length;
            }
            f4 = ((i6 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f4 = 0.5f;
        }
        int i9 = this.f2823d;
        if (i9 > 7) {
            i9 -= 17;
        } else if (this.f2826g == 1) {
            i9 -= this.f2827h - 1;
        }
        return new p082V.C0757b(spannableStringBuilder, android.text.Layout.Alignment.ALIGN_NORMAL, null, null, i9, 1, Integer.MIN_VALUE, f4, i8, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    /* renamed from: d */
    public final android.text.SpannableString m1635d() {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(this.f2822c);
        int length = spannableStringBuilder.length();
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = 0;
        int i9 = 0;
        boolean z4 = false;
        while (true) {
            java.util.ArrayList arrayList = this.f2820a;
            if (i8 >= arrayList.size()) {
                break;
            }
            p087W0.C0806a c0806a = (p087W0.C0806a) arrayList.get(i8);
            boolean z5 = c0806a.f2818b;
            int i10 = c0806a.f2817a;
            if (i10 != 8) {
                boolean z6 = i10 == 7;
                if (i10 != 7) {
                    i7 = p087W0.C0808c.f2829B[i10];
                }
                z4 = z6;
            }
            int i11 = c0806a.f2819c;
            i8++;
            if (i11 != (i8 < arrayList.size() ? ((p087W0.C0806a) arrayList.get(i8)).f2819c : length)) {
                if (i4 != -1 && !z5) {
                    spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i4, i11, 33);
                    i4 = -1;
                } else if (i4 == -1 && z5) {
                    i4 = i11;
                }
                if (i5 != -1 && !z4) {
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i5, i11, 33);
                    i5 = -1;
                } else if (i5 == -1 && z4) {
                    i5 = i11;
                }
                if (i7 != i6) {
                    if (i6 != -1) {
                        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i6), i9, i11, 33);
                    }
                    i6 = i7;
                    i9 = i11;
                }
            }
        }
        if (i4 != -1 && i4 != length) {
            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i4, length, 33);
        }
        if (i5 != -1 && i5 != length) {
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i5, length, 33);
        }
        if (i9 != length && i6 != -1) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i6), i9, length, 33);
        }
        return new android.text.SpannableString(spannableStringBuilder);
    }

    /* renamed from: e */
    public final boolean m1636e() {
        return this.f2820a.isEmpty() && this.f2821b.isEmpty() && this.f2822c.length() == 0;
    }
}
