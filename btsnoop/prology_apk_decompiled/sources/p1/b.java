package p1;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n.C0442e;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final C0442e f7645a;

    /* renamed from: b, reason: collision with root package name */
    public final C0442e f7646b;

    /* renamed from: c, reason: collision with root package name */
    public final C0442e f7647c;

    public b(C0442e c0442e, C0442e c0442e2, C0442e c0442e3) {
        this.f7645a = c0442e;
        this.f7646b = c0442e2;
        this.f7647c = c0442e3;
    }

    public abstract c a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C0442e c0442e = this.f7647c;
        Class cls2 = (Class) c0442e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0442e.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        C0442e c0442e = this.f7645a;
        Method method = (Method) c0442e.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
        c0442e.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C0442e c0442e = this.f7646b;
        Method method = (Method) c0442e.get(name);
        if (method != null) {
            return method;
        }
        Class b4 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b4.getDeclaredMethod("write", cls, b.class);
        c0442e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i4);

    public final int f(int i4, int i5) {
        return !e(i5) ? i4 : ((c) this).f7649e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i4) {
        if (!e(i4)) {
            return parcelable;
        }
        return ((c) this).f7649e.readParcelable(c.class.getClassLoader());
    }

    public final d h() {
        String readString = ((c) this).f7649e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (d) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
        } catch (InvocationTargetException e7) {
            if (e7.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e7.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
        }
    }

    public abstract void i(int i4);

    public final void j(int i4, int i5) {
        i(i5);
        ((c) this).f7649e.writeInt(i4);
    }

    public final void k(Parcelable parcelable, int i4) {
        i(i4);
        ((c) this).f7649e.writeParcelable(parcelable, 0);
    }

    public final void l(d dVar) {
        if (dVar == null) {
            ((c) this).f7649e.writeString(null);
            return;
        }
        try {
            ((c) this).f7649e.writeString(b(dVar.getClass()).getName());
            c a4 = a();
            try {
                d(dVar.getClass()).invoke(null, dVar, a4);
                int i4 = a4.f7653i;
                if (i4 >= 0) {
                    int i5 = a4.f7648d.get(i4);
                    Parcel parcel = a4.f7649e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i5);
                    parcel.writeInt(dataPosition - i5);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            } catch (IllegalAccessException e5) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
            } catch (InvocationTargetException e7) {
                if (!(e7.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
                }
                throw ((RuntimeException) e7.getCause());
            }
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException(dVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e8);
        }
    }
}
