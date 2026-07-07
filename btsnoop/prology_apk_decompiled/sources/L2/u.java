package L2;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class u implements m {

    /* renamed from: a, reason: collision with root package name */
    public static final u f1096a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f1097b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f1098c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, L2.u] */
    static {
        f1097b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        f1098c = Charset.forName("UTF8");
    }

    public static final void c(int i4, ByteBuffer byteBuffer) {
        int position = byteBuffer.position() % i4;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i4) - position);
        }
    }

    public static final int d(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        int i4 = byteBuffer.get() & 255;
        return i4 < 254 ? i4 : i4 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    public static final void g(t tVar, int i4) {
        int size = tVar.size() % i4;
        if (size != 0) {
            for (int i5 = 0; i5 < i4 - size; i5++) {
                tVar.write(0);
            }
        }
    }

    public static final void h(t tVar, int i4) {
        if (f1097b) {
            tVar.write(i4);
            tVar.write(i4 >>> 8);
            tVar.write(i4 >>> 16);
            tVar.write(i4 >>> 24);
            return;
        }
        tVar.write(i4 >>> 24);
        tVar.write(i4 >>> 16);
        tVar.write(i4 >>> 8);
        tVar.write(i4);
    }

    public static final void i(t tVar, long j4) {
        if (f1097b) {
            tVar.write((byte) j4);
            tVar.write((byte) (j4 >>> 8));
            tVar.write((byte) (j4 >>> 16));
            tVar.write((byte) (j4 >>> 24));
            tVar.write((byte) (j4 >>> 32));
            tVar.write((byte) (j4 >>> 40));
            tVar.write((byte) (j4 >>> 48));
            tVar.write((byte) (j4 >>> 56));
            return;
        }
        tVar.write((byte) (j4 >>> 56));
        tVar.write((byte) (j4 >>> 48));
        tVar.write((byte) (j4 >>> 40));
        tVar.write((byte) (j4 >>> 32));
        tVar.write((byte) (j4 >>> 24));
        tVar.write((byte) (j4 >>> 16));
        tVar.write((byte) (j4 >>> 8));
        tVar.write((byte) j4);
    }

    public static final void j(t tVar, int i4) {
        if (i4 < 254) {
            tVar.write(i4);
            return;
        }
        if (i4 > 65535) {
            tVar.write(255);
            h(tVar, i4);
            return;
        }
        tVar.write(254);
        if (f1097b) {
            tVar.write(i4);
            tVar.write(i4 >>> 8);
        } else {
            tVar.write(i4 >>> 8);
            tVar.write(i4);
        }
    }

    @Override // L2.m
    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object e4 = e(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return e4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.ByteArrayOutputStream, L2.t] */
    @Override // L2.m
    public final ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        k(byteArrayOutputStream, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    public final Object e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return f(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public Object f(byte b4, ByteBuffer byteBuffer) {
        Object bigInteger;
        Charset charset = f1098c;
        int i4 = 0;
        switch (b4) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                return Boolean.FALSE;
            case L.k.INTEGER_FIELD_NUMBER /* 3 */:
                return Integer.valueOf(byteBuffer.getInt());
            case L.k.LONG_FIELD_NUMBER /* 4 */:
                return Long.valueOf(byteBuffer.getLong());
            case L.k.STRING_FIELD_NUMBER /* 5 */:
                byte[] bArr = new byte[d(byteBuffer)];
                byteBuffer.get(bArr);
                bigInteger = new BigInteger(new String(bArr, charset), 16);
                break;
            case L.k.STRING_SET_FIELD_NUMBER /* 6 */:
                c(8, byteBuffer);
                return Double.valueOf(byteBuffer.getDouble());
            case L.k.DOUBLE_FIELD_NUMBER /* 7 */:
                byte[] bArr2 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr2);
                bigInteger = new String(bArr2, charset);
                break;
            case L.k.BYTES_FIELD_NUMBER /* 8 */:
                byte[] bArr3 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr3);
                return bArr3;
            case 9:
                int d4 = d(byteBuffer);
                int[] iArr = new int[d4];
                c(4, byteBuffer);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position((d4 * 4) + byteBuffer.position());
                return iArr;
            case 10:
                int d5 = d(byteBuffer);
                long[] jArr = new long[d5];
                c(8, byteBuffer);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position((d5 * 8) + byteBuffer.position());
                return jArr;
            case 11:
                int d6 = d(byteBuffer);
                double[] dArr = new double[d6];
                c(8, byteBuffer);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position((d6 * 8) + byteBuffer.position());
                return dArr;
            case 12:
                int d7 = d(byteBuffer);
                ArrayList arrayList = new ArrayList(d7);
                while (i4 < d7) {
                    arrayList.add(e(byteBuffer));
                    i4++;
                }
                return arrayList;
            case 13:
                int d8 = d(byteBuffer);
                HashMap hashMap = new HashMap();
                while (i4 < d8) {
                    hashMap.put(e(byteBuffer), e(byteBuffer));
                    i4++;
                }
                return hashMap;
            case 14:
                int d9 = d(byteBuffer);
                float[] fArr = new float[d9];
                c(4, byteBuffer);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position((d9 * 4) + byteBuffer.position());
                return fArr;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
        return bigInteger;
    }

    public void k(t tVar, Object obj) {
        int i4 = 0;
        if (obj == null || obj.equals(null)) {
            tVar.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            tVar.write(((Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        boolean z4 = obj instanceof Number;
        Charset charset = f1098c;
        if (z4) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                tVar.write(3);
                h(tVar, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                tVar.write(4);
                i(tVar, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                tVar.write(6);
                g(tVar, 8);
                i(tVar, Double.doubleToLongBits(((Number) obj).doubleValue()));
                return;
            } else {
                if (!(obj instanceof BigInteger)) {
                    throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                tVar.write(5);
                byte[] bytes = ((BigInteger) obj).toString(16).getBytes(charset);
                j(tVar, bytes.length);
                tVar.write(bytes, 0, bytes.length);
                return;
            }
        }
        if (obj instanceof CharSequence) {
            tVar.write(7);
            byte[] bytes2 = obj.toString().getBytes(charset);
            j(tVar, bytes2.length);
            tVar.write(bytes2, 0, bytes2.length);
            return;
        }
        if (obj instanceof byte[]) {
            tVar.write(8);
            byte[] bArr = (byte[]) obj;
            j(tVar, bArr.length);
            tVar.write(bArr, 0, bArr.length);
            return;
        }
        if (obj instanceof int[]) {
            tVar.write(9);
            int[] iArr = (int[]) obj;
            j(tVar, iArr.length);
            g(tVar, 4);
            int length = iArr.length;
            while (i4 < length) {
                h(tVar, iArr[i4]);
                i4++;
            }
            return;
        }
        if (obj instanceof long[]) {
            tVar.write(10);
            long[] jArr = (long[]) obj;
            j(tVar, jArr.length);
            g(tVar, 8);
            int length2 = jArr.length;
            while (i4 < length2) {
                i(tVar, jArr[i4]);
                i4++;
            }
            return;
        }
        if (obj instanceof double[]) {
            tVar.write(11);
            double[] dArr = (double[]) obj;
            j(tVar, dArr.length);
            g(tVar, 8);
            int length3 = dArr.length;
            while (i4 < length3) {
                i(tVar, Double.doubleToLongBits(dArr[i4]));
                i4++;
            }
            return;
        }
        if (obj instanceof List) {
            tVar.write(12);
            List list = (List) obj;
            j(tVar, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k(tVar, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            tVar.write(13);
            Map map = (Map) obj;
            j(tVar, map.size());
            for (Map.Entry entry : map.entrySet()) {
                k(tVar, entry.getKey());
                k(tVar, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        tVar.write(14);
        float[] fArr = (float[]) obj;
        j(tVar, fArr.length);
        g(tVar, 4);
        int length4 = fArr.length;
        while (i4 < length4) {
            h(tVar, Float.floatToIntBits(fArr[i4]));
            i4++;
        }
    }
}
