package p141i0;

/* renamed from: i0.g */
/* loaded from: classes.dex */
public final class C1534g {

    /* renamed from: a */
    public int f6376a;

    /* renamed from: b */
    public long f6377b;

    /* renamed from: c */
    public java.lang.Object f6378c;

    /* renamed from: b */
    public static byte[] m3400b(byte b4, java.io.DataInputStream dataInputStream) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
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

    /* renamed from: a */
    public p129f2.AbstractC1393I m3401a(byte[] bArr) {
        long j4;
        p086W.AbstractC0781a.m1416e(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
        java.lang.String str = new java.lang.String(bArr, 0, bArr.length - 2, p161m0.C1868y.f7593r);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f6378c;
        arrayList.add(str);
        int i4 = this.f6376a;
        if (i4 == 1) {
            if (!p161m0.AbstractC1869z.f7600a.matcher(str).matches() && !p161m0.AbstractC1869z.f7601b.matcher(str).matches()) {
                return null;
            }
            this.f6376a = 2;
            return null;
        }
        if (i4 != 2) {
            throw new java.lang.IllegalStateException();
        }
        try {
            java.util.regex.Matcher matcher = p161m0.AbstractC1869z.f7602c.matcher(str);
            if (matcher.find()) {
                java.lang.String group = matcher.group(1);
                group.getClass();
                j4 = java.lang.Long.parseLong(group);
            } else {
                j4 = -1;
            }
            if (j4 != -1) {
                this.f6377b = j4;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.f6377b > 0) {
                this.f6376a = 3;
                return null;
            }
            p129f2.AbstractC1393I m3162j = p129f2.AbstractC1393I.m3162j(arrayList);
            arrayList.clear();
            this.f6376a = 1;
            this.f6377b = 0L;
            return m3162j;
        } catch (java.lang.NumberFormatException e4) {
            throw p076T.C0666I.m1203b(str, e4);
        }
    }
}
