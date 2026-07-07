package m0;

import B2.AbstractC0007h;
import a.AbstractC0110a;
import android.net.Uri;
import java.net.DatagramSocket;
import java.util.Locale;

/* renamed from: m0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0419H implements InterfaceC0424e {

    /* renamed from: l, reason: collision with root package name */
    public final Y.E f7174l = new Y.E(AbstractC0110a.l(8000));

    /* renamed from: m, reason: collision with root package name */
    public C0419H f7175m;

    @Override // Y.h
    public final long b(Y.l lVar) {
        this.f7174l.b(lVar);
        return -1L;
    }

    @Override // Y.h
    public final void close() {
        this.f7174l.close();
        C0419H c0419h = this.f7175m;
        if (c0419h != null) {
            c0419h.close();
        }
    }

    @Override // m0.InterfaceC0424e
    public final String g() {
        int m4 = m();
        W.a.j(m4 != -1);
        int i4 = W.y.f2709a;
        Locale locale = Locale.US;
        return AbstractC0007h.i(m4, 1 + m4, "RTP/AVP;unicast;client_port=", "-");
    }

    @Override // m0.InterfaceC0424e
    public final boolean h() {
        return true;
    }

    @Override // Y.h
    public final void j(Y.C c4) {
        this.f7174l.j(c4);
    }

    @Override // m0.InterfaceC0424e
    public final int m() {
        DatagramSocket datagramSocket = this.f7174l.f2994t;
        int localPort = datagramSocket == null ? -1 : datagramSocket.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // Y.h
    public final Uri o() {
        return this.f7174l.s;
    }

    @Override // T.InterfaceC0089j
    public final int read(byte[] bArr, int i4, int i5) {
        try {
            return this.f7174l.read(bArr, i4, i5);
        } catch (Y.D e4) {
            if (e4.f3015l == 2002) {
                return -1;
            }
            throw e4;
        }
    }

    @Override // m0.InterfaceC0424e
    public final C0418G x() {
        return null;
    }
}
