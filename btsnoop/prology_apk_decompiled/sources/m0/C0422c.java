package m0;

import f2.h0;

/* renamed from: m0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422c {

    /* renamed from: a, reason: collision with root package name */
    public final String f7189a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7190b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7191c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7192d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7193e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7194f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7195g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7196h;

    /* renamed from: i, reason: collision with root package name */
    public final h0 f7197i;

    /* renamed from: j, reason: collision with root package name */
    public final C0421b f7198j;

    public C0422c(C0420a c0420a, h0 h0Var, C0421b c0421b) {
        this.f7189a = c0420a.f7176a;
        this.f7190b = c0420a.f7177b;
        this.f7191c = c0420a.f7178c;
        this.f7192d = c0420a.f7179d;
        this.f7194f = c0420a.f7182g;
        this.f7195g = c0420a.f7183h;
        this.f7193e = c0420a.f7181f;
        this.f7196h = c0420a.f7184i;
        this.f7197i = h0Var;
        this.f7198j = c0421b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0422c.class != obj.getClass()) {
            return false;
        }
        C0422c c0422c = (C0422c) obj;
        if (this.f7189a.equals(c0422c.f7189a) && this.f7190b == c0422c.f7190b && this.f7191c.equals(c0422c.f7191c) && this.f7192d == c0422c.f7192d && this.f7193e == c0422c.f7193e) {
            h0 h0Var = this.f7197i;
            h0Var.getClass();
            if (f2.r.h(h0Var, c0422c.f7197i) && this.f7198j.equals(c0422c.f7198j) && W.y.a(this.f7194f, c0422c.f7194f) && W.y.a(this.f7195g, c0422c.f7195g) && W.y.a(this.f7196h, c0422c.f7196h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f7198j.hashCode() + ((this.f7197i.hashCode() + ((((((this.f7191c.hashCode() + ((((this.f7189a.hashCode() + 217) * 31) + this.f7190b) * 31)) * 31) + this.f7192d) * 31) + this.f7193e) * 31)) * 31)) * 31;
        String str = this.f7194f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f7195g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7196h;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
