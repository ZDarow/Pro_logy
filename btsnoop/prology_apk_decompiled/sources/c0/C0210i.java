package c0;

import T.C0084e;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* renamed from: c0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4611a;

    /* renamed from: b, reason: collision with root package name */
    public final B2.x f4612b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f4613c;

    /* renamed from: d, reason: collision with root package name */
    public final C0208g f4614d;

    /* renamed from: e, reason: collision with root package name */
    public final S2.g f4615e;

    /* renamed from: f, reason: collision with root package name */
    public final C0209h f4616f;

    /* renamed from: g, reason: collision with root package name */
    public C0206e f4617g;

    /* renamed from: h, reason: collision with root package name */
    public C0211j f4618h;

    /* renamed from: i, reason: collision with root package name */
    public C0084e f4619i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4620j;

    public C0210i(Context context, B2.x xVar, C0084e c0084e, C0211j c0211j) {
        Context applicationContext = context.getApplicationContext();
        this.f4611a = applicationContext;
        this.f4612b = xVar;
        this.f4619i = c0084e;
        this.f4618h = c0211j;
        int i4 = W.y.f2709a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f4613c = handler;
        int i5 = W.y.f2709a;
        this.f4614d = i5 >= 23 ? new C0208g(0, this) : null;
        this.f4615e = i5 >= 21 ? new S2.g(2, this) : null;
        C0206e c0206e = C0206e.f4601c;
        String str = W.y.f2711c;
        Uri uriFor = ("Amazon".equals(str) || "Xiaomi".equals(str)) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f4616f = uriFor != null ? new C0209h(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(C0206e c0206e) {
        t0.q qVar;
        if (!this.f4620j || c0206e.equals(this.f4617g)) {
            return;
        }
        this.f4617g = c0206e;
        J j4 = (J) this.f4612b.f214m;
        j4.getClass();
        Looper myLooper = Looper.myLooper();
        Looper looper = j4.f4539i0;
        if (looper != myLooper) {
            String name = looper == null ? "null" : looper.getThread().getName();
            throw new IllegalStateException("Current looper (" + (myLooper == null ? "null" : myLooper.getThread().getName()) + ") is not the playback looper (" + name + ")");
        }
        if (c0206e.equals(j4.f4555x)) {
            return;
        }
        j4.f4555x = c0206e;
        K2.o oVar = j4.s;
        if (oVar != null) {
            M m4 = (M) oVar.f1009m;
            synchronized (m4.f3421l) {
                qVar = m4.f3420B;
            }
            if (qVar != null) {
                synchronized (qVar.f8377c) {
                    qVar.f8381g.getClass();
                }
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        C0211j c0211j = this.f4618h;
        if (W.y.a(audioDeviceInfo, c0211j == null ? null : c0211j.f4621a)) {
            return;
        }
        C0211j c0211j2 = audioDeviceInfo != null ? new C0211j(audioDeviceInfo) : null;
        this.f4618h = c0211j2;
        a(C0206e.b(this.f4611a, this.f4619i, c0211j2));
    }
}
