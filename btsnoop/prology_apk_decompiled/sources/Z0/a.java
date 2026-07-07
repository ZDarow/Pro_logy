package Z0;

import B2.AbstractC0007h;
import T.C0087h;
import V0.k;
import V0.l;
import W.r;
import W.y;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f3147r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3148l;

    /* renamed from: m, reason: collision with root package name */
    public final C0087h f3149m;

    /* renamed from: o, reason: collision with root package name */
    public LinkedHashMap f3151o;

    /* renamed from: p, reason: collision with root package name */
    public float f3152p = -3.4028235E38f;

    /* renamed from: q, reason: collision with root package name */
    public float f3153q = -3.4028235E38f;

    /* renamed from: n, reason: collision with root package name */
    public final r f3150n = new r();

    public a(List list) {
        if (list == null || list.isEmpty()) {
            this.f3148l = false;
            this.f3149m = null;
            return;
        }
        this.f3148l = true;
        String p2 = y.p((byte[]) list.get(0));
        W.a.e(p2.startsWith("Format:"));
        C0087h c4 = C0087h.c(p2);
        c4.getClass();
        this.f3149m = c4;
        c(new r((byte[]) list.get(1)), e2.d.f5436c);
    }

    public static int a(long j4, ArrayList arrayList, ArrayList arrayList2) {
        int i4;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j4) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j4) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, Long.valueOf(j4));
        arrayList2.add(i4, i4 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i4 - 1)));
        return i4;
    }

    public static long d(String str) {
        Matcher matcher = f3147r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i4 = y.f2709a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x02aa, code lost:
    
        if (r4 != 3) goto L160;
     */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0035 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(W.r r38, java.nio.charset.Charset r39) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.a.c(W.r, java.nio.charset.Charset):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:92:0x0226. Please report as an issue. */
    @Override // V0.l
    public final void h(byte[] bArr, int i4, int i5, k kVar, W.c cVar) {
        Charset charset;
        C0087h c0087h;
        r rVar;
        int i6;
        float f4;
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i8;
        PointF pointF;
        int i9;
        int i10;
        float f5;
        float f6;
        float f7;
        float f8;
        int i11;
        int i12;
        float f9;
        int i13;
        int i14;
        Integer num;
        int i15;
        int i16;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        r rVar2 = aVar.f3150n;
        rVar2.E(bArr, i4 + i5);
        rVar2.G(i4);
        Charset C4 = rVar2.C();
        if (C4 == null) {
            C4 = e2.d.f5436c;
        }
        boolean z4 = aVar.f3148l;
        if (!z4) {
            aVar.c(rVar2, C4);
        }
        C0087h c0087h2 = z4 ? aVar.f3149m : null;
        while (true) {
            String i17 = rVar2.i(C4);
            if (i17 == null) {
                long j4 = kVar.f2621a;
                ArrayList arrayList3 = (j4 == -9223372036854775807L || !kVar.f2622b) ? null : new ArrayList();
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    List list = (List) arrayList.get(i18);
                    if (!list.isEmpty() || i18 == 0) {
                        if (i18 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long longValue = ((Long) arrayList2.get(i18)).longValue();
                        long longValue2 = ((Long) arrayList2.get(i18 + 1)).longValue() - ((Long) arrayList2.get(i18)).longValue();
                        if (j4 == -9223372036854775807L || longValue >= j4) {
                            cVar.accept(new V0.a(list, longValue, longValue2));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new V0.a(list, longValue, longValue2));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        cVar.accept((V0.a) it.next());
                    }
                    return;
                }
                return;
            }
            if (i17.startsWith("Format:")) {
                c0087h2 = C0087h.c(i17);
            } else {
                if (i17.startsWith("Dialogue:")) {
                    if (c0087h2 == null) {
                        W.a.A("SsaParser", "Skipping dialogue line before complete format: ".concat(i17));
                    } else {
                        W.a.e(i17.startsWith("Dialogue:"));
                        String substring = i17.substring(9);
                        int i19 = c0087h2.f2249e;
                        String[] split = substring.split(",", i19);
                        if (split.length != i19) {
                            W.a.A("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(i17));
                        } else {
                            r rVar3 = rVar2;
                            long d4 = d(split[c0087h2.f2245a]);
                            if (d4 == -9223372036854775807L) {
                                W.a.A("SsaParser", "Skipping invalid timing: ".concat(i17));
                            } else {
                                long d5 = d(split[c0087h2.f2246b]);
                                if (d5 == -9223372036854775807L) {
                                    W.a.A("SsaParser", "Skipping invalid timing: ".concat(i17));
                                } else {
                                    LinkedHashMap linkedHashMap = aVar.f3151o;
                                    charset = C4;
                                    d dVar = (linkedHashMap == null || (i16 = c0087h2.f2247c) == -1) ? null : (d) linkedHashMap.get(split[i16].trim());
                                    String str = split[c0087h2.f2248d];
                                    Matcher matcher = c.f3165a.matcher(str);
                                    int i20 = -1;
                                    PointF pointF2 = null;
                                    while (matcher.find()) {
                                        C0087h c0087h3 = c0087h2;
                                        String group = matcher.group(1);
                                        group.getClass();
                                        try {
                                            PointF a4 = c.a(group);
                                            if (a4 != null) {
                                                pointF2 = a4;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = c.f3168d.matcher(group);
                                            if (matcher2.find()) {
                                                String group2 = matcher2.group(1);
                                                group2.getClass();
                                                i15 = d.a(group2);
                                            } else {
                                                i15 = -1;
                                            }
                                            if (i15 != -1) {
                                                i20 = i15;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        c0087h2 = c0087h3;
                                    }
                                    c0087h = c0087h2;
                                    String replace = c.f3165a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f10 = aVar.f3152p;
                                    float f11 = aVar.f3153q;
                                    SpannableString spannableString = new SpannableString(replace);
                                    if (dVar != null) {
                                        Integer num2 = dVar.f3171c;
                                        if (num2 != null) {
                                            rVar = rVar3;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            rVar = rVar3;
                                        }
                                        if (dVar.f3178j == 3 && (num = dVar.f3172d) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f12 = dVar.f3173e;
                                        if (f12 == -3.4028235E38f || f11 == -3.4028235E38f) {
                                            f8 = -3.4028235E38f;
                                            i11 = Integer.MIN_VALUE;
                                        } else {
                                            f8 = f12 / f11;
                                            i11 = 1;
                                        }
                                        boolean z5 = dVar.f3175g;
                                        boolean z6 = dVar.f3174f;
                                        if (z6 && z5) {
                                            i12 = i11;
                                            f9 = f8;
                                            i13 = 0;
                                            i14 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i12 = i11;
                                            f9 = f8;
                                            i13 = 0;
                                            i14 = 33;
                                            if (z6) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z5) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (dVar.f3176h) {
                                            spannableString.setSpan(new UnderlineSpan(), i13, spannableString.length(), i14);
                                        }
                                        if (dVar.f3177i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i13, spannableString.length(), i14);
                                        }
                                        i6 = i20;
                                        f4 = f9;
                                        i7 = i12;
                                    } else {
                                        rVar = rVar3;
                                        i6 = i20;
                                        f4 = -3.4028235E38f;
                                        i7 = Integer.MIN_VALUE;
                                    }
                                    int i21 = -1;
                                    if (i6 != -1) {
                                        i21 = i6;
                                    } else if (dVar != null) {
                                        i21 = dVar.f3170b;
                                    }
                                    switch (i21) {
                                        case 0:
                                        default:
                                            AbstractC0007h.o(i21, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            alignment2 = null;
                                            break;
                                        case 1:
                                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            alignment2 = alignment;
                                            break;
                                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            alignment2 = alignment;
                                            break;
                                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            alignment2 = alignment;
                                            break;
                                    }
                                    int i22 = Integer.MIN_VALUE;
                                    switch (i21) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            AbstractC0007h.o(i21, "Unknown alignment: ", "SsaParser");
                                            break;
                                        case 1:
                                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                            i8 = 0;
                                            break;
                                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                                            i8 = 1;
                                            break;
                                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                        case 9:
                                            i8 = 2;
                                            break;
                                    }
                                    i8 = Integer.MIN_VALUE;
                                    switch (i21) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            AbstractC0007h.o(i21, "Unknown alignment: ", "SsaParser");
                                            break;
                                        case 1:
                                        case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                                        case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                                            pointF = pointF2;
                                            i22 = 2;
                                            break;
                                        case L.k.LONG_FIELD_NUMBER /* 4 */:
                                        case L.k.STRING_FIELD_NUMBER /* 5 */:
                                        case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                            pointF = pointF2;
                                            i22 = 1;
                                            break;
                                        case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                        case L.k.BYTES_FIELD_NUMBER /* 8 */:
                                        case 9:
                                            pointF = pointF2;
                                            i22 = 0;
                                            break;
                                    }
                                    pointF = pointF2;
                                    if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
                                        float f13 = 0.95f;
                                        if (i8 != 0) {
                                            i9 = 1;
                                            if (i8 != 1) {
                                                i10 = 2;
                                                f5 = i8 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i10 = 2;
                                                f5 = 0.5f;
                                            }
                                        } else {
                                            i9 = 1;
                                            i10 = 2;
                                            f5 = 0.05f;
                                        }
                                        if (i22 == 0) {
                                            f13 = 0.05f;
                                        } else if (i22 == i9) {
                                            f13 = 0.5f;
                                        } else if (i22 != i10) {
                                            f13 = -3.4028235E38f;
                                        }
                                        f6 = f13;
                                        f7 = f5;
                                    } else {
                                        float f14 = pointF.x / f10;
                                        f6 = pointF.y / f11;
                                        f7 = f14;
                                    }
                                    V.b bVar = new V.b(spannableString, alignment2, null, null, f6, 0, i22, f7, i8, i7, f4, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                    int a5 = a(d5, arrayList2, arrayList);
                                    for (int a6 = a(d4, arrayList2, arrayList); a6 < a5; a6++) {
                                        ((List) arrayList.get(a6)).add(bVar);
                                    }
                                    aVar = this;
                                    C4 = charset;
                                    c0087h2 = c0087h;
                                    rVar2 = rVar;
                                }
                            }
                            charset = C4;
                            c0087h = c0087h2;
                            rVar = rVar3;
                            aVar = this;
                            C4 = charset;
                            c0087h2 = c0087h;
                            rVar2 = rVar;
                        }
                    }
                }
                charset = C4;
                c0087h = c0087h2;
                rVar = rVar2;
                aVar = this;
                C4 = charset;
                c0087h2 = c0087h;
                rVar2 = rVar;
            }
        }
    }

    @Override // V0.l
    public final int w() {
        return 1;
    }
}
