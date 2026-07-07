package p176p1;

/* renamed from: p1.b */
/* loaded from: classes.dex */
public abstract class AbstractC1950b {

    /* renamed from: a */
    public final p165n.C1878e f7936a;

    /* renamed from: b */
    public final p165n.C1878e f7937b;

    /* renamed from: c */
    public final p165n.C1878e f7938c;

    public AbstractC1950b(p165n.C1878e c1878e, p165n.C1878e c1878e2, p165n.C1878e c1878e3) {
        this.f7936a = c1878e;
        this.f7937b = c1878e2;
        this.f7938c = c1878e3;
    }

    /* renamed from: a */
    public abstract p176p1.C1951c mo3949a();

    /* renamed from: b */
    public final java.lang.Class m3950b(java.lang.Class cls) {
        java.lang.String name = cls.getName();
        p165n.C1878e c1878e = this.f7938c;
        java.lang.Class cls2 = (java.lang.Class) c1878e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        java.lang.Class<?> cls3 = java.lang.Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c1878e.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: c */
    public final java.lang.reflect.Method m3951c(java.lang.String str) {
        p165n.C1878e c1878e = this.f7936a;
        java.lang.reflect.Method method = (java.lang.reflect.Method) c1878e.get(str);
        if (method != null) {
            return method;
        }
        java.lang.System.currentTimeMillis();
        java.lang.reflect.Method declaredMethod = java.lang.Class.forName(str, true, p176p1.AbstractC1950b.class.getClassLoader()).getDeclaredMethod("read", p176p1.AbstractC1950b.class);
        c1878e.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: d */
    public final java.lang.reflect.Method m3952d(java.lang.Class cls) {
        java.lang.String name = cls.getName();
        p165n.C1878e c1878e = this.f7937b;
        java.lang.reflect.Method method = (java.lang.reflect.Method) c1878e.get(name);
        if (method != null) {
            return method;
        }
        java.lang.Class m3950b = m3950b(cls);
        java.lang.System.currentTimeMillis();
        java.lang.reflect.Method declaredMethod = m3950b.getDeclaredMethod("write", cls, p176p1.AbstractC1950b.class);
        c1878e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    public abstract boolean mo3953e(int i4);

    /* renamed from: f */
    public final int m3954f(int i4, int i5) {
        return !mo3953e(i5) ? i4 : ((p176p1.C1951c) this).f7940e.readInt();
    }

    /* renamed from: g */
    public final android.os.Parcelable m3955g(android.os.Parcelable parcelable, int i4) {
        if (!mo3953e(i4)) {
            return parcelable;
        }
        return ((p176p1.C1951c) this).f7940e.readParcelable(p176p1.C1951c.class.getClassLoader());
    }

    /* renamed from: h */
    public final p176p1.InterfaceC1952d m3956h() {
        java.lang.String readString = ((p176p1.C1951c) this).f7940e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (p176p1.InterfaceC1952d) m3951c(readString).invoke(null, mo3949a());
        } catch (java.lang.ClassNotFoundException e4) {
            throw new java.lang.RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        } catch (java.lang.IllegalAccessException e5) {
            throw new java.lang.RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
        } catch (java.lang.NoSuchMethodException e6) {
            throw new java.lang.RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
        } catch (java.lang.reflect.InvocationTargetException e7) {
            if (e7.getCause() instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) e7.getCause());
            }
            throw new java.lang.RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
        }
    }

    /* renamed from: i */
    public abstract void mo3957i(int i4);

    /* renamed from: j */
    public final void m3958j(int i4, int i5) {
        mo3957i(i5);
        ((p176p1.C1951c) this).f7940e.writeInt(i4);
    }

    /* renamed from: k */
    public final void m3959k(android.os.Parcelable parcelable, int i4) {
        mo3957i(i4);
        ((p176p1.C1951c) this).f7940e.writeParcelable(parcelable, 0);
    }

    /* renamed from: l */
    public final void m3960l(p176p1.InterfaceC1952d interfaceC1952d) {
        if (interfaceC1952d == null) {
            ((p176p1.C1951c) this).f7940e.writeString(null);
            return;
        }
        try {
            ((p176p1.C1951c) this).f7940e.writeString(m3950b(interfaceC1952d.getClass()).getName());
            p176p1.C1951c mo3949a = mo3949a();
            try {
                m3952d(interfaceC1952d.getClass()).invoke(null, interfaceC1952d, mo3949a);
                int i4 = mo3949a.f7944i;
                if (i4 >= 0) {
                    int i5 = mo3949a.f7939d.get(i4);
                    android.os.Parcel parcel = mo3949a.f7940e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i5);
                    parcel.writeInt(dataPosition - i5);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (java.lang.ClassNotFoundException e4) {
                throw new java.lang.RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            } catch (java.lang.IllegalAccessException e5) {
                throw new java.lang.RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
            } catch (java.lang.NoSuchMethodException e6) {
                throw new java.lang.RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
            } catch (java.lang.reflect.InvocationTargetException e7) {
                if (!(e7.getCause() instanceof java.lang.RuntimeException)) {
                    throw new java.lang.RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
                }
                throw ((java.lang.RuntimeException) e7.getCause());
            }
        } catch (java.lang.ClassNotFoundException e8) {
            throw new java.lang.RuntimeException(interfaceC1952d.getClass().getSimpleName().concat(" does not have a Parcelizer"), e8);
        }
    }
}
