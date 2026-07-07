package m0;

import android.net.Uri;
import f2.c0;
import f2.h0;

/* renamed from: m0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416E {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f7155a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f7156b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7157c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7158d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7159e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7160f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f7161g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7162h;

    /* renamed from: i, reason: collision with root package name */
    public final String f7163i;

    /* renamed from: j, reason: collision with root package name */
    public final String f7164j;

    /* renamed from: k, reason: collision with root package name */
    public final String f7165k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7166l;

    public C0416E(C0415D c0415d) {
        this.f7155a = h0.a(c0415d.f7143a);
        this.f7156b = c0415d.f7144b.g();
        String str = c0415d.f7146d;
        int i4 = W.y.f2709a;
        this.f7157c = str;
        this.f7158d = c0415d.f7147e;
        this.f7159e = c0415d.f7148f;
        this.f7161g = c0415d.f7149g;
        this.f7162h = c0415d.f7150h;
        this.f7160f = c0415d.f7145c;
        this.f7163i = c0415d.f7151i;
        this.f7164j = c0415d.f7153k;
        this.f7165k = c0415d.f7154l;
        this.f7166l = c0415d.f7152j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0416E.class != obj.getClass()) {
            return false;
        }
        C0416E c0416e = (C0416E) obj;
        if (this.f7160f == c0416e.f7160f) {
            h0 h0Var = this.f7155a;
            h0Var.getClass();
            if (f2.r.h(h0Var, c0416e.f7155a) && this.f7156b.equals(c0416e.f7156b) && W.y.a(this.f7158d, c0416e.f7158d) && W.y.a(this.f7157c, c0416e.f7157c) && W.y.a(this.f7159e, c0416e.f7159e) && W.y.a(this.f7166l, c0416e.f7166l) && W.y.a(this.f7161g, c0416e.f7161g) && W.y.a(this.f7164j, c0416e.f7164j) && W.y.a(this.f7165k, c0416e.f7165k) && W.y.a(this.f7162h, c0416e.f7162h) && W.y.a(this.f7163i, c0416e.f7163i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f7156b.hashCode() + ((this.f7155a.hashCode() + 217) * 31)) * 31;
        String str = this.f7158d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f7157c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7159e;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f7160f) * 31;
        String str4 = this.f7166l;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.f7161g;
        int hashCode6 = (hashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.f7164j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f7165k;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f7162h;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f7163i;
        return hashCode9 + (str8 != null ? str8.hashCode() : 0);
    }
}
