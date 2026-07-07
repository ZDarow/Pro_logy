package m0;

import B2.AbstractC0007h;
import Y.AbstractC0107c;
import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: m0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0418G extends AbstractC0107c implements InterfaceC0424e {

    /* renamed from: p, reason: collision with root package name */
    public final LinkedBlockingQueue f7171p;

    /* renamed from: q, reason: collision with root package name */
    public final long f7172q;

    /* renamed from: r, reason: collision with root package name */
    public byte[] f7173r;
    public int s;

    public C0418G() {
        super(true);
        this.f7172q = 8000L;
        this.f7171p = new LinkedBlockingQueue();
        this.f7173r = new byte[0];
        this.s = -1;
    }

    @Override // Y.h
    public final long b(Y.l lVar) {
        this.s = lVar.f3029a.getPort();
        return -1L;
    }

    @Override // Y.h
    public final void close() {
    }

    @Override // m0.InterfaceC0424e
    public final String g() {
        W.a.j(this.s != -1);
        int i4 = this.s;
        int i5 = this.s + 1;
        int i6 = W.y.f2709a;
        Locale locale = Locale.US;
        return AbstractC0007h.i(i4, i5, "RTP/AVP/TCP;unicast;interleaved=", "-");
    }

    @Override // m0.InterfaceC0424e
    public final boolean h() {
        return false;
    }

    @Override // m0.InterfaceC0424e
    public final int m() {
        return this.s;
    }

    @Override // Y.h
    public final Uri o() {
        return null;
    }

    @Override // T.InterfaceC0089j
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        int min = Math.min(i5, this.f7173r.length);
        System.arraycopy(this.f7173r, 0, bArr, i4, min);
        byte[] bArr2 = this.f7173r;
        this.f7173r = Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (min == i5) {
            return min;
        }
        try {
            byte[] bArr3 = (byte[]) this.f7171p.poll(this.f7172q, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int min2 = Math.min(i5 - min, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i4 + min, min2);
            if (min2 < bArr3.length) {
                this.f7173r = Arrays.copyOfRange(bArr3, min2, bArr3.length);
            }
            return min + min2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // m0.InterfaceC0424e
    public final C0418G x() {
        return this;
    }
}
