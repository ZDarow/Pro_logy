package android.support.v4.media.session;

/* renamed from: android.support.v4.media.session.h */
/* loaded from: classes.dex */
public class C1049h {

    /* renamed from: a */
    public final android.media.session.MediaController f3831a;

    /* renamed from: b */
    public final java.lang.Object f3832b = new java.lang.Object();

    /* renamed from: c */
    public final java.util.ArrayList f3833c = new java.util.ArrayList();

    /* renamed from: d */
    public final java.util.HashMap f3834d = new java.util.HashMap();

    /* renamed from: e */
    public final android.support.v4.media.session.MediaSessionCompat$Token f3835e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, android.os.ResultReceiver] */
    public C1049h(android.content.Context context, android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f3835e = mediaSessionCompat$Token;
        android.media.session.MediaController mediaController = new android.media.session.MediaController(context, (android.media.session.MediaSession.Token) mediaSessionCompat$Token.f3800m);
        this.f3831a = mediaController;
        if (mediaSessionCompat$Token.m2098d() == null) {
            ?? resultReceiver = new android.os.ResultReceiver(null);
            resultReceiver.f3794l = new java.lang.ref.WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, resultReceiver);
        }
    }

    /* renamed from: a */
    public final void m2156a() {
        android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token = this.f3835e;
        if (mediaSessionCompat$Token.m2098d() == null) {
            return;
        }
        java.util.ArrayList arrayList = this.f3833c;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p190s2.C2145e c2145e = (p190s2.C2145e) it.next();
            android.support.v4.media.session.BinderC1048g binderC1048g = new android.support.v4.media.session.BinderC1048g(c2145e);
            this.f3834d.put(c2145e, binderC1048g);
            c2145e.f8555c = binderC1048g;
            try {
                mediaSessionCompat$Token.m2098d().mo2110k(binderC1048g);
                c2145e.m4264a(13, null, null);
            } catch (android.os.RemoteException e4) {
                android.util.Log.e("MediaControllerCompat", "Dead object in registerCallback.", e4);
            }
        }
        arrayList.clear();
    }

    /* renamed from: b */
    public final void m2157b(p190s2.C2145e c2145e) {
        this.f3831a.unregisterCallback(c2145e.f8553a);
        synchronized (this.f3832b) {
            if (this.f3835e.m2098d() != null) {
                try {
                    android.support.v4.media.session.BinderC1048g binderC1048g = (android.support.v4.media.session.BinderC1048g) this.f3834d.remove(c2145e);
                    if (binderC1048g != null) {
                        c2145e.f8555c = null;
                        this.f3835e.m2098d().mo2112r(binderC1048g);
                    }
                } catch (android.os.RemoteException e4) {
                    android.util.Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e4);
                }
            } else {
                this.f3833c.remove(c2145e);
            }
        }
    }
}
