package android.support.v4.media;

/* renamed from: android.support.v4.media.a */
/* loaded from: classes.dex */
public final class HandlerC1033a extends android.os.Handler {

    /* renamed from: a */
    public final java.lang.ref.WeakReference f3779a;

    /* renamed from: b */
    public java.lang.ref.WeakReference f3780b;

    public HandlerC1033a(android.support.v4.media.C1036d c1036d) {
        this.f3779a = new java.lang.ref.WeakReference(c1036d);
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        java.lang.ref.WeakReference weakReference = this.f3780b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        java.lang.ref.WeakReference weakReference2 = this.f3779a;
        if (weakReference2.get() == null) {
            return;
        }
        android.os.Bundle data = message.getData();
        android.support.v4.media.session.C1061t.m2199b0(data);
        android.support.v4.media.C1036d c1036d = (android.support.v4.media.C1036d) weakReference2.get();
        android.os.Messenger messenger = (android.os.Messenger) this.f3780b.get();
        try {
            int i4 = message.what;
            if (i4 == 1) {
                android.support.v4.media.session.C1061t.m2199b0(data.getBundle("data_root_hints"));
                data.getString("data_media_item_id");
                c1036d.getClass();
                return;
            }
            if (i4 == 2) {
                c1036d.getClass();
                return;
            }
            if (i4 != 3) {
                android.util.Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                return;
            }
            android.support.v4.media.session.C1061t.m2199b0(data.getBundle("data_options"));
            android.support.v4.media.session.C1061t.m2199b0(data.getBundle("data_notify_children_changed_options"));
            java.lang.String string = data.getString("data_media_item_id");
            data.getParcelableArrayList("data_media_item_list");
            if (c1036d.f3790g != messenger) {
                return;
            }
            if (c1036d.f3788e.get(string) != null) {
                throw new java.lang.ClassCastException();
            }
            if (android.support.v4.media.C1037e.f3792b) {
                android.util.Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string);
            }
        } catch (android.os.BadParcelableException unused) {
            android.util.Log.e("MediaBrowserCompat", "Could not unparcel the data.");
            if (message.what == 1) {
                c1036d.getClass();
            }
        }
    }
}
