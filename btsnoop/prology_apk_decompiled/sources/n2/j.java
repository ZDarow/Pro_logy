package n2;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;
import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public final class j extends androidx.lifecycle.x {

    /* renamed from: c, reason: collision with root package name */
    public final F1.g f7472c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public int f7473d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Number f7474e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f7475f = 100;

    /* renamed from: g, reason: collision with root package name */
    public int f7476g = 200;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7477h;

    /* renamed from: i, reason: collision with root package name */
    public Uri f7478i;

    /* renamed from: j, reason: collision with root package name */
    public ContentResolver f7479j;

    /* renamed from: k, reason: collision with root package name */
    public Bitmap.CompressFormat f7480k;

    public static byte[] b(j jVar, Bitmap bitmap, byte[] bArr, int i4) {
        if ((i4 & 1) != 0) {
            bitmap = null;
        }
        if ((i4 & 2) != 0) {
            bArr = null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (bitmap != null) {
                Bitmap.CompressFormat compressFormat = jVar.f7480k;
                if (compressFormat == null) {
                    k3.h.i("format");
                    throw null;
                }
                bitmap.compress(compressFormat, jVar.f7475f, byteArrayOutputStream);
            } else {
                k3.h.b(bArr);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                Bitmap.CompressFormat compressFormat2 = jVar.f7480k;
                if (compressFormat2 == null) {
                    k3.h.i("format");
                    throw null;
                }
                decodeByteArray.compress(compressFormat2, jVar.f7475f, byteArrayOutputStream);
            }
        } catch (Exception e4) {
            if (jVar.f7477h) {
                Log.w("OnArtworksQuery", "(" + jVar.f7474e + ") Message: " + e4);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }
}
