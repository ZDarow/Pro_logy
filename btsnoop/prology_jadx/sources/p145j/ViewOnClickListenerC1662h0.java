package p145j;

/* renamed from: j.h0 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1662h0 extends p027G.AbstractC0231b implements android.view.View.OnClickListener {

    /* renamed from: I */
    public static final /* synthetic */ int f6913I = 0;

    /* renamed from: A */
    public int f6914A;

    /* renamed from: B */
    public android.content.res.ColorStateList f6915B;

    /* renamed from: C */
    public int f6916C;

    /* renamed from: D */
    public int f6917D;

    /* renamed from: E */
    public int f6918E;

    /* renamed from: F */
    public int f6919F;

    /* renamed from: G */
    public int f6920G;

    /* renamed from: H */
    public int f6921H;

    /* renamed from: s */
    public final int f6922s;

    /* renamed from: t */
    public final int f6923t;

    /* renamed from: u */
    public final android.view.LayoutInflater f6924u;

    /* renamed from: v */
    public final androidx.appcompat.widget.SearchView f6925v;

    /* renamed from: w */
    public final android.app.SearchableInfo f6926w;

    /* renamed from: x */
    public final android.content.Context f6927x;

    /* renamed from: y */
    public final java.util.WeakHashMap f6928y;

    /* renamed from: z */
    public final int f6929z;

    public ViewOnClickListenerC1662h0(android.content.Context context, androidx.appcompat.widget.SearchView searchView, android.app.SearchableInfo searchableInfo, java.util.WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f663m = true;
        this.f664n = null;
        this.f662l = false;
        this.f665o = -1;
        this.f666p = new p009B2.C0062s(this);
        this.f667q = new p027G.C0230a(0, this);
        this.f6923t = suggestionRowLayout;
        this.f6922s = suggestionRowLayout;
        this.f6924u = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        this.f6914A = 1;
        this.f6916C = -1;
        this.f6917D = -1;
        this.f6918E = -1;
        this.f6919F = -1;
        this.f6920G = -1;
        this.f6921H = -1;
        this.f6925v = searchView;
        this.f6926w = searchableInfo;
        this.f6929z = searchView.getSuggestionCommitIconResId();
        this.f6927x = context;
        this.f6928y = weakHashMap;
    }

    /* renamed from: h */
    public static java.lang.String m3599h(android.database.Cursor cursor, int i4) {
        if (i4 == -1) {
            return null;
        }
        try {
            return cursor.getString(i4);
        } catch (java.lang.Exception e4) {
            android.util.Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e4);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    @Override // p027G.AbstractC0231b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo612a(android.view.View r22, android.database.Cursor r23) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p145j.ViewOnClickListenerC1662h0.mo612a(android.view.View, android.database.Cursor):void");
    }

    @Override // p027G.AbstractC0231b
    /* renamed from: b */
    public final void mo613b(android.database.Cursor cursor) {
        try {
            super.mo613b(cursor);
            if (cursor != null) {
                this.f6916C = cursor.getColumnIndex("suggest_text_1");
                this.f6917D = cursor.getColumnIndex("suggest_text_2");
                this.f6918E = cursor.getColumnIndex("suggest_text_2_url");
                this.f6919F = cursor.getColumnIndex("suggest_icon_1");
                this.f6920G = cursor.getColumnIndex("suggest_icon_2");
                this.f6921H = cursor.getColumnIndex("suggest_flags");
            }
        } catch (java.lang.Exception e4) {
            android.util.Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e4);
        }
    }

    @Override // p027G.AbstractC0231b
    /* renamed from: c */
    public final java.lang.String mo614c(android.database.Cursor cursor) {
        java.lang.String m3599h;
        java.lang.String m3599h2;
        if (cursor == null) {
            return null;
        }
        java.lang.String m3599h3 = m3599h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (m3599h3 != null) {
            return m3599h3;
        }
        android.app.SearchableInfo searchableInfo = this.f6926w;
        if (searchableInfo.shouldRewriteQueryFromData() && (m3599h2 = m3599h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return m3599h2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (m3599h = m3599h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return m3599h;
    }

    @Override // p027G.AbstractC0231b
    /* renamed from: d */
    public final android.view.View mo615d(android.view.ViewGroup viewGroup) {
        android.view.View inflate = this.f6924u.inflate(this.f6922s, viewGroup, false);
        inflate.setTag(new p145j.C1660g0(inflate));
        ((android.widget.ImageView) inflate.findViewById(com.prology.R.id.edit_query)).setImageResource(this.f6929z);
        return inflate;
    }

    /* renamed from: e */
    public final android.graphics.drawable.Drawable m3600e(android.net.Uri uri) {
        int parseInt;
        java.lang.String authority = uri.getAuthority();
        if (android.text.TextUtils.isEmpty(authority)) {
            throw new java.io.FileNotFoundException("No authority: " + uri);
        }
        try {
            android.content.res.Resources resourcesForApplication = this.f6927x.getPackageManager().getResourcesForApplication(authority);
            java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new java.io.FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = java.lang.Integer.parseInt(pathSegments.get(0));
                } catch (java.lang.NumberFormatException unused) {
                    throw new java.io.FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new java.io.FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new java.io.FileNotFoundException("No resource found for: " + uri);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            throw new java.io.FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable m3601f(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p145j.ViewOnClickListenerC1662h0.m3601f(java.lang.String):android.graphics.drawable.Drawable");
    }

    /* renamed from: g */
    public final android.database.Cursor m3602g(android.app.SearchableInfo searchableInfo, java.lang.String str) {
        java.lang.String suggestAuthority;
        java.lang.String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        android.net.Uri.Builder fragment = new android.net.Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        java.lang.String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        java.lang.String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new java.lang.String[]{str};
        } else {
            fragment.appendPath(str);
        }
        java.lang.String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", java.lang.String.valueOf(50));
        return this.f6927x.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // p027G.AbstractC0231b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final android.view.View getDropDownView(int i4, android.view.View view, android.view.ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i4, view, viewGroup);
        } catch (java.lang.RuntimeException e4) {
            android.util.Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            android.view.View inflate = this.f6924u.inflate(this.f6923t, viewGroup, false);
            if (inflate != null) {
                ((p145j.C1660g0) inflate.getTag()).f6907a.setText(e4.toString());
            }
            return inflate;
        }
    }

    @Override // p027G.AbstractC0231b, android.widget.Adapter
    public final android.view.View getView(int i4, android.view.View view, android.view.ViewGroup viewGroup) {
        try {
            return super.getView(i4, view, viewGroup);
        } catch (java.lang.RuntimeException e4) {
            android.util.Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            android.view.View mo615d = mo615d(viewGroup);
            ((p145j.C1660g0) mo615d.getTag()).f6907a.setText(e4.toString());
            return mo615d;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        android.database.Cursor cursor = this.f664n;
        android.os.Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        android.database.Cursor cursor = this.f664n;
        android.os.Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object tag = view.getTag();
        if (tag instanceof java.lang.CharSequence) {
            this.f6925v.m2301n((java.lang.CharSequence) tag);
        }
    }
}
