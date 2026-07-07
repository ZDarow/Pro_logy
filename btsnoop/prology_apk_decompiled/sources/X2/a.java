package X2;

import android.bluetooth.BluetoothSocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: l, reason: collision with root package name */
    public final BluetoothSocket f2914l;

    /* renamed from: m, reason: collision with root package name */
    public final InputStream f2915m;

    /* renamed from: n, reason: collision with root package name */
    public final OutputStream f2916n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2917o = false;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f2918p;

    public a(j jVar, BluetoothSocket bluetoothSocket) {
        InputStream inputStream;
        this.f2918p = jVar;
        this.f2914l = bluetoothSocket;
        OutputStream outputStream = null;
        try {
            inputStream = bluetoothSocket.getInputStream();
        } catch (IOException e4) {
            e = e4;
            inputStream = null;
        }
        try {
            outputStream = bluetoothSocket.getOutputStream();
        } catch (IOException e5) {
            e = e5;
            e.printStackTrace();
            this.f2915m = inputStream;
            this.f2916n = outputStream;
        }
        this.f2915m = inputStream;
        this.f2916n = outputStream;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        j jVar;
        InputStream inputStream;
        byte[] bArr = new byte[1024];
        while (true) {
            boolean z4 = this.f2917o;
            jVar = this.f2918p;
            inputStream = this.f2915m;
            if (z4) {
                break;
            }
            try {
                jVar.f2947g.f2980x.runOnUiThread(new W.m(1, jVar, Arrays.copyOf(bArr, inputStream.read(bArr))));
            } catch (IOException unused) {
            }
        }
        OutputStream outputStream = this.f2916n;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception unused2) {
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused3) {
            }
        }
        jVar.f2947g.f2980x.runOnUiThread(new h(jVar, !this.f2917o, 0));
        this.f2917o = true;
    }
}
