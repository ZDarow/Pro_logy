package M1;

import B2.E;
import N1.B;
import N1.C;
import N1.C0057a;
import N1.C0058b;
import N1.C0060d;
import N1.x;
import O1.s;
import android.content.Context;
import android.os.Build;
import android.support.v4.media.session.t;
import d2.C0241d;
import d2.C0246i;
import java.util.Collections;
import java.util.Set;
import n.C0443f;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1162a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1163b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.d f1164c;

    /* renamed from: d, reason: collision with root package name */
    public final b f1165d;

    /* renamed from: e, reason: collision with root package name */
    public final C0058b f1166e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1167f;

    /* renamed from: g, reason: collision with root package name */
    public final C0057a f1168g;

    /* renamed from: h, reason: collision with root package name */
    public final C0060d f1169h;

    public f(Context context, B1.d dVar, b bVar, e eVar) {
        s.e(context, "Null context is not permitted.");
        s.e(dVar, "Api must not be null.");
        s.e(eVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        s.e(applicationContext, "The provided context did not have an application context.");
        this.f1162a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f1163b = attributionTag;
        this.f1164c = dVar;
        this.f1165d = bVar;
        this.f1166e = new C0058b(dVar, bVar, attributionTag);
        C0060d f4 = C0060d.f(applicationContext);
        this.f1169h = f4;
        this.f1167f = f4.s.getAndIncrement();
        this.f1168g = eVar.f1161a;
        W1.f fVar = f4.f1277x;
        fVar.sendMessage(fVar.obtainMessage(7, this));
    }

    public final t a() {
        t tVar = new t(10, false);
        Set emptySet = Collections.emptySet();
        if (((C0443f) tVar.f3734m) == null) {
            tVar.f3734m = new C0443f(0);
        }
        ((C0443f) tVar.f3734m).addAll(emptySet);
        Context context = this.f1162a;
        tVar.f3736o = context.getClass().getName();
        tVar.f3735n = context.getPackageName();
        return tVar;
    }

    public final C0246i b(N1.g gVar, int i4) {
        s.e(gVar, "Listener key cannot be null.");
        C0060d c0060d = this.f1169h;
        c0060d.getClass();
        C0241d c0241d = new C0241d();
        c0060d.e(c0241d, i4, this);
        x xVar = new x(new B(gVar, c0241d), c0060d.f1274t.get(), this);
        W1.f fVar = c0060d.f1277x;
        fVar.sendMessage(fVar.obtainMessage(13, xVar));
        return c0241d.f4974a;
    }

    public final C0246i c(int i4, E e4) {
        C0241d c0241d = new C0241d();
        C0060d c0060d = this.f1169h;
        c0060d.getClass();
        c0060d.e(c0241d, e4.f119c, this);
        x xVar = new x(new C(i4, e4, c0241d, this.f1168g), c0060d.f1274t.get(), this);
        W1.f fVar = c0060d.f1277x;
        fVar.sendMessage(fVar.obtainMessage(4, xVar));
        return c0241d.f4974a;
    }
}
