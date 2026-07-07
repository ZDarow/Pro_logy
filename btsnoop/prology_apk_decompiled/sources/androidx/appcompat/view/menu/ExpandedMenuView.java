package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.session.t;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import i.InterfaceC0327h;
import i.MenuItemC0329j;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0327h, AdapterView.OnItemClickListener {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f3746l = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        t q02 = t.q0(context, attributeSet, f3746l, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) q02.f3735n;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(q02.g0(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(q02.g0(1));
        }
        q02.u0();
    }

    @Override // i.InterfaceC0327h
    public final boolean a(MenuItemC0329j menuItemC0329j) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        throw null;
    }
}
