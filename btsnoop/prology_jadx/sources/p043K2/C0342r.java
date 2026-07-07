package p043K2;

/* renamed from: K2.r */
/* loaded from: classes.dex */
public final class C0342r {

    /* renamed from: a */
    public final java.lang.String f1065a;

    /* renamed from: b */
    public final int f1066b;

    /* renamed from: c */
    public final int f1067c;

    /* renamed from: d */
    public final int f1068d;

    /* renamed from: e */
    public final int f1069e;

    public C0342r(java.lang.String str, int i4, int i5, int i6, int i7) {
        if (!(i4 == -1 && i5 == -1) && (i4 < 0 || i5 < 0)) {
            throw new java.lang.IndexOutOfBoundsException("invalid selection: (" + java.lang.String.valueOf(i4) + ", " + java.lang.String.valueOf(i5) + ")");
        }
        if (!(i6 == -1 && i7 == -1) && (i6 < 0 || i6 > i7)) {
            throw new java.lang.IndexOutOfBoundsException("invalid composing range: (" + java.lang.String.valueOf(i6) + ", " + java.lang.String.valueOf(i7) + ")");
        }
        if (i7 > str.length()) {
            throw new java.lang.IndexOutOfBoundsException("invalid composing start: " + java.lang.String.valueOf(i6));
        }
        if (i4 > str.length()) {
            throw new java.lang.IndexOutOfBoundsException("invalid selection start: " + java.lang.String.valueOf(i4));
        }
        if (i5 > str.length()) {
            throw new java.lang.IndexOutOfBoundsException("invalid selection end: " + java.lang.String.valueOf(i5));
        }
        this.f1065a = str;
        this.f1066b = i4;
        this.f1067c = i5;
        this.f1068d = i6;
        this.f1069e = i7;
    }

    /* renamed from: a */
    public static p043K2.C0342r m770a(org.json.JSONObject jSONObject) {
        return new p043K2.C0342r(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
