package com.simplemobiletools.gallery.extensions

import android.graphics.Bitmap
import java.io.File

fun File.getCompressionFormat(): Bitmap.CompressFormat {
    return when (extension.toLowerCase()) {
        "png" -> Bitmap.CompressFormat.PNG
        "webp" -> Bitmap.CompressFormat.WEBP
        else -> Bitmap.CompressFormat.JPEG
    }
}
