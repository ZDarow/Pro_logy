package p009B2;

/* renamed from: B2.s */
/* loaded from: classes.dex */
public final class C0062s extends android.database.ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ int f189a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f190b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0062s(java.lang.Object obj, android.os.Handler handler, int i4) {
        super(handler);
        this.f189a = i4;
        this.f190b = obj;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f189a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z4, android.net.Uri uri) {
        switch (this.f189a) {
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                io.flutter.view.C1610g c1610g = (io.flutter.view.C1610g) this.f190b;
                if (c1610g.f6772u) {
                    return;
                }
                if (android.provider.Settings.Global.getFloat(c1610g.f6757f, "transition_animation_scale", 1.0f) == 0.0f) {
                    c1610g.f6763l |= 4;
                } else {
                    c1610g.f6763l &= -5;
                }
                ((io.flutter.embedding.engine.FlutterJNI) c1610g.f6753b.f3862n).setAccessibilityFeatures(c1610g.f6763l);
                return;
            default:
                super.onChange(z4, uri);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0062s(p145j.ViewOnClickListenerC1662h0 viewOnClickListenerC1662h0) {
        super(new android.os.Handler());
        this.f189a = 1;
        this.f190b = viewOnClickListenerC1662h0;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        android.database.Cursor cursor;
        switch (this.f189a) {
            case 0:
                super.onChange(z4);
                p009B2.C0064u c0064u = (p009B2.C0064u) this.f190b;
                if (c0064u.f210s == null) {
                    return;
                }
                c0064u.m279d();
                return;
            case 1:
                p145j.ViewOnClickListenerC1662h0 viewOnClickListenerC1662h0 = (p145j.ViewOnClickListenerC1662h0) this.f190b;
                if (!viewOnClickListenerC1662h0.f663m || (cursor = viewOnClickListenerC1662h0.f664n) == null || cursor.isClosed()) {
                    return;
                }
                viewOnClickListenerC1662h0.f662l = viewOnClickListenerC1662h0.f664n.requery();
                return;
            default:
                onChange(z4, null);
                return;
        }
    }
}
