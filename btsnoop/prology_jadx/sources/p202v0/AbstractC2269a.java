package p202v0;

/* renamed from: v0.a */
/* loaded from: classes.dex */
public abstract class AbstractC2269a {

    /* renamed from: a */
    public static final java.lang.Object f9005a = new java.lang.Object();

    /* renamed from: b */
    public static final java.lang.Object f9006b = new java.lang.Object();

    /* renamed from: c */
    public static boolean f9007c;

    /* renamed from: d */
    public static long f9008d;

    /* renamed from: a */
    public static long m4454a() {
        java.net.DatagramSocket datagramSocket;
        long j4;
        synchronized (f9006b) {
        }
        java.net.InetAddress byName = java.net.InetAddress.getByName("time.android.com");
        java.net.DatagramSocket datagramSocket2 = new java.net.DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            java.net.DatagramPacket datagramPacket = new java.net.DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                java.util.Arrays.fill(bArr, 40, 48, (byte) 0);
                j4 = currentTimeMillis;
                datagramSocket = datagramSocket2;
            } else {
                long j5 = currentTimeMillis / 1000;
                long j6 = currentTimeMillis - (j5 * 1000);
                long j7 = j5 + 2208988800L;
                j4 = currentTimeMillis;
                bArr[40] = (byte) (j7 >> 24);
                bArr[41] = (byte) (j7 >> 16);
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) (j7 >> 8);
                    bArr[43] = (byte) j7;
                    long j8 = (j6 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j8 >> 24);
                    bArr[45] = (byte) (j8 >> 16);
                    bArr[46] = (byte) (j8 >> 8);
                    bArr[47] = (byte) (java.lang.Math.random() * 255.0d);
                } catch (java.lang.Throwable th) {
                    th = th;
                    java.lang.Throwable th2 = th;
                    try {
                        datagramSocket.close();
                        throw th2;
                    } catch (java.lang.Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new java.net.DatagramPacket(bArr, 48));
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            long j9 = (elapsedRealtime2 - elapsedRealtime) + j4;
            byte b4 = bArr[0];
            int i4 = bArr[1] & 255;
            long m4457d = m4457d(bArr, 24);
            long m4457d2 = m4457d(bArr, 32);
            long m4457d3 = m4457d(bArr, 40);
            m4455b((byte) ((b4 >> 6) & 3), (byte) (b4 & 7), i4, m4457d3);
            long j10 = (j9 + (((m4457d3 - j9) + (m4457d2 - m4457d)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j10;
        } catch (java.lang.Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
        }
    }

    /* renamed from: b */
    public static void m4455b(byte b4, byte b5, int i4, long j4) {
        if (b4 == 3) {
            throw new java.io.IOException("SNTP: Unsynchronized server");
        }
        if (b5 != 4 && b5 != 5) {
            throw new java.io.IOException(p009B2.AbstractC0051h.m152k("SNTP: Untrusted mode: ", b5));
        }
        if (i4 == 0 || i4 > 15) {
            throw new java.io.IOException(p009B2.AbstractC0051h.m152k("SNTP: Untrusted stratum: ", i4));
        }
        if (j4 == 0) {
            throw new java.io.IOException("SNTP: Zero transmitTime");
        }
    }

    /* renamed from: c */
    public static long m4456c(byte[] bArr, int i4) {
        int i5 = bArr[i4];
        int i6 = bArr[i4 + 1];
        int i7 = bArr[i4 + 2];
        int i8 = bArr[i4 + 3];
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        if ((i6 & 128) == 128) {
            i6 = (i6 & 127) + 128;
        }
        if ((i7 & 128) == 128) {
            i7 = (i7 & 127) + 128;
        }
        if ((i8 & 128) == 128) {
            i8 = (i8 & 127) + 128;
        }
        return (i5 << 24) + (i6 << 16) + (i7 << 8) + i8;
    }

    /* renamed from: d */
    public static long m4457d(byte[] bArr, int i4) {
        long m4456c = m4456c(bArr, i4);
        long m4456c2 = m4456c(bArr, i4 + 4);
        if (m4456c == 0 && m4456c2 == 0) {
            return 0L;
        }
        return ((m4456c2 * 1000) / 4294967296L) + ((m4456c - 2208988800L) * 1000);
    }
}
