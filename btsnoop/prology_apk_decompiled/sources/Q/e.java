package Q;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import c.C0200d;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0200d f1516f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, C0200d c0200d, int i4) {
        super(obj);
        this.f1515e = i4;
        this.f1516f = c0200d;
    }

    @Override // Q.m
    public final void c(Object obj) {
        switch (this.f1515e) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", (MediaBrowserCompat$MediaItem) obj);
                this.f1516f.e(0, bundle);
                return;
            default:
                List list = (List) obj;
                C0200d c0200d = this.f1516f;
                if (list == null) {
                    c0200d.e(-1, null);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat$MediaItem[0]));
                c0200d.e(0, bundle2);
                return;
        }
    }
}
