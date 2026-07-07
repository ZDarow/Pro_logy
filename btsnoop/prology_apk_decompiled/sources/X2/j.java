package X2;

import B2.AbstractC0007h;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.support.v4.media.session.t;
import java.io.IOException;
import java.util.UUID;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: h, reason: collision with root package name */
    public static final UUID f2940h = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    /* renamed from: a, reason: collision with root package name */
    public final BluetoothAdapter f2941a;

    /* renamed from: c, reason: collision with root package name */
    public final int f2943c;

    /* renamed from: d, reason: collision with root package name */
    public L2.h f2944d;

    /* renamed from: e, reason: collision with root package name */
    public final t f2945e;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f2947g;

    /* renamed from: b, reason: collision with root package name */
    public a f2942b = null;

    /* renamed from: f, reason: collision with root package name */
    public final j f2946f = this;

    public j(r rVar, int i4, BluetoothAdapter bluetoothAdapter) {
        this.f2947g = rVar;
        this.f2941a = bluetoothAdapter;
        this.f2943c = i4;
        t tVar = new t(rVar.f2981y, AbstractC0007h.k("flutter_bluetooth_serial/read/", i4));
        this.f2945e = tVar;
        tVar.B0(new B.c(i4, this));
    }

    public final void a(String str) {
        a aVar = this.f2942b;
        if (aVar != null && !aVar.f2917o) {
            throw new IOException("already connected");
        }
        BluetoothAdapter bluetoothAdapter = this.f2941a;
        BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
        if (remoteDevice == null) {
            throw new IOException("device not found");
        }
        BluetoothSocket createRfcommSocketToServiceRecord = remoteDevice.createRfcommSocketToServiceRecord(f2940h);
        if (createRfcommSocketToServiceRecord == null) {
            throw new IOException("socket connection not established");
        }
        bluetoothAdapter.cancelDiscovery();
        createRfcommSocketToServiceRecord.connect();
        a aVar2 = new a(this, createRfcommSocketToServiceRecord);
        this.f2942b = aVar2;
        aVar2.start();
    }

    public final void b() {
        boolean z4;
        a aVar = this.f2942b;
        if (aVar == null || (z4 = aVar.f2917o)) {
            return;
        }
        if (!z4) {
            aVar.f2917o = true;
            try {
                aVar.f2916n.flush();
            } catch (Exception unused) {
            }
            BluetoothSocket bluetoothSocket = aVar.f2914l;
            if (bluetoothSocket != null) {
                try {
                    Thread.sleep(111L);
                    bluetoothSocket.close();
                } catch (Exception unused2) {
                }
            }
        }
        this.f2942b = null;
    }

    public final void c(byte[] bArr) {
        a aVar = this.f2942b;
        if (aVar == null || aVar.f2917o) {
            throw new IOException("not connected");
        }
        aVar.getClass();
        try {
            aVar.f2916n.write(bArr);
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }
}
