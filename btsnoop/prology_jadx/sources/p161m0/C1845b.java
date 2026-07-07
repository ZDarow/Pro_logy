package p161m0;

/* renamed from: m0.b */
/* loaded from: classes.dex */
public final class C1845b {

    /* renamed from: a */
    public final int f7456a;

    /* renamed from: b */
    public final java.lang.String f7457b;

    /* renamed from: c */
    public final int f7458c;

    /* renamed from: d */
    public final int f7459d;

    public C1845b(int i4, int i5, int i6, java.lang.String str) {
        this.f7456a = i4;
        this.f7457b = str;
        this.f7458c = i5;
        this.f7459d = i6;
    }

    /* renamed from: a */
    public static p161m0.C1845b m3810a(java.lang.String str) {
        int i4 = p086W.AbstractC0805y.f2801a;
        java.lang.String[] split = str.split(" ", 2);
        p086W.AbstractC0781a.m1416e(split.length == 2);
        java.lang.String str2 = split[0];
        java.util.regex.Pattern pattern = p161m0.AbstractC1869z.f7600a;
        try {
            int parseInt = java.lang.Integer.parseInt(str2);
            int i5 = -1;
            java.lang.String[] split2 = split[1].trim().split("/", -1);
            p086W.AbstractC0781a.m1416e(split2.length >= 2);
            java.lang.String str3 = split2[1];
            try {
                int parseInt2 = java.lang.Integer.parseInt(str3);
                if (split2.length == 3) {
                    java.lang.String str4 = split2[2];
                    try {
                        i5 = java.lang.Integer.parseInt(str4);
                    } catch (java.lang.NumberFormatException e4) {
                        throw p076T.C0666I.m1203b(str4, e4);
                    }
                }
                return new p161m0.C1845b(parseInt, parseInt2, i5, split2[0]);
            } catch (java.lang.NumberFormatException e5) {
                throw p076T.C0666I.m1203b(str3, e5);
            }
        } catch (java.lang.NumberFormatException e6) {
            throw p076T.C0666I.m1203b(str2, e6);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p161m0.C1845b.class != obj.getClass()) {
            return false;
        }
        p161m0.C1845b c1845b = (p161m0.C1845b) obj;
        return this.f7456a == c1845b.f7456a && this.f7457b.equals(c1845b.f7457b) && this.f7458c == c1845b.f7458c && this.f7459d == c1845b.f7459d;
    }

    public final int hashCode() {
        return ((((this.f7457b.hashCode() + ((217 + this.f7456a) * 31)) * 31) + this.f7458c) * 31) + this.f7459d;
    }
}
