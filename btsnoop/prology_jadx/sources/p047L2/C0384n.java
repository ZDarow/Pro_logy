package p047L2;

/* renamed from: L2.n */
/* loaded from: classes.dex */
public final class C0384n {

    /* renamed from: a */
    public final java.lang.String f1133a;

    /* renamed from: b */
    public final java.lang.Object f1134b;

    public C0384n(java.lang.Object obj, java.lang.String str) {
        this.f1133a = str;
        this.f1134b = obj;
    }

    /* renamed from: a */
    public final java.lang.Object m839a(java.lang.String str) {
        java.lang.Object obj = this.f1134b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof java.util.Map) {
            return ((java.util.Map) obj).get(str);
        }
        if (obj instanceof org.json.JSONObject) {
            return ((org.json.JSONObject) obj).opt(str);
        }
        throw new java.lang.ClassCastException();
    }

    /* renamed from: b */
    public final java.lang.Object m840b() {
        return this.f1134b;
    }

    /* renamed from: c */
    public final boolean m841c(java.lang.String str) {
        java.lang.Object obj = this.f1134b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof java.util.Map) {
            return ((java.util.Map) obj).containsKey(str);
        }
        if (obj instanceof org.json.JSONObject) {
            return ((org.json.JSONObject) obj).has(str);
        }
        throw new java.lang.ClassCastException();
    }
}
