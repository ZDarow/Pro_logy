package p013C2;

/* renamed from: C2.d */
/* loaded from: classes.dex */
public final class C0139d {

    /* renamed from: a */
    public final java.lang.Object f375a;

    /* renamed from: b */
    public java.lang.Object f376b;

    /* renamed from: c */
    public java.io.Serializable f377c;

    /* renamed from: d */
    public java.lang.Object f378d;

    /* renamed from: e */
    public java.lang.Object f379e;

    /* renamed from: f */
    public java.lang.Object f380f;

    public C0139d(java.util.Set set, java.lang.String str, java.lang.String str2) {
        p109b2.C1185a c1185a = p109b2.C1185a.f4616b;
        java.util.Set emptySet = set == null ? java.util.Collections.emptySet() : java.util.Collections.unmodifiableSet(set);
        this.f375a = emptySet;
        java.util.Map emptyMap = java.util.Collections.emptyMap();
        this.f377c = str;
        this.f378d = str2;
        this.f379e = c1185a;
        java.util.HashSet hashSet = new java.util.HashSet(emptySet);
        java.util.Iterator it = emptyMap.values().iterator();
        if (!it.hasNext()) {
            this.f376b = java.util.Collections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new java.lang.ClassCastException();
        }
    }

    /* renamed from: c */
    public static boolean m474c(int[] iArr, int i4) {
        for (int i5 : iArr) {
            if (i5 == i4) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static android.content.res.ColorStateList m475d(android.content.Context context, int i4) {
        int m3608c = p145j.AbstractC1666j0.m3608c(context, com.prology.R.attr.colorControlHighlight);
        int m3607b = p145j.AbstractC1666j0.m3607b(context, com.prology.R.attr.colorButtonNormal);
        int[] iArr = p145j.AbstractC1666j0.f6953b;
        int[] iArr2 = p145j.AbstractC1666j0.f6955d;
        int m4384a = p196u.AbstractC2206a.m4384a(m3608c, i4);
        return new android.content.res.ColorStateList(new int[][]{iArr, iArr2, p145j.AbstractC1666j0.f6954c, p145j.AbstractC1666j0.f6957f}, new int[]{m3607b, m4384a, p196u.AbstractC2206a.m4384a(m3608c, i4), i4});
    }

    /* renamed from: e */
    public static p179q0.C1964F m476e(p076T.InterfaceC0672O interfaceC0672O, p129f2.AbstractC1393I abstractC1393I, p179q0.C1964F c1964f, p076T.C0675S c0675s) {
        int mo1231b;
        p102a0.C0944H c0944h = (p102a0.C0944H) interfaceC0672O;
        p076T.AbstractC0677U m1857t = c0944h.m1857t();
        c0944h.m1848U();
        if (c0944h.f3355e0.f3579a.m1256p()) {
            mo1231b = 0;
        } else {
            p102a0.C0973f0 c0973f0 = c0944h.f3355e0;
            mo1231b = c0973f0.f3579a.mo1231b(c0973f0.f3580b.f7960a);
        }
        java.lang.Object mo1234l = m1857t.m1256p() ? null : m1857t.mo1234l(mo1231b);
        int m1238b = (c0944h.m1862z() || m1857t.m1256p()) ? -1 : m1857t.mo1232f(mo1231b, c0675s, false).m1238b(p086W.AbstractC0805y.m1592M(c0944h.m1855r()) - c0675s.f2227e);
        for (int i4 = 0; i4 < abstractC1393I.size(); i4++) {
            p179q0.C1964F c1964f2 = (p179q0.C1964F) abstractC1393I.get(i4);
            if (m478h(c1964f2, mo1234l, c0944h.m1862z(), c0944h.m1852o(), c0944h.m1853p(), m1238b)) {
                return c1964f2;
            }
        }
        if (abstractC1393I.isEmpty() && c1964f != null) {
            if (m478h(c1964f, mo1234l, c0944h.m1862z(), c0944h.m1852o(), c0944h.m1853p(), m1238b)) {
                return c1964f;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static android.graphics.drawable.LayerDrawable m477f(p145j.C1639S c1639s, android.content.Context context, int i4) {
        android.graphics.drawable.BitmapDrawable bitmapDrawable;
        android.graphics.drawable.BitmapDrawable bitmapDrawable2;
        android.graphics.drawable.BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i4);
        android.graphics.drawable.Drawable m3594c = c1639s.m3594c(context, com.prology.R.drawable.abc_star_black_48dp);
        android.graphics.drawable.Drawable m3594c2 = c1639s.m3594c(context, com.prology.R.drawable.abc_star_half_black_48dp);
        if ((m3594c instanceof android.graphics.drawable.BitmapDrawable) && m3594c.getIntrinsicWidth() == dimensionPixelSize && m3594c.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (android.graphics.drawable.BitmapDrawable) m3594c;
            bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            m3594c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            m3594c.draw(canvas);
            bitmapDrawable = new android.graphics.drawable.BitmapDrawable(createBitmap);
            bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(android.graphics.Shader.TileMode.REPEAT);
        if ((m3594c2 instanceof android.graphics.drawable.BitmapDrawable) && m3594c2.getIntrinsicWidth() == dimensionPixelSize && m3594c2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (android.graphics.drawable.BitmapDrawable) m3594c2;
        } else {
            android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap2);
            m3594c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            m3594c2.draw(canvas2);
            bitmapDrawable3 = new android.graphics.drawable.BitmapDrawable(createBitmap2);
        }
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* renamed from: h */
    public static boolean m478h(p179q0.C1964F c1964f, java.lang.Object obj, boolean z4, int i4, int i5, int i6) {
        if (!c1964f.f7960a.equals(obj)) {
            return false;
        }
        int i7 = c1964f.f7961b;
        return (z4 && i7 == i4 && c1964f.f7962c == i5) || (!z4 && i7 == -1 && c1964f.f7964e == i6);
    }

    /* renamed from: i */
    public static void m479i(android.graphics.drawable.Drawable drawable, int i4, android.graphics.PorterDuff.Mode mode) {
        android.graphics.PorterDuffColorFilter m3592e;
        if (p145j.AbstractC1623B.m3576a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = p145j.C1675o.f6981b;
        }
        android.graphics.PorterDuff.Mode mode2 = p145j.C1675o.f6981b;
        synchronized (p145j.C1675o.class) {
            m3592e = p145j.C1639S.m3592e(i4, mode);
        }
        drawable.setColorFilter(m3592e);
    }

    /* renamed from: a */
    public void m480a(p047L2.InterfaceC0388r interfaceC0388r) {
        ((java.util.HashSet) this.f377c).add(interfaceC0388r);
    }

    /* renamed from: b */
    public void m481b(p063P2.C0528a c0528a, p179q0.C1964F c1964f, p076T.AbstractC0677U abstractC0677U) {
        if (c1964f == null) {
            return;
        }
        if (abstractC0677U.mo1231b(c1964f.f7960a) != -1) {
            c0528a.m1028i(c1964f, abstractC0677U);
            return;
        }
        p076T.AbstractC0677U abstractC0677U2 = (p076T.AbstractC0677U) ((p129f2.C1425h0) this.f377c).get(c1964f);
        if (abstractC0677U2 != null) {
            c0528a.m1028i(c1964f, abstractC0677U2);
        }
    }

    /* renamed from: g */
    public android.content.res.ColorStateList m482g(android.content.Context context, int i4) {
        if (i4 == com.prology.R.drawable.abc_edit_text_material) {
            java.lang.Object obj = p126f.AbstractC1367a.f5645a;
            return context.getColorStateList(com.prology.R.color.abc_tint_edittext);
        }
        if (i4 == com.prology.R.drawable.abc_switch_track_mtrl_alpha) {
            java.lang.Object obj2 = p126f.AbstractC1367a.f5645a;
            return context.getColorStateList(com.prology.R.color.abc_tint_switch_track);
        }
        if (i4 == com.prology.R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            android.content.res.ColorStateList m3609d = p145j.AbstractC1666j0.m3609d(context, com.prology.R.attr.colorSwitchThumbNormal);
            if (m3609d == null || !m3609d.isStateful()) {
                iArr[0] = p145j.AbstractC1666j0.f6953b;
                iArr2[0] = p145j.AbstractC1666j0.m3607b(context, com.prology.R.attr.colorSwitchThumbNormal);
                iArr[1] = p145j.AbstractC1666j0.f6956e;
                iArr2[1] = p145j.AbstractC1666j0.m3608c(context, com.prology.R.attr.colorControlActivated);
                iArr[2] = p145j.AbstractC1666j0.f6957f;
                iArr2[2] = p145j.AbstractC1666j0.m3608c(context, com.prology.R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = p145j.AbstractC1666j0.f6953b;
                iArr[0] = iArr3;
                iArr2[0] = m3609d.getColorForState(iArr3, 0);
                iArr[1] = p145j.AbstractC1666j0.f6956e;
                iArr2[1] = p145j.AbstractC1666j0.m3608c(context, com.prology.R.attr.colorControlActivated);
                iArr[2] = p145j.AbstractC1666j0.f6957f;
                iArr2[2] = m3609d.getDefaultColor();
            }
            return new android.content.res.ColorStateList(iArr, iArr2);
        }
        if (i4 == com.prology.R.drawable.abc_btn_default_mtrl_shape) {
            return m475d(context, p145j.AbstractC1666j0.m3608c(context, com.prology.R.attr.colorButtonNormal));
        }
        if (i4 == com.prology.R.drawable.abc_btn_borderless_material) {
            return m475d(context, 0);
        }
        if (i4 == com.prology.R.drawable.abc_btn_colored_material) {
            return m475d(context, p145j.AbstractC1666j0.m3608c(context, com.prology.R.attr.colorAccent));
        }
        if (i4 == com.prology.R.drawable.abc_spinner_mtrl_am_alpha || i4 == com.prology.R.drawable.abc_spinner_textfield_background_material) {
            java.lang.Object obj3 = p126f.AbstractC1367a.f5645a;
            return context.getColorStateList(com.prology.R.color.abc_tint_spinner);
        }
        if (m474c((int[]) this.f376b, i4)) {
            return p145j.AbstractC1666j0.m3609d(context, com.prology.R.attr.colorControlNormal);
        }
        if (m474c((int[]) this.f379e, i4)) {
            java.lang.Object obj4 = p126f.AbstractC1367a.f5645a;
            return context.getColorStateList(com.prology.R.color.abc_tint_default);
        }
        if (m474c((int[]) this.f380f, i4)) {
            java.lang.Object obj5 = p126f.AbstractC1367a.f5645a;
            return context.getColorStateList(com.prology.R.color.abc_tint_btn_checkable);
        }
        if (i4 != com.prology.R.drawable.abc_seekbar_thumb_material) {
            return null;
        }
        java.lang.Object obj6 = p126f.AbstractC1367a.f5645a;
        return context.getColorStateList(com.prology.R.color.abc_tint_seek_thumb);
    }

    /* renamed from: j */
    public void m483j(p076T.AbstractC0677U abstractC0677U) {
        p063P2.C0528a c0528a = new p063P2.C0528a(4, 5);
        if (((p129f2.AbstractC1393I) this.f376b).isEmpty()) {
            m481b(c0528a, (p179q0.C1964F) this.f379e, abstractC0677U);
            if (!p101a.AbstractC0936a.m1814v((p179q0.C1964F) this.f380f, (p179q0.C1964F) this.f379e)) {
                m481b(c0528a, (p179q0.C1964F) this.f380f, abstractC0677U);
            }
            if (!p101a.AbstractC0936a.m1814v((p179q0.C1964F) this.f378d, (p179q0.C1964F) this.f379e) && !p101a.AbstractC0936a.m1814v((p179q0.C1964F) this.f378d, (p179q0.C1964F) this.f380f)) {
                m481b(c0528a, (p179q0.C1964F) this.f378d, abstractC0677U);
            }
        } else {
            for (int i4 = 0; i4 < ((p129f2.AbstractC1393I) this.f376b).size(); i4++) {
                m481b(c0528a, (p179q0.C1964F) ((p129f2.AbstractC1393I) this.f376b).get(i4), abstractC0677U);
            }
            if (!((p129f2.AbstractC1393I) this.f376b).contains((p179q0.C1964F) this.f378d)) {
                m481b(c0528a, (p179q0.C1964F) this.f378d, abstractC0677U);
            }
        }
        this.f377c = c0528a.m1024e();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [int[], java.io.Serializable] */
    public C0139d() {
        this.f375a = new int[]{com.prology.R.drawable.abc_textfield_search_default_mtrl_alpha, com.prology.R.drawable.abc_textfield_default_mtrl_alpha, com.prology.R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f376b = new int[]{com.prology.R.drawable.abc_ic_commit_search_api_mtrl_alpha, com.prology.R.drawable.abc_seekbar_tick_mark_material, com.prology.R.drawable.abc_ic_menu_share_mtrl_alpha, com.prology.R.drawable.abc_ic_menu_copy_mtrl_am_alpha, com.prology.R.drawable.abc_ic_menu_cut_mtrl_alpha, com.prology.R.drawable.abc_ic_menu_selectall_mtrl_alpha, com.prology.R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f377c = new int[]{com.prology.R.drawable.abc_textfield_activated_mtrl_alpha, com.prology.R.drawable.abc_textfield_search_activated_mtrl_alpha, com.prology.R.drawable.abc_cab_background_top_mtrl_alpha, com.prology.R.drawable.abc_text_cursor_material, com.prology.R.drawable.abc_text_select_handle_left_mtrl, com.prology.R.drawable.abc_text_select_handle_middle_mtrl, com.prology.R.drawable.abc_text_select_handle_right_mtrl};
        this.f378d = new int[]{com.prology.R.drawable.abc_popup_background_mtrl_mult, com.prology.R.drawable.abc_cab_background_internal_bg, com.prology.R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f379e = new int[]{com.prology.R.drawable.abc_tab_indicator_material, com.prology.R.drawable.abc_textfield_search_material};
        this.f380f = new int[]{com.prology.R.drawable.abc_btn_check_material, com.prology.R.drawable.abc_btn_radio_material, com.prology.R.drawable.abc_btn_check_material_anim, com.prology.R.drawable.abc_btn_radio_material_anim};
    }

    public C0139d(p009B2.AbstractActivityC0047d abstractActivityC0047d, androidx.lifecycle.C1149m c1149m) {
        this.f376b = new java.util.HashSet();
        this.f377c = new java.util.HashSet();
        this.f378d = new java.util.HashSet();
        this.f379e = new java.util.HashSet();
        new java.util.HashSet();
        this.f380f = new java.util.HashSet();
        this.f375a = abstractActivityC0047d;
        new io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference(c1149m);
    }

    public C0139d(p076T.C0675S c0675s) {
        this.f375a = c0675s;
        p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
        this.f376b = p129f2.C1415c0.f5744p;
        this.f377c = p129f2.C1425h0.f5764r;
    }
}
