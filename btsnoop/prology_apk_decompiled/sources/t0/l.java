package t0;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import f2.b0;

/* loaded from: classes.dex */
public final class l implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f8351a;

    public l(q qVar) {
        this.f8351a = qVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z4) {
        q qVar = this.f8351a;
        b0 b0Var = q.f8376j;
        qVar.e();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z4) {
        q qVar = this.f8351a;
        b0 b0Var = q.f8376j;
        qVar.e();
    }
}
