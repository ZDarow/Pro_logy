package j;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.prology.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h0 extends G.b implements View.OnClickListener {

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ int f6659I = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f6660A;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f6661B;

    /* renamed from: C, reason: collision with root package name */
    public int f6662C;

    /* renamed from: D, reason: collision with root package name */
    public int f6663D;

    /* renamed from: E, reason: collision with root package name */
    public int f6664E;

    /* renamed from: F, reason: collision with root package name */
    public int f6665F;

    /* renamed from: G, reason: collision with root package name */
    public int f6666G;

    /* renamed from: H, reason: collision with root package name */
    public int f6667H;
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final int f6668t;

    /* renamed from: u, reason: collision with root package name */
    public final LayoutInflater f6669u;

    /* renamed from: v, reason: collision with root package name */
    public final SearchView f6670v;
    public final SearchableInfo w;

    /* renamed from: x, reason: collision with root package name */
    public final Context f6671x;

    /* renamed from: y, reason: collision with root package name */
    public final WeakHashMap f6672y;

    /* renamed from: z, reason: collision with root package name */
    public final int f6673z;

    public h0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f653m = true;
        this.f654n = null;
        this.f652l = false;
        this.f655o = -1;
        this.f656p = new B2.s(this);
        this.f657q = new G.a(0, this);
        this.f6668t = suggestionRowLayout;
        this.s = suggestionRowLayout;
        this.f6669u = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f6660A = 1;
        this.f6662C = -1;
        this.f6663D = -1;
        this.f6664E = -1;
        this.f6665F = -1;
        this.f6666G = -1;
        this.f6667H = -1;
        this.f6670v = searchView;
        this.w = searchableInfo;
        this.f6673z = searchView.getSuggestionCommitIconResId();
        this.f6671x = context;
        this.f6672y = weakHashMap;
    }

    public static String h(Cursor cursor, int i4) {
        if (i4 == -1) {
            return null;
        }
        try {
            return cursor.getString(i4);
        } catch (Exception e4) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e4);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    @Override // G.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r22, android.database.Cursor r23) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.h0.a(android.view.View, android.database.Cursor):void");
    }

    @Override // G.b
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f6662C = cursor.getColumnIndex("suggest_text_1");
                this.f6663D = cursor.getColumnIndex("suggest_text_2");
                this.f6664E = cursor.getColumnIndex("suggest_text_2_url");
                this.f6665F = cursor.getColumnIndex("suggest_icon_1");
                this.f6666G = cursor.getColumnIndex("suggest_icon_2");
                this.f6667H = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e4) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e4);
        }
    }

    @Override // G.b
    public final String c(Cursor cursor) {
        String h4;
        String h5;
        if (cursor == null) {
            return null;
        }
        String h6 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h6 != null) {
            return h6;
        }
        SearchableInfo searchableInfo = this.w;
        if (searchableInfo.shouldRewriteQueryFromData() && (h5 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h5;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h4 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h4;
    }

    @Override // G.b
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f6669u.inflate(this.s, viewGroup, false);
        inflate.setTag(new g0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f6673z);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f6671x.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.h0.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f6671x.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // G.b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i4, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            View inflate = this.f6669u.inflate(this.f6668t, viewGroup, false);
            if (inflate != null) {
                ((g0) inflate.getTag()).f6653a.setText(e4.toString());
            }
            return inflate;
        }
    }

    @Override // G.b, android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i4, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            View d4 = d(viewGroup);
            ((g0) d4.getTag()).f6653a.setText(e4.toString());
            return d4;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f654n;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f654n;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f6670v.n((CharSequence) tag);
        }
    }
}
