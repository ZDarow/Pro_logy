package W;

import B2.AbstractC0007h;
import T.I;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import m0.z;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static p f2681e;

    /* renamed from: a, reason: collision with root package name */
    public int f2682a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2683b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2684c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2685d;

    public p(int i4, String str, String str2, String str3) {
        this.f2682a = i4;
        this.f2683b = str;
        this.f2684c = str2;
        this.f2685d = str3;
    }

    public static void a(int i4, p pVar) {
        synchronized (pVar.f2685d) {
            try {
                if (pVar.f2682a == i4) {
                    return;
                }
                pVar.f2682a = i4;
                Iterator it = ((CopyOnWriteArrayList) pVar.f2684c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    u0.f fVar = (u0.f) weakReference.get();
                    if (fVar != null) {
                        fVar.a(i4);
                    } else {
                        ((CopyOnWriteArrayList) pVar.f2684c).remove(weakReference);
                    }
                }
            } finally {
            }
        }
    }

    public static synchronized p c(Context context) {
        p pVar;
        synchronized (p.class) {
            try {
                if (f2681e == null) {
                    f2681e = new p(context);
                }
                pVar = f2681e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    public String b(F1.a aVar, Uri uri, int i4) {
        int i5 = this.f2682a;
        if (i5 == 1) {
            String encodeToString = Base64.encodeToString((aVar.f573b + ":" + aVar.f574c).getBytes(m0.y.f7314r), 0);
            int i6 = y.f2709a;
            Locale locale = Locale.US;
            return AbstractC0007h.l("Basic ", encodeToString);
        }
        if (i5 != 2) {
            throw new I(null, new UnsupportedOperationException(), false, 4);
        }
        String str = (String) this.f2684c;
        String str2 = (String) this.f2683b;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String h4 = z.h(i4);
            String str3 = aVar.f573b + ":" + str2 + ":" + aVar.f574c;
            Charset charset = m0.y.f7314r;
            String Y3 = y.Y(messageDigest.digest((y.Y(messageDigest.digest(str3.getBytes(charset))) + ":" + str + ":" + y.Y(messageDigest.digest((h4 + ":" + uri).getBytes(charset)))).getBytes(charset)));
            String str4 = (String) this.f2685d;
            if (str4.isEmpty()) {
                return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", aVar.f573b, str2, str, uri, Y3);
            }
            return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", aVar.f573b, str2, str, uri, Y3, str4);
        } catch (NoSuchAlgorithmException e4) {
            throw new I(null, e4, false, 4);
        }
    }

    public int d() {
        int i4;
        synchronized (this.f2685d) {
            i4 = this.f2682a;
        }
        return i4;
    }

    public int e() {
        int i4 = this.f2682a;
        if (i4 != 2) {
            return i4 != 3 ? 0 : 512;
        }
        return 2048;
    }

    public p(Context context) {
        this.f2683b = new Handler(Looper.getMainLooper());
        this.f2684c = new CopyOnWriteArrayList();
        this.f2685d = new Object();
        this.f2682a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new S2.g(1, this), intentFilter);
    }

    public p(int i4, String str, int i5, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f2683b = str;
        this.f2682a = i5;
        if (arrayList == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f2684c = unmodifiableList;
        this.f2685d = bArr;
    }
}
