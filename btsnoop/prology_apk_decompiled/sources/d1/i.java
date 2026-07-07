package d1;

import L.k;
import W.r;
import W.y;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f4969a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f4970b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f4971c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f4972d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f4971c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f4972d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String str, C0236f c0236f, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c4;
        int i4;
        int i5 = c0236f.f4953b;
        int length = spannableStringBuilder.length();
        String str2 = c0236f.f4952a;
        str2.getClass();
        int i6 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 117:
                if (str2.equals("u")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
            case k.STRING_FIELD_NUMBER /* 5 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i5, length, 33);
                break;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                for (String str3 : c0236f.f4955d) {
                    Map map = f4971c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i5, length, 33);
                    } else {
                        Map map2 = f4972d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i5, length, 33);
                        }
                    }
                }
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                spannableStringBuilder.setSpan(new StyleSpan(2), i5, length, 33);
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i5, length, 33);
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                int c5 = c(list2, str, c0236f);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C0235e.f4949c);
                int i7 = c0236f.f4953b;
                int i8 = 0;
                int i9 = 0;
                while (i8 < arrayList.size()) {
                    if ("rt".equals(((C0235e) arrayList.get(i8)).f4950a.f4952a)) {
                        C0235e c0235e = (C0235e) arrayList.get(i8);
                        int c6 = c(list2, str, c0235e.f4950a);
                        if (c6 == i6) {
                            c6 = c5 != i6 ? c5 : 1;
                        }
                        int i10 = c0235e.f4950a.f4953b - i9;
                        int i11 = c0235e.f4951b - i9;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i10, i11);
                        spannableStringBuilder.delete(i10, i11);
                        spannableStringBuilder.setSpan(new V.f(subSequence.toString(), c6), i7, i10, 33);
                        i9 = subSequence.length() + i9;
                        i7 = i10;
                    }
                    i8++;
                    i6 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b4 = b(list2, str, c0236f);
        for (int i12 = 0; i12 < b4.size(); i12++) {
            C0233c c0233c = ((C0237g) b4.get(i12)).f4957m;
            int i13 = c0233c.f4940k;
            if (i13 == -1 && c0233c.f4941l == -1) {
                i4 = -1;
            } else {
                i4 = (c0233c.f4941l == 1 ? (char) 2 : (char) 0) | (i13 == 1 ? (char) 1 : (char) 0);
            }
            if (i4 != -1) {
                int i14 = c0233c.f4940k;
                AbstractC0462a.d(spannableStringBuilder, new StyleSpan((i14 == -1 && c0233c.f4941l == -1) ? -1 : (i14 == 1 ? 1 : 0) | (c0233c.f4941l == 1 ? 2 : 0)), i5, length);
            }
            if (c0233c.f4939j == 1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i5, length, 33);
            }
            if (c0233c.f4936g) {
                if (!c0233c.f4936g) {
                    throw new IllegalStateException("Font color not defined");
                }
                AbstractC0462a.d(spannableStringBuilder, new ForegroundColorSpan(c0233c.f4935f), i5, length);
            }
            if (c0233c.f4938i) {
                if (!c0233c.f4938i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                AbstractC0462a.d(spannableStringBuilder, new BackgroundColorSpan(c0233c.f4937h), i5, length);
            }
            if (c0233c.f4934e != null) {
                AbstractC0462a.d(spannableStringBuilder, new TypefaceSpan(c0233c.f4934e), i5, length);
            }
            int i15 = c0233c.f4942m;
            if (i15 == 1) {
                AbstractC0462a.d(spannableStringBuilder, new AbsoluteSizeSpan((int) c0233c.f4943n, true), i5, length);
            } else if (i15 == 2) {
                AbstractC0462a.d(spannableStringBuilder, new RelativeSizeSpan(c0233c.f4943n), i5, length);
            } else if (i15 == 3) {
                AbstractC0462a.d(spannableStringBuilder, new RelativeSizeSpan(c0233c.f4943n / 100.0f), i5, length);
            }
            if (c0233c.f4945p) {
                spannableStringBuilder.setSpan(new Object(), i5, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, C0236f c0236f) {
        int i4;
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            C0233c c0233c = (C0233c) list.get(i5);
            String str2 = c0236f.f4952a;
            if (c0233c.f4930a.isEmpty() && c0233c.f4931b.isEmpty() && c0233c.f4932c.isEmpty() && c0233c.f4933d.isEmpty()) {
                i4 = TextUtils.isEmpty(str2);
            } else {
                int a4 = C0233c.a(C0233c.a(C0233c.a(0, 1073741824, c0233c.f4930a, str), 2, c0233c.f4931b, str2), 4, c0233c.f4933d, c0236f.f4954c);
                if (a4 != -1) {
                    if (c0236f.f4955d.containsAll(c0233c.f4932c)) {
                        i4 = a4 + (c0233c.f4932c.size() * 4);
                    }
                }
                i4 = 0;
            }
            if (i4 > 0) {
                arrayList.add(new C0237g(i4, c0233c));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, C0236f c0236f) {
        ArrayList b4 = b(list, str, c0236f);
        for (int i4 = 0; i4 < b4.size(); i4++) {
            int i5 = ((C0237g) b4.get(i4)).f4957m.f4944o;
            if (i5 != -1) {
                return i5;
            }
        }
        return -1;
    }

    public static C0234d d(String str, Matcher matcher, r rVar, ArrayList arrayList) {
        h hVar = new h();
        try {
            String group = matcher.group(1);
            group.getClass();
            hVar.f4958a = j.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            hVar.f4959b = j.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, hVar);
            StringBuilder sb = new StringBuilder();
            rVar.getClass();
            String i4 = rVar.i(e2.d.f5436c);
            while (!TextUtils.isEmpty(i4)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(i4.trim());
                i4 = rVar.i(e2.d.f5436c);
            }
            hVar.f4960c = f(str, sb.toString(), arrayList);
            return new C0234d(hVar.a().a(), hVar.f4958a, hVar.f4959b);
        } catch (NumberFormatException unused) {
            W.a.A("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static void e(String str, h hVar) {
        char c4;
        int i4;
        char c5;
        int i5;
        int i6;
        Matcher matcher = f4970b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    g(group2, hVar);
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c4 = 0;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c4 = 1;
                                break;
                            }
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c4 = 2;
                                break;
                            }
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c4 = 3;
                                break;
                            }
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c4 = 4;
                                break;
                            }
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c4 = 5;
                                break;
                            }
                            break;
                    }
                    c4 = 65535;
                    switch (c4) {
                        case 0:
                        case 1:
                            break;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            i4 = 3;
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            i4 = 4;
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            i4 = 5;
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            i4 = 1;
                            break;
                        default:
                            W.a.A("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            break;
                    }
                    i4 = 2;
                    hVar.f4961d = i4;
                } else if ("position".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        substring.getClass();
                        switch (substring.hashCode()) {
                            case -1842484672:
                                if (substring.equals("line-left")) {
                                    c5 = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c5 = 1;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (substring.equals("line-right")) {
                                    c5 = 2;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c5 = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c5 = 4;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    c5 = 5;
                                    break;
                                }
                                break;
                        }
                        c5 = 65535;
                        switch (c5) {
                            case 0:
                            case k.STRING_FIELD_NUMBER /* 5 */:
                                i5 = 0;
                                break;
                            case 1:
                            case k.INTEGER_FIELD_NUMBER /* 3 */:
                                i5 = 1;
                                break;
                            case k.FLOAT_FIELD_NUMBER /* 2 */:
                            case k.LONG_FIELD_NUMBER /* 4 */:
                                i5 = 2;
                                break;
                            default:
                                W.a.A("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                i5 = Integer.MIN_VALUE;
                                break;
                        }
                        hVar.f4966i = i5;
                        group2 = group2.substring(0, indexOf);
                    }
                    hVar.f4965h = j.b(group2);
                } else if ("size".equals(group)) {
                    hVar.f4967j = j.b(group2);
                } else if ("vertical".equals(group)) {
                    if (group2.equals("lr")) {
                        i6 = 2;
                    } else if (group2.equals("rl")) {
                        i6 = 1;
                    } else {
                        W.a.A("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                        i6 = Integer.MIN_VALUE;
                    }
                    hVar.f4968k = i6;
                } else {
                    W.a.A("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                }
            } catch (NumberFormatException unused) {
                W.a.A("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x00fb. Please report as an issue. */
    public static SpannedString f(String str, String str2, List list) {
        int i4;
        int i5;
        char c4;
        int i6;
        char c5;
        int i7 = -1;
        int i8 = 2;
        int i9 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            String str3 = "";
            if (i10 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (C0236f) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new C0236f("", 0, "", Collections.emptySet()), Collections.emptyList(), spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char charAt = str2.charAt(i10);
            if (charAt != '&') {
                if (charAt != '<') {
                    spannableStringBuilder.append(charAt);
                    i10 += i9;
                } else {
                    int i11 = i10 + 1;
                    if (i11 >= str2.length()) {
                        i10 = i11;
                    } else {
                        int i12 = str2.charAt(i11) == '/' ? i9 : 0;
                        int indexOf = str2.indexOf(62, i11);
                        int length = indexOf == i7 ? str2.length() : indexOf + i9;
                        int i13 = length - 2;
                        int i14 = str2.charAt(i13) == '/' ? i9 : 0;
                        int i15 = i10 + (i12 != 0 ? i8 : i9);
                        if (i14 == 0) {
                            i13 = length - 1;
                        }
                        String substring = str2.substring(i15, i13);
                        if (!substring.trim().isEmpty()) {
                            String trim = substring.trim();
                            W.a.e(trim.isEmpty() ^ i9);
                            int i16 = y.f2709a;
                            String str4 = trim.split("[ \\.]", i8)[0];
                            str4.getClass();
                            switch (str4.hashCode()) {
                                case 98:
                                    if (str4.equals("b")) {
                                        i6 = 0;
                                        break;
                                    }
                                    break;
                                case 99:
                                    if (str4.equals("c")) {
                                        i6 = i9;
                                        break;
                                    }
                                    break;
                                case 105:
                                    if (str4.equals("i")) {
                                        i6 = i8;
                                        break;
                                    }
                                    break;
                                case 117:
                                    if (str4.equals("u")) {
                                        i6 = 3;
                                        break;
                                    }
                                    break;
                                case 118:
                                    if (str4.equals("v")) {
                                        i6 = 4;
                                        break;
                                    }
                                    break;
                                case 3650:
                                    if (str4.equals("rt")) {
                                        i6 = 5;
                                        break;
                                    }
                                    break;
                                case 3314158:
                                    if (str4.equals("lang")) {
                                        i6 = 6;
                                        break;
                                    }
                                    break;
                                case 3511770:
                                    if (str4.equals("ruby")) {
                                        i6 = 7;
                                        break;
                                    }
                                    break;
                            }
                            i6 = -1;
                            switch (i6) {
                                case 0:
                                case 1:
                                case k.FLOAT_FIELD_NUMBER /* 2 */:
                                case k.INTEGER_FIELD_NUMBER /* 3 */:
                                case k.LONG_FIELD_NUMBER /* 4 */:
                                case k.STRING_FIELD_NUMBER /* 5 */:
                                case k.STRING_SET_FIELD_NUMBER /* 6 */:
                                case k.DOUBLE_FIELD_NUMBER /* 7 */:
                                    if (i12 == 0) {
                                        if (i14 == 0) {
                                            int length2 = spannableStringBuilder.length();
                                            String trim2 = substring.trim();
                                            W.a.e(trim2.isEmpty() ^ i9);
                                            int indexOf2 = trim2.indexOf(" ");
                                            if (indexOf2 == -1) {
                                                c5 = 0;
                                            } else {
                                                str3 = trim2.substring(indexOf2).trim();
                                                c5 = 0;
                                                trim2 = trim2.substring(0, indexOf2);
                                            }
                                            String[] split = trim2.split("\\.", -1);
                                            String str5 = split[c5];
                                            HashSet hashSet = new HashSet();
                                            for (int i17 = i9; i17 < split.length; i17 += i9) {
                                                hashSet.add(split[i17]);
                                            }
                                            arrayDeque.push(new C0236f(str5, length2, str3, hashSet));
                                        }
                                        i10 = length;
                                        i5 = i9;
                                        i4 = -1;
                                        break;
                                    }
                                    while (!arrayDeque.isEmpty()) {
                                        C0236f c0236f = (C0236f) arrayDeque.pop();
                                        a(str, c0236f, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new C0235e(c0236f, spannableStringBuilder.length()));
                                        }
                                        if (c0236f.f4952a.equals(str4)) {
                                            i10 = length;
                                            i5 = i9;
                                            i4 = -1;
                                        }
                                    }
                                    i10 = length;
                                    i5 = i9;
                                    i4 = -1;
                            }
                        }
                        i10 = length;
                        i7 = -1;
                    }
                }
                i5 = i9;
                i4 = i7;
            } else {
                i10 += i9;
                int indexOf3 = str2.indexOf(59, i10);
                int indexOf4 = str2.indexOf(32, i10);
                i4 = -1;
                if (indexOf3 == -1) {
                    indexOf3 = indexOf4;
                } else if (indexOf4 != -1) {
                    indexOf3 = Math.min(indexOf3, indexOf4);
                }
                if (indexOf3 != -1) {
                    String substring2 = str2.substring(i10, indexOf3);
                    substring2.getClass();
                    switch (substring2.hashCode()) {
                        case 3309:
                            if (substring2.equals("gt")) {
                                c4 = 0;
                                break;
                            }
                            break;
                        case 3464:
                            if (substring2.equals("lt")) {
                                c4 = 1;
                                break;
                            }
                            break;
                        case 96708:
                            if (substring2.equals("amp")) {
                                c4 = 2;
                                break;
                            }
                            break;
                        case 3374865:
                            if (substring2.equals("nbsp")) {
                                c4 = 3;
                                break;
                            }
                            break;
                    }
                    c4 = 65535;
                    switch (c4) {
                        case 0:
                            spannableStringBuilder.append('>');
                            break;
                        case 1:
                            spannableStringBuilder.append('<');
                            break;
                        case k.FLOAT_FIELD_NUMBER /* 2 */:
                            spannableStringBuilder.append('&');
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            W.a.A("WebvttCueParser", "ignoring unsupported entity: '&" + substring2 + ";'");
                            break;
                    }
                    if (indexOf3 == indexOf4) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i5 = 1;
                    i10 = indexOf3 + 1;
                } else {
                    i5 = 1;
                    spannableStringBuilder.append(charAt);
                }
            }
            i7 = i4;
            i8 = 2;
            i9 = i5;
        }
    }

    public static void g(String str, h hVar) {
        int i4 = 2;
        int indexOf = str.indexOf(44);
        char c4 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c4 = 3;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                case 1:
                    i4 = 1;
                    break;
                case k.FLOAT_FIELD_NUMBER /* 2 */:
                    break;
                case k.INTEGER_FIELD_NUMBER /* 3 */:
                    i4 = 0;
                    break;
                default:
                    W.a.A("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i4 = Integer.MIN_VALUE;
                    break;
            }
            hVar.f4964g = i4;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            hVar.f4962e = j.b(str);
            hVar.f4963f = 0;
        } else {
            hVar.f4962e = Integer.parseInt(str);
            hVar.f4963f = 1;
        }
    }
}
