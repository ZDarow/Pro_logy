package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.support.v4.media.session.t;
import android.util.Log;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f3654a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f3655b;

    public a(d dVar) {
        this.f3654a = new WeakReference(dVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference = this.f3655b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        WeakReference weakReference2 = this.f3654a;
        if (weakReference2.get() == null) {
            return;
        }
        Bundle data = message.getData();
        t.b0(data);
        d dVar = (d) weakReference2.get();
        Messenger messenger = (Messenger) this.f3655b.get();
        try {
            int i4 = message.what;
            if (i4 == 1) {
                t.b0(data.getBundle("data_root_hints"));
                data.getString("data_media_item_id");
                dVar.getClass();
                return;
            }
            if (i4 == 2) {
                dVar.getClass();
                return;
            }
            if (i4 != 3) {
                Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                return;
            }
            t.b0(data.getBundle("data_options"));
            t.b0(data.getBundle("data_notify_children_changed_options"));
            String string = data.getString("data_media_item_id");
            data.getParcelableArrayList("data_media_item_list");
            if (dVar.f3665g != messenger) {
                return;
            }
            if (dVar.f3663e.get(string) != null) {
                throw new ClassCastException();
            }
            if (e.f3667b) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaBrowserCompat", "Could not unparcel the data.");
            if (message.what == 1) {
                dVar.getClass();
            }
        }
    }
}
