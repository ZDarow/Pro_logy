package K2;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f1026a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1027b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1028c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1029d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1030e;

    public r(String str, int i4, int i5, int i6, int i7) {
        if (!(i4 == -1 && i5 == -1) && (i4 < 0 || i5 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i4) + ", " + String.valueOf(i5) + ")");
        }
        if (!(i6 == -1 && i7 == -1) && (i6 < 0 || i6 > i7)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i6) + ", " + String.valueOf(i7) + ")");
        }
        if (i7 > str.length()) {
            throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i6));
        }
        if (i4 > str.length()) {
            throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i4));
        }
        if (i5 > str.length()) {
            throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i5));
        }
        this.f1026a = str;
        this.f1027b = i4;
        this.f1028c = i5;
        this.f1029d = i6;
        this.f1030e = i7;
    }

    public static r a(JSONObject jSONObject) {
        return new r(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
