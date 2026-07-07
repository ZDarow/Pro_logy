package r;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.t;
import androidx.core.graphics.drawable.IconCompat;
import com.prology.R;
import java.util.ArrayList;

/* renamed from: r.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0498c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7959a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f7963e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f7964f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f7965g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f7966h;

    /* renamed from: i, reason: collision with root package name */
    public int f7967i;

    /* renamed from: k, reason: collision with root package name */
    public E0.e f7969k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f7970l;

    /* renamed from: n, reason: collision with root package name */
    public Bundle f7972n;

    /* renamed from: q, reason: collision with root package name */
    public String f7975q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f7976r;
    public final Notification s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f7977t;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7960b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7961c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7962d = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public boolean f7968j = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7971m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f7973o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f7974p = 0;

    public C0498c(Context context, String str) {
        Notification notification = new Notification();
        this.s = notification;
        this.f7959a = context;
        this.f7975q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f7967i = 0;
        this.f7977t = new ArrayList();
        this.f7976r = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        String c4;
        t tVar = new t(this);
        C0498c c0498c = (C0498c) tVar.f3735n;
        E0.e eVar = c0498c.f7969k;
        if (eVar != null) {
            eVar.a(tVar);
        }
        Notification build = ((Notification.Builder) tVar.f3734m).build();
        if (eVar != null) {
            c0498c.f7969k.getClass();
        }
        if (eVar != null && (bundle = build.extras) != null && (c4 = eVar.c()) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c4);
        }
        return build;
    }

    public final void c(int i4, boolean z4) {
        Notification notification = this.s;
        if (z4) {
            notification.flags = i4 | notification.flags;
        } else {
            notification.flags = (~i4) & notification.flags;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f7959a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f3951k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f3953b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f7966h = iconCompat;
    }

    public final void e(E0.e eVar) {
        if (this.f7969k != eVar) {
            this.f7969k = eVar;
            if (((C0498c) eVar.f527a) != this) {
                eVar.f527a = this;
                e(eVar);
            }
        }
    }
}
