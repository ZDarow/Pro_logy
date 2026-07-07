package Y;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class E extends AbstractC0107c {

    /* renamed from: p, reason: collision with root package name */
    public final int f2991p;

    /* renamed from: q, reason: collision with root package name */
    public final byte[] f2992q;

    /* renamed from: r, reason: collision with root package name */
    public final DatagramPacket f2993r;
    public Uri s;

    /* renamed from: t, reason: collision with root package name */
    public DatagramSocket f2994t;

    /* renamed from: u, reason: collision with root package name */
    public MulticastSocket f2995u;

    /* renamed from: v, reason: collision with root package name */
    public InetAddress f2996v;
    public boolean w;

    /* renamed from: x, reason: collision with root package name */
    public int f2997x;

    public E(int i4) {
        super(true);
        this.f2991p = i4;
        byte[] bArr = new byte[2000];
        this.f2992q = bArr;
        this.f2993r = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // Y.h
    public final long b(l lVar) {
        Uri uri = lVar.f3029a;
        this.s = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.s.getPort();
        f();
        try {
            this.f2996v = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f2996v, port);
            if (this.f2996v.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f2995u = multicastSocket;
                multicastSocket.joinGroup(this.f2996v);
                this.f2994t = this.f2995u;
            } else {
                this.f2994t = new DatagramSocket(inetSocketAddress);
            }
            this.f2994t.setSoTimeout(this.f2991p);
            this.w = true;
            i(lVar);
            return -1L;
        } catch (IOException e4) {
            throw new i(e4, 2001);
        } catch (SecurityException e5) {
            throw new i(e5, 2006);
        }
    }

    @Override // Y.h
    public final void close() {
        this.s = null;
        MulticastSocket multicastSocket = this.f2995u;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f2996v;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f2995u = null;
        }
        DatagramSocket datagramSocket = this.f2994t;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f2994t = null;
        }
        this.f2996v = null;
        this.f2997x = 0;
        if (this.w) {
            this.w = false;
            c();
        }
    }

    @Override // Y.h
    public final Uri o() {
        return this.s;
    }

    @Override // T.InterfaceC0089j
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        int i6 = this.f2997x;
        DatagramPacket datagramPacket = this.f2993r;
        if (i6 == 0) {
            try {
                DatagramSocket datagramSocket = this.f2994t;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f2997x = length;
                a(length);
            } catch (SocketTimeoutException e4) {
                throw new i(e4, 2002);
            } catch (IOException e5) {
                throw new i(e5, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i7 = this.f2997x;
        int min = Math.min(i7, i5);
        System.arraycopy(this.f2992q, length2 - i7, bArr, i4, min);
        this.f2997x -= min;
        return min;
    }
}
