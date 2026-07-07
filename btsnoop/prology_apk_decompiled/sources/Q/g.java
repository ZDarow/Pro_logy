package Q;

import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ K2.o f1525f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(String str, K2.o oVar, int i4) {
        super(str);
        this.f1524e = i4;
        this.f1525f = oVar;
    }

    @Override // Q.m
    public final void a() {
        switch (this.f1524e) {
            case 0:
                ((MediaBrowserService.Result) this.f1525f.f1009m).detach();
                return;
            case 1:
                ((MediaBrowserService.Result) this.f1525f.f1009m).detach();
                return;
            default:
                ((MediaBrowserService.Result) this.f1525f.f1009m).detach();
                return;
        }
    }

    @Override // Q.m
    public final void c(Object obj) {
        ArrayList arrayList;
        switch (this.f1524e) {
            case 0:
                List<MediaBrowserCompat$MediaItem> list = (List) obj;
                if (list == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaBrowserCompat$MediaItem.writeToParcel(obtain, 0);
                        arrayList2.add(obtain);
                    }
                    arrayList = arrayList2;
                }
                this.f1525f.N(arrayList);
                return;
            case 1:
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem2 = (MediaBrowserCompat$MediaItem) obj;
                K2.o oVar = this.f1525f;
                if (mediaBrowserCompat$MediaItem2 == null) {
                    oVar.N(null);
                    return;
                }
                Parcel obtain2 = Parcel.obtain();
                mediaBrowserCompat$MediaItem2.writeToParcel(obtain2, 0);
                oVar.N(obtain2);
                return;
            default:
                List<MediaBrowserCompat$MediaItem> list2 = (List) obj;
                K2.o oVar2 = this.f1525f;
                if (list2 == null) {
                    oVar2.N(null);
                    return;
                }
                ArrayList arrayList3 = new ArrayList(list2.size());
                for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem3 : list2) {
                    Parcel obtain3 = Parcel.obtain();
                    mediaBrowserCompat$MediaItem3.writeToParcel(obtain3, 0);
                    arrayList3.add(obtain3);
                }
                oVar2.N(arrayList3);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, String str, K2.o oVar, Bundle bundle) {
        super(str);
        this.f1524e = 2;
        this.f1525f = oVar;
    }
}
