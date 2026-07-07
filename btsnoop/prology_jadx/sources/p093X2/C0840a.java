package p093X2;

/* renamed from: X2.a */
/* loaded from: classes.dex */
public final class C0840a extends java.lang.Thread {

    /* renamed from: l */
    public final android.bluetooth.BluetoothSocket f3012l;

    /* renamed from: m */
    public final java.io.InputStream f3013m;

    /* renamed from: n */
    public final java.io.OutputStream f3014n;

    /* renamed from: o */
    public boolean f3015o = false;

    /* renamed from: p */
    public final /* synthetic */ p093X2.C0849j f3016p;

    public C0840a(p093X2.C0849j c0849j, android.bluetooth.BluetoothSocket bluetoothSocket) {
        java.io.InputStream inputStream;
        this.f3016p = c0849j;
        this.f3012l = bluetoothSocket;
        java.io.OutputStream outputStream = null;
        try {
            inputStream = bluetoothSocket.getInputStream();
        } catch (java.io.IOException e4) {
            e = e4;
            inputStream = null;
        }
        try {
            outputStream = bluetoothSocket.getOutputStream();
        } catch (java.io.IOException e5) {
            e = e5;
            e.printStackTrace();
            this.f3013m = inputStream;
            this.f3014n = outputStream;
        }
        this.f3013m = inputStream;
        this.f3014n = outputStream;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        p093X2.C0849j c0849j;
        java.io.InputStream inputStream;
        byte[] bArr = new byte[1024];
        while (true) {
            boolean z4 = this.f3015o;
            c0849j = this.f3016p;
            inputStream = this.f3013m;
            if (z4) {
                break;
            }
            try {
                c0849j.f3045g.f3080x.runOnUiThread(new p086W.RunnableC0793m(1, c0849j, java.util.Arrays.copyOf(bArr, inputStream.read(bArr))));
            } catch (java.io.IOException unused) {
            }
        }
        java.io.OutputStream outputStream = this.f3014n;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (java.lang.Exception unused2) {
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.lang.Exception unused3) {
            }
        }
        c0849j.f3045g.f3080x.runOnUiThread(new p093X2.RunnableC0847h(c0849j, !this.f3015o, 0));
        this.f3015o = true;
    }
}
