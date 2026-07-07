package p112c0;

/* renamed from: c0.H */
/* loaded from: classes.dex */
public final class C1209H extends android.media.AudioTrack$StreamEventCallback {

    /* renamed from: a */
    public final /* synthetic */ p112c0.C1210I f4651a;

    public C1209H(p112c0.C1210I c1210i) {
        this.f4651a = c1210i;
    }

    public final void onDataRequest(android.media.AudioTrack audioTrack, int i4) {
        p112c0.C1211J c1211j;
        p043K2.C0339o c0339o;
        p102a0.C0945I c0945i;
        if (audioTrack.equals(this.f4651a.f4654c.f4718w) && (c0339o = (c1211j = this.f4651a.f4654c).f4714s) != null && c1211j.f4682Y && (c0945i = ((p112c0.C1214M) c0339o.f1048m).f7140Q) != null) {
            c0945i.m1863a();
        }
    }

    public final void onPresentationEnded(android.media.AudioTrack audioTrack) {
        if (audioTrack.equals(this.f4651a.f4654c.f4718w)) {
            this.f4651a.f4654c.f4681X = true;
        }
    }

    public final void onTearDown(android.media.AudioTrack audioTrack) {
        p112c0.C1211J c1211j;
        p043K2.C0339o c0339o;
        p102a0.C0945I c0945i;
        if (audioTrack.equals(this.f4651a.f4654c.f4718w) && (c0339o = (c1211j = this.f4651a.f4654c).f4714s) != null && c1211j.f4682Y && (c0945i = ((p112c0.C1214M) c0339o.f1048m).f7140Q) != null) {
            c0945i.m1863a();
        }
    }
}
