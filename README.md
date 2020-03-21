# ZTintedImageView
 提取于Android版Chromium源码。
 Implementation of ImageView that allows tinting its Drawable for all states.

## ScreenShot
![截图](/img/img0.jpg)

## Usage

Gradle引入

```gradle
implementation 'com.zpj.widget:ZTintedImageView:1.0.0'
```

TintedImageView的使用：

```xml
<com.zpj.widget.tinted.TintedImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@mipmap/ic_launcher"
        app:z_tinted_color="@color/colorPrimary"
        />
```

TintedImageButton的使用：

```xml
<com.zpj.widget.tinted.TintedImageButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:src="@mipmap/ic_launcher"
        app:z_tinted_color="@color/colorPrimary"
        />
```

在Java中使用：

```java
TintedImageButton ib0 = findViewById(R.id.ib_0);
ib0.setTint(ColorStateList.valueOf(color));

TintedImageView iv0 = findViewById(R.id.iv_0);
iv0.setTint(ColorStateList.valueOf(color))

```
