// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package com.zpj.widget.tinted;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/**
 * Implementation of ImageView that allows tinting its Drawable for all states.
 * For usage, see {@link ImageViewTinter}.
 */
public class TintedImageView extends AppCompatImageView implements ImageViewTinter.ImageViewTinterOwner {
    private ImageViewTinter mTinter;
    private ColorStateList savedTintList;

    public TintedImageView(Context context) {
        super(context);
        init(null, 0);
    }

    public TintedImageView(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
        init(attrs, 0);
    }

    public TintedImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {
        mTinter = new ImageViewTinter(this, attrs, defStyle);
    }

    @Override
    public void drawableStateChanged() {
        super.drawableStateChanged();
        mTinter.drawableStateChanged();
    }

    @Override
    public void setTint(ColorStateList tintList) {
        savedTintList = tintList;
        mTinter.setTint(tintList);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public void setEnabled(boolean enabled) {
        if (enabled) {
            if (savedTintList == null) {
                mTinter.setTint(null);
            } else {
                mTinter.setTint(savedTintList);
            }
        } else {
            mTinter.setTint(ColorStateList.valueOf(Color.LTGRAY));
        }
        super.setEnabled(enabled);
    }
}
