package m0;

import T.I;
import java.util.regex.Pattern;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0421b {

    /* renamed from: a, reason: collision with root package name */
    public final int f7185a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7186b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7187c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7188d;

    public C0421b(int i4, int i5, int i6, String str) {
        this.f7185a = i4;
        this.f7186b = str;
        this.f7187c = i5;
        this.f7188d = i6;
    }

    public static C0421b a(String str) {
        int i4 = W.y.f2709a;
        String[] split = str.split(" ", 2);
        W.a.e(split.length == 2);
        String str2 = split[0];
        Pattern pattern = z.f7321a;
        try {
            int parseInt = Integer.parseInt(str2);
            int i5 = -1;
            String[] split2 = split[1].trim().split("/", -1);
            W.a.e(split2.length >= 2);
            String str3 = split2[1];
            try {
                int parseInt2 = Integer.parseInt(str3);
                if (split2.length == 3) {
                    String str4 = split2[2];
                    try {
                        i5 = Integer.parseInt(str4);
                    } catch (NumberFormatException e4) {
                        throw I.b(str4, e4);
                    }
                }
                return new C0421b(parseInt, parseInt2, i5, split2[0]);
            } catch (NumberFormatException e5) {
                throw I.b(str3, e5);
            }
        } catch (NumberFormatException e6) {
            throw I.b(str2, e6);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0421b.class != obj.getClass()) {
            return false;
        }
        C0421b c0421b = (C0421b) obj;
        return this.f7185a == c0421b.f7185a && this.f7186b.equals(c0421b.f7186b) && this.f7187c == c0421b.f7187c && this.f7188d == c0421b.f7188d;
    }

    public final int hashCode() {
        return ((((this.f7186b.hashCode() + ((217 + this.f7185a) * 31)) * 31) + this.f7187c) * 31) + this.f7188d;
    }
}
