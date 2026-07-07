package a1;

import V.b;
import V0.k;
import V0.l;
import W.c;
import W.r;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import e2.d;
import f2.I;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146a implements l {

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f3593o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f3594p = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: l, reason: collision with root package name */
    public final StringBuilder f3595l = new StringBuilder();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f3596m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final r f3597n = new r();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b a(Spanned spanned, String str) {
        char c4;
        char c5;
        float f4;
        if (str == null) {
            return new b(spanned, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        int i4 = (c4 == 0 || c4 == 1 || c4 == 2) ? 0 : (c4 == 3 || c4 == 4 || c4 == 5) ? 2 : 1;
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c5 = 6;
                    break;
                }
                c5 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c5 = 7;
                    break;
                }
                c5 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c5 = '\b';
                    break;
                }
                c5 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c5 = 5;
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        int i5 = (c5 == 0 || c5 == 1 || c5 == 2) ? 2 : (c5 == 3 || c5 == 4 || c5 == 5) ? 0 : 1;
        float f5 = 0.92f;
        if (i4 == 0) {
            f4 = 0.08f;
        } else if (i4 == 1) {
            f4 = 0.5f;
        } else {
            if (i4 != 2) {
                throw new IllegalArgumentException();
            }
            f4 = 0.92f;
        }
        if (i5 == 0) {
            f5 = 0.08f;
        } else if (i5 == 1) {
            f5 = 0.5f;
        } else if (i5 != 2) {
            throw new IllegalArgumentException();
        }
        return new b(spanned, null, null, null, f5, 0, i5, f4, i4, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public static long c(Matcher matcher, int i4) {
        String group = matcher.group(i4 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i4 + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i4 + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i4 + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    @Override // V0.l
    public final void h(byte[] bArr, int i4, int i5, k kVar, c cVar) {
        c cVar2;
        String i6;
        String str;
        c cVar3;
        C0146a c0146a = this;
        c cVar4 = cVar;
        String str2 = "SubripParser";
        r rVar = c0146a.f3597n;
        rVar.E(bArr, i4 + i5);
        rVar.G(i4);
        Charset C4 = rVar.C();
        if (C4 == null) {
            C4 = d.f5436c;
        }
        long j4 = kVar.f2621a;
        ArrayList arrayList = (j4 == -9223372036854775807L || !kVar.f2622b) ? null : new ArrayList();
        while (true) {
            String i7 = rVar.i(C4);
            if (i7 == null) {
                break;
            }
            if (i7.length() != 0) {
                try {
                    Integer.parseInt(i7);
                    i6 = rVar.i(C4);
                } catch (NumberFormatException unused) {
                    cVar2 = cVar4;
                    W.a.A(str2, "Skipping invalid index: ".concat(i7));
                }
                if (i6 == null) {
                    W.a.A(str2, "Unexpected end");
                    break;
                }
                Matcher matcher = f3593o.matcher(i6);
                if (matcher.matches()) {
                    long c4 = c(matcher, 1);
                    long c5 = c(matcher, 6);
                    StringBuilder sb = c0146a.f3595l;
                    sb.setLength(0);
                    ArrayList arrayList2 = c0146a.f3596m;
                    arrayList2.clear();
                    String i8 = rVar.i(C4);
                    while (!TextUtils.isEmpty(i8)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String trim = i8.trim();
                        StringBuilder sb2 = new StringBuilder(trim);
                        Matcher matcher2 = f3594p.matcher(trim);
                        int i9 = 0;
                        while (matcher2.find()) {
                            String group = matcher2.group();
                            arrayList2.add(group);
                            Matcher matcher3 = matcher2;
                            int start = matcher2.start() - i9;
                            int length = group.length();
                            sb2.replace(start, start + length, "");
                            i9 += length;
                            matcher2 = matcher3;
                            str2 = str2;
                        }
                        sb.append(sb2.toString());
                        i8 = rVar.i(C4);
                        str2 = str2;
                    }
                    String str3 = str2;
                    Spanned fromHtml = Html.fromHtml(sb.toString());
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i10);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (j4 == -9223372036854775807L || c4 >= j4) {
                        V0.a aVar = new V0.a(I.o(a(fromHtml, str)), c4, c5 - c4);
                        cVar3 = cVar;
                        cVar3.accept(aVar);
                    } else {
                        if (arrayList != null) {
                            arrayList.add(new V0.a(I.o(a(fromHtml, str)), c4, c5 - c4));
                        }
                        cVar3 = cVar;
                    }
                    cVar4 = cVar3;
                    str2 = str3;
                    c0146a = this;
                } else {
                    cVar2 = cVar4;
                    W.a.A(str2, "Skipping invalid timing: ".concat(i6));
                    cVar4 = cVar2;
                    c0146a = this;
                }
            }
        }
        c cVar5 = cVar4;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cVar5.accept((V0.a) it.next());
            }
        }
    }

    @Override // V0.l
    public final int w() {
        return 1;
    }
}
