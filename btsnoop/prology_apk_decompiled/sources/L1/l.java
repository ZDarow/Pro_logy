package L1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l extends k {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f1080e;

    public l(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f1080e = bArr;
    }

    @Override // L1.k
    public final byte[] p0() {
        return this.f1080e;
    }
}
