package B2;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import io.flutter.embedding.engine.FlutterJNI;
import j.h0;

/* loaded from: classes.dex */
public final class s extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f187b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, Handler handler, int i4) {
        super(handler);
        this.f186a = i4;
        this.f187b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f186a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z4, Uri uri) {
        switch (this.f186a) {
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                io.flutter.view.g gVar = (io.flutter.view.g) this.f187b;
                if (gVar.f6526u) {
                    return;
                }
                if (Settings.Global.getFloat(gVar.f6512f, "transition_animation_scale", 1.0f) == 0.0f) {
                    gVar.f6518l |= 4;
                } else {
                    gVar.f6518l &= -5;
                }
                ((FlutterJNI) gVar.f6508b.f3735n).setAccessibilityFeatures(gVar.f6518l);
                return;
            default:
                super.onChange(z4, uri);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(h0 h0Var) {
        super(new Handler());
        this.f186a = 1;
        this.f187b = h0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        Cursor cursor;
        switch (this.f186a) {
            case 0:
                super.onChange(z4);
                u uVar = (u) this.f187b;
                if (uVar.s == null) {
                    return;
                }
                uVar.d();
                return;
            case 1:
                h0 h0Var = (h0) this.f187b;
                if (!h0Var.f653m || (cursor = h0Var.f654n) == null || cursor.isClosed()) {
                    return;
                }
                h0Var.f652l = h0Var.f654n.requery();
                return;
            default:
                onChange(z4, null);
                return;
        }
    }
}
