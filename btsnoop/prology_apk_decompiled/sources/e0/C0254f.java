package e0;

import W.y;

/* renamed from: e0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254f {

    /* renamed from: a, reason: collision with root package name */
    public final String f5054a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5055b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5056c;

    public C0254f(String str, String str2, String str3) {
        this.f5054a = str;
        this.f5055b = str2;
        this.f5056c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0254f.class != obj.getClass()) {
            return false;
        }
        C0254f c0254f = (C0254f) obj;
        return y.a(this.f5054a, c0254f.f5054a) && y.a(this.f5055b, c0254f.f5055b) && y.a(this.f5056c, c0254f.f5056c);
    }

    public final int hashCode() {
        int hashCode = this.f5054a.hashCode() * 31;
        String str = this.f5055b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5056c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
