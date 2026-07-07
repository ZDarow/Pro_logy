package n2;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import b3.InterfaceC0190d;
import java.io.FileInputStream;
import p1.AbstractC0462a;
import r3.InterfaceC0533u;

/* loaded from: classes.dex */
public final class h extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f7468p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.f7468p = jVar;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        return new h(this.f7468p, interfaceC0190d);
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((h) g((InterfaceC0190d) obj2, (InterfaceC0533u) obj)).k(Z2.g.f3186a);
    }

    @Override // d3.b
    public final Object k(Object obj) {
        Uri withAppendedId;
        Bitmap loadThumbnail;
        AbstractC0462a.P(obj);
        int i4 = Build.VERSION.SDK_INT;
        j jVar = this.f7468p;
        byte[] bArr = null;
        F1.g gVar = jVar.f7472c;
        if (i4 >= 29) {
            try {
                int i5 = jVar.f7473d;
                if (i5 == 2 || i5 == 3 || i5 == 4) {
                    Number number = jVar.f7474e;
                    ContentResolver contentResolver = jVar.f7479j;
                    if (contentResolver == null) {
                        k3.h.i("resolver");
                        throw null;
                    }
                    gVar.getClass();
                    String z4 = F1.g.z(i5, number, contentResolver);
                    if (z4 == null) {
                        return null;
                    }
                    Uri uri = jVar.f7478i;
                    if (uri == null) {
                        k3.h.i("uri");
                        throw null;
                    }
                    withAppendedId = ContentUris.withAppendedId(uri, Long.parseLong(z4));
                } else {
                    Uri uri2 = jVar.f7478i;
                    if (uri2 == null) {
                        k3.h.i("uri");
                        throw null;
                    }
                    withAppendedId = ContentUris.withAppendedId(uri2, jVar.f7474e.longValue());
                }
                k3.h.b(withAppendedId);
                ContentResolver contentResolver2 = jVar.f7479j;
                if (contentResolver2 == null) {
                    k3.h.i("resolver");
                    throw null;
                }
                int i6 = jVar.f7476g;
                loadThumbnail = contentResolver2.loadThumbnail(withAppendedId, new Size(i6, i6), null);
                k3.h.d(loadThumbnail, "loadThumbnail(...)");
                byte[] b4 = j.b(jVar, loadThumbnail, null, 2);
                k3.h.b(b4);
                return b4;
            } catch (Exception e4) {
                if (!jVar.f7477h) {
                    return null;
                }
                Log.w("OnArtworksQuery", "(" + jVar.f7474e + ") Message: " + e4);
                return null;
            }
        }
        int i7 = jVar.f7473d;
        Number number2 = jVar.f7474e;
        ContentResolver contentResolver3 = jVar.f7479j;
        if (contentResolver3 == null) {
            k3.h.i("resolver");
            throw null;
        }
        gVar.getClass();
        String z5 = F1.g.z(i7, number2, contentResolver3);
        if (z5 == null) {
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(z5);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(fileInputStream.getFD());
            byte[] b5 = j.b(jVar, null, mediaMetadataRetriever.getEmbeddedPicture(), 1);
            if (b5 == null) {
                return null;
            }
            if (i4 >= 29) {
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception e5) {
                    e = e5;
                    bArr = b5;
                    if (!jVar.f7477h) {
                        return bArr;
                    }
                    Log.w("OnArtworksQuery", "(" + jVar.f7474e + ") Message: " + e);
                    return bArr;
                }
            }
            return b5;
        } catch (Exception e6) {
            e = e6;
        }
    }
}
