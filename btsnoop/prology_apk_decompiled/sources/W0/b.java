package W0;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2728a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2729b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f2730c;

    /* renamed from: d, reason: collision with root package name */
    public int f2731d;

    /* renamed from: e, reason: collision with root package name */
    public int f2732e;

    /* renamed from: f, reason: collision with root package name */
    public int f2733f;

    /* renamed from: g, reason: collision with root package name */
    public int f2734g;

    /* renamed from: h, reason: collision with root package name */
    public int f2735h;

    public b(int i4, int i5) {
        ArrayList arrayList = new ArrayList();
        this.f2728a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f2729b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f2730c = sb;
        this.f2734g = i4;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f2731d = 15;
        this.f2732e = 0;
        this.f2733f = 0;
        this.f2735h = i5;
    }

    public final void a(char c4) {
        StringBuilder sb = this.f2730c;
        if (sb.length() < 32) {
            sb.append(c4);
        }
    }

    public final void b() {
        StringBuilder sb = this.f2730c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f2728a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i4 = aVar.f2727c;
                if (i4 != length) {
                    return;
                }
                aVar.f2727c = i4 - 1;
            }
        }
    }

    public final V.b c(int i4) {
        float f4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f2729b;
            if (i5 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i5));
            spannableStringBuilder.append('\n');
            i5++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i6 = this.f2732e + this.f2733f;
        int length = (32 - i6) - spannableStringBuilder.length();
        int i7 = i6 - length;
        int i8 = i4 != Integer.MIN_VALUE ? i4 : (this.f2734g != 2 || (Math.abs(i7) >= 3 && length >= 0)) ? (this.f2734g != 2 || i7 <= 0) ? 0 : 2 : 1;
        if (i8 != 1) {
            if (i8 == 2) {
                i6 = 32 - length;
            }
            f4 = ((i6 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f4 = 0.5f;
        }
        int i9 = this.f2731d;
        if (i9 > 7) {
            i9 -= 17;
        } else if (this.f2734g == 1) {
            i9 -= this.f2735h - 1;
        }
        return new V.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i9, 1, Integer.MIN_VALUE, f4, i8, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f2730c);
        int length = spannableStringBuilder.length();
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = 0;
        int i9 = 0;
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f2728a;
            if (i8 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i8);
            boolean z5 = aVar.f2726b;
            int i10 = aVar.f2725a;
            if (i10 != 8) {
                boolean z6 = i10 == 7;
                if (i10 != 7) {
                    i7 = c.f2737B[i10];
                }
                z4 = z6;
            }
            int i11 = aVar.f2727c;
            i8++;
            if (i11 != (i8 < arrayList.size() ? ((a) arrayList.get(i8)).f2727c : length)) {
                if (i4 != -1 && !z5) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i4, i11, 33);
                    i4 = -1;
                } else if (i4 == -1 && z5) {
                    i4 = i11;
                }
                if (i5 != -1 && !z4) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i5, i11, 33);
                    i5 = -1;
                } else if (i5 == -1 && z4) {
                    i5 = i11;
                }
                if (i7 != i6) {
                    if (i6 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i6), i9, i11, 33);
                    }
                    i6 = i7;
                    i9 = i11;
                }
            }
        }
        if (i4 != -1 && i4 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
        }
        if (i5 != -1 && i5 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i5, length, 33);
        }
        if (i9 != length && i6 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i6), i9, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.f2728a.isEmpty() && this.f2729b.isEmpty() && this.f2730c.length() == 0;
    }
}
