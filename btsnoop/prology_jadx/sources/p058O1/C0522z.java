package p058O1;

/* renamed from: O1.z */
/* loaded from: classes.dex */
public final class C0522z {

    /* renamed from: d */
    public static final android.net.Uri f1542d = new android.net.Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    public final java.lang.String f1543a;

    /* renamed from: b */
    public final java.lang.String f1544b;

    /* renamed from: c */
    public final boolean f1545c;

    public C0522z(java.lang.String str, boolean z4) {
        p058O1.AbstractC0515s.m1016c(str);
        this.f1543a = str;
        p058O1.AbstractC0515s.m1016c("com.google.android.gms");
        this.f1544b = "com.google.android.gms";
        this.f1545c = z4;
    }

    /* renamed from: a */
    public final android.content.Intent m1020a(android.content.Context context) {
        android.os.Bundle bundle;
        java.lang.String str = this.f1543a;
        if (str == null) {
            return new android.content.Intent().setComponent(null);
        }
        if (this.f1545c) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(f1542d, "serviceIntentCall", (java.lang.String) null, bundle2);
            } catch (java.lang.IllegalArgumentException e4) {
                android.util.Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e4.toString()));
                bundle = null;
            }
            r1 = bundle != null ? (android.content.Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                android.util.Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(java.lang.String.valueOf(str)));
            }
        }
        return r1 == null ? new android.content.Intent(str).setPackage(this.f1544b) : r1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p058O1.C0522z)) {
            return false;
        }
        p058O1.C0522z c0522z = (p058O1.C0522z) obj;
        return p058O1.AbstractC0515s.m1019f(this.f1543a, c0522z.f1543a) && p058O1.AbstractC0515s.m1019f(this.f1544b, c0522z.f1544b) && p058O1.AbstractC0515s.m1019f(null, null) && this.f1545c == c0522z.f1545c;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f1543a, this.f1544b, null, 4225, java.lang.Boolean.valueOf(this.f1545c)});
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f1543a;
        if (str != null) {
            return str;
        }
        p058O1.AbstractC0515s.m1017d(null);
        throw null;
    }
}
