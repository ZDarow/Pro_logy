package i1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f6190a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6191b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6192c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6193d;

    public j(int i4, int i5, long j4, long j5) {
        this.f6190a = i4;
        this.f6191b = i5;
        this.f6192c = j4;
        this.f6193d = j5;
    }

    public static j a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            j jVar = new j(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return jVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f6190a);
            dataOutputStream.writeInt(this.f6191b);
            dataOutputStream.writeLong(this.f6192c);
            dataOutputStream.writeLong(this.f6193d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f6191b == jVar.f6191b && this.f6192c == jVar.f6192c && this.f6190a == jVar.f6190a && this.f6193d == jVar.f6193d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f6191b), Long.valueOf(this.f6192c), Integer.valueOf(this.f6190a), Long.valueOf(this.f6193d));
    }
}
