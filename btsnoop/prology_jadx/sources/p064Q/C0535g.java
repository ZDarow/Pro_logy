package p064Q;

/* renamed from: Q.g */
/* loaded from: classes.dex */
public final class C0535g extends p064Q.AbstractC0541m {

    /* renamed from: e */
    public final /* synthetic */ int f1575e;

    /* renamed from: f */
    public final /* synthetic */ p043K2.C0339o f1576f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0535g(java.lang.String str, p043K2.C0339o c0339o, int i4) {
        super(str);
        this.f1575e = i4;
        this.f1576f = c0339o;
    }

    @Override // p064Q.AbstractC0541m
    /* renamed from: a */
    public final void mo1038a() {
        switch (this.f1575e) {
            case 0:
                ((android.service.media.MediaBrowserService.Result) this.f1576f.f1048m).detach();
                return;
            case 1:
                ((android.service.media.MediaBrowserService.Result) this.f1576f.f1048m).detach();
                return;
            default:
                ((android.service.media.MediaBrowserService.Result) this.f1576f.f1048m).detach();
                return;
        }
    }

    @Override // p064Q.AbstractC0541m
    /* renamed from: c */
    public final void mo1037c(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        switch (this.f1575e) {
            case 0:
                java.util.List<android.support.v4.media.MediaBrowserCompat$MediaItem> list = (java.util.List) obj;
                if (list == null) {
                    arrayList = null;
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
                    for (android.support.v4.media.MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem : list) {
                        android.os.Parcel obtain = android.os.Parcel.obtain();
                        mediaBrowserCompat$MediaItem.writeToParcel(obtain, 0);
                        arrayList2.add(obtain);
                    }
                    arrayList = arrayList2;
                }
                this.f1576f.m755N(arrayList);
                return;
            case 1:
                android.support.v4.media.MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem2 = (android.support.v4.media.MediaBrowserCompat$MediaItem) obj;
                p043K2.C0339o c0339o = this.f1576f;
                if (mediaBrowserCompat$MediaItem2 == null) {
                    c0339o.m755N(null);
                    return;
                }
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                mediaBrowserCompat$MediaItem2.writeToParcel(obtain2, 0);
                c0339o.m755N(obtain2);
                return;
            default:
                java.util.List<android.support.v4.media.MediaBrowserCompat$MediaItem> list2 = (java.util.List) obj;
                p043K2.C0339o c0339o2 = this.f1576f;
                if (list2 == null) {
                    c0339o2.m755N(null);
                    return;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(list2.size());
                for (android.support.v4.media.MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem3 : list2) {
                    android.os.Parcel obtain3 = android.os.Parcel.obtain();
                    mediaBrowserCompat$MediaItem3.writeToParcel(obtain3, 0);
                    arrayList3.add(obtain3);
                }
                c0339o2.m755N(arrayList3);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0535g(p064Q.C0539k c0539k, java.lang.String str, p043K2.C0339o c0339o, android.os.Bundle bundle) {
        super(str);
        this.f1575e = 2;
        this.f1576f = c0339o;
    }
}
