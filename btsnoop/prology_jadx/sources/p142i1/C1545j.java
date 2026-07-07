package p142i1;

/* renamed from: i1.j */
/* loaded from: classes.dex */
public final class C1545j {

    /* renamed from: a */
    public final int f6420a;

    /* renamed from: b */
    public final int f6421b;

    /* renamed from: c */
    public final long f6422c;

    /* renamed from: d */
    public final long f6423d;

    public C1545j(int i4, int i5, long j4, long j5) {
        this.f6420a = i4;
        this.f6421b = i5;
        this.f6422c = j4;
        this.f6423d = j5;
    }

    /* renamed from: a */
    public static p142i1.C1545j m3433a(java.io.File file) {
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(file));
        try {
            p142i1.C1545j c1545j = new p142i1.C1545j(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c1545j;
        } catch (java.lang.Throwable th) {
            try {
                dataInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final void m3434b(java.io.File file) {
        file.delete();
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f6420a);
            dataOutputStream.writeInt(this.f6421b);
            dataOutputStream.writeLong(this.f6422c);
            dataOutputStream.writeLong(this.f6423d);
            dataOutputStream.close();
        } catch (java.lang.Throwable th) {
            try {
                dataOutputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p142i1.C1545j)) {
            return false;
        }
        p142i1.C1545j c1545j = (p142i1.C1545j) obj;
        return this.f6421b == c1545j.f6421b && this.f6422c == c1545j.f6422c && this.f6420a == c1545j.f6420a && this.f6423d == c1545j.f6423d;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.f6421b), java.lang.Long.valueOf(this.f6422c), java.lang.Integer.valueOf(this.f6420a), java.lang.Long.valueOf(this.f6423d));
    }
}
