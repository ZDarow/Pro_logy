package io.flutter.plugin.editing;

/* renamed from: io.flutter.plugin.editing.d */
/* loaded from: classes.dex */
public final class C1568d extends android.view.inputmethod.BaseInputConnection implements io.flutter.plugin.editing.InterfaceC1570f {

    /* renamed from: a */
    public final p009B2.C0064u f6495a;

    /* renamed from: b */
    public final int f6496b;

    /* renamed from: c */
    public final p008B1.C0026d f6497c;

    /* renamed from: d */
    public final io.flutter.plugin.editing.C1571g f6498d;

    /* renamed from: e */
    public final android.view.inputmethod.EditorInfo f6499e;

    /* renamed from: f */
    public android.view.inputmethod.ExtractedTextRequest f6500f;

    /* renamed from: g */
    public boolean f6501g;

    /* renamed from: h */
    public android.view.inputmethod.CursorAnchorInfo.Builder f6502h;

    /* renamed from: i */
    public final android.view.inputmethod.ExtractedText f6503i;

    /* renamed from: j */
    public final android.view.inputmethod.InputMethodManager f6504j;

    /* renamed from: k */
    public final android.text.DynamicLayout f6505k;

    /* renamed from: l */
    public final p129f2.C1408Y f6506l;

    /* renamed from: m */
    public final android.support.v4.media.session.C1061t f6507m;

