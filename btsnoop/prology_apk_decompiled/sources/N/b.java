package N;

import B2.AbstractC0007h;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* renamed from: p, reason: collision with root package name */
    public static final ByteOrder f1175p = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: q, reason: collision with root package name */
    public static final ByteOrder f1176q = ByteOrder.BIG_ENDIAN;

    /* renamed from: l, reason: collision with root package name */
    public final DataInputStream f1177l;

    /* renamed from: m, reason: collision with root package name */
    public ByteOrder f1178m;

    /* renamed from: n, reason: collision with root package name */
    public int f1179n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f1180o;

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    public final void a(int i4) {
        int i5 = 0;
        while (i5 < i4) {
            DataInputStream dataInputStream = this.f1177l;
            int i6 = i4 - i5;
            int skip = (int) dataInputStream.skip(i6);
            if (skip <= 0) {
                if (this.f1180o == null) {
                    this.f1180o = new byte[8192];
                }
                skip = dataInputStream.read(this.f1180o, 0, Math.min(8192, i6));
                if (skip == -1) {
                    throw new EOFException(AbstractC0007h.j(i4, "Reached EOF while skipping ", " bytes."));
                }
            }
            i5 += skip;
        }
        this.f1179n += i5;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f1177l.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i4) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f1179n++;
        return this.f1177l.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f1179n++;
        return this.f1177l.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f1179n++;
        int read = this.f1177l.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f1179n += 2;
        return this.f1177l.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i4, int i5) {
        this.f1179n += i5;
        this.f1177l.readFully(bArr, i4, i5);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f1179n += 4;
        DataInputStream dataInputStream = this.f1177l;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1178m;
        if (byteOrder == f1175p) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == f1176q) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.f1178m);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.f1179n += 8;
        DataInputStream dataInputStream = this.f1177l;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1178m;
        if (byteOrder == f1175p) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == f1176q) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        throw new IOException("Invalid byte order: " + this.f1178m);
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f1179n += 2;
        DataInputStream dataInputStream = this.f1177l;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1178m;
        if (byteOrder == f1175p) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == f1176q) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.f1178m);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f1179n += 2;
        return this.f1177l.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f1179n++;
        return this.f1177l.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f1179n += 2;
        DataInputStream dataInputStream = this.f1177l;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f1178m;
        if (byteOrder == f1175p) {
            return (read2 << 8) + read;
        }
        if (byteOrder == f1176q) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.f1178m);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i4) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        this.f1178m = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f1177l = dataInputStream;
        dataInputStream.mark(0);
        this.f1179n = 0;
        this.f1178m = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        int read = this.f1177l.read(bArr, i4, i5);
        this.f1179n += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f1179n += bArr.length;
        this.f1177l.readFully(bArr);
    }
}
