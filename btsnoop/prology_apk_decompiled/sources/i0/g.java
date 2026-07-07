package i0;

import f2.I;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import m0.y;
import m0.z;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f6147a;

    /* renamed from: b, reason: collision with root package name */
    public long f6148b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6149c;

    public static byte[] b(byte b4, DataInputStream dataInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {b4, dataInputStream.readByte()};
        byteArrayOutputStream.write(bArr);
        while (true) {
            if (bArr[0] == 13 && bArr[1] == 10) {
                return byteArrayOutputStream.toByteArray();
            }
            bArr[0] = bArr[1];
            byte readByte = dataInputStream.readByte();
            bArr[1] = readByte;
            byteArrayOutputStream.write(readByte);
        }
    }

    public I a(byte[] bArr) {
        long j4;
        W.a.e(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
        String str = new String(bArr, 0, bArr.length - 2, y.f7314r);
        ArrayList arrayList = (ArrayList) this.f6149c;
        arrayList.add(str);
        int i4 = this.f6147a;
        if (i4 == 1) {
            if (!z.f7321a.matcher(str).matches() && !z.f7322b.matcher(str).matches()) {
                return null;
            }
            this.f6147a = 2;
            return null;
        }
        if (i4 != 2) {
            throw new IllegalStateException();
        }
        try {
            Matcher matcher = z.f7323c.matcher(str);
            if (matcher.find()) {
                String group = matcher.group(1);
                group.getClass();
                j4 = Long.parseLong(group);
            } else {
                j4 = -1;
            }
            if (j4 != -1) {
                this.f6148b = j4;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.f6148b > 0) {
                this.f6147a = 3;
                return null;
            }
            I j5 = I.j(arrayList);
            arrayList.clear();
            this.f6147a = 1;
            this.f6148b = 0L;
            return j5;
        } catch (NumberFormatException e4) {
            throw T.I.b(str, e4);
        }
    }
}
