package v0;

import B2.AbstractC0007h;
import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0587a {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f8655a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f8656b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f8657c;

    /* renamed from: d, reason: collision with root package name */
    public static long f8658d;

    public static long a() {
        DatagramSocket datagramSocket;
        long j4;
        synchronized (f8656b) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
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
                    bArr[47] = (byte) (Math.random() * 255.0d);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        datagramSocket.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j9 = (elapsedRealtime2 - elapsedRealtime) + j4;
            byte b4 = bArr[0];
            int i4 = bArr[1] & 255;
            long d4 = d(bArr, 24);
            long d5 = d(bArr, 32);
            long d6 = d(bArr, 40);
            b((byte) ((b4 >> 6) & 3), (byte) (b4 & 7), i4, d6);
            long j10 = (j9 + (((d6 - j9) + (d5 - d4)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j10;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
        }
    }

    public static void b(byte b4, byte b5, int i4, long j4) {
        if (b4 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b5 != 4 && b5 != 5) {
            throw new IOException(AbstractC0007h.k("SNTP: Untrusted mode: ", b5));
        }
        if (i4 == 0 || i4 > 15) {
            throw new IOException(AbstractC0007h.k("SNTP: Untrusted stratum: ", i4));
        }
        if (j4 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long c(byte[] bArr, int i4) {
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

    public static long d(byte[] bArr, int i4) {
        long c4 = c(bArr, i4);
        long c5 = c(bArr, i4 + 4);
        if (c4 == 0 && c5 == 0) {
            return 0L;
        }
        return ((c5 * 1000) / 4294967296L) + ((c4 - 2208988800L) * 1000);
    }
}
