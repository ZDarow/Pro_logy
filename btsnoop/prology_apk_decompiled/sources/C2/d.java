package C2;

import B2.AbstractActivityC0003d;
import L2.r;
import T.O;
import T.S;
import T.U;
import W.y;
import a.AbstractC0110a;
import a0.C0118H;
import a0.f0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.lifecycle.m;
import b2.C0185a;
import com.prology.R;
import f.AbstractC0266a;
import f2.G;
import f2.I;
import f2.c0;
import f2.h0;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import j.B;
import j.C0360o;
import j.j0;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import q0.F;
import u.AbstractC0573a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f367a;

    /* renamed from: b, reason: collision with root package name */
    public Object f368b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f369c;

    /* renamed from: d, reason: collision with root package name */
    public Object f370d;

    /* renamed from: e, reason: collision with root package name */
    public Object f371e;

    /* renamed from: f, reason: collision with root package name */
    public Object f372f;

    public d(Set set, String str, String str2) {
        C0185a c0185a = C0185a.f4455b;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f367a = emptySet;
        Map emptyMap = Collections.emptyMap();
        this.f369c = str;
        this.f370d = str2;
        this.f371e = c0185a;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = emptyMap.values().iterator();
        if (!it.hasNext()) {
            this.f368b = Collections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public static boolean c(int[] iArr, int i4) {
        for (int i5 : iArr) {
            if (i5 == i4) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList d(Context context, int i4) {
        int c4 = j0.c(context, R.attr.colorControlHighlight);
        int b4 = j0.b(context, R.attr.colorButtonNormal);
        int[] iArr = j0.f6695b;
        int[] iArr2 = j0.f6697d;
        int a4 = AbstractC0573a.a(c4, i4);
        return new ColorStateList(new int[][]{iArr, iArr2, j0.f6696c, j0.f6699f}, new int[]{b4, a4, AbstractC0573a.a(c4, i4), i4});
    }

    public static F e(O o2, I i4, F f4, S s) {
        int b4;
        C0118H c0118h = (C0118H) o2;
        U t4 = c0118h.t();
        c0118h.U();
        if (c0118h.f3242e0.f3459a.p()) {
            b4 = 0;
        } else {
            f0 f0Var = c0118h.f3242e0;
            b4 = f0Var.f3459a.b(f0Var.f3460b.f7668a);
        }
        Object l4 = t4.p() ? null : t4.l(b4);
        int b5 = (c0118h.z() || t4.p()) ? -1 : t4.f(b4, s, false).b(y.M(c0118h.r()) - s.f2147e);
        for (int i5 = 0; i5 < i4.size(); i5++) {
            F f5 = (F) i4.get(i5);
            if (h(f5, l4, c0118h.z(), c0118h.o(), c0118h.p(), b5)) {
                return f5;
            }
        }
        if (i4.isEmpty() && f4 != null) {
            if (h(f4, l4, c0118h.z(), c0118h.o(), c0118h.p(), b5)) {
                return f4;
            }
        }
        return null;
    }

    public static LayerDrawable f(j.S s, Context context, int i4) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i4);
        Drawable c4 = s.c(context, R.drawable.abc_star_black_48dp);
        Drawable c5 = s.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c4 instanceof BitmapDrawable) && c4.getIntrinsicWidth() == dimensionPixelSize && c4.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c4;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c4.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c4.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c5 instanceof BitmapDrawable) && c5.getIntrinsicWidth() == dimensionPixelSize && c5.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c5;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c5.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c5.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean h(F f4, Object obj, boolean z4, int i4, int i5, int i6) {
        if (!f4.f7668a.equals(obj)) {
            return false;
        }
        int i7 = f4.f7669b;
        return (z4 && i7 == i4 && f4.f7670c == i5) || (!z4 && i7 == -1 && f4.f7672e == i6);
    }

    public static void i(Drawable drawable, int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter e4;
        if (B.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = C0360o.f6723b;
        }
        PorterDuff.Mode mode2 = C0360o.f6723b;
        synchronized (C0360o.class) {
            e4 = j.S.e(i4, mode);
        }
        drawable.setColorFilter(e4);
    }

    public void a(r rVar) {
        ((HashSet) this.f369c).add(rVar);
    }

    public void b(P2.a aVar, F f4, U u4) {
        if (f4 == null) {
            return;
        }
        if (u4.b(f4.f7668a) != -1) {
            aVar.i(f4, u4);
            return;
        }
        U u5 = (U) ((h0) this.f369c).get(f4);
        if (u5 != null) {
            aVar.i(f4, u5);
        }
    }

    public ColorStateList g(Context context, int i4) {
        if (i4 == R.drawable.abc_edit_text_material) {
            Object obj = AbstractC0266a.f5451a;
            return context.getColorStateList(R.color.abc_tint_edittext);
        }
        if (i4 == R.drawable.abc_switch_track_mtrl_alpha) {
            Object obj2 = AbstractC0266a.f5451a;
            return context.getColorStateList(R.color.abc_tint_switch_track);
        }
        if (i4 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d4 = j0.d(context, R.attr.colorSwitchThumbNormal);
            if (d4 == null || !d4.isStateful()) {
                iArr[0] = j0.f6695b;
                iArr2[0] = j0.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = j0.f6698e;
                iArr2[1] = j0.c(context, R.attr.colorControlActivated);
                iArr[2] = j0.f6699f;
                iArr2[2] = j0.c(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = j0.f6695b;
                iArr[0] = iArr3;
                iArr2[0] = d4.getColorForState(iArr3, 0);
                iArr[1] = j0.f6698e;
                iArr2[1] = j0.c(context, R.attr.colorControlActivated);
                iArr[2] = j0.f6699f;
                iArr2[2] = d4.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i4 == R.drawable.abc_btn_default_mtrl_shape) {
            return d(context, j0.c(context, R.attr.colorButtonNormal));
        }
        if (i4 == R.drawable.abc_btn_borderless_material) {
            return d(context, 0);
        }
        if (i4 == R.drawable.abc_btn_colored_material) {
            return d(context, j0.c(context, R.attr.colorAccent));
        }
        if (i4 == R.drawable.abc_spinner_mtrl_am_alpha || i4 == R.drawable.abc_spinner_textfield_background_material) {
            Object obj3 = AbstractC0266a.f5451a;
            return context.getColorStateList(R.color.abc_tint_spinner);
        }
        if (c((int[]) this.f368b, i4)) {
            return j0.d(context, R.attr.colorControlNormal);
        }
        if (c((int[]) this.f371e, i4)) {
            Object obj4 = AbstractC0266a.f5451a;
            return context.getColorStateList(R.color.abc_tint_default);
        }
        if (c((int[]) this.f372f, i4)) {
            Object obj5 = AbstractC0266a.f5451a;
            return context.getColorStateList(R.color.abc_tint_btn_checkable);
        }
        if (i4 != R.drawable.abc_seekbar_thumb_material) {
            return null;
        }
        Object obj6 = AbstractC0266a.f5451a;
        return context.getColorStateList(R.color.abc_tint_seek_thumb);
    }

    public void j(U u4) {
        P2.a aVar = new P2.a(4, 5);
        if (((I) this.f368b).isEmpty()) {
            b(aVar, (F) this.f371e, u4);
            if (!AbstractC0110a.v((F) this.f372f, (F) this.f371e)) {
                b(aVar, (F) this.f372f, u4);
            }
            if (!AbstractC0110a.v((F) this.f370d, (F) this.f371e) && !AbstractC0110a.v((F) this.f370d, (F) this.f372f)) {
                b(aVar, (F) this.f370d, u4);
            }
        } else {
            for (int i4 = 0; i4 < ((I) this.f368b).size(); i4++) {
                b(aVar, (F) ((I) this.f368b).get(i4), u4);
            }
            if (!((I) this.f368b).contains((F) this.f370d)) {
                b(aVar, (F) this.f370d, u4);
            }
        }
        this.f369c = aVar.e();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [int[], java.io.Serializable] */
    public d() {
        this.f367a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.f368b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f369c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.f370d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.f371e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f372f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public d(AbstractActivityC0003d abstractActivityC0003d, m mVar) {
        this.f368b = new HashSet();
        this.f369c = new HashSet();
        this.f370d = new HashSet();
        this.f371e = new HashSet();
        new HashSet();
        this.f372f = new HashSet();
        this.f367a = abstractActivityC0003d;
        new HiddenLifecycleReference(mVar);
    }

    public d(S s) {
        this.f367a = s;
        G g4 = I.f5510m;
        this.f368b = c0.f5550p;
        this.f369c = h0.f5570r;
    }
}