    /* renamed from: n */
    public int f6508n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568d(p009B2.C0064u c0064u, int i4, p008B1.C0026d c0026d, android.support.v4.media.session.C1061t c1061t, io.flutter.plugin.editing.C1571g c1571g, android.view.inputmethod.EditorInfo editorInfo) {
        super(c0064u, true);
        io.flutter.embedding.engine.FlutterJNI flutterJNI = new io.flutter.embedding.engine.FlutterJNI();
        this.f6501g = false;
        this.f6503i = new android.view.inputmethod.ExtractedText();
        this.f6508n = 0;
        this.f6495a = c0064u;
        this.f6496b = i4;
        this.f6497c = c0026d;
        this.f6498d = c1571g;
        c1571g.m3487a(this);
        this.f6499e = editorInfo;
        this.f6507m = c1061t;
        this.f6506l = new p129f2.C1408Y(8, flutterJNI);
        this.f6505k = new android.text.DynamicLayout(c1571g, new android.text.TextPaint(), Integer.MAX_VALUE, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f6504j = (android.view.inputmethod.InputMethodManager) c0064u.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.InterfaceC1570f
    /* renamed from: a */
    public final void mo3482a(boolean z4) {
        io.flutter.plugin.editing.C1571g c1571g = this.f6498d;
        c1571g.getClass();
        this.f6504j.updateSelection(this.f6495a, android.text.Selection.getSelectionStart(c1571g), android.text.Selection.getSelectionEnd(c1571g), android.view.inputmethod.BaseInputConnection.getComposingSpanStart(c1571g), android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(c1571g));
        android.view.inputmethod.ExtractedTextRequest extractedTextRequest = this.f6500f;
        android.view.inputmethod.InputMethodManager inputMethodManager = this.f6504j;
        p009B2.C0064u c0064u = this.f6495a;
        if (extractedTextRequest != null) {
            inputMethodManager.updateExtractedText(c0064u, extractedTextRequest.token, m3484c(extractedTextRequest));
        }
        if (this.f6501g) {
            inputMethodManager.updateCursorAnchorInfo(c0064u, m3483b());
        }
    }

    /* renamed from: b */
    public final android.view.inputmethod.CursorAnchorInfo m3483b() {
        android.view.inputmethod.CursorAnchorInfo.Builder builder = this.f6502h;
        if (builder == null) {
            this.f6502h = new android.view.inputmethod.CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        android.view.inputmethod.CursorAnchorInfo.Builder builder2 = this.f6502h;
        io.flutter.plugin.editing.C1571g c1571g = this.f6498d;
        c1571g.getClass();
        int selectionStart = android.text.Selection.getSelectionStart(c1571g);
        c1571g.getClass();
        builder2.setSelectionRange(selectionStart, android.text.Selection.getSelectionEnd(c1571g));
        c1571g.getClass();
        int composingSpanStart = android.view.inputmethod.BaseInputConnection.getComposingSpanStart(c1571g);
        c1571g.getClass();
        int composingSpanEnd = android.view.inputmethod.BaseInputConnection.getComposingSpanEnd(c1571g);
        if (composingSpanStart < 0 || composingSpanEnd <= composingSpanStart) {
            this.f6502h.setComposingText(-1, "");
        } else {
            this.f6502h.setComposingText(composingSpanStart, c1571g.toString().subSequence(composingSpanStart, composingSpanEnd));
        }
        return this.f6502h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f6498d.m3488b();
        this.f6508n++;
        return super.beginBatchEdit();
    }

    /* renamed from: c */
    public final android.view.inputmethod.ExtractedText m3484c(android.view.inputmethod.ExtractedTextRequest extractedTextRequest) {
        android.view.inputmethod.ExtractedText extractedText = this.f6503i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        java.lang.CharSequence charSequence = this.f6498d;
        charSequence.getClass();
        extractedText.selectionStart = android.text.Selection.getSelectionStart(charSequence);
        charSequence.getClass();
        extractedText.selectionEnd = android.text.Selection.getSelectionEnd(charSequence);
        if (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) {
            charSequence = charSequence.toString();
        }
        extractedText.text = charSequence;
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        super.closeConnection();
        this.f6498d.m3491e(this);
        while (this.f6508n > 0) {
            endBatchEdit();
            this.f6508n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i4, android.os.Bundle bundle) {
        int i5;
        if ((i4 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    android.net.Uri contentUri = inputContentInfo.getContentUri();
                    java.lang.String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    android.content.Context context = this.f6495a.getContext();
                    if (contentUri != null) {
                        try {
                            java.io.InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        i5 = openInputStream.read(bArr);
                                    } catch (java.io.IOException unused) {
                                        i5 = -1;
                                    }
                                    if (i5 == -1) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        java.util.HashMap hashMap = new java.util.HashMap();
                                        hashMap.put("mimeType", mimeType);
                                        hashMap.put("data", byteArray);
                                        hashMap.put("uri", contentUri.toString());
                                        p008B1.C0026d c0026d = this.f6497c;
                                        c0026d.getClass();
                                        ((p035I.C0291m) c0026d.f99m).m694j("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(this.f6496b), "TextInputAction.commitContent", hashMap), null);
                                        inputContentInfo.releasePermission();
                                        return true;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i5);
                                }
                            }
                        } catch (java.io.FileNotFoundException unused2) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (java.lang.Exception unused3) {
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m3485d(boolean z4, boolean z5) {
        int charCount;
        int charCount2;
        int charCount3;
        int charCount4;
        int min;
        int codePointBefore;
        int charCount5;
        int charCount6;
        int i4;
        int i5;
        int charCount7;
        io.flutter.plugin.editing.C1571g c1571g = this.f6498d;
        int selectionStart = android.text.Selection.getSelectionStart(c1571g);
        int selectionEnd = android.text.Selection.getSelectionEnd(c1571g);
        int i6 = 0;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        p129f2.C1408Y c1408y = this.f6506l;
        if (z4) {
            c1408y.getClass();
            if (selectionEnd > 1 && (charCount6 = selectionEnd - (charCount5 = java.lang.Character.charCount((codePointBefore = java.lang.Character.codePointBefore(c1571g, selectionEnd))))) != 0) {
                if (codePointBefore != 10) {
                    io.flutter.embedding.engine.FlutterJNI flutterJNI = (io.flutter.embedding.engine.FlutterJNI) c1408y.f5729m;
                    if (flutterJNI.isCodePointRegionalIndicator(codePointBefore)) {
                        int codePointBefore2 = java.lang.Character.codePointBefore(c1571g, charCount6);
                        int charCount8 = charCount6 - java.lang.Character.charCount(codePointBefore2);
                        int i7 = 1;
                        while (charCount8 > 0 && flutterJNI.isCodePointRegionalIndicator(codePointBefore2)) {
                            codePointBefore2 = java.lang.Character.codePointBefore(c1571g, charCount8);
                            charCount8 -= java.lang.Character.charCount(codePointBefore2);
                            i7++;
                        }
                        if (i7 % 2 == 0) {
                            charCount5 += 2;
                        }
                    } else if (codePointBefore == 8419) {
                        int codePointBefore3 = java.lang.Character.codePointBefore(c1571g, charCount6);
                        int charCount9 = charCount6 - java.lang.Character.charCount(codePointBefore3);
                        if (charCount9 > 0 && flutterJNI.isCodePointVariantSelector(codePointBefore3)) {
                            int codePointBefore4 = java.lang.Character.codePointBefore(c1571g, charCount9);
                            if (p129f2.C1408Y.m3184z(codePointBefore4)) {
                                charCount7 = java.lang.Character.charCount(codePointBefore4) + java.lang.Character.charCount(codePointBefore3);
                                charCount5 += charCount7;
                            }
                        } else if (p129f2.C1408Y.m3184z(codePointBefore3)) {
                            charCount7 = java.lang.Character.charCount(codePointBefore3);
                            charCount5 += charCount7;
                        }
                    } else {
                        if (codePointBefore == 917631) {
                            int codePointBefore5 = java.lang.Character.codePointBefore(c1571g, charCount6);
                            charCount6 -= java.lang.Character.charCount(codePointBefore5);
                            codePointBefore = codePointBefore5;
                            while (charCount6 > 0 && 917536 <= codePointBefore && codePointBefore <= 917630) {
                                charCount5 += java.lang.Character.charCount(codePointBefore);
                                codePointBefore = java.lang.Character.codePointBefore(c1571g, charCount6);
                                charCount6 -= java.lang.Character.charCount(codePointBefore);
                            }
                            if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                                charCount5 += java.lang.Character.charCount(codePointBefore);
                            } else {
                                i5 = selectionEnd - 2;
                            }
                        }
                        if (flutterJNI.isCodePointVariantSelector(codePointBefore)) {
                            codePointBefore = java.lang.Character.codePointBefore(c1571g, charCount6);
                            if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                                charCount5 += java.lang.Character.charCount(codePointBefore);
                                charCount6 -= charCount5;
                            }
                        }
                        if (flutterJNI.isCodePointEmoji(codePointBefore)) {
                            boolean z6 = false;
                            int i8 = 0;
                            while (true) {
                                if (z6) {
                                    charCount5 = java.lang.Character.charCount(codePointBefore) + i8 + 1 + charCount5;
                                    z6 = false;
                                }
                                if (flutterJNI.isCodePointEmojiModifier(codePointBefore)) {
                                    int codePointBefore6 = java.lang.Character.codePointBefore(c1571g, charCount6);
                                    int charCount10 = charCount6 - java.lang.Character.charCount(codePointBefore6);
                                    if (charCount10 <= 0 || !flutterJNI.isCodePointVariantSelector(codePointBefore6)) {
                                        i4 = 0;
                                    } else {
                                        codePointBefore6 = java.lang.Character.codePointBefore(c1571g, charCount10);
                                        if (flutterJNI.isCodePointEmoji(codePointBefore6)) {
                                            i4 = java.lang.Character.charCount(codePointBefore6);
                                            java.lang.Character.charCount(codePointBefore6);
                                        }
                                    }
                                    if (flutterJNI.isCodePointEmojiModifierBase(codePointBefore6)) {
                                        charCount5 += java.lang.Character.charCount(codePointBefore6) + i4;
                                    }
                                } else {
                                    if (charCount6 > 0) {
                                        int codePointBefore7 = java.lang.Character.codePointBefore(c1571g, charCount6);
                                        charCount6 -= java.lang.Character.charCount(codePointBefore7);
                                        if (codePointBefore7 == 8205) {
                                            int codePointBefore8 = java.lang.Character.codePointBefore(c1571g, charCount6);
                                            charCount6 -= java.lang.Character.charCount(codePointBefore8);
                                            if (charCount6 <= 0 || !flutterJNI.isCodePointVariantSelector(codePointBefore8)) {
                                                i8 = 0;
                                            } else {
                                                codePointBefore8 = java.lang.Character.codePointBefore(c1571g, charCount6);
                                                i8 = java.lang.Character.charCount(codePointBefore8);
                                                charCount6 -= java.lang.Character.charCount(codePointBefore8);
                                            }
                                            codePointBefore = codePointBefore8;
                                            z6 = true;
                                            if (charCount6 != 0 || !z6 || !flutterJNI.isCodePointEmoji(codePointBefore)) {
                                                break;
                                                break;
                                            }
                                        } else {
                                            codePointBefore = codePointBefore7;
                                        }
                                    }
                                    i8 = 0;
                                    if (charCount6 != 0) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (java.lang.Character.codePointBefore(c1571g, charCount6) == 13) {
                    charCount5++;
                }
                i5 = selectionEnd - charCount5;
            } else {
                i5 = 0;
            }
            min = java.lang.Math.max(i5, 0);
        } else {
            c1408y.getClass();
            int length = c1571g.length();
            int i9 = length - 1;
            if (selectionEnd >= i9) {
                i6 = length;
            } else {
                int codePointAt = java.lang.Character.codePointAt(c1571g, selectionEnd);
                int charCount11 = java.lang.Character.charCount(codePointAt);
                int i10 = selectionEnd + charCount11;
                if (i10 != 0) {
                    if (codePointAt != 10) {
                        io.flutter.embedding.engine.FlutterJNI flutterJNI2 = (io.flutter.embedding.engine.FlutterJNI) c1408y.f5729m;
                        if (!flutterJNI2.isCodePointRegionalIndicator(codePointAt)) {
                            if (p129f2.C1408Y.m3184z(codePointAt)) {
                                charCount11 += java.lang.Character.charCount(codePointAt);
                            }
                            if (codePointAt == 8419) {
                                int codePointBefore9 = java.lang.Character.codePointBefore(c1571g, i10);
                                int charCount12 = java.lang.Character.charCount(codePointBefore9) + i10;
                                if (charCount12 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore9)) {
                                    int codePointAt2 = java.lang.Character.codePointAt(c1571g, charCount12);
                                    if (p129f2.C1408Y.m3184z(codePointAt2)) {
                                        charCount2 = java.lang.Character.charCount(codePointBefore9);
                                        charCount3 = java.lang.Character.charCount(codePointAt2);
                                        charCount11 += charCount3 + charCount2;
                                    }
                                } else if (p129f2.C1408Y.m3184z(codePointBefore9)) {
                                    charCount = java.lang.Character.charCount(codePointBefore9);
                                    charCount11 += charCount;
                                }
                            } else if (flutterJNI2.isCodePointEmoji(codePointAt)) {
                                boolean z7 = false;
                                int i11 = 0;
                                while (true) {
                                    if (z7) {
                                        charCount11 = java.lang.Character.charCount(codePointAt) + i11 + 1 + charCount11;
                                        z7 = false;
                                    }
                                    if (flutterJNI2.isCodePointEmojiModifier(codePointAt)) {
                                        break;
                                    }
                                    if (i10 < length) {
                                        int codePointAt3 = java.lang.Character.codePointAt(c1571g, i10);
                                        int charCount13 = java.lang.Character.charCount(codePointAt3) + i10;
                                        if (codePointAt3 == 8419) {
                                            int codePointBefore10 = java.lang.Character.codePointBefore(c1571g, charCount13);
                                            int charCount14 = java.lang.Character.charCount(codePointBefore10) + charCount13;
                                            if (charCount14 < length && flutterJNI2.isCodePointVariantSelector(codePointBefore10)) {
                                                int codePointAt4 = java.lang.Character.codePointAt(c1571g, charCount14);
                                                if (p129f2.C1408Y.m3184z(codePointAt4)) {
                                                    charCount2 = java.lang.Character.charCount(codePointBefore10);
                                                    charCount3 = java.lang.Character.charCount(codePointAt4);
                                                }
                                            } else if (p129f2.C1408Y.m3184z(codePointBefore10)) {
                                                charCount = java.lang.Character.charCount(codePointBefore10);
                                            }
                                        } else {
                                            if (flutterJNI2.isCodePointEmojiModifier(codePointAt3)) {
                                                charCount4 = java.lang.Character.charCount(codePointAt3);
                                                break;
                                            }
                                            if (flutterJNI2.isCodePointVariantSelector(codePointAt3)) {
                                                charCount4 = java.lang.Character.charCount(codePointAt3);
                                                break;
                                            }
                                            if (codePointAt3 == 8205) {
                                                int codePointAt5 = java.lang.Character.codePointAt(c1571g, charCount13);
                                                int charCount15 = java.lang.Character.charCount(codePointAt5) + charCount13;
                                                if (charCount15 >= length || !flutterJNI2.isCodePointVariantSelector(codePointAt5)) {
                                                    codePointAt = codePointAt5;
                                                    i10 = charCount15;
                                                    i11 = 0;
                                                } else {
                                                    int codePointAt6 = java.lang.Character.codePointAt(c1571g, charCount15);
                                                    int charCount16 = java.lang.Character.charCount(codePointAt6);
                                                    int charCount17 = java.lang.Character.charCount(codePointAt6) + charCount15;
                                                    i11 = charCount16;
                                                    i10 = charCount17;
                                                    codePointAt = codePointAt6;
                                                }
                                                z7 = true;
                                                if (i10 < length || !z7 || !flutterJNI2.isCodePointEmoji(codePointAt)) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                codePointAt = codePointAt3;
                                                i10 = charCount13;
                                            }
                                        }
                                    }
                                    i11 = 0;
                                    if (i10 < length) {
                                        break;
                                    }
                                }
                                charCount11 += charCount4;
                            }
                        } else if (i10 >= i9 || !flutterJNI2.isCodePointRegionalIndicator(java.lang.Character.codePointAt(c1571g, i10))) {
                            i6 = i10;
                        } else {
                            int i12 = selectionEnd;
                            while (i12 > 0 && flutterJNI2.isCodePointRegionalIndicator(java.lang.Character.codePointBefore(c1571g, selectionEnd))) {
                                i12 -= java.lang.Character.charCount(java.lang.Character.codePointBefore(c1571g, selectionEnd));
                                i6++;
                            }
                            if (i6 % 2 == 0) {
                                charCount11 += 2;
                            }
                        }
                    } else if (java.lang.Character.codePointAt(c1571g, i10) == 13) {
                        charCount11++;
                    }
                    i6 = selectionEnd + charCount11;
                }
            }
            min = java.lang.Math.min(i6, c1571g.length());
        }
        if (selectionStart != selectionEnd || z5) {
            setSelection(selectionStart, min);
        } else {
            setSelection(min, min);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i4, int i5) {
        io.flutter.plugin.editing.C1571g c1571g = this.f6498d;
        c1571g.getClass();
        if (android.text.Selection.getSelectionStart(c1571g) == -1) {
            return true;
        }
        return super.deleteSurroundingText(i4, i5);
    }

    /* renamed from: e */
    public final boolean m3486e(boolean z4, boolean z5) {
        io.flutter.plugin.editing.C1571g c1571g = this.f6498d;
        int selectionStart = android.text.Selection.getSelectionStart(c1571g);
        int selectionEnd = android.text.Selection.getSelectionEnd(c1571g);
        boolean z6 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z5) {
            z6 = true;
        }
        beginBatchEdit();
        android.text.DynamicLayout dynamicLayout = this.f6505k;
        if (z6) {
            if (z4) {
                android.text.Selection.moveUp(c1571g, dynamicLayout);
            } else {
                android.text.Selection.moveDown(c1571g, dynamicLayout);
            }
            int selectionStart2 = android.text.Selection.getSelectionStart(c1571g);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z4) {
                android.text.Selection.extendUp(c1571g, dynamicLayout);
            } else {
                android.text.Selection.extendDown(c1571g, dynamicLayout);
            }
            setSelection(android.text.Selection.getSelectionStart(c1571g), android.text.Selection.getSelectionEnd(c1571g));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f6508n--;
        this.f6498d.m3489c();
        return endBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final android.text.Editable getEditable() {
        return this.f6498d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i4) {
        this.f6500f = (i4 & 1) != 0 ? extractedTextRequest : null;
        return m3484c(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i4) {
        beginBatchEdit();
        boolean z4 = true;
        io.flutter.plugin.editing.C1571g c1571g = this.f6498d;
        if (i4 == 16908319) {
            setSelection(0, c1571g.length());
        } else {
            p009B2.C0064u c0064u = this.f6495a;
            if (i4 == 16908320) {
                int selectionStart = android.text.Selection.getSelectionStart(c1571g);
                int selectionEnd = android.text.Selection.getSelectionEnd(c1571g);
                if (selectionStart != selectionEnd) {
                    int min = java.lang.Math.min(selectionStart, selectionEnd);
                    int max = java.lang.Math.max(selectionStart, selectionEnd);
                    ((android.content.ClipboardManager) c0064u.getContext().getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText("text label?", c1571g.subSequence(min, max)));
                    c1571g.delete(min, max);
                    setSelection(min, min);
                }
            } else if (i4 == 16908321) {
                int selectionStart2 = android.text.Selection.getSelectionStart(c1571g);
                int selectionEnd2 = android.text.Selection.getSelectionEnd(c1571g);
                if (selectionStart2 != selectionEnd2) {
                    ((android.content.ClipboardManager) c0064u.getContext().getSystemService("clipboard")).setPrimaryClip(android.content.ClipData.newPlainText("text label?", c1571g.subSequence(java.lang.Math.min(selectionStart2, selectionEnd2), java.lang.Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (i4 == 16908322) {
                android.content.ClipData primaryClip = ((android.content.ClipboardManager) c0064u.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    java.lang.CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(c0064u.getContext());
                    int max2 = java.lang.Math.max(0, android.text.Selection.getSelectionStart(c1571g));
                    int max3 = java.lang.Math.max(0, android.text.Selection.getSelectionEnd(c1571g));
                    int min2 = java.lang.Math.min(max2, max3);
                    int max4 = java.lang.Math.max(max2, max3);
                    if (min2 != max4) {
                        c1571g.delete(min2, max4);
                    }
                    c1571g.insert(min2, coerceToText);
                    int length = coerceToText.length() + min2;
                    setSelection(length, length);
                }
            } else {
                z4 = false;
            }
        }
        endBatchEdit();
        return z4;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i4) {
        int i5 = this.f6496b;
        p008B1.C0026d c0026d = this.f6497c;
        if (i4 == 0) {
            c0026d.getClass();
            ((p035I.C0291m) c0026d.f99m).m694j("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i5), "TextInputAction.unspecified"), null);
        } else if (i4 == 1) {
            c0026d.getClass();
            ((p035I.C0291m) c0026d.f99m).m694j("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i5), "TextInputAction.newline"), null);
        } else if (i4 == 2) {
            c0026d.getClass();
            ((p035I.C0291m) c0026d.f99m).m694j("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i5), "TextInputAction.go"), null);
        } else if (i4 == 3) {
            c0026d.getClass();
            ((p035I.C0291m) c0026d.f99m).m694j("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i5), "TextInputAction.search"), null);
        } else if (i4 == 4) {
            c0026d.getClass();
            ((p035I.C0291m) c0026d.f99m).m694j("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i5), "TextInputAction.send"), null);
        } else if (i4 == 5) {
            c0026d.getClass();
            ((p035I.C0291m) c0026d.f99m).m694j("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i5), "TextInputAction.next"), null);
        } else if (i4 != 7) {
            c0026d.getClass();
            ((p035I.C0291m) c0026d.f99m).m694j("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i5), "TextInputAction.done"), null);
        } else {
            c0026d.getClass();
            ((p035I.C0291m) c0026d.f99m).m694j("TextInputClient.performAction", java.util.Arrays.asList(java.lang.Integer.valueOf(i5), "TextInputAction.previous"), null);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        p008B1.C0026d c0026d = this.f6497c;
        c0026d.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            for (java.lang.String str2 : bundle.keySet()) {
                java.lang.Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof java.lang.Byte) {
                    hashMap2.put(str2, java.lang.Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof java.lang.Character) {
                    hashMap2.put(str2, java.lang.Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof java.lang.CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof java.lang.CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof java.lang.Float) {
                    hashMap2.put(str2, java.lang.Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        ((p035I.C0291m) c0026d.f99m).m694j("TextInputClient.performPrivateCommand", java.util.Arrays.asList(java.lang.Integer.valueOf(this.f6496b), hashMap), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i4) {
        if ((i4 & 1) != 0) {
            this.f6504j.updateCursorAnchorInfo(this.f6495a, m3483b());
        }
        this.f6501g = (i4 & 2) != 0;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        return this.f6507m.m2231k0(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(java.lang.CharSequence charSequence, int i4) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i4) : super.setComposingText(charSequence, i4);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i4, int i5) {
        beginBatchEdit();
        boolean selection = super.setSelection(i4, i5);
        endBatchEdit();
        return selection;
    }
}
