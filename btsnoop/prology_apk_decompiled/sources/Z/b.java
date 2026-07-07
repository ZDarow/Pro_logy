package Z;

import W.y;
import Y.x;
import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f3128a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f3129b;

    /* renamed from: c, reason: collision with root package name */
    public int f3130c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f3131d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f3132e;

    /* renamed from: f, reason: collision with root package name */
    public int f3133f;

    /* renamed from: g, reason: collision with root package name */
    public int f3134g;

    /* renamed from: h, reason: collision with root package name */
    public int f3135h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f3136i;

    /* renamed from: j, reason: collision with root package name */
    public final x f3137j;

    public b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f3136i = cryptoInfo;
        this.f3137j = y.f2709a >= 24 ? new x(cryptoInfo) : null;
    }
}
