package p094Y;

/* renamed from: Y.E */
/* loaded from: classes.dex */
public final class C0862E extends p094Y.AbstractC0865c {

    /* renamed from: p */
    public final int f3092p;

    /* renamed from: q */
    public final byte[] f3093q;

    /* renamed from: r */
    public final java.net.DatagramPacket f3094r;

    /* renamed from: s */
    public android.net.Uri f3095s;

    /* renamed from: t */
    public java.net.DatagramSocket f3096t;

    /* renamed from: u */
    public java.net.MulticastSocket f3097u;

    /* renamed from: v */
    public java.net.InetAddress f3098v;

    /* renamed from: w */
    public boolean f3099w;

    /* renamed from: x */
    public int f3100x;

    public C0862E(int i4) {
        super(true);
        this.f3092p = i4;
        byte[] bArr = new byte[2000];
        this.f3093q = bArr;
        this.f3094r = new java.net.DatagramPacket(bArr, 0, 2000);
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: b */
    public final long mo1686b(p094Y.C0874l c0874l) {
        android.net.Uri uri = c0874l.f3135a;
        this.f3095s = uri;
        java.lang.String host = uri.getHost();
        host.getClass();
        int port = this.f3095s.getPort();
        m1692f();
        try {
            this.f3098v = java.net.InetAddress.getByName(host);
            java.net.InetSocketAddress inetSocketAddress = new java.net.InetSocketAddress(this.f3098v, port);
            if (this.f3098v.isMulticastAddress()) {
                java.net.MulticastSocket multicastSocket = new java.net.MulticastSocket(inetSocketAddress);
                this.f3097u = multicastSocket;
                multicastSocket.joinGroup(this.f3098v);
                this.f3096t = this.f3097u;
            } else {
                this.f3096t = new java.net.DatagramSocket(inetSocketAddress);
            }
            this.f3096t.setSoTimeout(this.f3092p);
            this.f3099w = true;
            m1693i(c0874l);
            return -1L;
        } catch (java.io.IOException e4) {
            throw new p094Y.C0871i(e4, 2001);
        } catch (java.lang.SecurityException e5) {
            throw new p094Y.C0871i(e5, 2006);
        }
    }

    @Override // p094Y.InterfaceC0870h
    public final void close() {
        this.f3095s = null;
        java.net.MulticastSocket multicastSocket = this.f3097u;
        if (multicastSocket != null) {
            try {
                java.net.InetAddress inetAddress = this.f3098v;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (java.io.IOException unused) {
            }
            this.f3097u = null;
        }
        java.net.DatagramSocket datagramSocket = this.f3096t;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f3096t = null;
        }
        this.f3098v = null;
        this.f3100x = 0;
        if (this.f3099w) {
            this.f3099w = false;
            m1691c();
        }
    }

    @Override // p094Y.InterfaceC0870h
    /* renamed from: o */
    public final android.net.Uri mo1687o() {
        return this.f3095s;
    }

    @Override // p076T.InterfaceC0696j
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        int i6 = this.f3100x;
        java.net.DatagramPacket datagramPacket = this.f3094r;
        if (i6 == 0) {
            try {
                java.net.DatagramSocket datagramSocket = this.f3096t;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f3100x = length;
                m1690a(length);
            } catch (java.net.SocketTimeoutException e4) {
                throw new p094Y.C0871i(e4, 2002);
            } catch (java.io.IOException e5) {
                throw new p094Y.C0871i(e5, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i7 = this.f3100x;
        int min = java.lang.Math.min(i7, i5);
        java.lang.System.arraycopy(this.f3093q, length2 - i7, bArr, i4, min);
        this.f3100x -= min;
        return min;
    }
}
