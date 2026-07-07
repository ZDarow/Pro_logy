package p011C;

/* renamed from: C.g */
/* loaded from: classes.dex */
public final class C0115g {

    /* renamed from: a */
    public android.view.ViewParent f320a;

    /* renamed from: b */
    public android.view.ViewParent f321b;

    /* renamed from: c */
    public final android.view.ViewGroup f322c;

    /* renamed from: d */
    public boolean f323d;

    /* renamed from: e */
    public int[] f324e;

    public C0115g(android.view.ViewGroup viewGroup) {
        this.f322c = viewGroup;
    }

    /* renamed from: a */
    public final boolean m418a(float f4, float f5, boolean z4) {
        android.view.ViewParent m422e;
        if (!this.f323d || (m422e = m422e(0)) == null) {
            return false;
        }
        try {
            return m422e.onNestedFling(this.f322c, f4, f5, z4);
        } catch (java.lang.AbstractMethodError e4) {
            android.util.Log.e("ViewParentCompat", "ViewParent " + m422e + " does not implement interface method onNestedFling", e4);
            return false;
        }
    }

    /* renamed from: b */
    public final boolean m419b(float f4, float f5) {
        android.view.ViewParent m422e;
        if (!this.f323d || (m422e = m422e(0)) == null) {
            return false;
        }
        try {
            return m422e.onNestedPreFling(this.f322c, f4, f5);
        } catch (java.lang.AbstractMethodError e4) {
            android.util.Log.e("ViewParentCompat", "ViewParent " + m422e + " does not implement interface method onNestedPreFling", e4);
            return false;
        }
    }

    /* renamed from: c */
    public final boolean m420c(int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        android.view.ViewParent m422e;
        int i7;
        int i8;
        if (!this.f323d || (m422e = m422e(i6)) == null) {
            return false;
        }
        if (i4 == 0 && i5 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        android.view.ViewGroup viewGroup = this.f322c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i7 = iArr2[0];
            i8 = iArr2[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr == null) {
            if (this.f324e == null) {
                this.f324e = new int[2];
            }
            iArr = this.f324e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (m422e instanceof p011C.InterfaceC0116h) {
            ((p011C.InterfaceC0116h) m422e).mo429e(i4, i5, i6, iArr);
        } else if (i6 == 0) {
            try {
                m422e.onNestedPreScroll(viewGroup, i4, i5, iArr);
            } catch (java.lang.AbstractMethodError e4) {
                android.util.Log.e("ViewParentCompat", "ViewParent " + m422e + " does not implement interface method onNestedPreScroll", e4);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i7;
            iArr2[1] = iArr2[1] - i8;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: d */
    public final boolean m421d(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        android.view.ViewParent m422e;
        int i9;
        int i10;
        int[] iArr3;
        if (!this.f323d || (m422e = m422e(i8)) == null) {
            return false;
        }
        if (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        android.view.ViewGroup viewGroup = this.f322c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i9 = iArr[0];
            i10 = iArr[1];
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (iArr2 == null) {
            if (this.f324e == null) {
                this.f324e = new int[2];
            }
            int[] iArr4 = this.f324e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (m422e instanceof p011C.InterfaceC0117i) {
            ((p011C.InterfaceC0117i) m422e).mo431d(viewGroup, i4, i5, i6, i7, i8, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i6;
            iArr3[1] = iArr3[1] + i7;
            if (m422e instanceof p011C.InterfaceC0116h) {
                ((p011C.InterfaceC0116h) m422e).mo427b(viewGroup, i4, i5, i6, i7, i8);
            } else if (i8 == 0) {
                try {
                    m422e.onNestedScroll(viewGroup, i4, i5, i6, i7);
                } catch (java.lang.AbstractMethodError e4) {
                    android.util.Log.e("ViewParentCompat", "ViewParent " + m422e + " does not implement interface method onNestedScroll", e4);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i9;
            iArr[1] = iArr[1] - i10;
        }
        return true;
    }

    /* renamed from: e */
    public final android.view.ViewParent m422e(int i4) {
        if (i4 == 0) {
            return this.f320a;
        }
        if (i4 != 1) {
            return null;
        }
        return this.f321b;
    }

    /* renamed from: f */
    public final boolean m423f(int i4) {
        return m422e(i4) != null;
    }

    /* renamed from: g */
    public final boolean m424g(int i4, int i5) {
        boolean onStartNestedScroll;
        if (m423f(i5)) {
            return true;
        }
        if (this.f323d) {
            android.view.View view = this.f322c;
            android.view.View view2 = view;
            for (android.view.ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z4 = parent instanceof p011C.InterfaceC0116h;
                if (z4) {
                    onStartNestedScroll = ((p011C.InterfaceC0116h) parent).mo430f(view2, view, i4, i5);
                } else {
                    if (i5 == 0) {
                        try {
                            onStartNestedScroll = parent.onStartNestedScroll(view2, view, i4);
                        } catch (java.lang.AbstractMethodError e4) {
                            android.util.Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e4);
                        }
                    }
                    onStartNestedScroll = false;
                }
                if (onStartNestedScroll) {
                    if (i5 == 0) {
                        this.f320a = parent;
                    } else if (i5 == 1) {
                        this.f321b = parent;
                    }
                    if (z4) {
                        ((p011C.InterfaceC0116h) parent).mo426a(view2, view, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view2, view, i4);
                        } catch (java.lang.AbstractMethodError e5) {
                            android.util.Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e5);
                        }
                    }
                    return true;
                }
                if (parent instanceof android.view.View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public final void m425h(int i4) {
        android.view.ViewParent m422e = m422e(i4);
        if (m422e != null) {
            boolean z4 = m422e instanceof p011C.InterfaceC0116h;
            android.view.ViewGroup viewGroup = this.f322c;
            if (z4) {
                ((p011C.InterfaceC0116h) m422e).mo428c(viewGroup, i4);
            } else if (i4 == 0) {
                try {
                    m422e.onStopNestedScroll(viewGroup);
                } catch (java.lang.AbstractMethodError e4) {
                    android.util.Log.e("ViewParentCompat", "ViewParent " + m422e + " does not implement interface method onStopNestedScroll", e4);
                }
            }
            if (i4 == 0) {
                this.f320a = null;
            } else {
                if (i4 != 1) {
                    return;
                }
                this.f321b = null;
            }
        }
    }
}
