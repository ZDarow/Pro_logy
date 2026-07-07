package p052N;

/* renamed from: N.b */
/* loaded from: classes.dex */
public class C0430b extends java.io.InputStream implements java.io.DataInput {

    /* renamed from: p */
    public static final java.nio.ByteOrder f1214p = java.nio.ByteOrder.LITTLE_ENDIAN;

    /* renamed from: q */
    public static final java.nio.ByteOrder f1215q = java.nio.ByteOrder.BIG_ENDIAN;

    /* renamed from: l */
    public final java.io.DataInputStream f1216l;

    /* renamed from: m */
    public java.nio.ByteOrder f1217m;

    /* renamed from: n */
    public int f1218n;

    /* renamed from: o */
    public byte[] f1219o;

    public C0430b(byte[] bArr) {
        this(new java.io.ByteArrayInputStream(bArr), java.nio.ByteOrder.BIG_ENDIAN);
    }

    /* renamed from: a */
    public final void m905a(int i4) {
        int i5 = 0;
        while (i5 < i4) {
            java.io.DataInputStream dataInputStream = this.f1216l;
            int i6 = i4 - i5;
            int skip = (int) dataInputStream.skip(i6);
            if (skip <= 0) {
                if (this.f1219o == null) {
                    this.f1219o = new byte[8192];
                }
                skip = dataInputStream.read(this.f1219o, 0, java.lang.Math.min(8192, i6));
                if (skip == -1) {
                    throw new java.io.EOFException(p009B2.AbstractC0051h.m151j(i4, "Reached EOF while skipping ", " bytes."));
                }
            }
            i5 += skip;
        }
        this.f1218n += i5;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f1216l.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i4) {
        throw new java.lang.UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f1218n++;
        return this.f1216l.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f1218n++;
        return this.f1216l.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f1218n++;
        int read = this.f1216l.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new java.io.EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f1218n += 2;
        return this.f1216l.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return java.lang.Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return java.lang.Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i4, int i5) {
        this.f1218n += i5;
        this.f1216l.readFully(bArr, i4, i5);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f1218n += 4;
        java.io.DataInputStream dataInputStream = this.f1216l;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.f1217m;
        if (byteOrder == f1214p) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == f1215q) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new java.io.IOException("Invalid byte order: " + this.f1217m);
    }

    @Override // java.io.DataInput
    public final java.lang.String readLine() {
        android.util.Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.f1218n += 8;
        java.io.DataInputStream dataInputStream = this.f1216l;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.f1217m;
        if (byteOrder == f1214p) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == f1215q) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        throw new java.io.IOException("Invalid byte order: " + this.f1217m);
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f1218n += 2;
        java.io.DataInputStream dataInputStream = this.f1216l;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.f1217m;
        if (byteOrder == f1214p) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == f1215q) {
            return (short) ((read << 8) + read2);
        }
        throw new java.io.IOException("Invalid byte order: " + this.f1217m);
    }

    @Override // java.io.DataInput
    public final java.lang.String readUTF() {
        this.f1218n += 2;
        return this.f1216l.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f1218n++;
        return this.f1216l.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f1218n += 2;
        java.io.DataInputStream dataInputStream = this.f1216l;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.f1217m;
        if (byteOrder == f1214p) {
            return (read2 << 8) + read;
        }
        if (byteOrder == f1215q) {
            return (read << 8) + read2;
        }
        throw new java.io.IOException("Invalid byte order: " + this.f1217m);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new java.lang.UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i4) {
        throw new java.lang.UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public C0430b(java.io.InputStream inputStream) {
        this(inputStream, java.nio.ByteOrder.BIG_ENDIAN);
    }

    public C0430b(java.io.InputStream inputStream, java.nio.ByteOrder byteOrder) {
        this.f1217m = java.nio.ByteOrder.BIG_ENDIAN;
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
        this.f1216l = dataInputStream;
        dataInputStream.mark(0);
        this.f1218n = 0;
        this.f1217m = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        int read = this.f1216l.read(bArr, i4, i5);
        this.f1218n += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f1218n += bArr.length;
        this.f1216l.readFully(bArr);
    }
}
