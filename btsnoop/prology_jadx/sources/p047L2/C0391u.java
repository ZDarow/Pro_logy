package p047L2;

/* renamed from: L2.u */
/* loaded from: classes.dex */
public class C0391u implements p047L2.InterfaceC0383m {

    /* renamed from: a */
    public static final p047L2.C0391u f1135a = new java.lang.Object();

    /* renamed from: b */
    public static final boolean f1136b;

    /* renamed from: c */
    public static final java.nio.charset.Charset f1137c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, L2.u] */
    static {
        f1136b = java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.LITTLE_ENDIAN;
        f1137c = java.nio.charset.Charset.forName("UTF8");
    }

    /* renamed from: c */
    public static final void m843c(int i4, java.nio.ByteBuffer byteBuffer) {
        int position = byteBuffer.position() % i4;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i4) - position);
        }
    }

    /* renamed from: d */
    public static final int m844d(java.nio.ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new java.lang.IllegalArgumentException("Message corrupted");
        }
        int i4 = byteBuffer.get() & 255;
        return i4 < 254 ? i4 : i4 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    /* renamed from: g */
    public static final void m845g(p047L2.C0390t c0390t, int i4) {
        int size = c0390t.size() % i4;
        if (size != 0) {
            for (int i5 = 0; i5 < i4 - size; i5++) {
                c0390t.write(0);
            }
        }
    }

    /* renamed from: h */
    public static final void m846h(p047L2.C0390t c0390t, int i4) {
        if (f1136b) {
            c0390t.write(i4);
            c0390t.write(i4 >>> 8);
            c0390t.write(i4 >>> 16);
            c0390t.write(i4 >>> 24);
            return;
        }
        c0390t.write(i4 >>> 24);
        c0390t.write(i4 >>> 16);
        c0390t.write(i4 >>> 8);
        c0390t.write(i4);
    }

    /* renamed from: i */
    public static final void m847i(p047L2.C0390t c0390t, long j4) {
        if (f1136b) {
            c0390t.write((byte) j4);
            c0390t.write((byte) (j4 >>> 8));
            c0390t.write((byte) (j4 >>> 16));
            c0390t.write((byte) (j4 >>> 24));
            c0390t.write((byte) (j4 >>> 32));
            c0390t.write((byte) (j4 >>> 40));
            c0390t.write((byte) (j4 >>> 48));
            c0390t.write((byte) (j4 >>> 56));
            return;
        }
        c0390t.write((byte) (j4 >>> 56));
        c0390t.write((byte) (j4 >>> 48));
        c0390t.write((byte) (j4 >>> 40));
        c0390t.write((byte) (j4 >>> 32));
        c0390t.write((byte) (j4 >>> 24));
        c0390t.write((byte) (j4 >>> 16));
        c0390t.write((byte) (j4 >>> 8));
        c0390t.write((byte) j4);
    }

    /* renamed from: j */
    public static final void m848j(p047L2.C0390t c0390t, int i4) {
        if (i4 < 254) {
            c0390t.write(i4);
            return;
        }
        if (i4 > 65535) {
            c0390t.write(255);
            m846h(c0390t, i4);
            return;
        }
        c0390t.write(254);
        if (f1136b) {
            c0390t.write(i4);
            c0390t.write(i4 >>> 8);
        } else {
            c0390t.write(i4 >>> 8);
            c0390t.write(i4);
        }
    }

    @Override // p047L2.InterfaceC0383m
    /* renamed from: a */
    public final java.lang.Object mo831a(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(java.nio.ByteOrder.nativeOrder());
        java.lang.Object m849e = m849e(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new java.lang.IllegalArgumentException("Message corrupted");
        }
        return m849e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.ByteArrayOutputStream, L2.t] */
    @Override // p047L2.InterfaceC0383m
    /* renamed from: b */
    public final java.nio.ByteBuffer mo832b(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        ?? byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        mo851k(byteArrayOutputStream, obj);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.m842a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    /* renamed from: e */
    public final java.lang.Object m849e(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return mo850f(byteBuffer.get(), byteBuffer);
        }
        throw new java.lang.IllegalArgumentException("Message corrupted");
    }

    /* renamed from: f */
    public java.lang.Object mo850f(byte b4, java.nio.ByteBuffer byteBuffer) {
        java.lang.Object bigInteger;
        java.nio.charset.Charset charset = f1137c;
        int i4 = 0;
        switch (b4) {
            case 0:
                return null;
            case 1:
                return java.lang.Boolean.TRUE;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                return java.lang.Boolean.FALSE;
            case p044L.C0353k.INTEGER_FIELD_NUMBER /* 3 */:
                return java.lang.Integer.valueOf(byteBuffer.getInt());
            case p044L.C0353k.LONG_FIELD_NUMBER /* 4 */:
                return java.lang.Long.valueOf(byteBuffer.getLong());
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                byte[] bArr = new byte[m844d(byteBuffer)];
                byteBuffer.get(bArr);
                bigInteger = new java.math.BigInteger(new java.lang.String(bArr, charset), 16);
                break;
            case p044L.C0353k.STRING_SET_FIELD_NUMBER /* 6 */:
                m843c(8, byteBuffer);
                return java.lang.Double.valueOf(byteBuffer.getDouble());
            case p044L.C0353k.DOUBLE_FIELD_NUMBER /* 7 */:
                byte[] bArr2 = new byte[m844d(byteBuffer)];
                byteBuffer.get(bArr2);
                bigInteger = new java.lang.String(bArr2, charset);
                break;
            case p044L.C0353k.BYTES_FIELD_NUMBER /* 8 */:
                byte[] bArr3 = new byte[m844d(byteBuffer)];
                byteBuffer.get(bArr3);
                return bArr3;
            case 9:
                int m844d = m844d(byteBuffer);
                int[] iArr = new int[m844d];
                m843c(4, byteBuffer);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position((m844d * 4) + byteBuffer.position());
                return iArr;
            case 10:
                int m844d2 = m844d(byteBuffer);
                long[] jArr = new long[m844d2];
                m843c(8, byteBuffer);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position((m844d2 * 8) + byteBuffer.position());
                return jArr;
            case 11:
                int m844d3 = m844d(byteBuffer);
                double[] dArr = new double[m844d3];
                m843c(8, byteBuffer);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position((m844d3 * 8) + byteBuffer.position());
                return dArr;
            case 12:
                int m844d4 = m844d(byteBuffer);
                java.util.ArrayList arrayList = new java.util.ArrayList(m844d4);
                while (i4 < m844d4) {
                    arrayList.add(m849e(byteBuffer));
                    i4++;
                }
                return arrayList;
            case 13:
                int m844d5 = m844d(byteBuffer);
                java.util.HashMap hashMap = new java.util.HashMap();
                while (i4 < m844d5) {
                    hashMap.put(m849e(byteBuffer), m849e(byteBuffer));
                    i4++;
                }
                return hashMap;
            case 14:
                int m844d6 = m844d(byteBuffer);
                float[] fArr = new float[m844d6];
                m843c(4, byteBuffer);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position((m844d6 * 4) + byteBuffer.position());
                return fArr;
            default:
                throw new java.lang.IllegalArgumentException("Message corrupted");
        }
        return bigInteger;
    }

    /* renamed from: k */
    public void mo851k(p047L2.C0390t c0390t, java.lang.Object obj) {
        int i4 = 0;
        if (obj == null || obj.equals(null)) {
            c0390t.write(0);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            c0390t.write(((java.lang.Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        boolean z4 = obj instanceof java.lang.Number;
        java.nio.charset.Charset charset = f1137c;
        if (z4) {
            if ((obj instanceof java.lang.Integer) || (obj instanceof java.lang.Short) || (obj instanceof java.lang.Byte)) {
                c0390t.write(3);
                m846h(c0390t, ((java.lang.Number) obj).intValue());
                return;
            }
            if (obj instanceof java.lang.Long) {
                c0390t.write(4);
                m847i(c0390t, ((java.lang.Long) obj).longValue());
                return;
            }
            if ((obj instanceof java.lang.Float) || (obj instanceof java.lang.Double)) {
                c0390t.write(6);
                m845g(c0390t, 8);
                m847i(c0390t, java.lang.Double.doubleToLongBits(((java.lang.Number) obj).doubleValue()));
                return;
            } else {
                if (!(obj instanceof java.math.BigInteger)) {
                    throw new java.lang.IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                c0390t.write(5);
                byte[] bytes = ((java.math.BigInteger) obj).toString(16).getBytes(charset);
                m848j(c0390t, bytes.length);
                c0390t.write(bytes, 0, bytes.length);
                return;
            }
        }
        if (obj instanceof java.lang.CharSequence) {
            c0390t.write(7);
            byte[] bytes2 = obj.toString().getBytes(charset);
            m848j(c0390t, bytes2.length);
            c0390t.write(bytes2, 0, bytes2.length);
            return;
        }
        if (obj instanceof byte[]) {
            c0390t.write(8);
            byte[] bArr = (byte[]) obj;
            m848j(c0390t, bArr.length);
            c0390t.write(bArr, 0, bArr.length);
            return;
        }
        if (obj instanceof int[]) {
            c0390t.write(9);
            int[] iArr = (int[]) obj;
            m848j(c0390t, iArr.length);
            m845g(c0390t, 4);
            int length = iArr.length;
            while (i4 < length) {
                m846h(c0390t, iArr[i4]);
                i4++;
            }
            return;
        }
        if (obj instanceof long[]) {
            c0390t.write(10);
            long[] jArr = (long[]) obj;
            m848j(c0390t, jArr.length);
            m845g(c0390t, 8);
            int length2 = jArr.length;
            while (i4 < length2) {
                m847i(c0390t, jArr[i4]);
                i4++;
            }
            return;
        }
        if (obj instanceof double[]) {
            c0390t.write(11);
            double[] dArr = (double[]) obj;
            m848j(c0390t, dArr.length);
            m845g(c0390t, 8);
            int length3 = dArr.length;
            while (i4 < length3) {
                m847i(c0390t, java.lang.Double.doubleToLongBits(dArr[i4]));
                i4++;
            }
            return;
        }
        if (obj instanceof java.util.List) {
            c0390t.write(12);
            java.util.List list = (java.util.List) obj;
            m848j(c0390t, list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                mo851k(c0390t, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            c0390t.write(13);
            java.util.Map map = (java.util.Map) obj;
            m848j(c0390t, map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                mo851k(c0390t, entry.getKey());
                mo851k(c0390t, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new java.lang.IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        c0390t.write(14);
        float[] fArr = (float[]) obj;
        m848j(c0390t, fArr.length);
        m845g(c0390t, 4);
        int length4 = fArr.length;
        while (i4 < length4) {
            m846h(c0390t, java.lang.Float.floatToIntBits(fArr[i4]));
            i4++;
        }
    }
}
