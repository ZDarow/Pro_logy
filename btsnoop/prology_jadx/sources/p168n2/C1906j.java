package p168n2;

/* renamed from: n2.j */
/* loaded from: classes.dex */
public final class C1906j extends androidx.lifecycle.AbstractC1160x {

    /* renamed from: c */
    public final p025F1.C0215g f7758c = new java.lang.Object();

    /* renamed from: d */
    public int f7759d = -1;

    /* renamed from: e */
    public java.lang.Number f7760e = 0;

    /* renamed from: f */
    public int f7761f = 100;

    /* renamed from: g */
    public int f7762g = 200;

    /* renamed from: h */
    public boolean f7763h;

    /* renamed from: i */
    public android.net.Uri f7764i;

    /* renamed from: j */
    public android.content.ContentResolver f7765j;

    /* renamed from: k */
    public android.graphics.Bitmap.CompressFormat f7766k;

    /* renamed from: b */
    public static byte[] m3880b(p168n2.C1906j c1906j, android.graphics.Bitmap bitmap, byte[] bArr, int i4) {
        if ((i4 & 1) != 0) {
            bitmap = null;
        }
        if ((i4 & 2) != 0) {
            bArr = null;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            if (bitmap != null) {
                android.graphics.Bitmap.CompressFormat compressFormat = c1906j.f7766k;
                if (compressFormat == null) {
                    p154k3.AbstractC1803h.m3783i("format");
                    throw null;
                }
                bitmap.compress(compressFormat, c1906j.f7761f, byteArrayOutputStream);
            } else {
                p154k3.AbstractC1803h.m3776b(bArr);
                android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                android.graphics.Bitmap.CompressFormat compressFormat2 = c1906j.f7766k;
                if (compressFormat2 == null) {
                    p154k3.AbstractC1803h.m3783i("format");
                    throw null;
                }
                decodeByteArray.compress(compressFormat2, c1906j.f7761f, byteArrayOutputStream);
            }
        } catch (java.lang.Exception e4) {
            if (c1906j.f7763h) {
                android.util.Log.w("OnArtworksQuery", "(" + c1906j.f7760e + ") Message: " + e4);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }
}
